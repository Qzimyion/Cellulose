package net.qzimyion.cellulose.blocks.customBlocks.foliage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

@SuppressWarnings("deprecation")
public class HollowLogBlock extends RotatedPillarBlock implements SimpleWaterloggedBlock {

    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape BARK_BOTTOM = Block.box(0F, 0F, 0F, 16F, 2F, 16F);
    private static final VoxelShape BARK_TOP = Block.box(0F, 14F, 0F, 16F, 16F, 16F);
    private static final VoxelShape BARK_NORTH = Block.box(0F, 0F, 0F, 2F, 16F, 16F);
    private static final VoxelShape BARK_SOUTH = Block.box(14F, 0F, 0F, 16F, 16F, 16F);
    private static final VoxelShape BARK_EAST = Block.box(0F, 0F, 0F, 16F, 16F, 2F);
    private static final VoxelShape BARK_WEST = Block.box(0F, 0F, 14F, 16F, 16F, 16F);

    private static final VoxelShape X_AXIS = Shapes.or(BARK_BOTTOM, BARK_TOP, BARK_EAST, BARK_WEST);
    private static final VoxelShape Y_AXIS = Shapes.or(BARK_NORTH, BARK_SOUTH, BARK_EAST, BARK_WEST);
    private static final VoxelShape Z_AXIS = Shapes.or(BARK_BOTTOM, BARK_TOP, BARK_NORTH, BARK_SOUTH);

    public HollowLogBlock(Properties settings) {
        super(settings);
        registerDefaultState(defaultBlockState().setValue(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        return switch (state.getValue(AXIS)) {
            case Z -> Z_AXIS;
            case X -> X_AXIS;
            default -> Y_AXIS;
        };
    }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
        boolean bl = fluidState.getType() == Fluids.WATER;
        BlockState blockState = ctx.getLevel().getBlockState(ctx.getClickedPos().above());
        return Objects.requireNonNull(super.getStateForPlacement(ctx)).setValue(WATERLOGGED, bl);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS, WATERLOGGED);
    }
    
}
