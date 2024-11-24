package net.qzimyion.cellulose.blocks.customBlocks.foliage;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.phys.shapes.VoxelShape;

@SuppressWarnings("deprecation")
public class ShelfShroomBlock extends HorizontalDirectionalBlock {

    private static final VoxelShape SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

    protected ShelfShroomBlock(Properties settings) {
        super(settings);
    }
}
