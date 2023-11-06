package net.qzimyion.cellulose.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import static net.minecraft.item.Items.*;
import static net.minecraft.registry.tag.ItemTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.util.CelluloseTags.Items.*;

public class CelluloseFuel
{
    public static void registerFuel()
    {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(PLANKS, 300);
        registry.add(WOODEN_MOSAICS, 300);
        registry.add(WOODEN_SLABS, 300);
        registry.add(WOODEN_STAIRS, 300);
        registry.add(WOODEN_FRAMES, 300);
        registry.add(LINTELS, 150);
        registry.add(CHIPPED_PLANKS, 300);
        registry.add(CHIPPED_PLANKS_SLAB, 300);
        registry.add(CHIPPED_PLANKS_STAIRS, 300);
        registry.add(BOOKSHELVES, 300);
        registry.add(EMPTY_BOOKSHELVES, 300);
        registry.add(ABANDONED_BOOKSHELVES, 300);
        registry.add(COBWEBBED_BOOKSHELVES, 300);
        registry.add(COBWEBBED_EMPTY_BOOKSHELVES, 300);

        //Woodsets
        registry.add(CACTUS_LOGS, 300);
        registry.add(AZALEA_LOGS, 300);

        //Sawmill
        registry.add(SAWMILL, 300);

        //Compressed Blocks
        registry.add(BLOCK_OF_CHARCOAL, 16000);
        registry.add(PAPER_BLOCK, 4000);
        registry.add(BLOCK_OF_STICKS, 2000);

        //Cactus Woodset
        registry.add(CACTUS, 300);
        registry.add(CACTUS_STAIRS, 300);
        registry.add(CACTUS_SLAB, 150);
        registry.add(CACTUS_FENCE, 300);
        registry.add(CACTUS_FENCE_GATE, 300);
        registry.add(CACTUS_BUTTON, 200);
        registry.add(CACTUS_PRESSURE_PLATE, 200);
        registry.add(CACTUS_DOOR, 200);
        registry.add(CACTUS_TRAPDOOR, 300);
        
    }
}
