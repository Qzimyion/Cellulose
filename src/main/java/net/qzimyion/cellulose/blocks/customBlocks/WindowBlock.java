package net.qzimyion.cellulose.blocks.customBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
//TODO: Complete this in the next version
@SuppressWarnings("deprecation")
public class WindowBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    protected static final VoxelShape NORTH = Block.box(0, 0, 6, 16, 16, 9);
    protected static final VoxelShape SOUTH = Block.box(0, 0, 6, 16, 16, 9);
    protected static final VoxelShape EAST_WEST = Block.box(6, 0, 0, 9, 16, 16);
    protected static final VoxelShape OPEN_NORTH = Block.box(0, 0, 6, 8, 16, 9);
    protected static final VoxelShape OPEN_SOUTH = Block.box(0, 0, 6, 8, 16, 9);
    protected static final VoxelShape OPEN_EAST_WEST = Block.box(6, 0, 0, 9, 16, 8);
    private final BlockSetType blockSetType;
    protected WindowBlock(Properties settings, BlockSetType blockSetType) {
        super(settings);
        this.blockSetType = blockSetType;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, POWERED, WATERLOGGED);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter view, BlockPos pos, CollisionContext ctx){
        Direction direction = state.getValue(FACING);
        if (!state.getValue(OPEN)){
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
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }
}
