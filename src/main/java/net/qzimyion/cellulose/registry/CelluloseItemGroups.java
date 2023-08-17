package net.qzimyion.cellulose.registry;


import net.minecraft.item.ItemGroups;


import static net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.modifyEntriesEvent;
import static net.minecraft.item.ItemGroups.*;
import static net.minecraft.item.Items.*;
import static net.qzimyion.cellulose.registry.CelluloseBlocks.*;
import static net.qzimyion.cellulose.registry.CelluloseItems.PIPIS;

public class CelluloseItemGroups
{
    public static void registerItemGroups()
    {
        modifyEntriesEvent(INGREDIENTS).register(content->{content.addAfter(EGG, PIPIS);});

        /*This section adds items to building blocks group
        Section1: Solid block*/

        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_JUNGLE_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_DARK_OAK_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_OAK_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_BIRCH_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_SPRUCE_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_ACACIA_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_MANGROVE_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_BAMBOO_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_CHERRY_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_CRIMSON_PLANKS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_WARPED_PLANKS);});

        /*Section 2: Stairs*/

        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_OAK_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_BIRCH_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_SPRUCE_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_DARK_OAK_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_JUNGLE_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_ACACIA_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_CRIMSON_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_WARPED_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_MANGROVE_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_BAMBOO_PLANKS_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_CHERRY_PLANKS_STAIRS);});


        /*Section 3: Slabs*/

        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_OAK_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_BIRCH_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_SPRUCE_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_DARK_OAK_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_JUNGLE_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_ACACIA_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_CRIMSON_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_WARPED_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_MANGROVE_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_BAMBOO_PLANKS_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(VERTICAL_CHERRY_PLANKS_SLABS);});

        //This section adds Lintels (Custom block)

        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(OAK_FRAME);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(BIRCH_FRAME);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(OAK_LINTELS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(BIRCH_LINTELS);});

        //This section adds mosaic blocks

        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(OAK_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(BIRCH_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(SPRUCE_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(JUNGLE_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ACACIA_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(DARK_OAK_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(CRIMSON_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(WARPED_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(MANGROVE_MOSAIC);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(CHERRY_MOSAIC);});

        //Mosaic stairs

        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(OAK_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(BIRCH_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(SPRUCE_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(JUNGLE_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ACACIA_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(DARK_OAK_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(CRIMSON_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(WARPED_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(MANGROVE_MOSAIC_STAIRS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(CHERRY_MOSAIC_STAIRS);});

        //Mosaic slabs

        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(OAK_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(BIRCH_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(SPRUCE_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(JUNGLE_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ACACIA_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(DARK_OAK_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(CRIMSON_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(WARPED_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(MANGROVE_MOSAIC_SLABS);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(CHERRY_MOSAIC_SLABS);});

        //Sawmill
        modifyEntriesEvent(FUNCTIONAL).register(content->{content.addAfter(STONECUTTER, SAWMILL);});

        //Engraved logs and wood

        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_OAK);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_BIRCH);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_SPRUCE);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_JUNGLE);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_ACACIA);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_DARK_OAK);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_CRIMSON);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_WARPED);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_MANGROVE);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_CHERRY);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_OAK_WOOD);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_BIRCH_WOOD);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_SPRUCE_WOOD);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_JUNGLE_WOOD);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_ACACIA_WOOD);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_DARK_OAK_WOOD);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_CRIMSON_HYPHAE);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_WARPED_HYPHAE);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_MANGROVE_WOOD);});
        modifyEntriesEvent(BUILDING_BLOCKS).register(content->{content.add(ENGRAVED_CHERRY_WOOD);});

        //Chipped woodset

    }

}
