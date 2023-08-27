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
        BlockChipperEvent.BlockChipping(BIRCH_LOG, CHIPPED_BIRCH);
        BlockChipperEvent.BlockChipping(SPRUCE_LOG, CHIPPED_SPRUCE);
        BlockChipperEvent.BlockChipping(DARK_OAK_LOG, CHIPPED_DARK_OAK);
        BlockChipperEvent.BlockChipping(JUNGLE_LOG, CHIPPED_JUNGLE);
        BlockChipperEvent.BlockChipping(ACACIA_LOG, CHIPPED_ACACIA);
        BlockChipperEvent.BlockChipping(CRIMSON_STEM, CHIPPED_CRIMSON);
        BlockChipperEvent.BlockChipping(WARPED_STEM, CHIPPED_WARPED);
        BlockChipperEvent.BlockChipping(MANGROVE_LOG, CHIPPED_MANGROVE);
        BlockChipperEvent.BlockChipping(BAMBOO_BLOCK, CHIPPED_BAMBOO);
        BlockChipperEvent.BlockChipping(CHERRY_LOG, CHIPPED_CHERRY);
        BlockChipperEvent.BlockChipping(CACTUS_BUNDLE, CHIPPED_CACTUS);

        BlockChipperEvent.BlockChipping(OAK_WOOD, CHIPPED_OAK_WOOD);
        BlockChipperEvent.BlockChipping(BIRCH_WOOD, CHIPPED_BIRCH_WOOD);
        BlockChipperEvent.BlockChipping(SPRUCE_WOOD, CHIPPED_SPRUCE_WOOD);
        BlockChipperEvent.BlockChipping(DARK_OAK_WOOD, CHIPPED_DARK_OAK_WOOD);
        BlockChipperEvent.BlockChipping(JUNGLE_WOOD, CHIPPED_JUNGLE_WOOD);
        BlockChipperEvent.BlockChipping(ACACIA_WOOD, CHIPPED_ACACIA_WOOD);
        BlockChipperEvent.BlockChipping(CRIMSON_HYPHAE, CHIPPED_CRIMSON_HYPHAE);
        BlockChipperEvent.BlockChipping(WARPED_HYPHAE, CHIPPED_WARPED_HYPHAE);
        BlockChipperEvent.BlockChipping(MANGROVE_WOOD, CHIPPED_MANGROVE_WOOD);

        BlockChipperEvent.BlockChipping(CHERRY_WOOD, CHIPPED_CHERRY_WOOD);
        BlockChipperEvent.BlockChipping(CACTUS_CROWN, CHIPPED_CACTUS_CROWN);

        //Wood Charring
        WoodCharrerEvent.WoodCharring(OAK_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(BIRCH_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(SPRUCE_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(DARK_OAK_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(JUNGLE_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(ACACIA_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(MANGROVE_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(CHERRY_PLANKS, CHARRED_PLANKS);
        WoodCharrerEvent.WoodCharring(CACTUS_PLANKS, CHARRED_PLANKS);

        WoodCharrerEvent.WoodCharring(OAK_SLAB, CHARRED_SLABS);
        WoodCharrerEvent.WoodCharring(BIRCH_SLAB, CHARRED_SLABS);
        WoodCharrerEvent.WoodCharring(SPRUCE_SLAB, CHARRED_SLABS);
        WoodCharrerEvent.WoodCharring(DARK_OAK_SLAB, CHARRED_SLABS);
        WoodCharrerEvent.WoodCharring(JUNGLE_SLAB, CHARRED_SLABS);
        WoodCharrerEvent.WoodCharring(ACACIA_SLAB, CHARRED_SLABS);
        WoodCharrerEvent.WoodCharring(MANGROVE_SLAB, CHARRED_SLABS);
        WoodCharrerEvent.WoodCharring(CHERRY_SLAB, CHARRED_SLABS);
        WoodCharrerEvent.WoodCharring(CACTUS_SLABS, CHARRED_SLABS);

        WoodCharrerEvent.WoodCharring(OAK_STAIRS, CHARRED_STAIRS);
        WoodCharrerEvent.WoodCharring(BIRCH_STAIRS, CHARRED_STAIRS);
        WoodCharrerEvent.WoodCharring(SPRUCE_STAIRS, CHARRED_STAIRS);
        WoodCharrerEvent.WoodCharring(DARK_OAK_STAIRS, CHARRED_STAIRS);
        WoodCharrerEvent.WoodCharring(JUNGLE_STAIRS, CHARRED_STAIRS);
        WoodCharrerEvent.WoodCharring(ACACIA_STAIRS, CHARRED_STAIRS);
        WoodCharrerEvent.WoodCharring(MANGROVE_STAIRS, CHARRED_STAIRS);
        WoodCharrerEvent.WoodCharring(CHERRY_STAIRS, CHARRED_STAIRS);
        WoodCharrerEvent.WoodCharring(CACTUS_STAIRS, CHARRED_STAIRS);
    }
}
