package net.qzimyion.cellulose.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

import static net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.modifyEntriesEvent;
import static net.minecraft.item.Items.*;
import static net.qzimyion.cellulose.registry.CelluloseBlocks.*;
import static net.qzimyion.cellulose.registry.CelluloseItems.PIPIS;

public class CelluloseItemGroups
{
    public static void registerItemGroups()
    {
        //This section adds items to ingredients group

        modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content->{content.addAfter(EGG, PIPIS);});

        /*This section adds items to building blocks group
        Section1: Solid block*/

        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(JUNGLE_SLAB, VERTICAL_JUNGLE_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(DARK_OAK_SLAB, VERTICAL_DARK_OAK_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(OAK_SLAB, VERTICAL_OAK_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(BIRCH_SLAB, VERTICAL_BIRCH_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(SPRUCE_SLAB, VERTICAL_SPRUCE_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ACACIA_SLAB, VERTICAL_ACACIA_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(MANGROVE_SLAB, VERTICAL_MANGROVE_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(BAMBOO_SLAB, VERTICAL_BAMBOO_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(CHERRY_SLAB, VERTICAL_CHERRY_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(CRIMSON_SLAB, VERTICAL_CRIMSON_PLANKS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(WARPED_SLAB, VERTICAL_WARPED_PLANKS);});

        /*Section 2: Stairs*/

        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_OAK_PLANKS, VERTICAL_OAK_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_BIRCH_PLANKS, VERTICAL_BIRCH_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_SPRUCE_PLANKS, VERTICAL_SPRUCE_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_DARK_OAK_PLANKS, VERTICAL_DARK_OAK_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_JUNGLE_PLANKS, VERTICAL_JUNGLE_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_ACACIA_PLANKS, VERTICAL_ACACIA_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_CRIMSON_PLANKS, VERTICAL_CRIMSON_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_WARPED_PLANKS, VERTICAL_WARPED_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_MANGROVE_PLANKS, VERTICAL_MANGROVE_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_BAMBOO_PLANKS, VERTICAL_BAMBOO_PLANKS_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_CHERRY_PLANKS, VERTICAL_CHERRY_PLANKS_STAIRS);});


        /*Section 3: Slabs*/

        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_OAK_PLANKS_STAIRS, VERTICAL_OAK_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_BIRCH_PLANKS_STAIRS, VERTICAL_BIRCH_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_SPRUCE_PLANKS_STAIRS, VERTICAL_SPRUCE_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_DARK_OAK_PLANKS_STAIRS, VERTICAL_DARK_OAK_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_JUNGLE_PLANKS_STAIRS, VERTICAL_JUNGLE_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_ACACIA_PLANKS_STAIRS, VERTICAL_ACACIA_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_CRIMSON_PLANKS_STAIRS, VERTICAL_CRIMSON_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_WARPED_PLANKS_STAIRS, VERTICAL_WARPED_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_MANGROVE_PLANKS_STAIRS, VERTICAL_MANGROVE_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_BAMBOO_PLANKS_STAIRS, VERTICAL_BAMBOO_PLANKS_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_CHERRY_PLANKS_STAIRS, VERTICAL_CHERRY_PLANKS_SLABS);});

        //This section adds Lintels (Custom block)

        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_OAK_PLANKS_SLABS, OAK_FRAME);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(VERTICAL_BIRCH_PLANKS_SLABS, BIRCH_FRAME);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(OAK_FRAME, OAK_LINTELS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(BIRCH_FRAME, BIRCH_LINTELS);});

        //This section adds mosaic blocks

        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_OAK_WOOD, OAK_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_BIRCH_WOOD, BIRCH_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_SPRUCE_WOOD, SPRUCE_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_JUNGLE_WOOD, JUNGLE_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_ACACIA_WOOD, ACACIA_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_DARK_OAK_WOOD, DARK_OAK_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_CRIMSON_HYPHAE, CRIMSON_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_WARPED_HYPHAE, WARPED_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_MANGROVE_WOOD, MANGROVE_MOSAIC);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_CHERRY_WOOD, CHERRY_MOSAIC);});

        //Mosaic stairs

        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(OAK_MOSAIC, OAK_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(BIRCH_MOSAIC, BIRCH_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(SPRUCE_MOSAIC, SPRUCE_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(JUNGLE_MOSAIC, JUNGLE_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ACACIA_MOSAIC, ACACIA_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(DARK_OAK_MOSAIC, DARK_OAK_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(CRIMSON_MOSAIC, CRIMSON_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(WARPED_MOSAIC, WARPED_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(MANGROVE_MOSAIC, MANGROVE_MOSAIC_STAIRS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(CHERRY_MOSAIC, CHERRY_MOSAIC_STAIRS);});

        //Mosaic slabs

        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(OAK_MOSAIC_STAIRS, OAK_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(BIRCH_MOSAIC_STAIRS, BIRCH_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(SPRUCE_MOSAIC_STAIRS, SPRUCE_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(JUNGLE_MOSAIC_STAIRS, JUNGLE_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ACACIA_MOSAIC_STAIRS, ACACIA_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(DARK_OAK_MOSAIC_STAIRS, DARK_OAK_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(CRIMSON_MOSAIC_STAIRS, CRIMSON_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(WARPED_MOSAIC_STAIRS, WARPED_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(MANGROVE_MOSAIC_STAIRS, MANGROVE_MOSAIC_SLABS);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(CHERRY_MOSAIC_STAIRS, CHERRY_MOSAIC_SLABS);});

        //Sawmill
        modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content->{content.addAfter(STONECUTTER, SAWMILL);});

        //Engraved logs and wood

        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_OAK_WOOD, ENGRAVED_OAK);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_BIRCH_WOOD, ENGRAVED_BIRCH);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_SPRUCE_WOOD, ENGRAVED_SPRUCE);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_JUNGLE_WOOD, ENGRAVED_JUNGLE);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_ACACIA_WOOD, ENGRAVED_ACACIA);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_DARK_OAK_WOOD, ENGRAVED_DARK_OAK);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_CRIMSON_HYPHAE, ENGRAVED_CRIMSON);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_WARPED_HYPHAE, ENGRAVED_WARPED);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_MANGROVE_WOOD, ENGRAVED_MANGROVE);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(STRIPPED_CHERRY_WOOD, ENGRAVED_CHERRY);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_OAK, ENGRAVED_OAK_WOOD);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_BIRCH, ENGRAVED_BIRCH_WOOD);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_SPRUCE, ENGRAVED_SPRUCE_WOOD);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_JUNGLE, ENGRAVED_JUNGLE_WOOD);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_ACACIA, ENGRAVED_ACACIA_WOOD);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_DARK_OAK, ENGRAVED_DARK_OAK_WOOD);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_CRIMSON, ENGRAVED_CRIMSON_HYPHAE);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_WARPED, ENGRAVED_WARPED_HYPHAE);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_MANGROVE, ENGRAVED_MANGROVE_WOOD);});
        modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content->{content.addAfter(ENGRAVED_CHERRY, ENGRAVED_CHERRY_WOOD);});

    }

}
