package net.qzimyion.cellulose.blocks.customBlocks.BiggerDoorsAndTrapdoors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.shape.VoxelShape;

public class TripleDoorBlock extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty OPEN = Properties.OPEN;
    public static final EnumProperty<DoorHinge> HINGE = Properties.DOOR_HINGE;
    public static final BooleanProperty POWERED = Properties.POWERED;
    protected static final float field_31083 = 3.0f;
    protected static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
    protected static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape EAST_SHAPE = Block.createCuboidShape(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    private final BlockSetType blockSetType;
    public TripleDoorBlock(Settings settings, BlockSetType blockSetType) {
        super(settings);
        this.blockSetType = blockSetType;
    }
}
