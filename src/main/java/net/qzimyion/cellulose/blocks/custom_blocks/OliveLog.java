package net.qzimyion.cellulose.blocks.custom_blocks;

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
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.state.property.Properties.*;

@SuppressWarnings("deprecation")
public class OliveLog extends PillarBlock implements Waterloggable {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final VoxelShape SHAPE_X = Block.createCuboidShape(0.0, 4.0, 4.0, 16.0, 12.0, 12.0);
    public static final VoxelShape SHAPE_Y = Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    public static final VoxelShape SHAPE_Z = Block.createCuboidShape(4.0, 4.0, 0.0, 12.0, 12.0, 16.0);
    public OliveLog(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false).with(AXIS, Direction.Axis.Y));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return switch (state.get(AXIS)) {
            case Z -> SHAPE_Z;
            case X -> SHAPE_X;
            default -> SHAPE_Y;
        };
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
        return this.getDefaultState()
                .with(DOWN, blockState.getBlock() instanceof OliveLog || blockState.getBlock() instanceof LeavesBlock || blockState.isSideSolid(world, pos, Direction.UP, SideShapeType.CENTER))
                .with(UP, blockState2.getBlock() instanceof OliveLog || blockState2.getBlock() instanceof LeavesBlock ||  blockState2.isSideSolid(world, pos, Direction.DOWN, SideShapeType.CENTER))
                .with(NORTH, blockState3.getBlock() instanceof OliveLog || blockState3.getBlock() instanceof LeavesBlock || blockState3.isSideSolid(world, pos, Direction.SOUTH, SideShapeType.CENTER))
                .with(EAST, blockState4.getBlock() instanceof OliveLog || blockState4.getBlock() instanceof LeavesBlock || blockState4.isSideSolid(world, pos, Direction.WEST, SideShapeType.CENTER))
                .with(SOUTH, blockState5.getBlock() instanceof OliveLog || blockState5.getBlock() instanceof LeavesBlock || blockState5.isSideSolid(world, pos, Direction.NORTH, SideShapeType.CENTER))
                .with(WEST, blockState6.getBlock() instanceof OliveLog || blockState6.getBlock() instanceof LeavesBlock || blockState6.isSideSolid(world, pos, Direction.EAST, SideShapeType.CENTER));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return withConnectionProperties(world, pos);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS, WATERLOGGED);
    }

    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED)) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}
