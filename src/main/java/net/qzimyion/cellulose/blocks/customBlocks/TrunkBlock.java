package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.qzimyion.cellulose.blocks.ModBlockProperties;
import net.qzimyion.cellulose.util.TwoByTwoShapeEnum;

@SuppressWarnings({"deprecation", "NullableProblems", "DataFlowIssue"})
public class TrunkBlock extends RotatedPillarBlock {
    public static final EnumProperty<TwoByTwoShapeEnum> TRUNK_ENUM = ModBlockProperties.TRUNK_ENUM;

    public TrunkBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(TRUNK_ENUM, TwoByTwoShapeEnum.SOUTH_EAST).setValue(AXIS, Direction.Axis.Y));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS, TRUNK_ENUM);
    }

    @Override
    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        return getConnection(blockState, levelAccessor, blockPos);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis());
        return getConnection(state, world, pos);
    }

    public BlockState getConnection(BlockState state, LevelAccessor world, BlockPos pos) {
        Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
        Block block = state.getBlock();

        for (TwoByTwoShapeEnum shape : TwoByTwoShapeEnum.values()) {
            BlockPos offset = offsetFromShapeAndAxis(shape, axis);
            if (isTrunk2x2Corner(world, pos.offset(offset), block, axis)) {
                return state.setValue(TRUNK_ENUM, shape);
            }
        }
        return state.setValue(TRUNK_ENUM, TwoByTwoShapeEnum.SOUTH_EAST);
    }

    private boolean isTrunk2x2Corner(LevelAccessor world, BlockPos origin, Block block, Direction.Axis axis) {
        BlockPos[] positions = offsetsForAxis(axis);

        for (BlockPos offset : positions) {
            if (!isSameTrunk(world, origin.offset(offset), block, axis)) return false;
        }
        return true;
    }

    private boolean isSameTrunk(LevelAccessor world, BlockPos pos, Block block, Direction.Axis axis) {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() == block && state.getValue(BlockStateProperties.AXIS) == axis;
    }

    private BlockPos[] offsetsForAxis(Direction.Axis axis) {
        return switch (axis) {
            case Y -> // X-Z plane
                    new BlockPos[]{
                            BlockPos.ZERO,
                            new BlockPos(1, 0, 0),
                            new BlockPos(0, 0, 1),
                            new BlockPos(1, 0, 1)
                    };
            case X -> // Y-Z plane
                    new BlockPos[]{
                            BlockPos.ZERO,
                            new BlockPos(0, 1, 0),
                            new BlockPos(0, 0, 1),
                            new BlockPos(0, 1, 1)
                    };
            case Z -> // X-Y plane
                    new BlockPos[]{
                            BlockPos.ZERO,
                            new BlockPos(1, 0, 0),
                            new BlockPos(0, 1, 0),
                            new BlockPos(1, 1, 0)
                    };
        };
    }

    private BlockPos offsetFromShapeAndAxis(TwoByTwoShapeEnum shape, Direction.Axis axis) {
        int dx = 0, dy = 0, dz = 0;

        switch (axis) {
            case Y: // X-Z plane (like tree trunks)
                dz = switch (shape) {
                    case NORTH_WEST -> {
                        dx = 0;
                        yield 0;
                    }
                    case NORTH_EAST -> {
                        dx = -1;
                        yield 0;
                    }
                    case SOUTH_WEST -> {
                        dx = 0;
                        yield -1;
                    }
                    case SOUTH_EAST -> {
                        dx = -1;
                        yield -1;
                    }
                };
                break;
            case X: // Y-Z plane
                dz = switch (shape) {
                    case NORTH_WEST -> {
                        dy = 0;
                        yield 0;
                    }
                    case NORTH_EAST -> {
                        dy = -1;
                        yield 0;
                    }
                    case SOUTH_WEST -> {
                        dy = 0;
                        yield -1;
                    }
                    case SOUTH_EAST -> {
                        dy = -1;
                        yield -1;
                    }
                };
                break;
            case Z: // X-Y plane
                dy = switch (shape) {
                    case NORTH_WEST -> {
                        dx = 0;
                        yield 0;
                    }
                    case NORTH_EAST -> {
                        dx = -1;
                        yield 0;
                    }
                    case SOUTH_WEST -> {
                        dx = 0;
                        yield -1;
                    }
                    case SOUTH_EAST -> {
                        dx = -1;
                        yield -1;
                    }
                };
                break;
        }

        return new BlockPos(dx, dy, dz);
    }
}
