package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
//TODO: Complete this in the next version
@SuppressWarnings("deprecation")
public class WindowBlock extends HorizontalFacingBlock implements Waterloggable {
    public static final BooleanProperty OPEN = Properties.OPEN;
    public static final BooleanProperty POWERED = Properties.POWERED;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    protected static final VoxelShape NORTH = Block.createCuboidShape(0, 0, 6, 16, 16, 9);
    protected static final VoxelShape SOUTH = Block.createCuboidShape(0, 0, 6, 16, 16, 9);
    protected static final VoxelShape EAST_WEST = Block.createCuboidShape(6, 0, 0, 9, 16, 16);
    protected static final VoxelShape OPEN_NORTH = Block.createCuboidShape(0, 0, 6, 8, 16, 9);
    protected static final VoxelShape OPEN_SOUTH = Block.createCuboidShape(0, 0, 6, 8, 16, 9);
    protected static final VoxelShape OPEN_EAST_WEST = Block.createCuboidShape(6, 0, 0, 9, 16, 8);
    private final BlockSetType blockSetType;
    protected WindowBlock(Settings settings, BlockSetType blockSetType) {
        super(settings);
        this.blockSetType = blockSetType;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, POWERED, WATERLOGGED);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx){
        Direction direction = state.get(FACING);
        if (!state.get(OPEN)){
            switch (direction) {
                default -> {
                    return NORTH;
                }
                case SOUTH -> {
                    return SOUTH;
                }
                case EAST, WEST -> {
                    return EAST_WEST;
                }
            }
        }
        switch (direction) {
            default -> {
                return OPEN_NORTH;
            }
            case SOUTH -> {
                return OPEN_SOUTH;
            }
            case EAST, WEST -> {
                return OPEN_EAST_WEST;
            }
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}
