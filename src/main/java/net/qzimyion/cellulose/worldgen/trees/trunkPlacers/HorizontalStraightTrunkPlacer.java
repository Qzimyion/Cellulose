package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.datafixers.Products;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;
import org.jetbrains.annotations.Contract;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

import static net.minecraft.state.property.Properties.AXIS;


public class HorizontalStraightTrunkPlacer extends TrunkPlacer {

    public static final Codec<HorizontalStraightTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) ->
            horizontalCodec(instance).apply(instance, HorizontalStraightTrunkPlacer::new));

    @Contract("_ -> new")
    protected static <P extends HorizontalStraightTrunkPlacer> Products.P5<RecordCodecBuilder.Mu<P>, Integer, Integer, Integer, Float, Float> horizontalCodec(RecordCodecBuilder.Instance<P> builder) {
        return fillTrunkPlacerFields(builder)
                .and(Codec.floatRange(0.0F, 1.0F).fieldOf("success_in_water_chance").forGetter((trunkPlacer) -> trunkPlacer.successInWaterChance))
                .and(Codec.floatRange(0.0F, 1.0F).fieldOf("stump_chance").forGetter((trunkPlacer) -> trunkPlacer.stumpChance));
    }

    public final float successInWaterChance;
    public final float stumpChance;

    public HorizontalStraightTrunkPlacer(int baseLength, int firstRandomHeight, int secondRandomHeight, float successInWaterChance, float stumpChance) {
        super(baseLength, firstRandomHeight, secondRandomHeight);
        this.successInWaterChance = successInWaterChance;
        this.stumpChance = stumpChance;
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return WorldGenRegistry.HORIZONTAL_STRAIGHT_TRUNK_PLACER;
    }

    public static boolean isWater(TestableWorld world, BlockPos pos) {
        return world.testFluidState(pos, fluidstate -> fluidstate.isIn(FluidTags.WATER));
    }

    public static int getRandomFromList(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be null or empty.");
        }
        java.util.Random random = new java.util.Random();
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int length, BlockPos startPos, TreeFeatureConfig config) {
        Direction.Axis logDir = random.nextBoolean() ? Direction.Axis.X : Direction.Axis.Z;
        Direction direction = Direction.Type.HORIZONTAL.random(random);
        //BlockState state = config.trunkProvider.get(random, startPos);
        List<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        if (isWater(world, startPos) && random.nextFloat() > this.successInWaterChance) {
            return list;
        }
        for (int i = 0; i < length; i++) {
            BlockPos currentPos = startPos.offset(logDir, i);
//            if (state.contains(Properties.AXIS) && logDir == Direction.Axis.X){
//                state = state.with(AXIS, Direction.Axis.X);
//            }else{
//                state = state.with(AXIS, Direction.Axis.Z);
//            }
            Function<BlockState, BlockState> blockStateBlockStateFunction = (state) -> {
                if (state.contains(Properties.AXIS) && logDir == Direction.Axis.X){
                    state = state.with(AXIS, Direction.Axis.X);
                }else{
                    state = state.with(AXIS, Direction.Axis.Z);
                }
                return state;
            };
            if (random.nextFloat() < this.stumpChance){
                if (i == length - 1) {
                    List<Integer> distanceList = List.of(2, 3);
                    int placementDistance = getRandomFromList(distanceList);
                    BlockPos stumpPos;
                    //BlockState stumpState = config.trunkProvider.get(random, startPos).with(Properties.AXIS, Direction.Axis.Y);
                    Function<BlockState, BlockState> stumpState = (state) -> state.with(Properties.AXIS, Direction.Axis.Y);
                    if (logDir == Direction.Axis.X) {
                        stumpPos = currentPos.offset(Direction.Axis.X, placementDistance);
                    } else {
                        stumpPos = currentPos.offset(Direction.Axis.Z, placementDistance);
                    }
                    getAndSetState(world, replacer, random, stumpPos, config, stumpState);
                }
            }
            startPos.add(currentPos);
            getAndSetState(world, replacer, random, currentPos, config, blockStateBlockStateFunction);
        }
        return list;
    }
}
