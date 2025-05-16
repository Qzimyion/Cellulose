package net.qzimyion.cellulose.blocks.customBlocks.PannelBlocks.ShojiBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.util.ShojiShapes;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class ShojiBlocks extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<ShojiShapes> SHOJI_SHAPE = ModBlockProperties.SHOJI_SHAPE;

    //General Shape
    protected static final VoxelShape SHOJI_WALL_NORTH = Block.box(0, 0, 7, 16, 16, 9);
    protected static final VoxelShape SHOJI_WALL_SOUTH = Block.box(0, 0, 7, 16, 16, 9);
    protected static final VoxelShape SHOJI_WALL_EAST_WEST = Block.box(7, 0, 0, 9, 16, 16);

    public ShojiBlocks(Properties settings) {
        super(settings);
        this.registerDefaultState(defaultBlockState().setValue(FACING, Direction.NORTH).setValue(SHOJI_SHAPE, ShojiShapes.NONE).setValue(WATERLOGGED, false));
    }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext ctx){
        return switch (state.getValue(FACING)){
            case SOUTH -> SHOJI_WALL_SOUTH;
            case EAST, WEST -> SHOJI_WALL_EAST_WEST;
            default -> SHOJI_WALL_NORTH;
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, SHOJI_SHAPE);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return getConnection(state, world, pos);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    public BlockState getConnection(BlockState state, LevelAccessor world, BlockPos pos){
        Direction facing = state.getValue(FACING);

        BlockState top = world.getBlockState(pos.above());
        BlockState bottom = world.getBlockState(pos.below());

        boolean sideU = (bottom.getBlock() instanceof ShojiBlocks && (bottom.getValue(FACING)==facing));
        boolean sideD = (top.getBlock() instanceof ShojiBlocks && (top.getValue(FACING)==facing));
        ShojiShapes shapes = sideU && sideD ? ShojiShapes.MIDDLE : (sideD ? ShojiShapes.BOTTOM
                : (sideU ? ShojiShapes.TOP : ShojiShapes.NONE));
        return state.setValue(SHOJI_SHAPE, shapes);
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation)
    {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror)
    {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

}
