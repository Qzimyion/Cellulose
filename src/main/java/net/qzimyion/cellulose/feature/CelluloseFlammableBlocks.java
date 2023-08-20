package net.qzimyion.cellulose.feature;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseFlammableBlocks
{
    public static void registerFlammableBlocks()
    {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        //Adds blocks
        registry.add(VERTICAL_OAK_PLANKS, 5, 5);
        registry.add(OAK_MOSAIC, 5, 5);
        registry.add(VERTICAL_BIRCH_PLANKS, 5, 5);
        registry.add(BIRCH_MOSAIC, 5, 5);
        registry.add(VERTICAL_SPRUCE_PLANKS, 5, 5);
        registry.add(SPRUCE_MOSAIC, 5, 5);
        registry.add(VERTICAL_DARK_OAK_PLANKS, 5, 5);
        registry.add(DARK_OAK_MOSAIC, 5, 5);
        registry.add(VERTICAL_JUNGLE_PLANKS, 5, 5);
        registry.add(JUNGLE_MOSAIC, 5, 5);
        registry.add(VERTICAL_ACACIA_PLANKS, 5, 5);
        registry.add(ACACIA_MOSAIC, 5, 5);
        registry.add(VERTICAL_MANGROVE_PLANKS, 5, 5);
        registry.add(MANGROVE_MOSAIC, 5, 5);
        registry.add(VERTICAL_BAMBOO_PLANKS, 5, 5);
        registry.add(VERTICAL_CHERRY_PLANKS, 5, 5);
        registry.add(CHERRY_MOSAIC, 5, 5);

        //Adds slabs
        registry.add(VERTICAL_OAK_PLANKS_SLABS, 5, 5);
        registry.add(VERTICAL_BIRCH_PLANKS_SLABS, 5, 5);
        registry.add(VERTICAL_SPRUCE_PLANKS_SLABS, 5, 5);
        registry.add(VERTICAL_DARK_OAK_PLANKS_SLABS, 5, 5);
        registry.add(VERTICAL_JUNGLE_PLANKS_SLABS, 5, 5);
        registry.add(VERTICAL_ACACIA_PLANKS_SLABS, 5, 5);
        registry.add(VERTICAL_MANGROVE_PLANKS_SLABS, 5, 5);
        registry.add(VERTICAL_BAMBOO_PLANKS_SLABS, 5, 5);
        registry.add(VERTICAL_CHERRY_PLANKS_SLABS, 5, 5);

        //Adds stairs
        registry.add(VERTICAL_OAK_PLANKS_STAIRS, 5, 5);
        registry.add(VERTICAL_BIRCH_PLANKS_STAIRS, 5, 5);
        registry.add(VERTICAL_SPRUCE_PLANKS_STAIRS, 5, 5);
        registry.add(VERTICAL_DARK_OAK_PLANKS_STAIRS, 5, 5);
        registry.add(VERTICAL_JUNGLE_PLANKS_STAIRS, 5, 5);
        registry.add(VERTICAL_ACACIA_PLANKS_STAIRS, 5, 5);
        registry.add(VERTICAL_MANGROVE_PLANKS_STAIRS, 5, 5);
        registry.add(VERTICAL_BAMBOO_PLANKS_STAIRS, 5, 5);
        registry.add(VERTICAL_CHERRY_PLANKS_STAIRS, 5, 5);

        //Adds Lintels
        registry.add(OAK_LINTELS, 1,10);
        registry.add(BIRCH_LINTELS, 1,10);

        //Sawmill
        registry.add(SAWMILL, 5,5);

        //Engraved logs and wood
        registry.add(ENGRAVED_OAK, 5,5);
        registry.add(ENGRAVED_OAK_WOOD, 5,5);
        registry.add(ENGRAVED_BIRCH, 5,5);
        registry.add(ENGRAVED_BIRCH_WOOD, 5,5);
        registry.add(ENGRAVED_SPRUCE, 5,5);
        registry.add(ENGRAVED_SPRUCE_WOOD, 5,5);
        registry.add(ENGRAVED_DARK_OAK, 5,5);
        registry.add(ENGRAVED_DARK_OAK_WOOD, 5,5);
        registry.add(ENGRAVED_JUNGLE, 5,5);
        registry.add(ENGRAVED_JUNGLE_WOOD, 5,5);
        registry.add(ENGRAVED_ACACIA, 5,5);
        registry.add(ENGRAVED_ACACIA_WOOD, 5,5);
        registry.add(ENGRAVED_MANGROVE, 5,5);
        registry.add(ENGRAVED_MANGROVE_WOOD, 5,5);
        registry.add(ENGRAVED_CHERRY, 5,5);
        registry.add(ENGRAVED_CHERRY_WOOD, 5,5);
    }
}
