package net.qzimyion.cellulose.registry;

import net.minecraft.item.ItemGroups;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Items;

public class CelluloseItemGroups
{
    public static void registerItemGroups()
    {
        //This section adds items to ingredients group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register( content->{
            content.addAfter(Items.EGG, CelluloseItems.PIPIS);
        });

        /* This section adds items to building blocks group */

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            /* Section 1: Solid blocks */
            content.addAfter(Items.JUNGLE_SLAB, CelluloseBlocks.VERTICAL_JUNGLE_PLANKS);
            content.addAfter(Items.DARK_OAK_SLAB, CelluloseBlocks.VERTICAL_DARK_OAK_PLANKS);
            content.addAfter(Items.OAK_SLAB, CelluloseBlocks.VERTICAL_OAK_PLANKS);
            content.addAfter(Items.BIRCH_SLAB, CelluloseBlocks.VERTICAL_BIRCH_PLANKS);
            content.addAfter(Items.SPRUCE_SLAB, CelluloseBlocks.VERTICAL_SPRUCE_PLANKS);
            content.addAfter(Items.ACACIA_SLAB, CelluloseBlocks.VERTICAL_ACACIA_PLANKS);
            content.addAfter(Items.MANGROVE_SLAB, CelluloseBlocks.VERTICAL_MANGROVE_PLANKS);
            content.addAfter(Items.BAMBOO_SLAB, CelluloseBlocks.VERTICAL_BAMBOO_PLANKS);
            content.addAfter(Items.CHERRY_SLAB, CelluloseBlocks.VERTICAL_CHERRY_PLANKS);
            content.addAfter(Items.CRIMSON_SLAB, CelluloseBlocks.VERTICAL_CRIMSON_PLANKS);
            content.addAfter(Items.WARPED_SLAB, CelluloseBlocks.VERTICAL_WARPED_PLANKS);

            /*Section 2: Stairs*/
            content.addAfter(CelluloseBlocks.VERTICAL_OAK_PLANKS, CelluloseBlocks.VERTICAL_OAK_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_BIRCH_PLANKS, CelluloseBlocks.VERTICAL_BIRCH_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_SPRUCE_PLANKS, CelluloseBlocks.VERTICAL_SPRUCE_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_DARK_OAK_PLANKS, CelluloseBlocks.VERTICAL_DARK_OAK_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_JUNGLE_PLANKS, CelluloseBlocks.VERTICAL_JUNGLE_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_ACACIA_PLANKS, CelluloseBlocks.VERTICAL_ACACIA_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_CRIMSON_PLANKS, CelluloseBlocks.VERTICAL_CRIMSON_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_WARPED_PLANKS, CelluloseBlocks.VERTICAL_WARPED_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_MANGROVE_PLANKS, CelluloseBlocks.VERTICAL_MANGROVE_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_BAMBOO_PLANKS, CelluloseBlocks.VERTICAL_BAMBOO_PLANKS_STAIRS);
            content.addAfter(CelluloseBlocks.VERTICAL_CHERRY_PLANKS, CelluloseBlocks.VERTICAL_CHERRY_PLANKS_STAIRS);


            /*Section 3: Slabs*/
            content.addAfter(CelluloseBlocks.VERTICAL_OAK_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_OAK_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_BIRCH_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_BIRCH_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_SPRUCE_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_SPRUCE_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_DARK_OAK_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_DARK_OAK_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_JUNGLE_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_JUNGLE_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_ACACIA_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_ACACIA_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_CRIMSON_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_CRIMSON_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_WARPED_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_WARPED_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_MANGROVE_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_MANGROVE_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_BAMBOO_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_BAMBOO_PLANKS_SLABS);
            content.addAfter(CelluloseBlocks.VERTICAL_CHERRY_PLANKS_STAIRS, CelluloseBlocks.VERTICAL_CHERRY_PLANKS_SLABS);

            //This section adds Lintels (Custom block)

            content.addAfter(CelluloseBlocks.VERTICAL_OAK_PLANKS_SLABS, CelluloseBlocks.OAK_FRAME);
            content.addAfter(CelluloseBlocks.VERTICAL_BIRCH_PLANKS_SLABS, CelluloseBlocks.BIRCH_FRAME);
            content.addAfter(CelluloseBlocks.OAK_FRAME, CelluloseBlocks.OAK_LINTELS);
            content.addAfter(CelluloseBlocks.BIRCH_FRAME, CelluloseBlocks.BIRCH_LINTELS);

            //This section adds mosaic blocks

            content.addAfter(Items.STRIPPED_OAK_WOOD, CelluloseBlocks.OAK_MOSAIC);
            content.addAfter(Items.STRIPPED_BIRCH_WOOD, CelluloseBlocks.BIRCH_MOSAIC);
            content.addAfter(Items.STRIPPED_SPRUCE_WOOD, CelluloseBlocks.SPRUCE_MOSAIC);
            content.addAfter(Items.STRIPPED_JUNGLE_WOOD, CelluloseBlocks.JUNGLE_MOSAIC);
            content.addAfter(Items.STRIPPED_ACACIA_WOOD, CelluloseBlocks.ACACIA_MOSAIC);
            content.addAfter(Items.STRIPPED_DARK_OAK_WOOD, CelluloseBlocks.DARK_OAK_MOSAIC);
            content.addAfter(Items.STRIPPED_CRIMSON_HYPHAE, CelluloseBlocks.CRIMSON_MOSAIC);
            content.addAfter(Items.STRIPPED_WARPED_HYPHAE, CelluloseBlocks.WARPED_MOSAIC);
            content.addAfter(Items.STRIPPED_MANGROVE_WOOD, CelluloseBlocks.MANGROVE_MOSAIC);
            content.addAfter(Items.STRIPPED_CHERRY_WOOD, CelluloseBlocks.CHERRY_MOSAIC);

            //Mosaic stairs
            content.addAfter(CelluloseBlocks.OAK_MOSAIC, CelluloseBlocks.OAK_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.BIRCH_MOSAIC, CelluloseBlocks.BIRCH_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.SPRUCE_MOSAIC, CelluloseBlocks.SPRUCE_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.JUNGLE_MOSAIC, CelluloseBlocks.JUNGLE_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.ACACIA_MOSAIC, CelluloseBlocks.ACACIA_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.DARK_OAK_MOSAIC, CelluloseBlocks.DARK_OAK_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.CRIMSON_MOSAIC, CelluloseBlocks.CRIMSON_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.WARPED_MOSAIC, CelluloseBlocks.WARPED_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.MANGROVE_MOSAIC, CelluloseBlocks.MANGROVE_MOSAIC_STAIRS);
            content.addAfter(CelluloseBlocks.CHERRY_MOSAIC, CelluloseBlocks.CHERRY_MOSAIC_STAIRS);

            //Mosaic slabs

            content.addAfter(CelluloseBlocks.OAK_MOSAIC_STAIRS, CelluloseBlocks.OAK_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.BIRCH_MOSAIC_STAIRS, CelluloseBlocks.BIRCH_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.SPRUCE_MOSAIC_STAIRS, CelluloseBlocks.SPRUCE_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.JUNGLE_MOSAIC_STAIRS, CelluloseBlocks.JUNGLE_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.ACACIA_MOSAIC_STAIRS, CelluloseBlocks.ACACIA_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.DARK_OAK_MOSAIC_STAIRS, CelluloseBlocks.DARK_OAK_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.CRIMSON_MOSAIC_STAIRS, CelluloseBlocks.CRIMSON_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.WARPED_MOSAIC_STAIRS, CelluloseBlocks.WARPED_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.MANGROVE_MOSAIC_STAIRS, CelluloseBlocks.MANGROVE_MOSAIC_SLABS);
            content.addAfter(CelluloseBlocks.CHERRY_MOSAIC_STAIRS, CelluloseBlocks.CHERRY_MOSAIC_SLABS);

            //Engraved logs and wood

            content.addAfter(Items.STRIPPED_OAK_WOOD, CelluloseBlocks.ENGRAVED_OAK);
            content.addAfter(Items.STRIPPED_BIRCH_WOOD, CelluloseBlocks.ENGRAVED_BIRCH);
            content.addAfter(Items.STRIPPED_SPRUCE_WOOD, CelluloseBlocks.ENGRAVED_SPRUCE);
            content.addAfter(Items.STRIPPED_JUNGLE_WOOD, CelluloseBlocks.ENGRAVED_JUNGLE);
            content.addAfter(Items.STRIPPED_ACACIA_WOOD, CelluloseBlocks.ENGRAVED_ACACIA);
            content.addAfter(Items.STRIPPED_DARK_OAK_WOOD, CelluloseBlocks.ENGRAVED_DARK_OAK);
            content.addAfter(Items.STRIPPED_CRIMSON_HYPHAE, CelluloseBlocks.ENGRAVED_CRIMSON);
            content.addAfter(Items.STRIPPED_WARPED_HYPHAE, CelluloseBlocks.ENGRAVED_WARPED);
            content.addAfter(Items.STRIPPED_MANGROVE_WOOD, CelluloseBlocks.ENGRAVED_MANGROVE);
            content.addAfter(Items.STRIPPED_CHERRY_WOOD, CelluloseBlocks.ENGRAVED_CHERRY);
            content.addAfter(CelluloseBlocks.ENGRAVED_OAK, CelluloseBlocks.ENGRAVED_OAK_WOOD);
            content.addAfter(CelluloseBlocks.ENGRAVED_BIRCH, CelluloseBlocks.ENGRAVED_BIRCH_WOOD);
            content.addAfter(CelluloseBlocks.ENGRAVED_SPRUCE, CelluloseBlocks.ENGRAVED_SPRUCE_WOOD);
            content.addAfter(CelluloseBlocks.ENGRAVED_JUNGLE, CelluloseBlocks.ENGRAVED_JUNGLE_WOOD);
            content.addAfter(CelluloseBlocks.ENGRAVED_ACACIA, CelluloseBlocks.ENGRAVED_ACACIA_WOOD);
            content.addAfter(CelluloseBlocks.ENGRAVED_DARK_OAK, CelluloseBlocks.ENGRAVED_DARK_OAK_WOOD);
            content.addAfter(CelluloseBlocks.ENGRAVED_CRIMSON, CelluloseBlocks.ENGRAVED_CRIMSON_HYPHAE);
            content.addAfter(CelluloseBlocks.ENGRAVED_WARPED, CelluloseBlocks.ENGRAVED_WARPED_HYPHAE);
            content.addAfter(CelluloseBlocks.ENGRAVED_MANGROVE, CelluloseBlocks.ENGRAVED_MANGROVE_WOOD);
            content.addAfter(CelluloseBlocks.ENGRAVED_CHERRY, CelluloseBlocks.ENGRAVED_CHERRY_WOOD);

            //Chipped woodset
            content.addAfter(CelluloseBlocks.ENGRAVED_OAK_WOOD, CelluloseBlocks.CHIPPED_OAK);
            content.addAfter(CelluloseBlocks.CHIPPED_OAK, CelluloseBlocks.CHIPPED_OAK_WOOD);

        });

        // Functional blocks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.STONECUTTER, CelluloseBlocks.SAWMILL);
        });

    }

}
