package net.qzimyion.cellulose.items.custom_items.popacorn_bowls;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class PopacornBowlQuaterItem extends Item {
    public PopacornBowlQuaterItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        if (user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode) {
            return itemStack;
        }
        return new ItemStack(Items.BOWL);
    }
}
