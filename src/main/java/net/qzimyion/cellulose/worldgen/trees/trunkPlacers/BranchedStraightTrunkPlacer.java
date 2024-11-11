package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class BranchedStraightTrunkPlacer extends TrunkPlacer {

    public BranchedStraightTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return null;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        setToDirt(world, replacer, random, startPos.down(), config);
        for(int i = 0; i < height; ++i) {
            if (random.nextInt(6) == 0) {
                int x = random.nextInt(3) - 1;
                int z = random.nextInt(3) - 1;
                this.getAndSetState(world, replacer, random, startPos.add(x, i, z), config);
            }
        }
        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height), 0, false));
    }
}
