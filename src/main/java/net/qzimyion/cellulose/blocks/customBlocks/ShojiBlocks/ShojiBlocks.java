package net.qzimyion.cellulose.blocks.customBlocks.ShojiBlocks;

import net.minecraft.block.*;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

@SuppressWarnings("deprecation")
public class ShojiBlocks extends Block implements Waterloggable {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    //General Shape
    protected static final VoxelShape SHOJI_WALL_NORTH = Block.createCuboidShape(0, 0, 7, 16, 16, 9);
    protected static final VoxelShape SHOJI_WALL_SOUTH = Block.createCuboidShape(0, 0, 7, 16, 16, 9);
    protected static final VoxelShape SHOJI_WALL_EAST = Block.createCuboidShape(7, 0, 0, 9, 16, 16);
    protected static final VoxelShape SHOJI_WALL_WEST = Block.createCuboidShape(7, 0, 0, 9, 16, 16);

    //Curving Shapes
    protected static final VoxelShape SHOJI_WALL_INNER_RIGHT = VoxelShapes.combineAndSimplify(Block.createCuboidShape(7, 0, 7, 16, 16, 9), Block.createCuboidShape(7, 0, 0, 9, 16, 7), BooleanBiFunction.OR);
    protected static final VoxelShape SHOJI_WALL_INNER_LEFT = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 7, 9, 16, 9), Block.createCuboidShape(7, 0, 0, 9, 16, 7), BooleanBiFunction.OR);
    protected static final VoxelShape SHOJI_WALL_OUTER_RIGHT = VoxelShapes.combineAndSimplify(Block.createCuboidShape(7, 0, 7, 16, 16, 9), Block.createCuboidShape(7, 0, 9, 9, 16, 16), BooleanBiFunction.OR);
    protected static final VoxelShape SHOJI_WALL_OUTER_LEFT = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 7, 9, 16, 9), Block.createCuboidShape(7, 0, 9, 9, 16, 16), BooleanBiFunction.OR);

    public ShojiBlocks(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }
}
