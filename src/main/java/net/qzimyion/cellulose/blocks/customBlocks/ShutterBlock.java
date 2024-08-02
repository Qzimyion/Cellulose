package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class ShutterBlock extends HorizontalFacingBlock implements Waterloggable {
    public static final BooleanProperty OPEN = Properties.OPEN;
    public static final BooleanProperty POWERED = Properties.POWERED;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<DoorHinge> HINGE = Properties.DOOR_HINGE;
    protected static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
    protected static final VoxelShape EAST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    protected static final VoxelShape WEST_SHAPE = Block.createCuboidShape(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private final BlockSetType blockSetType;

    public ShutterBlock(Settings settings, BlockSetType blockSetType) {
        super(settings);
        this.blockSetType = blockSetType;
        this.setDefaultState(getDefaultState().with(FACING, Direction.NORTH).with(OPEN, false).with(HINGE, DoorHinge.LEFT).with(POWERED, false).with(WATERLOGGED, false));
    }

    public BlockSetType type() {
        return this.blockSetType;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, POWERED, WATERLOGGED, HINGE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction behindDir = state.get(FACING);
        boolean flag = !state.get(OPEN);
        boolean flag1 = state.get(HINGE) == DoorHinge.RIGHT;
        return switch (behindDir) {
            default -> flag ? NORTH_SHAPE : (flag1 ? WEST_SHAPE : EAST_SHAPE);
            case SOUTH -> flag ? SOUTH_SHAPE : (flag1 ? EAST_SHAPE : WEST_SHAPE);
            case EAST -> flag ? EAST_SHAPE : (flag1 ? NORTH_SHAPE : SOUTH_SHAPE);
            case WEST -> flag ? WEST_SHAPE : (flag1 ? SOUTH_SHAPE : NORTH_SHAPE);
        };
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return switch (type) {
            case LAND, AIR -> state.get(OPEN);
            case WATER -> state.get(WATERLOGGED);
        };
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
    }

    public BlockState rotate(BlockState state, BlockRotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirrorIn) {
        return mirrorIn == BlockMirror.NONE ? state : state.rotate(mirrorIn.getRotation(state.get(FACING))).cycle(HINGE);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    protected void playSound(@Nullable Entity entity, World world, BlockPos pos, boolean isOpen) {
        world.playSound(entity, pos, isOpen ? this.blockSetType.doorOpen() : this.blockSetType.doorClose(), SoundCategory.BLOCKS, 1.0F, world.getRandom().nextFloat() * 0.1F + 0.9F);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public long getRenderingSeed(BlockState state, BlockPos pos) {
        return MathHelper.hashCode(pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!this.blockSetType.canOpenByHand()) {
            return ActionResult.PASS;
        }
        state = state.cycle(OPEN);
        world.setBlockState(pos, state, 10);
        this.playSound(player, world, pos, state.get(OPEN));
        world.emitGameEvent(player, state.get(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
        if (state.get(WATERLOGGED)){
            world.scheduleBlockTick(pos, this, 20);
        }
        return ActionResult.success(world.isClient);
    }

    private DoorHinge getHinge(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        Direction behindDir = ctx.getHorizontalPlayerFacing(); // Behind
        Direction leftDir = behindDir.rotateYCounterclockwise(); // Left
        BlockPos leftPos = blockPos.offset(leftDir); // Left Pos
        BlockState leftBlockstate = world.getBlockState(leftPos); // Left BlockState
        Direction rightDir = behindDir.rotateYClockwise(); // Right
        BlockPos rightPos = blockPos.offset(rightDir); // Right Pos
        BlockState rightBlockstate = world.getBlockState(rightPos); // Right Blockstate

        int i = ((leftBlockstate.isFullCube(world, leftPos)) ? -1 : 0) + (rightBlockstate.isFullCube(world, rightPos) ? 1 : 0);
        boolean bl = leftBlockstate.getBlock() == this;
        boolean bl1 = rightBlockstate.getBlock() == this;
        if ((!bl || bl1) && i <= 0) {
            if ((!bl1 || bl) && i == 0) {
                int j = behindDir.getOffsetX();
                int k = behindDir.getOffsetZ();
                Vec3d vec3d = ctx.getHitPos();
                double d0 = vec3d.x - (double) blockPos.getX();
                double d1 = vec3d.z - (double) blockPos.getZ();
                return (j >= 0 || !(d1 < 0.5D)) && (j <= 0 || !(d1 > 0.5D)) && (k >= 0 || !(d0 > 0.5D)) && (k <= 0 || !(d0 < 0.5D)) ? DoorHinge.LEFT : DoorHinge.RIGHT;
            } else {
                return DoorHinge.LEFT;
            }
        } else {
            return DoorHinge.RIGHT;
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockpos = ctx.getBlockPos();
        World world = ctx.getWorld();

        if (blockpos.getY() < world.getTopY() && world.getBlockState(blockpos.up()).canReplace(ctx)) {
            Direction face = ctx.getHorizontalPlayerFacing();
            DoorHinge hinge = this.getHinge(ctx);
            boolean flag = world.isReceivingRedstonePower(blockpos) || world.isReceivingRedstonePower(blockpos.up());
            boolean waterlogged = world.getFluidState(blockpos).getFluid() == Fluids.WATER;
            if (ctx.getHorizontalPlayerFacing() == ctx.getHorizontalPlayerFacing().getOpposite() && ctx.getHorizontalPlayerFacing().getAxis().isHorizontal()) {
               face = face.getOpposite();
               hinge = hinge == DoorHinge.LEFT ? DoorHinge.RIGHT : DoorHinge.LEFT;
            }
            return this.getDefaultState().with(FACING, face).with(HINGE, hinge).with(POWERED, flag).with(OPEN, flag).with(WATERLOGGED, waterlogged);
        } else {
            return null;
        }
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        boolean bl = world.isReceivingRedstonePower(pos);
        if (sourceBlock != this && bl != state.get(POWERED)){
            if (bl != state.get(OPEN)){
                this.playSound(null, world, pos, bl);
                world.setBlockState(pos, state.with(POWERED, bl).with(OPEN, bl), Block.NOTIFY_LISTENERS);
            }
        }
    }
}
