package net.qzimyion.cellulose.blocks.customBlocks;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.qzimyion.cellulose.blocks.ModBlockProperties;

@SuppressWarnings({"NullableProblems", "deprecation"})
public class TrunkBlock extends RotatedPillarBlock {
    public static final BooleanProperty UPDATED = ModBlockProperties.UPDATE_NEIGHBOUR;
    public static final IntegerProperty VARIANT = ModBlockProperties.VARIANT;

    public TrunkBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y).setValue(VARIANT, 0).setValue(UPDATED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS, UPDATED, VARIANT);
    }

    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (world.isClientSide() || state.getValue(UPDATED)) return;
        world.setBlock(pos, getStateAndUpdate(world, pos, state, null), 3);
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean isMoving) {
        if (world.isClientSide() || state.getValue(UPDATED)) return;
        world.scheduleTick(pos, this, 3);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        LivingEntity placer = context.getPlayer();

        BlockState state = this.defaultBlockState()
                .setValue(AXIS, context.getClickedFace().getAxis());

        return this.getStateAndUpdate(world, pos, state, placer);
    }

    public BlockState getStateAndUpdate(LevelAccessor world, BlockPos pos, BlockState state, LivingEntity placer) {
        if (world.isClientSide()) {
            return state;
        }
        boolean placedByPlayer = placer != null;
        if (placedByPlayer && placer.isShiftKeyDown()) {
            return state.setValue(UPDATED, true);
        }
        int currentAxisIndex = getAxisIndex(state.getValue(AXIS));
        for (int direction = 0; direction < 4; direction++) {
            BlockPos[] neighborPositions = getNeighborPositions(pos, currentAxisIndex, direction);

            BlockState[] neighborStates = getNeighborStates(world, neighborPositions);
            if (allNeighborsMatch(neighborStates, currentAxisIndex)) {
                updateNeighborVariants(world, neighborPositions, neighborStates, direction);

                if (placedByPlayer && state.getValue(VARIANT) != 0) {
                    playUpdateSound(world, pos, state);
                }

                return createUpdatedState(state, direction + 1);
            }
        }
        return state.setValue(UPDATED, true);
    }

    private int getAxisIndex(Direction.Axis axis) {
        for (int i = 0; i < 3; i++) {
            if (axis == this.axes[i]) {
                return i;
            }
        }
        return 0;
    }

    private BlockPos[] getNeighborPositions(BlockPos pos, int axisIndex, int direction) {
        BlockPos[] positions = new BlockPos[3];
        for (int i = 0; i < 3; i++) {
            positions[i] = offsetPos(pos, offsets[axisIndex][direction][i]);
        }
        return positions;
    }

    private BlockState[] getNeighborStates(LevelAccessor world, BlockPos[] positions) {
        BlockState[] states = new BlockState[positions.length];
        for (int i = 0; i < positions.length; i++) {
            states[i] = world.getBlockState(positions[i]);
        }
        return states;
    }

    private boolean allNeighborsMatch(BlockState[] states, int axisIndex) {
        for (BlockState state : states) {
            if (state.getBlock() != this || state.getValue(AXIS) != this.axes[axisIndex]) {
                return false;
            }
        }
        return true;
    }

    private void updateNeighborVariants(LevelAccessor world, BlockPos[] positions, BlockState[] states, int direction) {
        int[] variants = calculateVariants(direction);
        for (int i = 0; i < 3; i++) {
            BlockState updatedState = states[i]
                    .setValue(VARIANT, variants[i])
                    .setValue(UPDATED, true);
            world.setBlock(positions[i], updatedState, 3);
        }
    }

    private int[] calculateVariants(int direction) {
        return new int[] {4 - direction, (direction % 2 == 0) ? direction + 2 : direction, (direction + 3 > 4) ? direction - 1 : direction + 3};
    }

    private void playUpdateSound(LevelAccessor world, BlockPos pos, BlockState state) {
        world.playSound(null, pos, this.getSoundType(state).getBreakSound(),
                SoundSource.BLOCKS, 1.0F, 1.0F);
    }

    private BlockState createUpdatedState(BlockState state, int variant) {
        return state
                .setValue(VARIANT, variant)
                .setValue(UPDATED, true);
    }

    private BlockPos offsetPos(BlockPos pos, BlockPos offset) {
        return pos.offset(offset);
    }

    private final Direction.Axis[] axes = {
            Direction.Axis.Y,
            Direction.Axis.X,
            Direction.Axis.Z
    };

    private final BlockPos[][][] offsets = {
            {   // Y-axis facing (UP/DOWN)
                    {new BlockPos(0, 0, 1), new BlockPos(1, 0, 0), new BlockPos(1, 0, 1)},     // South + East + SE
                    {new BlockPos(0, 0, 1), new BlockPos(-1, 0, 0), new BlockPos(-1, 0, 1)},   // South + West + SW
                    {new BlockPos(0, 0, -1), new BlockPos(-1, 0, 0), new BlockPos(-1, 0, -1)}, // North + West + NW
                    {new BlockPos(0, 0, -1), new BlockPos(1, 0, 0), new BlockPos(1, 0, -1)}     // North + East + NE
            },
            {   // Z-axis facing (NORTH/SOUTH)
                    {new BlockPos(0, 1, 0), new BlockPos(0, 0, 1), new BlockPos(0, 1, 1)},     // Up + South + Up-South
                    {new BlockPos(0, 1, 0), new BlockPos(0, 0, -1), new BlockPos(0, 1, -1)},   // Up + North + Up-North
                    {new BlockPos(0, -1, 0), new BlockPos(0, 0, -1), new BlockPos(0, -1, -1)}, // Down + North + Down-North
                    {new BlockPos(0, -1, 0), new BlockPos(0, 0, 1), new BlockPos(0, -1, 1)}    // Down + South + Down-South
            },
            {   // X-axis facing (EAST/WEST)
                    {new BlockPos(0, 1, 0), new BlockPos(1, 0, 0), new BlockPos(1, 1, 0)},     // Up + East + Up-East
                    {new BlockPos(0, 1, 0), new BlockPos(-1, 0, 0), new BlockPos(-1, 1, 0)},   // Up + West + Up-West
                    {new BlockPos(0, -1, 0), new BlockPos(-1, 0, 0), new BlockPos(-1, -1, 0)}, // Down + West + Down-West
                    {new BlockPos(0, -1, 0), new BlockPos(1, 0, 0), new BlockPos(1, -1, 0)}    // Down + East + Down-East
            }
    };
}
