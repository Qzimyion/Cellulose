package net.qzimyion.cellulose.screen.sawmill;

import com.google.common.collect.Lists;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.*;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.qzimyion.cellulose.recipe.SawmillingRecipe;
import net.qzimyion.cellulose.registry.CelluloseBlocks;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SawmillScreenHandler extends ScreenHandler {

    protected SawmillScreenHandler(@Nullable ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return false;
    }
}
