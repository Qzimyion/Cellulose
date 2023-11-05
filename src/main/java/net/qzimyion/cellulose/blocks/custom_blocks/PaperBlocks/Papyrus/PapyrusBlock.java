package net.qzimyion.cellulose.blocks.custom_blocks.PaperBlocks.Papyrus;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

@SuppressWarnings("deprecation")
public class PapyrusBlock extends Block {
    private static final Direction[] field_43257 = Direction.values();
    public PapyrusBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.isOf(state.getBlock())) {
            return;
        }
        this.update(world, pos);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
    }

    protected void update(World world, BlockPos pos) {
        if (this.absorbWater(world, pos)) {
            world.setBlockState(pos, CelluloseBlocks.SOAKED_PAPER_BLOCK.getDefaultState(), Block.NOTIFY_LISTENERS);
            world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, pos, Block.getRawIdFromState(Blocks.LAVA.getDefaultState()));
        }
    }

    private boolean absorbWater(World world, BlockPos pos) {
        return BlockPos.iterateRecursively(pos, 6, 65, (currentPos, queuer) -> {
            for (Direction direction : field_43257) {
                queuer.accept(currentPos.offset(direction));
            }
        }, currentPos -> {
            if (currentPos.equals(pos)) {
                return true;
            }
            BlockState blockState = world.getBlockState(currentPos);
            FluidState fluidState = world.getFluidState(currentPos);
            if (!fluidState.isIn(FluidTags.LAVA)) {
                return false;
            }
            Block block = blockState.getBlock();
            if (block instanceof FluidDrainable && !((FluidDrainable) block).tryDrainFluid(world, currentPos, blockState).isEmpty()) {
                return true;
            }
            if (blockState.getBlock() instanceof FluidBlock) {
                world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
            } else {
                return false;
            }
            return true;
        }) > 1;
    }
}