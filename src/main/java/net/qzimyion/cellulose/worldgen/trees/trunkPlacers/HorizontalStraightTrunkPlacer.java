package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.datafixers.Products;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Heightmap;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier;
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
    protected static <P extends HorizontalStraightTrunkPlacer> Products.P4<RecordCodecBuilder.Mu<P>, Integer, Integer, Integer, Float> horizontalCodec(RecordCodecBuilder.Instance<P> builder) {
        return fillTrunkPlacerFields(builder).and(Codec.floatRange(0.0F, 1.0F).fieldOf("stump_chance").forGetter((trunkPlacer) -> trunkPlacer.stumpChance));
    }

    public final float stumpChance;
    //public final float stumpVineChance;
    //public final float stumpShroomChance;

    public HorizontalStraightTrunkPlacer(int baseLength, int firstRandomHeight, int secondRandomHeight, float stumpChance) {
        super(baseLength, firstRandomHeight, secondRandomHeight);
        this.stumpChance = stumpChance;
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return WorldGenRegistry.HORIZONTAL_STRAIGHT_TRUNK_PLACER;
    }

    private boolean isInvalidBelowBlock(BlockState state) {
        return state.isAir() || state.isIn(BlockTags.LEAVES);
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
        List<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        for (int i = 0; i < length; i++) {
            Function<BlockState, BlockState> blockStateBlockStateFunction = (state) -> {
                if (state.contains(AXIS) && logDir == Direction.Axis.X){
                    state = state.with(AXIS, Direction.Axis.X);
                }else{
                    state = state.with(AXIS, Direction.Axis.Z);
                }
                return state;
            };
            int aboveSolidAmount = 0;
            boolean isEndAboveSolid = false;
            BlockPos currentPos = startPos.offset(logDir, i);
            if (random.nextFloat() < this.stumpChance){
                if (i == length - 1) {
                    BlockPos stumpPos;
                    List<Integer> distanceList = List.of(2, 3);
                    int placementDistance = getRandomFromList(distanceList);
                    Function<BlockState, BlockState> stumpState = (state) -> state.with(AXIS, Direction.Axis.Y);
                    if (logDir == Direction.Axis.X) {
                        stumpPos = currentPos.offset(Direction.Axis.X, placementDistance);
                    } else {
                        stumpPos = currentPos.offset(Direction.Axis.Z, placementDistance);
                    }
                    BlockPos[] directions = new BlockPos[]{
                            stumpPos.north(),
                            stumpPos.south(),
                            stumpPos.east(),
                            stumpPos.west()
                    };
                    for (BlockPos pos : directions) {
                        BlockState state = config.trunkProvider.get(random, pos);
                        if (state.isAir()) {
                            BlockState mossState = Blocks.VINE.getDefaultState();
                            replacer.accept(pos, mossState);
                        }
                    }
                    Iterable<BlockPos> poses = BlockPos.iterate(currentPos, stumpPos);
                    for (BlockPos blockPos : poses){
                        mutable.add(blockPos);
                        if (TreeFeature.canReplace(world, mutable)){
                            if (!TreeFeature.canReplace(world, mutable.offset(Direction.DOWN)) && !TreeFeature.isAirOrLeaves(world, mutable)){
                                aboveSolidAmount += 1;
                                mutable.offset(Direction.UP);
                                if (mutable.equals(currentPos) || mutable.equals(stumpPos)){
                                    isEndAboveSolid = true;
                                }
                            } else {
                                mutable.offset(Direction.UP);
                                if (mutable.equals(currentPos)){
                                    return list;
                                }
                            }
                        } else {
                            return list;
                        }
                    }
                    getAndSetState(world, replacer, random, stumpPos, config, stumpState);
                }
            }
            if (isEndAboveSolid || ((double) aboveSolidAmount / (double) length) > 0.5){
                getAndSetState(world, replacer, random, currentPos, config, blockStateBlockStateFunction);
            }
        }
        return list;
    }
}
