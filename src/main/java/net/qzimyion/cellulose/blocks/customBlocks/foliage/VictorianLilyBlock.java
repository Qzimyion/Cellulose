package net.qzimyion.cellulose.blocks.customBlocks.foliage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.util.VictorianLilyBlockShape;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

@SuppressWarnings("deprecation")
public class VictorianLilyBlock extends BushBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<VictorianLilyBlockShape> SHAPE_PROPERTY = ModBlockProperties.VICTORIAN_LILY_SHAPE;

    public VictorianLilyBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SHAPE_PROPERTY, FACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.box(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        return validConnections(state, world, pos);
    }

    @SuppressWarnings("DataFlowIssue")
    private BlockState validConnections(BlockState state, BlockGetter world, BlockPos pos) {
        Direction facing = state.getValue(FACING);
        BlockPos south = pos;
        BlockPos north = pos.relative(facing);
        BlockPos east = north.relative(facing.getClockWise());
        BlockPos west = pos.relative(facing.getClockWise());

        boolean lilypadSurvive = true;
        VictorianLilyBlockShape shape = state.getValue(SHAPE_PROPERTY);

        switch (shape) {
            case SOUTH_WEST:
                south = pos;
                north = pos.relative(facing);
                east = north.relative(facing.getClockWise());
                west = pos.relative(facing.getClockWise());
                break;
            case NORTH_WEST:
                south = pos.relative(facing.getOpposite());
                north = pos;
                east = pos.relative(facing.getClockWise());
                west = south.relative(facing.getClockWise());
                break;
            case NORTH_EAST:
                north = pos.relative(facing.getCounterClockWise(Direction.Axis.Y));
                east = pos;
                west = pos.relative(facing.getOpposite());
                south = west.relative(facing);
                break;
            case SOUTH_EAST:
                south = pos.relative(facing.getCounterClockWise(Direction.Axis.Y));
                east = pos.relative(facing);
                west = pos;
                north = east.relative(facing.getCounterClockWise(Direction.Axis.Y));
                break;
        }
        if (!world.getBlockState(south).is(this) || world.getBlockState(north).is(this) || world.getBlockState(east).is(this) || world.getBlockState(west).is(this)){
            lilypadSurvive = false;
        }
        if (world.getBlockState(south).is(this) && world.getBlockState(south).getValue(FACING) != facing && world.getBlockState(south).getValue(SHAPE_PROPERTY) != VictorianLilyBlockShape.SOUTH_WEST) {
            lilypadSurvive = false;
        }
        if (world.getBlockState(north).is(this) && world.getBlockState(north).getValue(FACING) != facing && world.getBlockState(north).getValue(SHAPE_PROPERTY) != VictorianLilyBlockShape.NORTH_WEST) {
            lilypadSurvive = false;
        }
        if (world.getBlockState(east).is(this) && world.getBlockState(east).getValue(FACING) != facing && world.getBlockState(east).getValue(SHAPE_PROPERTY) != VictorianLilyBlockShape.NORTH_EAST) {
            lilypadSurvive = false;
        }
        if (world.getBlockState(west).is(this) && world.getBlockState(west).getValue(FACING) != facing && world.getBlockState(west).getValue(SHAPE_PROPERTY) != VictorianLilyBlockShape.SOUTH_EAST) {
            lilypadSurvive = false;
        }
        if (!lilypadSurvive) {
            return Blocks.AIR.defaultBlockState();
        } else {
            return state.setValue(SHAPE_PROPERTY, shape);
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction direction = context.getHorizontalDirection();
        BlockPos blockpos = context.getClickedPos();
        BlockPos blockpos1 = blockpos.relative(direction);
        BlockPos blockpos2 = blockpos1.relative(direction.getClockWise());
        BlockPos blockpos3 = blockpos.relative(direction.getClockWise());

        Level world = context.getLevel();
        if (mayPlaceOn(world.getBlockState(blockpos1.below()), world, blockpos1.below()) &&
                world.getBlockState(blockpos1).canBeReplaced(context) &&
                world.getWorldBorder().isWithinBounds(blockpos1) &&
                mayPlaceOn(world.getBlockState(blockpos2.below()), world, blockpos2.below()) &&
                world.getBlockState(blockpos2).canBeReplaced(context) &&
                world.getWorldBorder().isWithinBounds(blockpos2) &&
                mayPlaceOn(world.getBlockState(blockpos3.below()), world, blockpos3.below()) &&
                world.getBlockState(blockpos3).canBeReplaced(context) &&
                world.getWorldBorder().isWithinBounds(blockpos3)) {

            return this.defaultBlockState().setValue(FACING, direction);
        }
        return null;
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        FluidState state = world.getFluidState(pos);
        FluidState state1 = world.getFluidState(pos.above());
        return state.getType() == Fluids.WATER || floor.getBlock() instanceof IceBlock && state1.getType() == Fluids.EMPTY;
    }

    @Override
    public void setPlacedBy(Level world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.setPlacedBy(world, pos, state, placer, itemStack);
        if (!world.isClientSide()){
            BlockPos blockpos = pos.relative(state.getValue(FACING));
            BlockPos blockpos1 = blockpos.relative(state.getValue(FACING).getClockWise());
            BlockPos blockpos2 = pos.relative(state.getValue(FACING).getClockWise());
            world.setBlock(blockpos, state.setValue(SHAPE_PROPERTY, VictorianLilyBlockShape.NORTH_WEST), 26);
            world.setBlock(blockpos1, state.setValue(SHAPE_PROPERTY, VictorianLilyBlockShape.NORTH_EAST), 26);
            world.setBlock(blockpos2, state.setValue(SHAPE_PROPERTY, VictorianLilyBlockShape.SOUTH_EAST), 26);
            world.blockUpdated(pos, Blocks.AIR.defaultBlockState().getBlock());
            world.blockUpdated(blockpos, Blocks.AIR.defaultBlockState().getBlock());
            world.blockUpdated(blockpos1, Blocks.AIR.defaultBlockState().getBlock());
            world.blockUpdated(blockpos2, Blocks.AIR.defaultBlockState().getBlock());
            state.updateNeighbourShapes(world, pos, 30);
            state.updateNeighbourShapes(world, blockpos, 30);
            state.updateNeighbourShapes(world, blockpos1, 30);
            state.updateNeighbourShapes(world, blockpos2, 30);
        }
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    private Item getBoatItem(Boat.Type boatType) {
        return switch (boatType) {
            case SPRUCE -> Items.SPRUCE_BOAT;
            case BIRCH -> Items.BIRCH_BOAT;
            case JUNGLE -> Items.JUNGLE_BOAT;
            case ACACIA -> Items.ACACIA_BOAT;
            case DARK_OAK -> Items.DARK_OAK_BOAT;
            case MANGROVE -> Items.MANGROVE_BOAT;
            case BAMBOO -> Items.BAMBOO_RAFT;
            case CHERRY -> Items.CHERRY_BOAT;
            default -> Items.OAK_BOAT;
        };
    }

    @Override
    public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity) {
        Random random = new Random();
        if (world instanceof ServerLevel && entity instanceof Boat) {
            world.destroyBlock(new BlockPos(pos), true, entity);
        }
        if (random.nextFloat() <= 0.25f && entity instanceof Boat boatEntity){
            Boat.Type boatType = boatEntity.getVariant();
            boatEntity.spawnAtLocation(getBoatItem(boatType));
            boatEntity.discard();
        }
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
}
