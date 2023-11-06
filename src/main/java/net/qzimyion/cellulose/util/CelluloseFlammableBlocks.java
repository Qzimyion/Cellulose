package net.qzimyion.cellulose.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.registry.tag.BlockTags;
import net.qzimyion.cellulose.util.CelluloseTags;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseFlammableBlocks
{
    public static void registerFlammableBlocks()
    {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        //Adds blocks
        registry.add(BlockTags.PLANKS, 5, 5);
        registry.add(BlockTags.LOGS_THAT_BURN, 5, 5);
        registry.add(BlockTags.WOODEN_SLABS, 5, 5);
        registry.add(BlockTags.WOODEN_STAIRS, 5, 5);
        registry.add(CelluloseTags.Blocks.WOODEN_MOSAICS, 5, 5);
        registry.add(CelluloseTags.Blocks.WOODEN_MOSAICS_SLABS, 5, 5);
        registry.add(CelluloseTags.Blocks.WOODEN_MOSAICS_STAIRS, 5, 5);
        registry.add(CelluloseTags.Blocks.WOODEN_FRAMES, 1, 10);
        registry.add(CelluloseTags.Blocks.LINTELS, 1, 10);

        //Sawmill
        registry.add(SAWMILL, 5,5);

        //Compressed Blocks
        registry.add(PAPER_BLOCK, 1, 50);
    }
}
