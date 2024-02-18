package net.qzimyion.cellulose.blocks;

import net.qzimyion.cellulose.blocks.customBlocks.CustomDoorsAndTrapdoors.properties.GatesShape;
import net.qzimyion.cellulose.blocks.customBlocks.CustomDoorsAndTrapdoors.properties.TallGatesShape;
import net.qzimyion.cellulose.blocks.customBlocks.CustomDoorsAndTrapdoors.properties.TripleDoorShape;
import net.qzimyion.cellulose.blocks.customBlocks.PannelBlocks.ShojiBlocks.ShojiShapes;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Items;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;

public class ModBlockProperties {

    public static final IntProperty FRUIT_AMOUNT = IntProperty.of("fruit_amount", 1, 4);
    public static final IntProperty SAWDUST_LAYERS = IntProperty.of("sawdust_layers", 1, 16);

    ///Boolean properties
    public static final BooleanProperty MOSSY = BooleanProperty.of("mossy");

    public static boolean ImmuneToSpikyStuff (LivingEntity entity){
        return !entity.getEquippedStack(EquipmentSlot.FEET).isOf(Items.CHAINMAIL_BOOTS);
    }

    ///Shape properties
    //Shoji blocks
    public static final EnumProperty<ShojiShapes> SHOJI_SHAPE = EnumProperty.of("shape", ShojiShapes.class);

    //Triple door blocks
    public static final EnumProperty<TripleDoorShape> TRIPLE_DOOR_SHAPE = EnumProperty.of("shape", TripleDoorShape.class);

    //Gates blocks
    public static final EnumProperty<TallGatesShape> TALL_GATES_SHAPE = EnumProperty.of("shape", TallGatesShape.class);
    public static final EnumProperty<GatesShape> GATES_SHAPE = EnumProperty.of("shape", GatesShape.class);

    //Extra slots properties
    public static final BooleanProperty SLOT_6_OCCUPIED = BooleanProperty.of("slot_6_occupied");
    public static final BooleanProperty SLOT_7_OCCUPIED = BooleanProperty.of("slot_7_occupied");
    public static final BooleanProperty SLOT_8_OCCUPIED = BooleanProperty.of("slot_8_occupied");

    //Potion slots
    public static final BooleanProperty P_SLOT_0_OCCUPIED = BooleanProperty.of("potion_slot_0_occupied");
    public static final BooleanProperty P_SLOT_1_OCCUPIED = BooleanProperty.of("potion_slot_1_occupied");
    public static final BooleanProperty P_SLOT_2_OCCUPIED = BooleanProperty.of("potion_slot_2_occupied");
    public static final BooleanProperty P_SLOT_3_OCCUPIED = BooleanProperty.of("potion_slot_3_occupied");
    public static final BooleanProperty P_SLOT_4_OCCUPIED = BooleanProperty.of("potion_slot_4_occupied");
    public static final BooleanProperty P_SLOT_5_OCCUPIED = BooleanProperty.of("potion_slot_5_occupied");

    //Bamboo Chiseled bookshelf properties
    public static final IntProperty BOOKS_STORED = IntProperty.of("books_stored", 0, 7);
    public static final IntProperty LAST_INTERACTION_BOOK_SLOT = IntProperty.of("last_interaction_book_slot", 0, 7);
}
