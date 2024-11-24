package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistryCodecs;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer.FoliageAttachment;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;

import java.util.List;
import java.util.function.BiConsumer;

@SuppressWarnings("unused")
public class SmallDarkOakTrunkPlacer extends TrunkPlacer {
    public static final Codec<SmallDarkOakTrunkPlacer> CODEC = RecordCodecBuilder.create(instance -> trunkPlacerParts(instance)
            .and(instance.group(IntProvider.POSITIVE_CODEC.fieldOf("extra_branch_steps").forGetter((trunkPlacer) ->
            trunkPlacer.extraBranchSteps), Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability")
            .forGetter((trunkPlacer) -> trunkPlacer.placeBranchPerLogProbability), IntProvider.NON_NEGATIVE_CODEC
            .fieldOf("extra_branch_length")
            .forGetter((trunkPlacer) -> trunkPlacer.extraBranchLength), RegistryCodecs.homogeneousList(Registries.BLOCK)
            .fieldOf("can_grow_through")
            .forGetter((trunkPlacer) -> trunkPlacer.canGrowThrough))).apply(instance, SmallDarkOakTrunkPlacer::new));
    private final IntProvider extraBranchSteps;
    private final float placeBranchPerLogProbability;
    private final IntProvider extraBranchLength;
    private final HolderSet<Block> canGrowThrough;


    public SmallDarkOakTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, IntProvider extraBranchSteps, float placeBranchPerLogProbability, IntProvider extraBranchLength, HolderSet<Block> canGrowThrough) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
        this.extraBranchSteps = extraBranchSteps;
        this.placeBranchPerLogProbability = placeBranchPerLogProbability;
        this.extraBranchLength = extraBranchLength;
        this.canGrowThrough = canGrowThrough;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return WorldGenRegistry.SMALL_DARK_OAK_TRUNK_PLACER;
    }

    public List<FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer <BlockPos, BlockState> replacer, RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {
        List <FoliageAttachment> list = Lists.newArrayList();
        MutableBlockPos mutable = new MutableBlockPos();
        boolean bl = random.nextBoolean();
        boolean bl2 = random.nextBoolean();
        Direction trunkOffset = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        Direction trunkOffset2 = Direction.Plane.HORIZONTAL.getRandomDirection(random);

        for(int i = 0; i < height; ++i) {
            int j = startPos.getY() + i;
            Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(random);
            Direction direction2 = Direction.Plane.HORIZONTAL.getRandomDirection(random);
            Direction direction3 = Direction.Plane.HORIZONTAL.getRandomDirection(random);

            MutableBlockPos mutablePos1 = mutable.set(startPos.getX(), j, startPos.getZ());
            BlockPos pos2 = mutablePos1.relative(trunkOffset);
            BlockPos pos3 = pos2.relative(trunkOffset2);
            BlockPos blockPos = bl && i >= 2 ? (bl2 && trunkOffset != trunkOffset2 ? pos3 : pos2) : mutablePos1;

            if(bl && i == 2) {
                this.placeLog(world, replacer, random, mutablePos1, config);
            }
            if(this.placeLog(world, replacer, random, blockPos, config) && i < height - 1 && random.nextFloat() < this.placeBranchPerLogProbability) {
                int k = this.extraBranchLength.sample(random);
                int l = Math.max(0, k - this.extraBranchLength.sample(random) - 1);
                int m = height + i - 7;
                if(i > 2) {
                    this.generateExtraBranch(world, replacer, random, height, config, list, blockPos, j, direction, l, m, i);

                    if(random.nextFloat() < this.placeBranchPerLogProbability - 0.25) {
                        this.generateExtraBranch(world, replacer, random, height, config, list, blockPos, j, direction2, l, Math.round((float) m / 2), i);
                    }
                    if(random.nextFloat() < this.placeBranchPerLogProbability - 0.55) {
                        this.generateExtraBranch(world, replacer, random, height, config, list, blockPos, j, direction3, l, Math.round((float) m / 2), i);
                    }
                }
            }
            if(i == height - 1) {
                list.add(new FoliageAttachment(blockPos.above(1), 0, false));
            }
        }

        return list;
    }

    private void generateExtraBranch(LevelSimulatedReader world, BiConsumer <BlockPos, BlockState> replacer, RandomSource random, int height, TreeConfiguration config, List <FoliageAttachment> nodes, BlockPos pos, int yOffset, Direction direction, int length, int steps, int b) {
        int i = yOffset + length;
        int j = pos.getX();
        int k = pos.getZ();
        MutableBlockPos mutable = new MutableBlockPos();
        boolean bl = random.nextFloat() < .5F;
        Direction direction2 = random.nextFloat() < .5F ? direction.getClockWise() : direction.getCounterClockWise();

        for(int l = length; l < height && steps > 0 && (steps < (bl ? 7 : 10)); --steps) {
            if(l >= 1) {
                int m = Math.round(yOffset + (float) l / 5);
                j += direction.getStepX();
                if(bl) {
                    k += Math.max(0, direction2.getStepZ() - random.nextInt(2));
                }
                else {
                    k += direction.getStepZ();
                }
                i = m;
                if(this.placeLog(world, replacer, random, mutable.set(j, m, k), config, blockState -> blockState.trySetValue(RotatedPillarBlock.AXIS, direction.getAxis()))) {
                    i = m + 1;
                }
            }
            ++l;
        }

        if(i - yOffset >= 1) {
            BlockPos blockPos = new BlockPos(j, i, k);
            nodes.add(new FoliageAttachment(blockPos, 0, false));
        }

    }

    protected boolean validTreePos(LevelSimulatedReader world, BlockPos pos) {
        return super.validTreePos(world, pos) || world.isStateAtPosition(pos, (state) -> state.is(this.canGrowThrough));
    }
}
