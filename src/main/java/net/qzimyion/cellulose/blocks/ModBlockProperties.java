package net.qzimyion.cellulose.blocks;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.qzimyion.cellulose.util.ShojiShapes;
import net.qzimyion.cellulose.util.ThreeByThreeShapeEnum;
import net.qzimyion.cellulose.util.TwoByTwoShapeEnum;

public class ModBlockProperties {

    public static final IntegerProperty FRUIT_AMOUNT = IntegerProperty.create("fruit_amount", 1, 4);
    //public static final IntegerProperty LAYERS16 = IntegerProperty.create("layers16", 1, 16);

    //Enum properties
    public static final EnumProperty<ShojiShapes> SHOJI_SHAPE = EnumProperty.create("shape", ShojiShapes.class);
    public static final EnumProperty<TwoByTwoShapeEnum> TRUNK_ENUM = EnumProperty.create("shape", TwoByTwoShapeEnum.class);
    public static final EnumProperty<TwoByTwoShapeEnum> VICTORIAN_LILY_SHAPE = EnumProperty.create("shape", TwoByTwoShapeEnum.class);
    public static final EnumProperty<ThreeByThreeShapeEnum> OMEGA_LILY_SHAPE = EnumProperty.create("shape", ThreeByThreeShapeEnum.class);


    //Extra slots properties
    public static final BooleanProperty SLOT_6_OCCUPIED = BooleanProperty.create("slot_6_occupied");
    public static final BooleanProperty SLOT_7_OCCUPIED = BooleanProperty.create("slot_7_occupied");
    public static final BooleanProperty SLOT_8_OCCUPIED = BooleanProperty.create("slot_8_occupied");

    //Bamboo Chiseled bookshelf properties
    public static final IntegerProperty BOOKS_STORED = IntegerProperty.create("books_stored", 0, 7);
    public static final IntegerProperty LAST_INTERACTION_BOOK_SLOT = IntegerProperty.create("last_interaction_book_slot", 0, 7);

    //Trunk properties
    public static final BooleanProperty UPDATE_NEIGHBOUR = BooleanProperty.create("update_neighbour");
    public static final IntegerProperty VARIANT = IntegerProperty.create("variant", 0, 4);
}
