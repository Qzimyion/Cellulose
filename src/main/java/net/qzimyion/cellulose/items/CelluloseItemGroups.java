package net.qzimyion.cellulose.items;

import net.minecraft.item.ItemGroups;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import static net.minecraft.item.Items.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

public class CelluloseItemGroups
{
    public static void registerItemGroups()
    {
        //This section adds items to ingredients group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register( content->{
            content.addAfter(EGG, PIPIS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register( content->{
            content.addAfter(CHERRY_CHEST_BOAT, CACTUS_BOAT);
            content.addAfter(CACTUS_BOAT, CACTUS_CHEST_BOAT);

        });

        /* This section adds items to building blocks group */

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            /* Section 1: Solid blocks */
            content.addAfter(JUNGLE_SLAB, VERTICAL_JUNGLE_PLANKS);
            content.addAfter(DARK_OAK_SLAB, VERTICAL_DARK_OAK_PLANKS);
            content.addAfter(OAK_SLAB, VERTICAL_OAK_PLANKS);
            content.addAfter(BIRCH_SLAB, VERTICAL_BIRCH_PLANKS);
            content.addAfter(SPRUCE_SLAB, VERTICAL_SPRUCE_PLANKS);
            content.addAfter(ACACIA_SLAB, VERTICAL_ACACIA_PLANKS);
            content.addAfter(MANGROVE_SLAB, VERTICAL_MANGROVE_PLANKS);
            content.addAfter(BAMBOO_SLAB, VERTICAL_BAMBOO_PLANKS);
            content.addAfter(CHERRY_SLAB, VERTICAL_CHERRY_PLANKS);
            content.addAfter(CRIMSON_SLAB, VERTICAL_CRIMSON_PLANKS);
            content.addAfter(WARPED_SLAB, VERTICAL_WARPED_PLANKS);

            /*Section 2: Stairs*/
            content.addAfter(VERTICAL_OAK_PLANKS, VERTICAL_OAK_PLANKS_STAIRS);
            content.addAfter(VERTICAL_BIRCH_PLANKS, VERTICAL_BIRCH_PLANKS_STAIRS);
            content.addAfter(VERTICAL_SPRUCE_PLANKS, VERTICAL_SPRUCE_PLANKS_STAIRS);
            content.addAfter(VERTICAL_DARK_OAK_PLANKS, VERTICAL_DARK_OAK_PLANKS_STAIRS);
            content.addAfter(VERTICAL_JUNGLE_PLANKS, VERTICAL_JUNGLE_PLANKS_STAIRS);
            content.addAfter(VERTICAL_ACACIA_PLANKS, VERTICAL_ACACIA_PLANKS_STAIRS);
            content.addAfter(VERTICAL_CRIMSON_PLANKS, VERTICAL_CRIMSON_PLANKS_STAIRS);
            content.addAfter(VERTICAL_WARPED_PLANKS, VERTICAL_WARPED_PLANKS_STAIRS);
            content.addAfter(VERTICAL_MANGROVE_PLANKS, VERTICAL_MANGROVE_PLANKS_STAIRS);
            content.addAfter(VERTICAL_BAMBOO_PLANKS, VERTICAL_BAMBOO_PLANKS_STAIRS);
            content.addAfter(VERTICAL_CHERRY_PLANKS, VERTICAL_CHERRY_PLANKS_STAIRS);


            /*Section 3: Slabs*/
            content.addAfter(VERTICAL_OAK_PLANKS_STAIRS, VERTICAL_OAK_PLANKS_SLABS);
            content.addAfter(VERTICAL_BIRCH_PLANKS_STAIRS, VERTICAL_BIRCH_PLANKS_SLABS);
            content.addAfter(VERTICAL_SPRUCE_PLANKS_STAIRS, VERTICAL_SPRUCE_PLANKS_SLABS);
            content.addAfter(VERTICAL_DARK_OAK_PLANKS_STAIRS, VERTICAL_DARK_OAK_PLANKS_SLABS);
            content.addAfter(VERTICAL_JUNGLE_PLANKS_STAIRS, VERTICAL_JUNGLE_PLANKS_SLABS);
            content.addAfter(VERTICAL_ACACIA_PLANKS_STAIRS, VERTICAL_ACACIA_PLANKS_SLABS);
            content.addAfter(VERTICAL_CRIMSON_PLANKS_STAIRS, VERTICAL_CRIMSON_PLANKS_SLABS);
            content.addAfter(VERTICAL_WARPED_PLANKS_STAIRS, VERTICAL_WARPED_PLANKS_SLABS);
            content.addAfter(VERTICAL_MANGROVE_PLANKS_STAIRS, VERTICAL_MANGROVE_PLANKS_SLABS);
            content.addAfter(VERTICAL_BAMBOO_PLANKS_STAIRS, VERTICAL_BAMBOO_PLANKS_SLABS);
            content.addAfter(VERTICAL_CHERRY_PLANKS_STAIRS, VERTICAL_CHERRY_PLANKS_SLABS);

            //This section adds Lintels (Custom block)

            content.addAfter(VERTICAL_OAK_PLANKS_SLABS, OAK_FRAME);
            content.addAfter(VERTICAL_BIRCH_PLANKS_SLABS, BIRCH_FRAME);
            content.addAfter(OAK_FRAME, OAK_LINTELS);
            content.addAfter(BIRCH_FRAME, BIRCH_LINTELS);

            //This section adds mosaic blocks

            content.addAfter(STRIPPED_OAK_WOOD, OAK_MOSAIC);
            content.addAfter(STRIPPED_BIRCH_WOOD, BIRCH_MOSAIC);
            content.addAfter(STRIPPED_SPRUCE_WOOD, SPRUCE_MOSAIC);
            content.addAfter(STRIPPED_JUNGLE_WOOD, JUNGLE_MOSAIC);
            content.addAfter(STRIPPED_ACACIA_WOOD, ACACIA_MOSAIC);
            content.addAfter(STRIPPED_DARK_OAK_WOOD, DARK_OAK_MOSAIC);
            content.addAfter(STRIPPED_CRIMSON_HYPHAE, CRIMSON_MOSAIC);
            content.addAfter(STRIPPED_WARPED_HYPHAE, WARPED_MOSAIC);
            content.addAfter(STRIPPED_MANGROVE_WOOD, MANGROVE_MOSAIC);
            content.addAfter(STRIPPED_CHERRY_WOOD, CHERRY_MOSAIC);

            //Mosaic stairs
            content.addAfter(OAK_MOSAIC, OAK_MOSAIC_STAIRS);
            content.addAfter(BIRCH_MOSAIC, BIRCH_MOSAIC_STAIRS);
            content.addAfter(SPRUCE_MOSAIC, SPRUCE_MOSAIC_STAIRS);
            content.addAfter(JUNGLE_MOSAIC, JUNGLE_MOSAIC_STAIRS);
            content.addAfter(ACACIA_MOSAIC, ACACIA_MOSAIC_STAIRS);
            content.addAfter(DARK_OAK_MOSAIC, DARK_OAK_MOSAIC_STAIRS);
            content.addAfter(CRIMSON_MOSAIC, CRIMSON_MOSAIC_STAIRS);
            content.addAfter(WARPED_MOSAIC, WARPED_MOSAIC_STAIRS);
            content.addAfter(MANGROVE_MOSAIC, MANGROVE_MOSAIC_STAIRS);
            content.addAfter(CHERRY_MOSAIC, CHERRY_MOSAIC_STAIRS);

            //Mosaic slabs

            content.addAfter(OAK_MOSAIC_STAIRS, OAK_MOSAIC_SLABS);
            content.addAfter(BIRCH_MOSAIC_STAIRS, BIRCH_MOSAIC_SLABS);
            content.addAfter(SPRUCE_MOSAIC_STAIRS, SPRUCE_MOSAIC_SLABS);
            content.addAfter(JUNGLE_MOSAIC_STAIRS, JUNGLE_MOSAIC_SLABS);
            content.addAfter(ACACIA_MOSAIC_STAIRS, ACACIA_MOSAIC_SLABS);
            content.addAfter(DARK_OAK_MOSAIC_STAIRS, DARK_OAK_MOSAIC_SLABS);
            content.addAfter(CRIMSON_MOSAIC_STAIRS, CRIMSON_MOSAIC_SLABS);
            content.addAfter(WARPED_MOSAIC_STAIRS, WARPED_MOSAIC_SLABS);
            content.addAfter(MANGROVE_MOSAIC_STAIRS, MANGROVE_MOSAIC_SLABS);
            content.addAfter(CHERRY_MOSAIC_STAIRS, CHERRY_MOSAIC_SLABS);

            //Engraved logs and wood

            content.addAfter(STRIPPED_OAK_WOOD, ENGRAVED_OAK);
            content.addAfter(STRIPPED_BIRCH_WOOD, ENGRAVED_BIRCH);
            content.addAfter(STRIPPED_SPRUCE_WOOD, ENGRAVED_SPRUCE);
            content.addAfter(STRIPPED_JUNGLE_WOOD, ENGRAVED_JUNGLE);
            content.addAfter(STRIPPED_ACACIA_WOOD, ENGRAVED_ACACIA);
            content.addAfter(STRIPPED_DARK_OAK_WOOD, ENGRAVED_DARK_OAK);
            content.addAfter(STRIPPED_CRIMSON_HYPHAE, ENGRAVED_CRIMSON);
            content.addAfter(STRIPPED_WARPED_HYPHAE, ENGRAVED_WARPED);
            content.addAfter(STRIPPED_MANGROVE_WOOD, ENGRAVED_MANGROVE);
            content.addAfter(STRIPPED_CHERRY_WOOD, ENGRAVED_CHERRY);
            content.addAfter(ENGRAVED_OAK, ENGRAVED_OAK_WOOD);
            content.addAfter(ENGRAVED_BIRCH, ENGRAVED_BIRCH_WOOD);
            content.addAfter(ENGRAVED_SPRUCE, ENGRAVED_SPRUCE_WOOD);
            content.addAfter(ENGRAVED_JUNGLE, ENGRAVED_JUNGLE_WOOD);
            content.addAfter(ENGRAVED_ACACIA, ENGRAVED_ACACIA_WOOD);
            content.addAfter(ENGRAVED_DARK_OAK, ENGRAVED_DARK_OAK_WOOD);
            content.addAfter(ENGRAVED_CRIMSON, ENGRAVED_CRIMSON_HYPHAE);
            content.addAfter(ENGRAVED_WARPED, ENGRAVED_WARPED_HYPHAE);
            content.addAfter(ENGRAVED_MANGROVE, ENGRAVED_MANGROVE_WOOD);
            content.addAfter(ENGRAVED_CHERRY, ENGRAVED_CHERRY_WOOD);

            //Chipped woodset
            content.addAfter(ENGRAVED_OAK_WOOD, CHIPPED_OAK);
            content.addAfter(CHIPPED_OAK, CHIPPED_OAK_WOOD);
            content.addAfter(ENGRAVED_BIRCH_WOOD, CHIPPED_BIRCH);
            content.addAfter(CHIPPED_BIRCH, CHIPPED_BIRCH_WOOD);
            content.addAfter(ENGRAVED_SPRUCE, CHIPPED_SPRUCE);
            content.addAfter(CHIPPED_SPRUCE, CHIPPED_SPRUCE_WOOD);
            content.addAfter(ENGRAVED_DARK_OAK_WOOD, CHIPPED_DARK_OAK);
            content.addAfter(CHIPPED_DARK_OAK, CHIPPED_DARK_OAK_WOOD);
            content.addAfter(ENGRAVED_JUNGLE, CHIPPED_JUNGLE);
            content.addAfter(CHIPPED_JUNGLE, CHIPPED_JUNGLE_WOOD);
            content.addAfter(ENGRAVED_ACACIA, CHIPPED_ACACIA);
            content.addAfter(CHIPPED_ACACIA, CHIPPED_ACACIA_WOOD);

        });

