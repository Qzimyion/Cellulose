package net.qzimyion.cellulose.worldgen.trees.foliagePlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;

public class OliveFoliagePlacer extends FoliagePlacer {

    public static final Codec <OliveFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) ->
            fillFoliagePlacerFields(instance).and(instance.group(IntProvider.createValidatingCodec(4, 16).fieldOf("height")
                    .forGetter((foliagePlacer) -> foliagePlacer.height), Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_chance")
                    .forGetter((foliagePlacer) -> foliagePlacer.hangingLeavesChance), Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_extension_chance")
                    .forGetter((foliagePlacer) -> foliagePlacer.hangingLeavesExtensionChance))).apply(instance, OliveFoliagePlacer::new));
    private final IntProvider height;
    private final float hangingLeavesChance;
    private final float hangingLeavesExtensionChance;

    public OliveFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider height, float hangingLeavesChance, float hangingLeavesExtensionChance) {
        super(radius, offset);
        this.height = height;
        this.hangingLeavesChance = hangingLeavesChance;
        this.hangingLeavesExtensionChance = hangingLeavesExtensionChance;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return WorldGenRegistry.OLIVE_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, FoliagePlacer.BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, FoliagePlacer.TreeNode treeNode, int foliageHeight, int radius, int offset) {
        boolean bl = treeNode.isGiantTrunk();
        BlockPos blockPos = treeNode.getCenter().up(offset);
        this.generateSquare(world, placer, random, config, blockPos, radius + treeNode.getFoliageRadius(), -1 - foliageHeight, bl);
        this.generateSquareWithHangingLeaves(world, placer, random, config, blockPos, radius - 1, -foliageHeight, bl, this.hangingLeavesChance, this.hangingLeavesExtensionChance);
        this.generateSquareWithHangingLeaves(world, placer, random, config, blockPos, radius + treeNode.getFoliageRadius() - 1, 0, bl, this.hangingLeavesChance, this.hangingLeavesExtensionChance);
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return 0;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        if (y == 0) {
            return (dx > 1 || dz > 1) && dx != 0 && dz != 0;
        }
        return dx == radius && dz == radius && radius > 0;
    }
}
