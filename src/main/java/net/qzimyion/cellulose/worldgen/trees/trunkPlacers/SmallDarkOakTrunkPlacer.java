package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.RegistryCodecs;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer.TreeNode;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.qzimyion.cellulose.worldgen.WorldGenRegistry;

import java.util.List;
import java.util.function.BiConsumer;

@SuppressWarnings("unused")
public class SmallDarkOakTrunkPlacer extends TrunkPlacer {
    public static final Codec<SmallDarkOakTrunkPlacer> CODEC = RecordCodecBuilder.create(instance -> fillTrunkPlacerFields(instance)
            .and(instance.group(IntProvider.POSITIVE_CODEC.fieldOf("extra_branch_steps").forGetter((trunkPlacer) ->
            trunkPlacer.extraBranchSteps), Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability")
            .forGetter((trunkPlacer) -> trunkPlacer.placeBranchPerLogProbability), IntProvider.NON_NEGATIVE_CODEC
            .fieldOf("extra_branch_length")
            .forGetter((trunkPlacer) -> trunkPlacer.extraBranchLength), RegistryCodecs.entryList(RegistryKeys.BLOCK)
            .fieldOf("can_grow_through")
            .forGetter((trunkPlacer) -> trunkPlacer.canGrowThrough))).apply(instance, SmallDarkOakTrunkPlacer::new));
    private final IntProvider extraBranchSteps;
    private final float placeBranchPerLogProbability;
    private final IntProvider extraBranchLength;
    private final RegistryEntryList<Block> canGrowThrough;


    public SmallDarkOakTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, IntProvider extraBranchSteps, float placeBranchPerLogProbability, IntProvider extraBranchLength, RegistryEntryList<Block> canGrowThrough) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
        this.extraBranchSteps = extraBranchSteps;
        this.placeBranchPerLogProbability = placeBranchPerLogProbability;
        this.extraBranchLength = extraBranchLength;
        this.canGrowThrough = canGrowThrough;
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return WorldGenRegistry.SMALL_DARK_OAK_TRUNK_PLACER;
    }

    public List<TreeNode> generate(TestableWorld world, BiConsumer <BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        List <TreeNode> list = Lists.newArrayList();
        Mutable mutable = new Mutable();
        boolean bl = random.nextBoolean();
        boolean bl2 = random.nextBoolean();
        Direction trunkOffset = Direction.Type.HORIZONTAL.random(random);
        Direction trunkOffset2 = Direction.Type.HORIZONTAL.random(random);

        for(int i = 0; i < height; ++i) {
            int j = startPos.getY() + i;
            Direction direction = Direction.Type.HORIZONTAL.random(random);
            Direction direction2 = Direction.Type.HORIZONTAL.random(random);
            Direction direction3 = Direction.Type.HORIZONTAL.random(random);

            Mutable mutablePos1 = mutable.set(startPos.getX(), j, startPos.getZ());
            BlockPos pos2 = mutablePos1.offset(trunkOffset);
            BlockPos pos3 = pos2.offset(trunkOffset2);
            BlockPos blockPos = bl && i >= 2 ? (bl2 && trunkOffset != trunkOffset2 ? pos3 : pos2) : mutablePos1;

            if(bl && i == 2) {
                this.getAndSetState(world, replacer, random, mutablePos1, config);
            }
            if(this.getAndSetState(world, replacer, random, blockPos, config) && i < height - 1 && random.nextFloat() < this.placeBranchPerLogProbability) {
                int k = this.extraBranchLength.get(random);
                int l = Math.max(0, k - this.extraBranchLength.get(random) - 1);
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
                list.add(new TreeNode(blockPos.up(1), 0, false));
            }
        }

        return list;
    }

    private void generateExtraBranch(TestableWorld world, BiConsumer <BlockPos, BlockState> replacer, Random random, int height, TreeFeatureConfig config, List <TreeNode> nodes, BlockPos pos, int yOffset, Direction direction, int length, int steps, int b) {
        int i = yOffset + length;
        int j = pos.getX();
        int k = pos.getZ();
        Mutable mutable = new Mutable();
        boolean bl = random.nextFloat() < .5F;
        Direction direction2 = random.nextFloat() < .5F ? direction.rotateYClockwise() : direction.rotateYCounterclockwise();

        for(int l = length; l < height && steps > 0 && (steps < (bl ? 7 : 10)); --steps) {
            if(l >= 1) {
                int m = Math.round(yOffset + (float) l / 5);
                j += direction.getOffsetX();
                if(bl) {
                    k += Math.max(0, direction2.getOffsetZ() - random.nextInt(2));
                }
                else {
                    k += direction.getOffsetZ();
                }
                i = m;
                if(this.getAndSetState(world, replacer, random, mutable.set(j, m, k), config, blockState -> blockState.withIfExists(PillarBlock.AXIS, direction.getAxis()))) {
                    i = m + 1;
                }
            }
            ++l;
        }

        if(i - yOffset >= 1) {
            BlockPos blockPos = new BlockPos(j, i, k);
            nodes.add(new TreeNode(blockPos, 0, false));
        }

    }

    protected boolean canReplace(TestableWorld world, BlockPos pos) {
        return super.canReplace(world, pos) || world.testBlockState(pos, (state) -> state.isIn(this.canGrowThrough));
    }
}
