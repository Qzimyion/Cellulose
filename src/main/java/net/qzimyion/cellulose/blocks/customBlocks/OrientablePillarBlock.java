package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.Direction;

@SuppressWarnings("deprecation")
public class OrientablePillarBlock extends FacingBlock {

    public OrientablePillarBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx){
        PlayerEntity entity = ctx.getPlayer();
        assert entity != null;
        if(entity.isSneaking()) {
            return this.getDefaultState().with(FACING, ctx.getSide().getOpposite());
        }
        else {
            return this.getDefaultState().with(FACING, ctx.getSide());
        }
    }
}
