package net.qzimyion.cellulose.blocks.customBlocks.CustomDoorsAndTrapdoors;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
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
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.blocks.customBlocks.CustomDoorsAndTrapdoors.properties.TripleDoorShape;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings({"deprecation", "ReassignedVariable", "UnonUsedAssignment", "NonStrictComparisonCanBeEquality"})
public class TripleDoorBlock extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty OPEN = Properties.OPEN;
    public static final EnumProperty<DoorHinge> HINGE = Properties.DOOR_HINGE;
    public static final EnumProperty<TripleDoorShape> TRIPLE_DOOR_SHAPE = ModBlockProperties.TRIPLE_DOOR_SHAPE;
    public static final BooleanProperty POWERED = Properties.POWERED;
    protected static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
    protected static final VoxelShape EAST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    protected static final VoxelShape WEST_SHAPE = Block.createCuboidShape(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private final BlockSetType blockSetType;

    public TripleDoorBlock(Settings settings, BlockSetType blockSetType) {
        super(settings);
        this.blockSetType = blockSetType;
        this.setDefaultState(getDefaultState().with(FACING, Direction.NORTH).with(OPEN, false).with(HINGE, DoorHinge.LEFT).with(POWERED, false).with(TRIPLE_DOOR_SHAPE, TripleDoorShape.LOWER));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TRIPLE_DOOR_SHAPE, FACING, OPEN, HINGE, POWERED);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction direction = state.get(FACING);
        boolean bl = !state.get(OPEN);
        boolean bl1 = state.get(HINGE) == DoorHinge.RIGHT;
        return switch (direction) {
            default -> bl ? EAST_SHAPE : (bl1 ? NORTH_SHAPE : SOUTH_SHAPE);
            case SOUTH -> bl ? SOUTH_SHAPE : (bl1 ? EAST_SHAPE : WEST_SHAPE);
            case WEST -> bl ? WEST_SHAPE : (bl1 ? SOUTH_SHAPE : NORTH_SHAPE);
            case NORTH -> bl ? NORTH_SHAPE : (bl1 ? WEST_SHAPE : EAST_SHAPE);
        };
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return switch (type) {
            case LAND, AIR -> state.get(OPEN);
            case WATER -> false;
        };
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        TripleDoorShape tripleDoorShape = state.get(TRIPLE_DOOR_SHAPE);
        if (direction.getAxis() == Direction.Axis.Y && ((tripleDoorShape == TripleDoorShape.LOWER == (direction == Direction.UP)) || tripleDoorShape == TripleDoorShape.MIDDLE)) {
            if (neighborState.getBlock() == this && neighborState.get(TRIPLE_DOOR_SHAPE) != tripleDoorShape) {
                return state.with(FACING, neighborState.get(FACING)).with(OPEN, neighborState.get(OPEN)).with(HINGE, neighborState.get(HINGE)).with(POWERED, neighborState.get(POWERED));
            } else {
                return Blocks.AIR.getDefaultState();
            }
        } else {
            if (tripleDoorShape == TripleDoorShape.LOWER && direction == Direction.DOWN && !state.canPlaceAt(world, pos)) {
                return Blocks.AIR.getDefaultState();
            } else {
                return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
            }
        }
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient && player.isCreative()) {
            BlockPos otherPos1;
            BlockPos otherPos2;
            TripleDoorShape tripleDoorShape = state.get(TRIPLE_DOOR_SHAPE);
            otherPos2 = switch (tripleDoorShape) {
                case LOWER -> {
                    otherPos1 = pos.up();
                    yield pos.up(2);
                }
                case MIDDLE -> {
                    otherPos1 = pos.down();
                    yield pos.up();
                }
                case UPPER -> {
                    otherPos1 = pos.down(2);
                    yield pos.down();
                }
            };
            BlockState blockstate1 = world.getBlockState(otherPos1);
            BlockState blockstate2 = world.getBlockState(otherPos2);
            if (blockstate1.getBlock() == state.getBlock() && blockstate1.get(TRIPLE_DOOR_SHAPE) == TripleDoorShape.LOWER) {
                world.syncWorldEvent(player, 2001, otherPos1, Block.getRawIdFromState(blockstate1));
            }
            if (blockstate2.getBlock() == state.getBlock() && blockstate2.get(TRIPLE_DOOR_SHAPE) == TripleDoorShape.LOWER) {
                world.syncWorldEvent(player, 2001, otherPos1, Block.getRawIdFromState(blockstate1));
            }
        }
        super.onBreak(world, pos, state, player);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockpos = ctx.getBlockPos();
        if (blockpos.getY() < ctx.getWorld().getTopY() - 2 && ctx.getWorld().getBlockState(blockpos.up()).canReplace(ctx) && ctx.getWorld().getBlockState(blockpos.up(2)).canReplace(ctx)) {
            World world = ctx.getWorld();
            boolean bl = world.isReceivingRedstonePower(blockpos) || world.isReceivingRedstonePower(blockpos.up());
            return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing()).with(HINGE, this.getHinge(ctx)).with(POWERED, bl).with(OPEN, bl).with(TRIPLE_DOOR_SHAPE, TripleDoorShape.LOWER);
        }
        return null;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        world.setBlockState(pos.up(), state.with(TRIPLE_DOOR_SHAPE, TripleDoorShape.MIDDLE));
        world.setBlockState(pos.up(2), state.with(TRIPLE_DOOR_SHAPE, TripleDoorShape.UPPER));
    }

    //This took fucking forever to get right
    private DoorHinge getHinge(ItemPlacementContext ctx) {
        World blockView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        Direction direction = ctx.getHorizontalPlayerFacing();
        BlockPos blockPos2 = blockPos.up();
        Direction direction2 = direction.rotateYCounterclockwise();
        BlockPos blockPos3 = blockPos.offset(direction2);
        BlockState blockState = blockView.getBlockState(blockPos3);
        BlockPos blockPos4 = blockPos2.offset(direction2);
        BlockState blockState2 = blockView.getBlockState(blockPos4);
        Direction direction3 = direction.rotateYClockwise();
        BlockPos blockPos5 = blockPos.offset(direction3);
        BlockState blockState3 = blockView.getBlockState(blockPos5);
        BlockPos blockPos6 = blockPos2.offset(direction3);
        BlockState blockState4 = blockView.getBlockState(blockPos6);

        int i = (blockState.isFullCube(blockView, blockPos3) ? -1 : 0) + (blockState2.isFullCube(blockView, blockPos4) ? -1 : 0) + (blockState3.isFullCube(blockView, blockPos5) ? 1 : 0) + (blockState4.isFullCube(blockView, blockPos6) ? 1 : 0);
        boolean leftIsLowerOfSameType = blockState.getBlock() == this && blockState.get(TRIPLE_DOOR_SHAPE) == TripleDoorShape.LOWER;
        boolean rightIsLowerOfSameType = blockState3.getBlock() == this && blockState3.get(TRIPLE_DOOR_SHAPE) == TripleDoorShape.LOWER;
        if ((!leftIsLowerOfSameType || rightIsLowerOfSameType) && i <= 0) {
            if ((!rightIsLowerOfSameType || leftIsLowerOfSameType) && i >= 0) {
                int j = direction.getOffsetX();
                int k = direction.getOffsetZ();
                Vec3d vec3d = ctx.getHitPos();
                double d0 = vec3d.x - (double)blockPos.getX();
                double d1 = vec3d.z - (double)blockPos.getZ();
                return (j >= 0 || !(d1 < 0.5D)) && (j <= 0 || !(d1 > 0.5D)) && (k >= 0 || !(d0 > 0.5D)) && (k <= 0 || !(d0 < 0.5D)) ? DoorHinge.LEFT : DoorHinge.RIGHT;
            } else {
                return DoorHinge.LEFT;
            }
        } else {
            return DoorHinge.RIGHT;
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
        if (!this.blockSetType.canOpenByHand()) {
            return ActionResult.PASS;
        }
        state = state.cycle(OPEN);
        world.setBlockState(pos, state, 10);
        this.playSound(player, world, pos, state.get(OPEN));
        world.emitGameEvent(player, state.get(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
        return ActionResult.success(world.isClient);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos fromPos, boolean isMoving) {
        boolean bl = world.isReceivingRedstonePower(pos);
        if (!bl) {
            bl = switch (state.get(TRIPLE_DOOR_SHAPE)) {
                case LOWER -> world.isReceivingRedstonePower(pos.offset(Direction.UP)) || world.isReceivingRedstonePower(pos.offset(Direction.UP, 2));
                case MIDDLE -> world.isReceivingRedstonePower(pos.offset(Direction.DOWN)) || world.isReceivingRedstonePower(pos.offset(Direction.UP));
                case UPPER -> world.isReceivingRedstonePower(pos.offset(Direction.DOWN)) || world.isReceivingRedstonePower(pos.offset(Direction.DOWN, 2));
            };
        }
        if (sourceBlock != this && bl != state.get(POWERED)){
            this.playSound(null, world, pos, bl);
            world.setBlockState(pos, state.with(POWERED, bl).with(OPEN, bl), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        boolean result;
        BlockPos below = pos.down();
        BlockPos below2 = below.down();
        BlockState belowState = world.getBlockState(below);
        BlockState below2State = world.getBlockState(below2);
        if (state.get(TRIPLE_DOOR_SHAPE) == TripleDoorShape.LOWER) {
            result = belowState.isSideSolidFullSquare(world, below, Direction.UP);
            return result;
        } else if (state.get(TRIPLE_DOOR_SHAPE) == TripleDoorShape.MIDDLE) {
            result = belowState.getBlock() == this;
            return result;
        } else {
            result = belowState.getBlock() == this && below2State.getBlock() == this;
            return result;
        }
    }

    protected void playSound(@Nullable Entity entity, World world, BlockPos pos, boolean isOpen) {
        world.playSound(entity, pos, isOpen ? this.blockSetType.doorOpen() : this.blockSetType.doorClose(), SoundCategory.BLOCKS, 1.0F, world.getRandom().nextFloat() * 0.1F + 0.9F);
    }

    @Override
    public long getRenderingSeed(BlockState state, BlockPos pos) {
        return MathHelper.hashCode(pos.getX(), pos.down(state.get(TRIPLE_DOOR_SHAPE) == TripleDoorShape.LOWER ? 0 : state.get(TRIPLE_DOOR_SHAPE) == TripleDoorShape.MIDDLE ? 1 : 2).getY(), pos.getZ());
    }

    public BlockState rotate(BlockState state, BlockRotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirrorIn) {
        return mirrorIn == BlockMirror.NONE ? state : state.rotate(mirrorIn.getRotation(state.get(FACING))).cycle(HINGE);
    }

    public BlockSetType type() {
        return this.blockSetType;
    }
}

