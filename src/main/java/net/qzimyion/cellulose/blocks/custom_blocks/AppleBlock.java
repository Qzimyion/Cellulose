package net.qzimyion.cellulose.blocks.custom_blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.qzimyion.cellulose.blocks.ModBlockProperties;

@SuppressWarnings("deprecation")
public class AppleBlock extends PlantBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final IntProperty FRUIT_AMOUNT = ModBlockProperties.FRUIT_AMOUNT;
    public static final BooleanProperty HANGING = Properties.HANGING;
    public static final VoxelShape SHAPE = Block.createCuboidShape(0, 14, 0, 16,16,16);

    public AppleBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(FRUIT_AMOUNT, 1).with(HANGING, true));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, FRUIT_AMOUNT, HANGING);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (blockState.isOf(this)) {
            return blockState.with(FRUIT_AMOUNT, Math.min(4, blockState.get(FRUIT_AMOUNT) + 1));
        }
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == state.get(FACING) && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        if (!context.shouldCancelInteraction() && context.getStack().isOf(this.asItem()) && state.get(FRUIT_AMOUNT) < 4) {
            return true;
        }
        return super.canReplace(state, context);
    }

    public static boolean isHanging(BlockState state) {
        return state.get(HANGING);
    }

    //Change OAK_LEAVES to APPLE_LEAVES later
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (AppleBlock.isHanging(state)) {
            return world.getBlockState(pos.up()).isOf(Blocks.OAK_LEAVES);
        }
        return super.canPlaceAt(state, world, pos);
    }

}
