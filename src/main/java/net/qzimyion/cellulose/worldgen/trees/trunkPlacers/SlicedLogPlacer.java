package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;


public class SlicedLogPlacer extends TrunkPlacer {

    public static final Codec<SlicedLogPlacer> CODEC = RecordCodecBuilder.create((instance) -> trunkPlacerParts(instance).apply(instance, SlicedLogPlacer::new));

    public SlicedLogPlacer(int baseLength, int firstRandomHeight, int secondRandomHeight) {
        super(baseLength, firstRandomHeight, secondRandomHeight);

    }

    @Override
    protected TrunkPlacerType<?> type() {
        return null;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int length, BlockPos startPos, TreeConfiguration config) {
        Direction logDir = random.nextBoolean() ? Direction.NORTH : random.nextBoolean() ? Direction.SOUTH : random.nextBoolean() ? Direction.EAST : Direction.WEST;
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();
        for (int i = 0; i < length; i++) {
            Function<BlockState, BlockState> blockStateBlockStateFunction = (state) -> {
                state = state.setValue(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM);
                Direction facingDirection = switch (logDir) {
                    case NORTH -> Direction.NORTH;
                    case SOUTH -> Direction.SOUTH;
                    case EAST -> Direction.EAST;
                    default -> Direction.WEST;
                };
                state = state.setValue(BlockStateProperties.FACING, facingDirection);
                return state;
            };
            BlockPos currentPos = world.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, startPos.relative(logDir, i));
            placeLog(world, replacer, random, currentPos, config, blockStateBlockStateFunction);
        }
        return list;
    }
}
