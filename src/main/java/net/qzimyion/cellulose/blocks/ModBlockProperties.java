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

    ///Potion rack properties
    //Glass bottles
    public static final BooleanProperty GLASS_SLOT_0_OCCUPIED = BooleanProperty.of("glass_slot_0_occupied");
    public static final BooleanProperty GLASS_SLOT_1_OCCUPIED = BooleanProperty.of("glass_slot_1_occupied");
    public static final BooleanProperty GLASS_SLOT_2_OCCUPIED = BooleanProperty.of("glass_slot_2_occupied");
    public static final BooleanProperty GLASS_SLOT_3_OCCUPIED = BooleanProperty.of("glass_slot_3_occupied");
    public static final BooleanProperty GLASS_SLOT_4_OCCUPIED = BooleanProperty.of("glass_slot_4_occupied");
    public static final BooleanProperty GLASS_SLOT_5_OCCUPIED = BooleanProperty.of("glass_slot_5_occupied");
    //Honey bottles
    public static final BooleanProperty HONEY_SLOT_0_OCCUPIED = BooleanProperty.of("honey_slot_0_occupied");
    public static final BooleanProperty HONEY_SLOT_1_OCCUPIED = BooleanProperty.of("honey_slot_1_occupied");
    public static final BooleanProperty HONEY_SLOT_2_OCCUPIED = BooleanProperty.of("honey_slot_2_occupied");
    public static final BooleanProperty HONEY_SLOT_3_OCCUPIED = BooleanProperty.of("honey_slot_3_occupied");
    public static final BooleanProperty HONEY_SLOT_4_OCCUPIED = BooleanProperty.of("honey_slot_4_occupied");
    public static final BooleanProperty HONEY_SLOT_5_OCCUPIED = BooleanProperty.of("honey_slot_5_occupied");
}
