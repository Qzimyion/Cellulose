package net.qzimyion.cellulose.events;

import static net.minecraft.block.Blocks.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class OnUseBlockEventRegistry
{
    public static void registerEvents(){
        //Log slab and stair stripping
        SlabStrippingEvent.SlabStripping(OAK_LOG_SLABS, STRIPPED_OAK_LOG_SLABS);
        SlabStrippingEvent.SlabStripping(OAK_LOG_STAIRS, STRIPPED_OAK_LOG_STAIRS);

        //Block Chipping
        BlockChipperEvent.BlockChipping(OAK_LOG, CHIPPED_OAK);
        BlockChipperEvent.BlockChipping(OAK_WOOD, CHIPPED_OAK_WOOD);

        //Wood Charring
        WoodCharrerEvent.WoodCharring(OAK_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(BIRCH_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(SPRUCE_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(DARK_OAK_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(JUNGLE_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(ACACIA_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(MANGROVE_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(CHERRY_PLANKS, CHARRED_PLANKS);
    }
}
