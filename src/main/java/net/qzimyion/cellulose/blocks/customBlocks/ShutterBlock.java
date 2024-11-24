package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class ShutterBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;
    protected static final VoxelShape NORTH_SHAPE = Block.box(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
    protected static final VoxelShape EAST_SHAPE = Block.box(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    protected static final VoxelShape WEST_SHAPE = Block.box(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private final BlockSetType blockSetType;

    public ShutterBlock(Properties settings, BlockSetType blockSetType) {
        super(settings);
        this.blockSetType = blockSetType;
        this.registerDefaultState(defaultBlockState().setValue(FACING, Direction.NORTH).setValue(OPEN, false).setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, false).setValue(WATERLOGGED, false));
    }

    public BlockSetType type() {
        return this.blockSetType;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, POWERED, WATERLOGGED, HINGE);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter view, BlockPos pos, CollisionContext ctx) {
        Direction behindDir = state.getValue(FACING);
        boolean flag = !state.getValue(OPEN);
        boolean flag1 = state.getValue(HINGE) == DoorHingeSide.RIGHT;
        return switch (behindDir) {
            default -> flag ? NORTH_SHAPE : (flag1 ? WEST_SHAPE : EAST_SHAPE);
            case SOUTH -> flag ? SOUTH_SHAPE : (flag1 ? EAST_SHAPE : WEST_SHAPE);
            case EAST -> flag ? EAST_SHAPE : (flag1 ? NORTH_SHAPE : SOUTH_SHAPE);
            case WEST -> flag ? WEST_SHAPE : (flag1 ? SOUTH_SHAPE : NORTH_SHAPE);
        };
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter world, BlockPos pos, PathComputationType type) {
        return switch (type) {
            case LAND, AIR -> state.getValue(OPEN);
            case WATER -> state.getValue(WATERLOGGED);
        };
    }

    @Override
    public void playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(world, pos, state, player);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return mirrorIn == Mirror.NONE ? state : state.rotate(mirrorIn.getRotation(state.getValue(FACING))).cycle(HINGE);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }

    protected void playSound(@Nullable Entity entity, Level world, BlockPos pos, boolean isOpen) {
        world.playSound(entity, pos, isOpen ? this.blockSetType.doorOpen() : this.blockSetType.doorClose(), SoundSource.BLOCKS, 1.0F, world.getRandom().nextFloat() * 0.1F + 0.9F);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public long getSeed(BlockState state, BlockPos pos) {
        return Mth.getSeed(pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!this.blockSetType.canOpenByHand()) {
            return InteractionResult.PASS;
        }
        state = state.cycle(OPEN);
        world.setBlock(pos, state, 10);
        this.playSound(player, world, pos, state.getValue(OPEN));
        world.gameEvent(player, state.getValue(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
        if (state.getValue(WATERLOGGED)){
            world.scheduleTick(pos, this, 20);
        }
        return InteractionResult.sidedSuccess(world.isClientSide);
    }

    private DoorHingeSide getHinge(BlockPlaceContext ctx) {
        Level world = ctx.getLevel();
        BlockPos blockPos = ctx.getClickedPos();
        Direction behindDir = ctx.getHorizontalDirection(); // Behind
        Direction leftDir = behindDir.getCounterClockWise(); // Left
        BlockPos leftPos = blockPos.relative(leftDir); // Left Pos
        BlockState leftBlockstate = world.getBlockState(leftPos); // Left BlockState
        Direction rightDir = behindDir.getClockWise(); // Right
        BlockPos rightPos = blockPos.relative(rightDir); // Right Pos
        BlockState rightBlockstate = world.getBlockState(rightPos); // Right Blockstate

        int i = ((leftBlockstate.isCollisionShapeFullBlock(world, leftPos)) ? -1 : 0) + (rightBlockstate.isCollisionShapeFullBlock(world, rightPos) ? 1 : 0);
        boolean bl = leftBlockstate.getBlock() == this;
        boolean bl1 = rightBlockstate.getBlock() == this;
        if ((!bl || bl1) && i <= 0) {
            if ((!bl1 || bl) && i == 0) {
                int j = behindDir.getStepX();
                int k = behindDir.getStepZ();
                Vec3 vec3d = ctx.getClickLocation();
                double d0 = vec3d.x - (double) blockPos.getX();
                double d1 = vec3d.z - (double) blockPos.getZ();
                return (j >= 0 || !(d1 < 0.5D)) && (j <= 0 || !(d1 > 0.5D)) && (k >= 0 || !(d0 > 0.5D)) && (k <= 0 || !(d0 < 0.5D)) ? DoorHingeSide.LEFT : DoorHingeSide.RIGHT;
            } else {
                return DoorHingeSide.LEFT;
            }
        } else {
            return DoorHingeSide.RIGHT;
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockPos blockpos = ctx.getClickedPos();
        Level world = ctx.getLevel();

        if (blockpos.getY() < world.getMaxBuildHeight() && world.getBlockState(blockpos.above()).canBeReplaced(ctx)) {
            Direction face = ctx.getHorizontalDirection();
            DoorHingeSide hinge = this.getHinge(ctx);
            boolean flag = world.hasNeighborSignal(blockpos) || world.hasNeighborSignal(blockpos.above());
            boolean waterlogged = world.getFluidState(blockpos).getType() == Fluids.WATER;
            if (ctx.getHorizontalDirection() == ctx.getHorizontalDirection().getOpposite() && ctx.getHorizontalDirection().getAxis().isHorizontal()) {
               face = face.getOpposite();
               hinge = hinge == DoorHingeSide.LEFT ? DoorHingeSide.RIGHT : DoorHingeSide.LEFT;
            }
            return this.defaultBlockState().setValue(FACING, face).setValue(HINGE, hinge).setValue(POWERED, flag).setValue(OPEN, flag).setValue(WATERLOGGED, waterlogged);
        } else {
            return null;
        }
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        boolean bl = world.hasNeighborSignal(pos);
        if (sourceBlock != this && bl != state.getValue(POWERED)){
            if (bl != state.getValue(OPEN)){
                this.playSound(null, world, pos, bl);
                world.setBlock(pos, state.setValue(POWERED, bl).setValue(OPEN, bl), Block.UPDATE_CLIENTS);
            }
        }
    }
}
