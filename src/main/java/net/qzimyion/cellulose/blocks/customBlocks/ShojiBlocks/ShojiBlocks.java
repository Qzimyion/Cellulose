package net.qzimyion.cellulose.blocks.customBlocks.ShojiBlocks;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.qzimyion.cellulose.blocks.ModBlockProperties;

@SuppressWarnings("deprecation")
public class ShojiBlocks extends Block implements Waterloggable {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final EnumProperty<ShojiShapes> SHOJI_SHAPE = ModBlockProperties.SHOJI_SHAPE;

    //General Shape
    protected static final VoxelShape SHOJI_WALL_NORTH = Block.createCuboidShape(0, 0, 7, 16, 16, 9);
    protected static final VoxelShape SHOJI_WALL_SOUTH = Block.createCuboidShape(0, 0, 7, 16, 16, 9);
    protected static final VoxelShape SHOJI_WALL_EAST_WEST = Block.createCuboidShape(7, 0, 0, 9, 16, 16);

    public ShojiBlocks(Settings settings) {
        super(settings);
        this.setDefaultState(getDefaultState().with(FACING, Direction.NORTH).with(SHOJI_SHAPE, ShojiShapes.NONE).with(WATERLOGGED, false));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx){
        return switch (state.get(FACING)){
            default -> SHOJI_WALL_NORTH;
            case SOUTH -> SHOJI_WALL_SOUTH;
            case EAST, WEST -> SHOJI_WALL_EAST_WEST;
        };
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, SHOJI_SHAPE);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return getConnection(state, world, pos);
    }

    public BlockState getConnection(BlockState state, WorldAccess world, BlockPos pos){
        Direction facing = state.get(FACING);

        BlockState top = world.getBlockState(pos.up());
        BlockState bottom = world.getBlockState(pos.down());

        boolean sideU = (bottom.getBlock() instanceof ShojiBlocks && (bottom.get(FACING)==facing));
        boolean sideD = (top.getBlock() instanceof ShojiBlocks && (top.get(FACING)==facing));
        ShojiShapes shapes = sideU && sideD ? ShojiShapes.MIDDLE : (sideD ? ShojiShapes.BOTTOM : (sideU ? ShojiShapes.TOP : ShojiShapes.NONE));
        return state.with(SHOJI_SHAPE, shapes);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation)
    {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror)
    {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

}
