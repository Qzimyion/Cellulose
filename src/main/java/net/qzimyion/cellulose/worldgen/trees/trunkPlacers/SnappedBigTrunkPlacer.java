package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;

import java.util.List;
import java.util.function.BiConsumer;

public class SnappedBigTrunkPlacer extends TrunkPlacer {
    public static final Codec<SnappedBigTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) ->
            trunkPlacerParts(instance).apply(instance, SnappedBigTrunkPlacer::new));

    public SnappedBigTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return WorldGenRegistry.SNAPPED_BIG_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {
        BlockPos blockPos = startPos.below();
        setDirtAt(world, replacer, random, blockPos, config);
        setDirtAt(world, replacer, random, blockPos.east(), config);
        setDirtAt(world, replacer, random, blockPos.south(), config);
        setDirtAt(world, replacer, random, blockPos.south().east(), config);
        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();

        for(int i = 0; i < height; ++i) {
            int randomY = i + random.nextInt(3) - 1;
            this.setLog(world, replacer, random, mutable, config, startPos, 0, randomY, 0);
            if (i < height - 1) {
                this.setLog(world, replacer, random, mutable, config, startPos, 1, randomY, 0);
                this.setLog(world, replacer, random, mutable, config, startPos, 1, randomY, 1);
                this.setLog(world, replacer, random, mutable, config, startPos, 0, randomY, 1);
            }
        }
        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(startPos.above(height), 0, true));
    }

    private void setLog(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, BlockPos.MutableBlockPos tmpPos, TreeConfiguration config, BlockPos startPos, int dx, int dy, int dz) {
        tmpPos.setWithOffset(startPos, dx, dy, dz);
        this.placeLogIfFree(world, replacer, random, tmpPos, config);
    }
}
