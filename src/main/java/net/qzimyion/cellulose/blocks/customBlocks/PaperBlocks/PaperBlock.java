package net.qzimyion.cellulose.blocks.customBlocks.PaperBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

@SuppressWarnings("deprecation")
public class PaperBlock extends Block {
    private static final Direction[] dir = Direction.values();
    public PaperBlock(Properties settings) {
        super(settings);
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.is(state.getBlock())) {
            return;
        }
        this.update(world, pos);
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        this.update(world, pos);
        super.neighborChanged(state, world, pos, sourceBlock, sourcePos, notify);
    }

    protected void update(Level world, BlockPos pos) {
        if (this.absorbWater(world, pos)) {
            world.setBlock(pos, CelluloseBlocks.SOAKED_PAPER_BLOCK.defaultBlockState(), Block.UPDATE_CLIENTS);
            world.levelEvent(LevelEvent.PARTICLES_DESTROY_BLOCK, pos, Block.getId(Blocks.WATER.defaultBlockState()));
        }
    }

    private boolean absorbWater(Level world, BlockPos pos) {
        return BlockPos.breadthFirstTraversal(pos, 5, 36, (currentPos, queuer) -> {
            for (Direction direction : dir) {
                queuer.accept(currentPos.relative(direction));
            }
        }, currentPos -> {
            if (currentPos.equals(pos)) {
                return true;
            }
            BlockState blockState = world.getBlockState(currentPos);
            FluidState fluidState = world.getFluidState(currentPos);
            if (!fluidState.is(FluidTags.WATER)) {
                return false;
            }
            Block block = blockState.getBlock();
            if (block instanceof BucketPickup && !((BucketPickup) block).pickupBlock(world, currentPos, blockState).isEmpty()) {
                return true;
            }
            if (blockState.getBlock() instanceof LiquidBlock) {
                world.setBlock(currentPos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
            } else if (blockState.is(Blocks.KELP) || blockState.is(Blocks.KELP_PLANT) || blockState.is(Blocks.SEAGRASS) || blockState.is(Blocks.TALL_SEAGRASS)) {
                BlockEntity blockEntity = blockState.hasBlockEntity() ? world.getBlockEntity(currentPos) : null;
                PaperBlock.dropResources(blockState, world, currentPos, blockEntity);
                world.setBlock(currentPos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
            } else {
                return false;
            }
            return true;
        }) > 1;
    }
}