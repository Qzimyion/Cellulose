package net.qzimyion.cellulose.events;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class CelluloseItemEvents {

    public static void registerEvents(){
        UseItemCallback.EVENT.register((player, world, hand) ->{
            Item itemInHand = player.getItemInHand(hand).getItem();
            if (itemInHand == Items.RED_MUSHROOM) {
                BlockPos blockPos = player.blockPosition().relative(player.getDirection());
                if (!world.isClientSide) {
                    BlockState blockState = Blocks.DIAMOND_BLOCK.defaultBlockState();
                    world.setBlockAndUpdate(blockPos, blockState);
                }
                return InteractionResultHolder.success(itemInHand.getDefaultInstance());
            }
            return InteractionResultHolder.pass(itemInHand.getDefaultInstance());
        });
    }
}
