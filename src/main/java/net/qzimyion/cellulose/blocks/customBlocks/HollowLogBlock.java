package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

@SuppressWarnings("deprecation")
public class HollowLogBlock extends PillarBlock implements Waterloggable {

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    private static final VoxelShape BARK_BOTTOM = Block.createCuboidShape(0F, 0F, 0F, 16F, 2F, 16F);
    private static final VoxelShape BARK_TOP = Block.createCuboidShape(0F, 14F, 0F, 16F, 16F, 16F);
    private static final VoxelShape BARK_NORTH = Block.createCuboidShape(0F, 0F, 0F, 2F, 16F, 16F);
    private static final VoxelShape BARK_SOUTH = Block.createCuboidShape(14F, 0F, 0F, 16F, 16F, 16F);
    private static final VoxelShape BARK_EAST = Block.createCuboidShape(0F, 0F, 0F, 16F, 16F, 2F);
    private static final VoxelShape BARK_WEST = Block.createCuboidShape(0F, 0F, 14F, 16F, 16F, 16F);

    private static final VoxelShape X_AXIS = VoxelShapes.union(BARK_BOTTOM, BARK_TOP, BARK_EAST, BARK_WEST);
    private static final VoxelShape Y_AXIS = VoxelShapes.union(BARK_NORTH, BARK_SOUTH, BARK_EAST, BARK_WEST);
    private static final VoxelShape Z_AXIS = VoxelShapes.union(BARK_BOTTOM, BARK_TOP, BARK_NORTH, BARK_SOUTH);

    public HollowLogBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return switch (state.get(AXIS)) {
            case Z -> Z_AXIS;
            case X -> X_AXIS;
            default -> Y_AXIS;
        };
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        boolean bl = fluidState.getFluid() == Fluids.WATER;
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().up());
        return Objects.requireNonNull(super.getPlacementState(ctx)).with(WATERLOGGED, bl);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS, WATERLOGGED);
    }


    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof PlayerEntity player) {
            Box playerHitbox = player.getBoundingBox();
            VoxelShape voxelShape = state.getOutlineShape(world, pos);
            Vec3d eyePos = player.getEyePos();
            float f = 2.0f/16.0f;
            Box logHitbox = voxelShape.getBoundingBox().offset(pos);
            if (logHitbox.intersects(playerHitbox) && eyePos.x > (pos.getX() + f) && eyePos.z > (pos.getZ() + f) && eyePos.x < (pos.getX() + 1 - f) && eyePos.z < (pos.getZ() + 1 - f)){
               player.canClimb(state);
            }
        }
    }
    
}
