package net.qzimyion.cellulose.events;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;

public class CelluloseItemEvents {

    public static void registerEvents(){
        UseItemCallback.EVENT.register((player, world, hand) ->{
            Item itemInHand = player.getStackInHand(hand).getItem();
            if (itemInHand == Items.RED_MUSHROOM) {
                BlockPos blockPos = player.getBlockPos().offset(player.getHorizontalFacing());
                if (!world.isClient) {
                    BlockState blockState = Blocks.DIAMOND_BLOCK.getDefaultState();
                    world.setBlockState(blockPos, blockState);
                }
                return TypedActionResult.success(itemInHand.getDefaultStack());
            }
            return TypedActionResult.pass(itemInHand.getDefaultStack());
        });
    }
}
