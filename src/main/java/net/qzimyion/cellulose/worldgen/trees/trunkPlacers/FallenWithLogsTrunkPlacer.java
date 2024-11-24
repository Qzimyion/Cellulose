package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class FallenWithLogsTrunkPlacer extends TrunkPlacer {
    public static final Codec<FallenWithLogsTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) ->
            trunkPlacerParts(instance)
                    .and(Codec.floatRange(0.0F, 1.0F).fieldOf("branch_chance").forGetter(trunkPlacer -> trunkPlacer.branchChance))
                    .and(Codec.floatRange(0.0F, 1.0F).fieldOf("success_in_water_chance").forGetter(trunkPlacer -> trunkPlacer.successInWaterChance))
                    .and(IntProvider.NON_NEGATIVE_CODEC.fieldOf("max_branch_count").forGetter(trunkPlacer -> trunkPlacer.maxBranchCount))
                    .apply(instance, FallenWithLogsTrunkPlacer::new)
    );


    public final float branchChance;
    public final IntProvider maxBranchCount;
    public final float successInWaterChance;

    public FallenWithLogsTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, float branchChance, float successInWaterChance, IntProvider maxBranchCount) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
        this.branchChance = branchChance;
        this.maxBranchCount = maxBranchCount;
        this.successInWaterChance = successInWaterChance;
    }

    private static boolean isWaterAt(LevelSimulatedReader level, BlockPos pos) {
        return level.isFluidAtPosition(pos, fluidState -> fluidState.is(FluidTags.WATER));
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return null;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();
        List<BlockPos> logs = new ArrayList<>();
        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();
        int maxLogs = this.maxBranchCount.sample(random);
        Direction logDir = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        int extraLogs = 0;

        if (isWaterAt(level, startPos) && random.nextFloat() > this.successInWaterChance) {
            return foliageAttachments;
        }

        BlockPos endPos = startPos.relative(logDir, height);
        BlockPos secondToEndPos = endPos.relative(logDir.getOpposite());
        int aboveSolidAmount = 0;
        boolean isEndAboveSolid = false;
        Iterable<BlockPos> positions = BlockPos.betweenClosed(startPos, endPos);

        for (BlockPos blockPos : positions) {
            mutable.set(blockPos);
            if (TreeFeature.validTreePos(level, mutable)) {
                if (!TreeFeature.validTreePos(level, mutable.move(Direction.DOWN)) && !TreeFeature.isAirOrLeaves(level, mutable)) {
                    aboveSolidAmount++;
                    mutable.move(Direction.UP);
                    if (mutable.equals(endPos) || mutable.equals(secondToEndPos)) {
                        isEndAboveSolid = true;
                    }
                } else {
                    mutable.move(Direction.UP);
                    if (mutable.equals(startPos)) {
                        return foliageAttachments;
                    }
                }
            } else {
                return foliageAttachments;
            }
        }

        if (isEndAboveSolid || (aboveSolidAmount / (float) height) > 0.5) {
            for (BlockPos blockPos : positions) {
                mutable.set(blockPos);
                getAndSetState(logs, level, replacer, random, config, mutable, logDir);
                if (random.nextFloat() < this.branchChance && extraLogs < maxLogs) {
                    Direction direction = random.nextFloat() >= 0.33 ? Direction.Plane.HORIZONTAL.getRandomDirection(random) : Direction.Plane.VERTICAL.getRandomDirection(random);
                    generateExtraBranch(logs, level, replacer, random, config, mutable, logDir, direction);
                    extraLogs++;
                }
            }
        }

        return foliageAttachments;
    }

    private void generateExtraBranch(List<BlockPos> logs, LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, TreeConfiguration config, BlockPos.MutableBlockPos pos, Direction offsetDir, Direction direction) {
        int x = pos.getX();
        int z = pos.getZ();
        int y = pos.getY();
        if (offsetDir.getAxis() != direction.getAxis()) {
            x += direction.getStepX();
            z += direction.getStepZ();
            y += direction.getStepY();
            if (TreeFeature.validTreePos(level, pos.set(x, y, z))) {
                getAndSetState(logs, level, replacer, random, config, pos, direction);
            }
        }
    }

    private void getAndSetState(List<BlockPos> logs, LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, TreeConfiguration config, BlockPos.MutableBlockPos pos, Direction direction) {
        BlockState stateToPlace = config.trunkProvider.getState(random, pos);
        if (stateToPlace.getValue(BlockStateProperties.WATERLOGGED)) {
            stateToPlace = stateToPlace.setValue(BlockStateProperties.WATERLOGGED, isWaterAt(level, pos));
        } else {
            Direction.Axis axis = direction.getStepX() != 0 ? Direction.Axis.X : (direction.getStepX() != 0 ? Direction.Axis.Y : Direction.Axis.Z);
            stateToPlace = stateToPlace.setValue(BlockStateProperties.AXIS, axis);
        }
        replacer.accept(pos, stateToPlace);
        logs.add(pos.immutable());
    }
}

