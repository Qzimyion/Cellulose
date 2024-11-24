package net.qzimyion.cellulose.blocks;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.qzimyion.cellulose.blocks.customBlocks.PannelBlocks.ShojiBlocks.ShojiShapes;
import net.qzimyion.cellulose.util.OmegaLilyBlockShape;
import net.qzimyion.cellulose.util.VictorianLilyBlockShape;

public class ModBlockProperties {

    public static final IntegerProperty FRUIT_AMOUNT = IntegerProperty.create("fruit_amount", 1, 4);
    public static final IntegerProperty LAYERS16 = IntegerProperty.create("layers16", 1, 16);

    //Enum properties
    public static final EnumProperty<ShojiShapes> SHOJI_SHAPE = EnumProperty.create("shape", ShojiShapes.class);
    public static final EnumProperty<VictorianLilyBlockShape> VICTORIAN_LILY_SHAPE = EnumProperty.create("shape", VictorianLilyBlockShape.class);
    public static final EnumProperty<OmegaLilyBlockShape> OMEGA_LILY_SHAPE = EnumProperty.create("shape", OmegaLilyBlockShape.class);


    //Extra slots properties
    public static final BooleanProperty SLOT_6_OCCUPIED = BooleanProperty.create("slot_6_occupied");
    public static final BooleanProperty SLOT_7_OCCUPIED = BooleanProperty.create("slot_7_occupied");
    public static final BooleanProperty SLOT_8_OCCUPIED = BooleanProperty.create("slot_8_occupied");

    //Bamboo Chiseled bookshelf properties
    public static final IntegerProperty BOOKS_STORED = IntegerProperty.create("books_stored", 0, 7);
    public static final IntegerProperty LAST_INTERACTION_BOOK_SLOT = IntegerProperty.create("last_interaction_book_slot", 0, 7);
}
