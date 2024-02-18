package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class SmallDarkOakTrunkPlacer extends TrunkPlacer {
    public static final Codec<SmallDarkOakTrunkPlacer> CODEC = RecordCodecBuilder.create(instance -> SmallDarkOakTrunkPlacer.fillTrunkPlacerFields(instance).apply(instance, SmallDarkOakTrunkPlacer::new));

    public SmallDarkOakTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return CelluloseTrunkPlacerTypes.SMALL_DARK_OAK_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        int q;
        ArrayList<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos blockPos = startPos.down();
        DarkOakTrunkPlacer.setToDirt(world, replacer, random, blockPos, config);
        Direction direction = Direction.Type.HORIZONTAL.random(random);
        int i = height - random.nextInt(4);
        int j = 2 - random.nextInt(3);
        int k = startPos.getX();
        int l = startPos.getY();
        int m = startPos.getZ();
        int n = k;
        int o = m;
        int p = l + height - 1;
        for (q = 0; q < height; ++q) {
            BlockPos blockPos2;
            if (q >= i && j > 0) {
                n += direction.getOffsetX();
                o += direction.getOffsetZ();
                --j;
            }
            if (!TreeFeature.isAirOrLeaves(world, blockPos2 = new BlockPos(n, l + q, o))) continue;
            this.getAndSetState(world, replacer, random, blockPos2, config);
            list.add(new FoliagePlacer.TreeNode(new BlockPos(n, p, o), 0, false));
        }
        return list;
    }
}
