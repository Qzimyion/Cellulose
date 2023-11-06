package net.qzimyion.cellulose.blocks.customBlocks.SawdustStuff;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.LightType;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class SawdustLayerBlock extends FallingBlock implements Waterloggable {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final IntProperty SAWDUST = ModBlockProperties.SAWDUST_LAYERS;
    public static final VoxelShape[] LAYERS_TO_SHAPE = new VoxelShape[]{VoxelShapes.empty(),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 1.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 13.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0),
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)};

    public SawdustLayerBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(SAWDUST, 1).with(WATERLOGGED, false));
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        switch (type) {
            case LAND -> {
                return state.get(SAWDUST) < 8;
            }
            case WATER, AIR -> {
                return false;
            }
        }
        return false;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return LAYERS_TO_SHAPE[state.get(SAWDUST)];
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return LAYERS_TO_SHAPE[state.get(SAWDUST) - 1];
    }

    @Override
    public VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        return LAYERS_TO_SHAPE[state.get(SAWDUST)];
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return LAYERS_TO_SHAPE[state.get(SAWDUST)];
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return state.get(SAWDUST) == 16 ? 0.2f : 1.0f;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.down());
        return Block.isFaceFullSquare(blockState.getCollisionShape(world, pos.down()), Direction.UP) || blockState.isOf(this) && blockState.get(SAWDUST) == 16;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getLightLevel(LightType.BLOCK, pos) > 11) {
            SnowBlock.dropStacks(state, world, pos);
            world.removeBlock(pos, false);
        }
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        int i = state.get(SAWDUST);
        if (context.getStack().isOf(this.asItem()) && i < 16) {
            if (context.canReplaceExisting()) {
                return context.getSide() == Direction.UP;
            }
            return true;
        }
        return i == 1;
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (blockState.isOf(this)) {
            int i = blockState.get(SAWDUST);
            return blockState.with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER)).with(SAWDUST, Math.min(16, i + 1));
        }
        return super.getPlacementState(ctx);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SAWDUST, WATERLOGGED);
    }
}
