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
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.util.TwoByTwoShapeEnum;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

@SuppressWarnings("deprecation")
public class VictorianLilyBlock extends BushBlock {
    public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<TwoByTwoShapeEnum> VICTORIAN_LILY_BLOCK_SHAPE = ModBlockProperties.VICTORIAN_LILY_SHAPE;

    protected static final VoxelShape SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 1.5F, 16.0F);

    public VictorianLilyBlock(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(VICTORIAN_LILY_BLOCK_SHAPE, TwoByTwoShapeEnum.SOUTH_WEST));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VICTORIAN_LILY_BLOCK_SHAPE);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, LevelAccessor levelAccessor, BlockPos pos, BlockPos pos2)
    {
        boolean lilypadSurvive = true;
        Direction facing = state.getValue(FACING);
        BlockPos southwest = pos;
        BlockPos northwest = pos.relative(facing);
        BlockPos northeast = northwest.relative(facing.getClockWise());
        BlockPos southeast = pos.relative(facing.getClockWise());
        TwoByTwoShapeEnum shape = state.getValue(VICTORIAN_LILY_BLOCK_SHAPE);

        switch (shape) {
            case SOUTH_WEST -> {
                northwest = pos.relative(facing);
                northeast = northwest.relative(facing.getClockWise());
                southeast = pos.relative(facing.getClockWise());
            }
            case NORTH_WEST -> {
                southwest = pos.relative(facing.getOpposite());
                northwest = pos;
                northeast = pos.relative(facing.getClockWise());
                southeast = southwest.relative(facing.getClockWise());
            }
            case NORTH_EAST -> {
                northwest = pos.relative(facing.getCounterClockWise());
                northeast = pos;
                southeast = pos.relative(facing.getOpposite());
                southwest = southeast.relative(facing);
            }
            case SOUTH_EAST -> {
                southwest = pos.relative(facing.getCounterClockWise());
                northeast = pos.relative(facing);
                southeast = pos;
                northwest = northeast.relative(facing.getCounterClockWise());
            }
        }
        if (!levelAccessor.getBlockState(southwest).is(this) || !levelAccessor.getBlockState(northwest).is(this) || !levelAccessor.getBlockState(northeast).is(this) || !levelAccessor.getBlockState(southeast).is(this)) {
            lilypadSurvive = false;
        }
        if (levelAccessor.getBlockState(southwest).is(this) && levelAccessor.getBlockState(southwest).getValue(FACING) != facing && levelAccessor.getBlockState(southwest).getValue(VICTORIAN_LILY_BLOCK_SHAPE) != TwoByTwoShapeEnum.SOUTH_WEST) {
            lilypadSurvive = false;
        }
        if (levelAccessor.getBlockState(northwest).is(this) && levelAccessor.getBlockState(northwest).getValue(FACING) != facing && levelAccessor.getBlockState(northwest).getValue(VICTORIAN_LILY_BLOCK_SHAPE) != TwoByTwoShapeEnum.NORTH_WEST) {
            lilypadSurvive = false;
        }
        if (levelAccessor.getBlockState(northeast).is(this) && levelAccessor.getBlockState(northeast).getValue(FACING) != facing && levelAccessor.getBlockState(northeast).getValue(VICTORIAN_LILY_BLOCK_SHAPE) != TwoByTwoShapeEnum.NORTH_EAST) {
            lilypadSurvive = false;
        }
        if (levelAccessor.getBlockState(southeast).is(this) && levelAccessor.getBlockState(southeast).getValue(FACING) != facing && levelAccessor.getBlockState(southeast).getValue(VICTORIAN_LILY_BLOCK_SHAPE) != TwoByTwoShapeEnum.SOUTH_EAST) {
            lilypadSurvive = false;
        }
        if (!lilypadSurvive) {
            return Blocks.AIR.defaultBlockState();
        }
        else {
            return super.updateShape(state, direction, state2, levelAccessor, pos, pos2);
        }
    }


    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        Direction direction = ctx.getHorizontalDirection();
        BlockPos blockpos = ctx.getClickedPos();
        BlockPos blockpos1 = blockpos.relative(direction);
        BlockPos blockpos2 = blockpos1.relative(direction.getClockWise());
        BlockPos blockpos3 = blockpos.relative(direction.getClockWise());

        Level level = ctx.getLevel();
        return mayPlaceOn(level.getBlockState(blockpos1.below()), level, blockpos1.below()) && level.getBlockState(blockpos1).canBeReplaced(ctx) && level.getWorldBorder().isWithinBounds(blockpos1) &&
                mayPlaceOn(level.getBlockState(blockpos2.below()), level, blockpos2.below()) && level.getBlockState(blockpos2).canBeReplaced(ctx) && level.getWorldBorder().isWithinBounds(blockpos2) &&
                mayPlaceOn(level.getBlockState(blockpos3.below()), level, blockpos3.below()) && level.getBlockState(blockpos3).canBeReplaced(ctx) && level.getWorldBorder().isWithinBounds(blockpos3) ? this.defaultBlockState().setValue(FACING, direction) : null;
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack)
    {
        super.setPlacedBy(level, pos, state, entity, stack);
        if (!level.isClientSide) {
            BlockPos blockpos = pos.relative(state.getValue(FACING));
            BlockPos blockpos1 = blockpos.relative(state.getValue(FACING).getClockWise());
            BlockPos blockpos2 = pos.relative(state.getValue(FACING).getClockWise());
            level.setBlock(blockpos, state.setValue(VICTORIAN_LILY_BLOCK_SHAPE, TwoByTwoShapeEnum.NORTH_WEST), 26);
            level.setBlock(blockpos1, state.setValue(VICTORIAN_LILY_BLOCK_SHAPE, TwoByTwoShapeEnum.NORTH_EAST), 26);
            level.setBlock(blockpos2, state.setValue(VICTORIAN_LILY_BLOCK_SHAPE, TwoByTwoShapeEnum.SOUTH_EAST), 26);
            level.blockUpdated(pos, Blocks.AIR);
            level.blockUpdated(blockpos, Blocks.AIR);
            level.blockUpdated(blockpos1, Blocks.AIR);
            level.blockUpdated(blockpos2, Blocks.AIR);
            state.updateNeighbourShapes(level, pos, 26);
            state.updateNeighbourShapes(level, blockpos, 26);
            state.updateNeighbourShapes(level, blockpos1, 26);
            state.updateNeighbourShapes(level, blockpos2, 26);
        }
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
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        Random random = new Random();
        if (level instanceof ServerLevel && entity instanceof Boat boatEntity) {
            level.destroyBlock(new BlockPos(pos), true, entity);
            if (random.nextFloat() <= 0.25f){
                Boat.Type boatType = boatEntity.getVariant();
                entity.spawnAtLocation(getBoatItem(boatType));
                boatEntity.discard();
            }
        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos)
    {
        FluidState fluidstate = getter.getFluidState(pos);
        FluidState fluidstate1 = getter.getFluidState(pos.above());
        return (fluidstate.getType() == Fluids.WATER || state.getBlock() instanceof IceBlock) && fluidstate1.getType() == Fluids.EMPTY;
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
}
