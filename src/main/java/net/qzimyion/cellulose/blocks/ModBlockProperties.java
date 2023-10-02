package net.qzimyion.cellulose.blocks;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;

public class ModBlockProperties {

    public static final IntProperty FRUIT_AMOUNT = IntProperty.of("fruit_amount", 1, 4);
    public static final IntProperty SAWDUST_LAYERS = IntProperty.of("sawdust_layers", 1, 16);
    public static final BooleanProperty FLUID_FILLED = BooleanProperty.of("fluid_filled");


    //Triple door Properties


    //Enchantment properties
    public static boolean hasThorns(LivingEntity entity) {
        return EnchantmentHelper.getEquipmentLevel(Enchantments.THORNS, entity) > 0;
    }
}
