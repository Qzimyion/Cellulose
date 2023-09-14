package net.qzimyion.cellulose.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import static net.minecraft.item.Items.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseFuel
{
    public static void registerFuel()
    {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //Plank fuel
        registry.add(VERTICAL_OAK_PLANKS, 300);
        registry.add(OAK_MOSAIC, 300);
        registry.add(VERTICAL_BIRCH_PLANKS, 300);
        registry.add(BIRCH_MOSAIC, 300);
        registry.add(VERTICAL_SPRUCE_PLANKS, 300);
        registry.add(SPRUCE_MOSAIC, 300);
        registry.add(VERTICAL_JUNGLE_PLANKS, 300);
        registry.add(JUNGLE_MOSAIC, 300);
        registry.add(VERTICAL_DARK_OAK_PLANKS, 300);
        registry.add(DARK_OAK_MOSAIC, 300);
        registry.add(VERTICAL_ACACIA_PLANKS, 300);
        registry.add(ACACIA_MOSAIC, 300);
        registry.add(VERTICAL_MANGROVE_PLANKS, 300);
        registry.add(MANGROVE_MOSAIC, 300);
        registry.add(VERTICAL_BAMBOO_PLANKS, 300);
        registry.add(VERTICAL_CHERRY_PLANKS, 300);
        registry.add(CHERRY_MOSAIC, 300);

        //Stairs fuel
        registry.add(VERTICAL_OAK_STAIR, 300);
        registry.add(OAK_MOSAIC_STAIRS, 300);
        registry.add(VERTICAL_BIRCH_STAIR, 300);
        registry.add(BIRCH_MOSAIC_STAIRS, 300);
        registry.add(VERTICAL_SPRUCE_STAIR, 300);
        registry.add(SPRUCE_MOSAIC_STAIRS, 300);
        registry.add(VERTICAL_JUNGLE_STAIR, 300);
        registry.add(JUNGLE_MOSAIC_STAIRS, 300);
        registry.add(VERTICAL_DARK_OAK_STAIR, 300);
        registry.add(DARK_OAK_MOSAIC_STAIRS, 300);
        registry.add(VERTICAL_ACACIA_STAIR, 300);
        registry.add(ACACIA_MOSAIC_STAIRS, 300);
        registry.add(VERTICAL_MANGROVE_STAIR, 300);
        registry.add(MANGROVE_MOSAIC_STAIRS, 300);
        registry.add(VERTICAL_BAMBOO_STAIR, 300);
        registry.add(VERTICAL_CHERRY_STAIR, 300);
        registry.add(CHERRY_MOSAIC_STAIRS, 300);

        //Slab fuel
        registry.add(VERTICAL_OAK_SLAB, 300);
        registry.add(OAK_MOSAIC_SLABS, 300);
        registry.add(VERTICAL_BIRCH_SLAB, 300);
        registry.add(BIRCH_MOSAIC_SLABS, 300);
        registry.add(VERTICAL_SPRUCE_SLAB, 300);
        registry.add(SPRUCE_MOSAIC_SLABS, 300);
        registry.add(VERTICAL_JUNGLE_SLAB, 300);
        registry.add(JUNGLE_MOSAIC_SLABS, 300);
        registry.add(VERTICAL_DARK_OAK_SLAB, 300);
        registry.add(DARK_OAK_MOSAIC_SLABS, 300);
        registry.add(VERTICAL_ACACIA_SLAB, 300);
        registry.add(ACACIA_MOSAIC_SLABS, 300);
        registry.add(VERTICAL_MANGROVE_SLAB, 300);
        registry.add(MANGROVE_MOSAIC_SLABS, 300);
        registry.add(VERTICAL_BAMBOO_SLAB, 300);
        registry.add(VERTICAL_CHERRY_SLAB, 300);
        registry.add(CHERRY_MOSAIC_SLABS, 300);

        //Lintel block fuel
        registry.add(OAK_LINTELS, 200);
        registry.add(BIRCH_LINTELS, 200);
        registry.add(SPRUCE_LINTELS,200);

        //Sawmill
        registry.add(SAWMILL, 300);

        //Chipped Woodset

        //Cactus Woodset
        registry.add(CACTUS, 300);
        registry.add(CACTUS_BUNDLE, 300);
        registry.add(CACTUS_CROWN, 300);
        registry.add(STRIPPED_CACTUS, 300);
        registry.add(STRIPPED_CACTUS_CROWN, 300);
        registry.add(ENGRAVED_CACTUS, 300);
        registry.add(ENGRAVED_CACTUS_CROWN, 300);
        registry.add(CACTUS_PLANKS, 300);
        registry.add(CACTUS_STAIRS, 300);
        registry.add(CACTUS_SLAB, 300);
        registry.add(CACTUS_PLANKS, 300);
        registry.add(CACTUS_FENCE, 300);
        registry.add(CACTUS_FENCE_GATE, 300);
        registry.add(CACTUS_BUTTON, 300);
        registry.add(CACTUS_PRESSURE_PLATE, 300);
        registry.add(CACTUS_DOOR, 300);
        registry.add(CACTUS_TRAPDOOR, 300);
        registry.add(ENGRAVED_CACTUS, 300);
        registry.add(ENGRAVED_CACTUS_CROWN, 300);
        registry.add(CACTUS_MOSAIC, 300);
        registry.add(CACTUS_MOSAIC_STAIRS, 300);
        registry.add(CACTUS_MOSAIC_SLABS, 300);
        
    }
}
