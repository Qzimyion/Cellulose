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
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;
import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.AXIS;


public class HorizontalStraightTrunkPlacer extends TrunkPlacer {

    public static final Codec<HorizontalStraightTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) ->
            horizontalCodec(instance).apply(instance, HorizontalStraightTrunkPlacer::new));

    @Contract("_ -> new")
    protected static <P extends HorizontalStraightTrunkPlacer> Products.P4<RecordCodecBuilder.Mu<P>, Integer, Integer, Integer, Float> horizontalCodec(RecordCodecBuilder.Instance<P> builder) {
        return trunkPlacerParts(builder).and(Codec.floatRange(0.0F, 1.0F).fieldOf("stump_chance").forGetter((trunkPlacer) -> trunkPlacer.stumpChance));
    }

    public final float stumpChance;
    //public final float stumpVineChance;
    //public final float stumpShroomChance;

    public HorizontalStraightTrunkPlacer(int baseLength, int firstRandomHeight, int secondRandomHeight, float stumpChance) {
        super(baseLength, firstRandomHeight, secondRandomHeight);
        this.stumpChance = stumpChance;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return WorldGenRegistry.HORIZONTAL_STRAIGHT_TRUNK_PLACER;
    }

    @SuppressWarnings("Convert2MethodRef")
    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int length, BlockPos startPos, TreeConfiguration config) {
        Direction.Axis logDir = random.nextBoolean() ? Direction.Axis.X : Direction.Axis.Z;
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();
        for (int i = 0; i < length; i++) {
            Function<BlockState, BlockState> blockStateBlockStateFunction = (state) -> {
                if (state.hasProperty(AXIS) && logDir == Direction.Axis.X){
                    state = state.setValue(AXIS, Direction.Axis.X);
                }else{
                    state = state.setValue(AXIS, Direction.Axis.Z);
                }
                return state;
            };
            int placementDistance = random.nextBoolean() ? 2 : 3;
            BlockPos currentPos = startPos.relative(logDir, i);
            if (!world.isStateAtPosition( currentPos, state -> state.canBeReplaced() || world.isFluidAtPosition(currentPos.below(), fluidState -> fluidState.is(FluidTags.WATER)
                    || world.isStateAtPosition(currentPos.below(), state1 -> state1.canBeReplaced())))){
                break;
            }
            BlockPos stumpPos = switch (logDir) {
                case X -> currentPos.relative(Direction.Axis.X, placementDistance);
                case Z -> currentPos.relative(Direction.Axis.Z, placementDistance);
                default -> currentPos;
            };
            if (i == length - 1 && random.nextFloat() < this.stumpChance){
                Function<BlockState, BlockState> stumpState = (state) -> state.setValue(AXIS, Direction.Axis.Y);
                if (!world.isStateAtPosition(stumpPos, state ->  state.canBeReplaced() || world.isFluidAtPosition(stumpPos.below(), fluidState -> fluidState.is(FluidTags.WATER)
                        || world.isStateAtPosition(stumpPos.below(), state1 -> state1.canBeReplaced())))){
                    break;
                }
                BlockPos hmPos = world.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, stumpPos);
                placeLog(world, replacer, random, hmPos, config, stumpState);
            }
            placeLog(world, replacer, random, currentPos, config, blockStateBlockStateFunction);
        }
        return list;
    }
}
