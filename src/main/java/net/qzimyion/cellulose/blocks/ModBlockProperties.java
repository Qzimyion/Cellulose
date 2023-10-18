package net.qzimyion.cellulose.blocks;

import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;

import java.util.Map;

public class ModBlockProperties {

    public static final IntProperty FRUIT_AMOUNT = IntProperty.of("fruit_amount", 1, 4);
    public static final IntProperty SAWDUST_LAYERS = IntProperty.of("sawdust_layers", 1, 16);
    public static final BooleanProperty TOP = BooleanProperty.of("top");
    public static final BooleanProperty SPIKE_ACTIVE = BooleanProperty.of("spike_active");


    //Triple door Properties


    //Cauldron behaviors
    public static final Map<Item, CauldronBehavior> BAMBOO_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final CauldronBehavior FILL_WITH_BAMBOO_SHELLS = (state, world, pos, player, hand, stack) -> CauldronBehavior.fillCauldron(world, pos, player, hand, stack, CelluloseBlocks.DISSOLVED_BAMBOO_CAULDRON_BLOCK.getDefaultState(), SoundEvents.ITEM_BUCKET_EMPTY);
}
