package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

@SuppressWarnings("deprecation")
public class OrientablePillarBlock extends DirectionalBlock {

    public OrientablePillarBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx){
        Player entity = ctx.getPlayer();
        assert entity != null;
        if(entity.isShiftKeyDown()) {
            return this.defaultBlockState().setValue(FACING, ctx.getClickedFace().getOpposite());
        }
        else {
            return this.defaultBlockState().setValue(FACING, ctx.getClickedFace());
        }
    }
}
