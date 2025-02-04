package net.qzimyion.cellulose.blocks.customBlocks.foliage;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
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
import net.qzimyion.cellulose.util.OmegaLilyBlockShape;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class OmegaLilyBlock extends BushBlock {
    public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<OmegaLilyBlockShape> OMEGA_LILY_BLOCK_SHAPE = ModBlockProperties.OMEGA_LILY_SHAPE;

    protected static final VoxelShape SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 1.5F, 16.0F);

    public OmegaLilyBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OMEGA_LILY_BLOCK_SHAPE, OmegaLilyBlockShape.CENTER));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING).add(OMEGA_LILY_BLOCK_SHAPE);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, LevelAccessor levelAccessor, BlockPos pos, BlockPos pos2) {
        Direction facing = state.getValue(FACING);
        boolean lilypadSurvive = true;

        BlockPos[] positions = getBlockPositions(pos, facing, state.getValue(OMEGA_LILY_BLOCK_SHAPE));

        for (BlockPos blockPos : positions) {
            BlockState neighborState = levelAccessor.getBlockState(blockPos);
            if (!neighborState.is(this) || neighborState.getValue(FACING) != facing) {
                lilypadSurvive = false;
                break;
            }
        }

        return lilypadSurvive ? super.updateShape(state, direction, state2, levelAccessor, pos, pos2) : Blocks.AIR.defaultBlockState();
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        Direction direction = ctx.getHorizontalDirection();
        BlockPos pos = ctx.getClickedPos();
        Level level = ctx.getLevel();

        BlockPos[] positions = getBlockPositions(pos, direction, OmegaLilyBlockShape.CENTER);

        for (BlockPos blockPos : positions) {
            if (!level.getBlockState(blockPos).canBeReplaced(ctx) || !mayPlaceOn(level.getBlockState(blockPos.below()), level, blockPos.below())) {
                return null;
            }
        }

        return this.defaultBlockState().setValue(FACING, direction);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack) {
        super.setPlacedBy(level, pos, state, entity, stack);
        Direction direction = state.getValue(FACING);
        BlockPos[] positions = getBlockPositions(pos, direction, OmegaLilyBlockShape.CENTER);

        for (int i = 0; i < positions.length; i++) {
            OmegaLilyBlockShape shape = OmegaLilyBlockShape.values()[i];
            level.setBlock(positions[i], state.setValue(OMEGA_LILY_BLOCK_SHAPE, shape), 26);
        }
    }

    private BlockPos[] getBlockPositions(BlockPos center, Direction facing, OmegaLilyBlockShape shape) {
        BlockPos[] positions = new BlockPos[9];
        Direction right = facing.getClockWise();
        Direction left = facing.getCounterClockWise();
        Direction back = facing.getOpposite();

        positions[0] = center.relative(left).relative(back); // SOUTH_WEST
        positions[1] = center.relative(back);               // SOUTH
        positions[2] = center.relative(right).relative(back); // SOUTH_EAST
        positions[3] = center.relative(left);               // WEST
        positions[4] = center;                              // CENTER
        positions[5] = center.relative(right);              // EAST
        positions[6] = center.relative(left).relative(facing); // NORTH_WEST
        positions[7] = center.relative(facing);             // NORTH
        positions[8] = center.relative(right).relative(facing); // NORTH_EAST
        return positions;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        FluidState fluidState = getter.getFluidState(pos);
        return fluidState.getType() == Fluids.WATER || state.getBlock() instanceof IceBlock;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
}