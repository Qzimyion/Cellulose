package net.qzimyion.cellulose.blocks;

import net.qzimyion.cellulose.blocks.customBlocks.PannelBlocks.ShojiBlocks.ShojiShapes;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;

public class ModBlockProperties {

    public static final IntProperty FRUIT_AMOUNT = IntProperty.of("fruit_amount", 1, 4);
    public static final IntProperty SAWDUST_LAYERS = IntProperty.of("sawdust_layers", 1, 16);


    ///Shape properties
    //Shoji blocks
    public static final EnumProperty<ShojiShapes> SHOJI_SHAPE = EnumProperty.of("shape", ShojiShapes.class);


    //Extra slots properties
    public static final BooleanProperty SLOT_6_OCCUPIED = BooleanProperty.of("slot_6_occupied");
    public static final BooleanProperty SLOT_7_OCCUPIED = BooleanProperty.of("slot_7_occupied");
    public static final BooleanProperty SLOT_8_OCCUPIED = BooleanProperty.of("slot_8_occupied");

    //Bamboo Chiseled bookshelf properties
    public static final IntProperty BOOKS_STORED = IntProperty.of("books_stored", 0, 7);
    public static final IntProperty LAST_INTERACTION_BOOK_SLOT = IntProperty.of("last_interaction_book_slot", 0, 7);
}
