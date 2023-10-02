package net.qzimyion.cellulose.blocks.custom_blocks.BiggerDoorsAndTrapdoors;

import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Waterloggable;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;

public class ShutterBlock extends HorizontalFacingBlock implements Waterloggable {
    public static final BooleanProperty OPEN = Properties.OPEN;
    public static final BooleanProperty POWERED = Properties.POWERED;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    protected ShutterBlock(Settings settings) {
        super(settings);
    }
}
