package net.qzimyion.cellulose.blocks.customBlocks.PostBlocks;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class PostChunkBlock extends ConnectingBlock implements Waterloggable {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public PostChunkBlock(Settings settings) {
        super(0.2495F,settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(NORTH, false).with(EAST, false).with(SOUTH, false).with(WEST, false).with(UP, false).with(DOWN, false).with(WATERLOGGED, false));
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return this.withConnectionProperties(ctx.getWorld(), ctx.getBlockPos()).with(WATERLOGGED, fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8);
    }

    public BlockState withConnectionProperties(BlockView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.down());
        BlockState blockState2 = world.getBlockState(pos.up());
        BlockState blockState3 = world.getBlockState(pos.north());
        BlockState blockState4 = world.getBlockState(pos.east());
        BlockState blockState5 = world.getBlockState(pos.south());
        BlockState blockState6 = world.getBlockState(pos.west());
        return this.getDefaultState().with(DOWN, blockState.getBlock() instanceof PostChunkBlock || blockState.isSideSolid(world, pos, Direction.UP, SideShapeType.CENTER)
        ).with(
                UP,
                blockState2.getBlock() instanceof PostChunkBlock || blockState2.isSideSolid(world, pos, Direction.DOWN, SideShapeType.CENTER)
        ).with(NORTH, blockState3.getBlock() instanceof PostChunkBlock || blockState3.isSideSolid(world, pos, Direction.SOUTH, SideShapeType.CENTER)).with(
                EAST,
                blockState4.getBlock() instanceof PostChunkBlock || blockState4.isSideSolid(world, pos, Direction.WEST, SideShapeType.CENTER)
        ).with(SOUTH, blockState5.getBlock() instanceof PostChunkBlock || blockState5.isSideSolid(world, pos, Direction.NORTH, SideShapeType.CENTER)).with(
                WEST,
                blockState6.getBlock() instanceof PostChunkBlock || blockState6.isSideSolid(world, pos, Direction.EAST, SideShapeType.CENTER)
        );
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        boolean bl = neighborState.isSideSolid(world, pos, direction.getOpposite(), SideShapeType.CENTER) || neighborState.getBlock() instanceof PostChunkBlock;
        return state.with(FACING_PROPERTIES.get(direction), bl);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, NORTH, EAST, SOUTH, WEST, UP, DOWN);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}
