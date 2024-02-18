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

public class SmallDarkOakFoliagePlacer extends FoliagePlacer {

    public static final Codec<SmallDarkOakFoliagePlacer> CODEC = RecordCodecBuilder.create(instance -> SmallDarkOakFoliagePlacer.fillFoliagePlacerFields(instance).apply(instance, SmallDarkOakFoliagePlacer::new));

    public SmallDarkOakFoliagePlacer(IntProvider radius, IntProvider offset) {
        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return CelluloseFoliagePlacerTypes.SMALL_DARK_OAK_FOLIAGE;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos blockPos = treeNode.getCenter().up(offset);
        this.generateSquare(world, placer, random, config, blockPos, radius + 1, -1, false);
        this.generateSquare(world, placer, random, config, blockPos, radius + 2, 0, false);
        this.generateSquare(world, placer, random, config, blockPos, radius + 1, 1, false);
        this.generateSquare(world, placer, random, config, blockPos, radius, 2, false);
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return 0;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
