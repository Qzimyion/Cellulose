package net.qzimyion.cellulose.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

import static net.minecraft.item.Items.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.util.CelluloseTags.Items.*;

public class CelluloseFuel
{
    public static void registerFuel()
    {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //Planks
        registry.add(CelluloseBlocks.CACTUS_PLANKS, 300);
        registry.add(CelluloseBlocks.AZALEA_PLANKS, 300);
        registry.add(CelluloseBlocks.BLOOMING_AZALEA_PLANKS, 300);

        //Vertical planks
        registry.add(VERTICAL_OAK_PLANKS, 300);
        registry.add(VERTICAL_BIRCH_PLANKS, 300);
        registry.add(VERTICAL_SPRUCE_PLANKS, 300);
        registry.add(VERTICAL_DARK_OAK_PLANKS, 300);
        registry.add(VERTICAL_JUNGLE_PLANKS, 300);
        registry.add(VERTICAL_ACACIA_PLANKS, 300);
        registry.add(VERTICAL_MANGROVE_PLANKS, 300);
        registry.add(VERTICAL_BAMBOO_PLANKS, 300);
        registry.add(VERTICAL_CHERRY_PLANKS, 300);
        registry.add(VERTICAL_CACTUS_PLANKS, 300);
        registry.add(VERTICAL_AZALEA_PLANKS, 300);
        registry.add(VERTICAL_BLOOMING_AZALEA_PLANKS, 300);

        //Mosaics
        registry.add(OAK_MOSAIC, 300);
        registry.add(BIRCH_MOSAIC, 300);
        registry.add(SPRUCE_MOSAIC, 300);
        registry.add(DARK_OAK_MOSAIC, 300);
        registry.add(JUNGLE_MOSAIC, 300);
        registry.add(ACACIA_MOSAIC, 300);
        registry.add(MANGROVE_MOSAIC, 300);
        registry.add(BAMBOO_MOSAIC, 300);
        registry.add(CHERRY_MOSAIC, 300);
        registry.add(CACTUS_MOSAIC, 300);
        registry.add(AZALEA_MOSAIC, 300);
        registry.add(BLOOMING_AZALEA_MOSAIC, 300);

        //Wooden Slabs
        registry.add(CACTUS_SLAB, 150);
        registry.add(AZALEA_SLAB, 150);
        registry.add(BLOOMING_AZALEA_SLAB, 150);

        //Wooden Stairs
        registry.add(CACTUS_STAIRS, 300);
        registry.add(AZALEA_STAIRS, 300);
        registry.add(BLOOMING_AZALEA_STAIRS, 300);

        //Frames
        registry.add(OAK_FRAME, 300);
        registry.add(BIRCH_FRAME, 300);
        registry.add(SPRUCE_FRAME, 300);
        registry.add(DARK_OAK_FRAME, 300);
        registry.add(JUNGLE_FRAME, 300);
        registry.add(ACACIA_FRAME, 300);
        registry.add(MANGROVE_FRAME, 300);
        registry.add(BAMBOO_FRAME, 300);
        registry.add(CHERRY_FRAME, 300);
        registry.add(CACTUS_FRAME, 300);
        registry.add(AZALEA_FRAME, 300);
        registry.add(BLOOMING_AZALEA_FRAME, 300);

        //Lintels
        registry.add(OAK_LINTELS, 100);
        registry.add(BIRCH_LINTELS, 100);
        registry.add(SPRUCE_LINTELS, 100);
        registry.add(DARK_OAK_LINTELS, 100);
        registry.add(JUNGLE_LINTELS, 100);
        registry.add(ACACIA_LINTELS, 100);
        registry.add(MANGROVE_LINTELS, 100);
        registry.add(BAMBOO_LINTELS, 100);
        registry.add(CHERRY_LINTELS, 100);
        registry.add(CACTUS_LINTELS, 100);
        registry.add(AZALEA_LINTELS, 100);
        registry.add(BLOOMING_AZALEA_LINTELS, 100);

        //Chipped Planks
        registry.add(CHIPPED_OAK_PLANKS, 300);
        registry.add(CHIPPED_BIRCH_PLANKS, 300);
        registry.add(CHIPPED_SPRUCE_PLANKS, 300);
        registry.add(CHIPPED_DARK_OAK_PLANKS, 300);
        registry.add(CHIPPED_JUNGLE_PLANKS, 300);
        registry.add(CHIPPED_ACACIA_PLANKS, 300);
        registry.add(CHIPPED_MANGROVE_PLANKS, 300);
        registry.add(CHIPPED_BAMBOO_PLANKS, 300);
        registry.add(CHIPPED_CHERRY_PLANKS, 300);
        registry.add(CHIPPED_CACTUS_PLANKS, 300);
        registry.add(CHIPPED_AZALEA_PLANKS, 300);
        registry.add(CHIPPED_BLOOMING_AZALEA_PLANKS, 300);

        //Chipped Planks Slabs
        registry.add(CHIPPED_OAK_SLAB, 300);
        registry.add(CHIPPED_BIRCH_SLAB, 300);
        registry.add(CHIPPED_SPRUCE_SLAB, 300);
        registry.add(CHIPPED_DARK_OAK_SLAB, 300);
        registry.add(CHIPPED_JUNGLE_SLAB, 300);
        registry.add(CHIPPED_ACACIA_SLAB, 300);
        registry.add(CHIPPED_MANGROVE_SLAB, 300);
        registry.add(CHIPPED_BAMBOO_SLAB, 300);
        registry.add(CHIPPED_CHERRY_SLAB, 300);
        registry.add(CHIPPED_CACTUS_SLAB, 300);
        registry.add(CHIPPED_AZALEA_SLAB, 300);
        registry.add(CHIPPED_BLOOMING_AZALEA_SLAB, 300);

        //Chipped stairs
        registry.add(CHIPPED_OAK_STAIRS, 300);
        registry.add(CHIPPED_BIRCH_STAIRS, 300);
        registry.add(CHIPPED_SPRUCE_STAIRS, 300);
        registry.add(CHIPPED_DARK_OAK_STAIRS, 300);
        registry.add(CHIPPED_JUNGLE_STAIRS, 300);
        registry.add(CHIPPED_ACACIA_STAIRS, 300);
        registry.add(CHIPPED_MANGROVE_STAIRS, 300);
        registry.add(CHIPPED_BAMBOO_STAIRS, 300);
        registry.add(CHIPPED_CHERRY_STAIRS, 300);
        registry.add(CHIPPED_CACTUS_STAIRS, 300);
        registry.add(CHIPPED_AZALEA_STAIRS, 300);
        registry.add(CHIPPED_BLOOMING_AZALEA_STAIRS, 300);

        //Vertical Chipped Planks
        registry.add(CHIPPED_VERTICAL_OAK_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_BIRCH_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_SPRUCE_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_DARK_OAK_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_JUNGLE_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_ACACIA_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_MANGROVE_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_BAMBOO_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_CHERRY_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_CACTUS_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_AZALEA_PLANKS, 300);
        registry.add(CHIPPED_VERTICAL_BLOOMING_AZALEA_PLANKS, 300);

        //Vertical Chipped Planks Slabs
        registry.add(CHIPPED_VERTICAL_OAK_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_BIRCH_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_SPRUCE_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_DARK_OAK_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_JUNGLE_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_ACACIA_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_MANGROVE_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_BAMBOO_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_CHERRY_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_CACTUS_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_AZALEA_SLAB, 300);
        registry.add(CHIPPED_VERTICAL_BLOOMING_AZALEA_SLAB, 300);

        //Vertical Chipped Planks Stairs
        registry.add(CHIPPED_VERTICAL_OAK_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_BIRCH_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_SPRUCE_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_DARK_OAK_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_JUNGLE_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_ACACIA_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_MANGROVE_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_BAMBOO_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_CHERRY_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_CACTUS_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_AZALEA_STAIRS, 300);
        registry.add(CHIPPED_VERTICAL_BLOOMING_AZALEA_STAIRS, 300);

        //registry.add(BOOKSHELVES, 300);

        //registry.add(EMPTY_BOOKSHELVES, 300);

        //registry.add(ABANDONED_BOOKSHELVES, 300);

        //registry.add(COBWEBBED_BOOKSHELVES, 300);

        //registry.add(COBWEBBED_EMPTY_BOOKSHELVES, 300);

        //Pavements

        //Plank pillars

        //Tiles

        //Tile slabs

        //Tile stairs

        //Timbers

        //Shoji

        //Glazed blocks

        //Chiseled Blocks

        //Chiseled boards

        //Sawmill
        registry.add(SAWMILL, 300);

        //Compressed Blocks
        registry.add(PAPER_BLOCK, 4000);

        ///Woodsets
        //Logs
        registry.add(CACTUS_LOGS, 300);
        registry.add(AZALEA_LOGS, 300);

        registry.add(CACTUS, 300);

        //Fences
        registry.add(CACTUS_FENCE, 300);
        registry.add(CACTUS_FENCE_GATE, 300);

        //Buttons
        registry.add(CACTUS_BUTTON, 200);
        registry.add(CACTUS_PRESSURE_PLATE, 200);
        //Doors
        registry.add(CACTUS_DOOR, 200);

        //Trapdoors
        registry.add(CACTUS_TRAPDOOR, 300);

        //Shutter
        registry.add(OAK_SHOJI, 100);
        
    }
}
