package net.qzimyion.cellulose.worldgen.trees.trunkPlacers;

import com.mojang.datafixers.util.Function7;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

@SuppressWarnings("FieldCanBeLocal")
public class BetterCherryTrunkPlacer extends TrunkPlacer {
    private static final Codec<UniformIntProvider> BRANCH_START_OFFSET_FROM_TOP_CODEC;
    public static final Codec<BetterCherryTrunkPlacer> CODEC;
    private final IntProvider branchCount;
    private final IntProvider branchHorizontalLength;
    private final UniformIntProvider branchStartOffsetFromTop;
    private final UniformIntProvider secondBranchStartOffsetFromTop;
    private final IntProvider branchEndOffsetFromTop;

    public BetterCherryTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, IntProvider branchCount, IntProvider branchHorizontalLength, UniformIntProvider branchStartOffsetFromTop, IntProvider branchEndOffsetFromTop) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
        this.branchCount = branchCount;
        this.branchHorizontalLength = branchHorizontalLength;
        this.branchStartOffsetFromTop = branchStartOffsetFromTop;
        this.secondBranchStartOffsetFromTop = UniformIntProvider.create(branchStartOffsetFromTop.getMin(), branchStartOffsetFromTop.getMax() - 1);
        this.branchEndOffsetFromTop = branchEndOffsetFromTop;
    }

    protected TrunkPlacerType<?> getType() {
        return TrunkPlacerType.CHERRY_TRUNK_PLACER;
    }

    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        setToDirt(world, replacer, random, startPos.down(), config);
        int i = Math.max(0, height - 1 + this.branchStartOffsetFromTop.get(random));
        int j = Math.max(0, height - 1 + this.secondBranchStartOffsetFromTop.get(random));
        if (j >= i) {
            ++j;
        }

        int k = this.branchCount.get(random);
        boolean bl = k == 3;
        boolean bl2 = k >= 2;
        int l;
        if (bl) {
            l = height;
        } else if (bl2) {
            l = Math.max(i, j) + 1;
        } else {
            l = i + 1;
        }

        for(int m = 0; m < l; ++m) {
            this.getAndSetState(world, replacer, random, startPos.up(m), config);
        }

        List<FoliagePlacer.TreeNode> list = new ArrayList();
        if (bl) {
            list.add(new FoliagePlacer.TreeNode(startPos.up(l), 0, false));
        }

        BlockPos.Mutable mutable = new BlockPos.Mutable();
        Direction direction = Direction.Type.HORIZONTAL.random(random);
        Function<BlockState, BlockState> function = (state) -> {
            return (BlockState)state.withIfExists(PillarBlock.AXIS, direction.getAxis());
        };
        list.add(this.generateBranch(world, replacer, random, height, startPos, config, function, direction, i, i < l - 1, mutable));
        if (bl2) {
            list.add(this.generateBranch(world, replacer, random, height, startPos, config, function, direction.getOpposite(), j, j < l - 1, mutable));
        }

        return list;
    }

    private FoliagePlacer.TreeNode generateBranch(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config, Function<BlockState, BlockState> withAxisFunction, Direction direction, int branchStartOffset, boolean branchBelowHeight, BlockPos.Mutable mutablePos) {
        mutablePos.set(startPos).move(Direction.UP, branchStartOffset);
        int i = height - 1 + this.branchEndOffsetFromTop.get(random);
        boolean bl = branchBelowHeight || i < branchStartOffset;
        int j = this.branchHorizontalLength.get(random) + (bl ? 1 : 0);
        BlockPos blockPos = startPos.offset(direction, j).up(i);
        int k = bl ? 2 : 1;
        for (int l = 0; l < k; ++l) {
            this.getAndSetState(world, replacer, random, mutablePos.move(direction), config, withAxisFunction);
        }

        Direction direction2 = blockPos.getY() > mutablePos.getY() ? Direction.UP : Direction.DOWN;
        while (true) {
            int m = mutablePos.getManhattanDistance(blockPos);
            if (m == 0) {
                return new FoliagePlacer.TreeNode(blockPos.up(), 0, false);
            }

            float f = (float) Math.abs(blockPos.getY() - mutablePos.getY()) / (float) m;
            boolean bl2 = random.nextFloat() < f;
            mutablePos.move(bl2 ? direction2 : direction);
            if (bl2 && mutablePos.getY() == blockPos.getY()) {
                this.getAndSetState(world, replacer, random, mutablePos, config, blockState -> Blocks.CHERRY_WOOD.getDefaultState());
            } else {
                this.getAndSetState(world, replacer, random, mutablePos, config, bl2 ? Function.identity() : withAxisFunction);
            }
        }
    }

}
