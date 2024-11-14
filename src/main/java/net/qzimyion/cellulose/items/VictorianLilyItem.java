package net.qzimyion.cellulose.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.PlaceableOnWaterItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VictorianLilyItem extends PlaceableOnWaterItem {

    Block block;
    public VictorianLilyItem(Block block, Settings settings) {
        super(block, settings);
        this.block = block;
    }

    @Override
    protected boolean place(ItemPlacementContext context, BlockState state) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        for (int dx = 0; dx < 2; dx++) {
            for (int dz = 0; dz < 2; dz++) {
                BlockPos posToPlace = pos.add(dx, 0, dz);
                BlockState lilyPadState = block.getDefaultState();
                world.setBlockState(pos, state, Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD | Block.FORCE_STATE);
                world.setBlockState(posToPlace, lilyPadState, 27);
            }
        }
        return true;
    }
}
