package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.datafixers.Products;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BiConsumer;


public class HorizontalStraightTrunkPlacer extends TrunkPlacer {
    public static final Codec<HorizontalStraightTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) ->
            fallenTrunkCodec(instance).apply(instance, HorizontalStraightTrunkPlacer::new));

    public final float stumpChance;
    public final float successInWaterChance;

    public HorizontalStraightTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, float stumpChance, float successInWaterChance) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
        this.stumpChance = stumpChance;
        this.successInWaterChance = successInWaterChance;
    }

    @Contract("_ -> new")
    protected static <P extends HorizontalStraightTrunkPlacer> Products.P5<RecordCodecBuilder.Mu<P>, Integer, Integer, Integer, Float, Float> fallenTrunkCodec(RecordCodecBuilder.Instance<P> builder) {
        return trunkPlacerParts(builder)
                .and(Codec.floatRange(0.0F, 1.0F).fieldOf("stump_chance").forGetter((placer) -> placer.stumpChance))
                .and(Codec.floatRange(0.0F, 1.0F).fieldOf("success_in_water_chance").forGetter((trunkPlacer) -> trunkPlacer.successInWaterChance));
    }

    private static boolean isWaterAt(@NotNull LevelSimulatedReader level, @NotNull BlockPos blockPos) {
        return level.isFluidAtPosition(blockPos, fluidState -> fluidState.is(FluidTags.WATER));
    }

    @Override
    @NotNull
    protected TrunkPlacerType<?> type() {
        return WorldGenRegistry.HORIZONTAL_STRAIGHT_TRUNK_PLACER;
    }

    @Override
    @NotNull
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(@NotNull LevelSimulatedReader level, @NotNull BiConsumer<BlockPos, BlockState> replacer, @NotNull RandomSource random, int length, @NotNull BlockPos startPos, @NotNull TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();
        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();
        Direction logDir = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        for (int i = 0; i < length; i++) {
            BlockPos currentPos = startPos.relative(logDir, i);
            mutable.set(currentPos);
            if (TreeFeature.validTreePos(level, mutable)) {
                placeLog(level, replacer, random, config, mutable, logDir);
            } else {
                break;
            }
            if (isWaterAt(level, startPos) && random.nextFloat() > this.successInWaterChance) {
                return list;
            }
            if (i == length - 1 && random.nextFloat() < this.stumpChance) {
                int placementDistance = random.nextBoolean() ? 1 : 2;
                int actualPlacement = length + placementDistance;
                BlockPos stumpPos = startPos.relative(logDir, actualPlacement);
                BlockPos groundPos = level.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, stumpPos);
                if (TreeFeature.validTreePos(level, groundPos)) {
                    placeStump(level, replacer, random, config, groundPos);
                }
            }
        }
        return list;
    }

    private void placeLog(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, TreeConfiguration config, BlockPos.MutableBlockPos pos, Direction direction) {
        BlockState logState = config.trunkProvider.getState(random, pos);
        if (logState.hasProperty(BlockStateProperties.AXIS)) {
            logState = logState.setValue(BlockStateProperties.AXIS, direction.getAxis());
        }
        replacer.accept(pos.immutable(), logState);
    }

    private void placeStump(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, TreeConfiguration config, BlockPos pos) {
        BlockState stumpState = config.trunkProvider.getState(random, pos).setValue(BlockStateProperties.AXIS, Direction.Axis.Y);
        replacer.accept(pos, stumpState);
    }
}
