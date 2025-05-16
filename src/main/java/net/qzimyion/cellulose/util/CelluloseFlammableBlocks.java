package net.qzimyion.cellulose.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.tags.BlockTags;
import net.qzimyion.cellulose.util.CelluloseTags;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;

public class CelluloseFlammableBlocks
{
    public static void registerFlammableBlocks()
    {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        //Adds blocks
        registry.add(BlockTags.LOGS_THAT_BURN, 5, 5);

        //Sawmill
        registry.add(SAWMILL, 5,5);

        //Compressed Blocks
        registry.add(PAPER_BLOCK, 1, 50);
    }
}
