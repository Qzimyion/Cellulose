package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.BiConsumer;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

public class BranchedStraightTrunkPlacer extends TrunkPlacer {

    public BranchedStraightTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return null;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {
        setDirtAt(world, replacer, random, startPos.below(), config);
        for(int i = 0; i < height; ++i) {
            if (random.nextInt(6) == 0) {
                int x = random.nextInt(3) - 1;
                int z = random.nextInt(3) - 1;
                this.placeLog(world, replacer, random, startPos.offset(x, i, z), config);
            }
        }
        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(startPos.above(height), 0, false));
    }
}
