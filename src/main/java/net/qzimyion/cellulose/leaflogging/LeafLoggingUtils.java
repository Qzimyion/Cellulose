package net.qzimyion.cellulose.leaflogging;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class LeafLoggingUtils {
    public static final BooleanProperty LEAF_LOGGED = BooleanProperty.create("leaf_logged");


    public static boolean supportsLeafLogging(BlockState state) {
        return state != null && state.hasProperty(LEAF_LOGGED);
    }

    public static boolean canLeafLog(BlockState state) {
        return supportsLeafLogging(state) && state.getFluidState().isEmpty();
    }

    public static boolean isLeafLogged(BlockState state) {
        return state != null && supportsLeafLogging(state) && state.getValue(LEAF_LOGGED);
    }

    @NotNull
    public static BlockState getLeafEquivalent(BlockState state) {
        return Blocks.OAK_LEAVES.defaultBlockState();
    }

    public static BlockState getStateWithoutLeaves(BlockState state) {
        return isLeafLogged(state) ? state.setValue(LEAF_LOGGED, false) : state;
    }

    public static boolean isItemLeaf(ItemStack stack) {
        return stack != null && stack.is(Blocks.OAK_LEAVES.asItem());
    }

    public static boolean canBeReplacedWithLeaves(BlockState state, BlockPlaceContext context) {
        return LeafLoggingUtils.canLeafLog(state) && isItemLeaf(context.getItemInHand()) &&
                Blocks.OAK_LEAVES.canSurvive(Blocks.OAK_LEAVES.defaultBlockState(), context.getLevel(), context.getClickedPos()) &&
                !state.getValue(LEAF_LOGGED);
    }

    public static BlockState onUpdateShape(BlockState state, LevelAccessor level, BlockPos pos) {
        if (isLeafLogged(state)) {
            BlockState leafEquivalent = LeafLoggingUtils.getLeafEquivalent(state);
            if (!Blocks.OAK_LEAVES.canSurvive(leafEquivalent, level, pos)) {
                level.levelEvent(LevelEvent.PARTICLES_DESTROY_BLOCK, pos, Block.getId(leafEquivalent));
                state = state.setValue(LEAF_LOGGED, false);
            }
        }
        return state;
    }

    public static BlockState getLeafPlacementState(BlockState state, @NotNull BlockPlaceContext context) {
        if (state != null && LeafLoggingUtils.supportsLeafLogging(state)) {
            return state.setValue(LEAF_LOGGED, true);
        }
        return state;
    }

    public static float getLeafDestroySpeed(BlockState state, BlockGetter level, BlockPos pos) {
        return getLeafEquivalent(state).getDestroySpeed(level, pos);
    }

    public static void onRandomTick(BlockState state, ServerLevel level, BlockPos pos) {
        if (LeafLoggingUtils.isLeafLogged(state)) {
            if (level.getBrightness(LightLayer.BLOCK, pos) > 11) {
                Block.dropResources(LeafLoggingUtils.getLeafEquivalent(state), level, pos);
                level.setBlock(pos, state.setValue(LEAF_LOGGED, false), Block.UPDATE_ALL);
            }
        }
    }

    public static boolean isOriginalBlockCovered(BlockState state, BlockGetter level, BlockPos pos) {
        if (isLeafLogged(state)) {
            VoxelShape blockShape = state.getShape(level, pos);
            VoxelShape leafShape = getLeafEquivalent(state).getShape(level, pos);
            return blockShape.max(Direction.Axis.Y) <= leafShape.max(Direction.Axis.Y);
        }
        return false;
    }
}