        // Functional blocks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(STONECUTTER, SAWMILL);
        });

        //Cactus woodset
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(WARPED_BUTTON, CACTUS_BUNDLE);
            content.addAfter(CACTUS_BUNDLE, CACTUS_CROWN);
            content.addAfter(CACTUS_CROWN, STRIPPED_CACTUS);
            content.addAfter(STRIPPED_CACTUS, STRIPPED_CACTUS_CROWN);
            content.addAfter(STRIPPED_CACTUS_CROWN, ENGRAVED_CACTUS);
            content.addAfter(ENGRAVED_CACTUS, ENGRAVED_CACTUS_CROWN);
            content.addAfter(ENGRAVED_CACTUS_CROWN, CACTUS_MOSAIC);
            content.addAfter(CACTUS_MOSAIC, CACTUS_MOSAIC_STAIRS);
            content.addAfter(CACTUS_MOSAIC_STAIRS, CACTUS_MOSAIC_SLABS);
            content.addAfter(CACTUS_MOSAIC_SLABS, CACTUS_PLANKS);
            content.addAfter(CACTUS_PLANKS, CACTUS_STAIRS);
            content.addAfter(CACTUS_STAIRS, CACTUS_SLABS);
            content.addAfter(CACTUS_SLABS, VERTICAL_CACTUS_PLANKS);
            content.addAfter(VERTICAL_CACTUS_PLANKS, VERTICAL_CACTUS_PLANKS_STAIRS);
            content.addAfter(VERTICAL_CACTUS_PLANKS_STAIRS, VERTICAL_CACTUS_PLANKS_SLABS);
            content.addAfter(VERTICAL_CACTUS_PLANKS_SLABS, CACTUS_FENCE);
            content.addAfter(CACTUS_FENCE, CACTUS_FENCE_GATE);
            content.addAfter(CACTUS_FENCE_GATE, CACTUS_DOOR);
            content.addAfter(CACTUS_DOOR, CACTUS_TRAPDOOR);
            content.addAfter(CACTUS_TRAPDOOR, CACTUS_PRESSURE_PLATE);
            content.addAfter(CACTUS_PRESSURE_PLATE, CACTUS_BUTTON);
            content.addAfter(CHERRY_SIGN, CACTUS_SIGN);
            content.addAfter(CHERRY_HANGING_SIGN, CACTUS_HANGING_SIGN);
        });
    }

}
