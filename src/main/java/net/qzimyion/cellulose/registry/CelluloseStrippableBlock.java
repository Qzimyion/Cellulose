package net.qzimyion.cellulose.registry;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Blocks;

import static net.minecraft.block.Blocks.*;
import static net.qzimyion.cellulose.registry.CelluloseBlocks.*;

public class CelluloseStrippableBlock
{
    public static void registerStrippableBlocks()
    {
        StrippableBlockRegistry.register(STRIPPED_OAK_LOG, ENGRAVED_OAK);
        StrippableBlockRegistry.register(STRIPPED_BIRCH_LOG, ENGRAVED_BIRCH);
        StrippableBlockRegistry.register(STRIPPED_SPRUCE_LOG, ENGRAVED_SPRUCE);
        StrippableBlockRegistry.register(STRIPPED_DARK_OAK_LOG, ENGRAVED_DARK_OAK);
        StrippableBlockRegistry.register(STRIPPED_JUNGLE_LOG, ENGRAVED_JUNGLE);
        StrippableBlockRegistry.register(STRIPPED_ACACIA_LOG, ENGRAVED_ACACIA);
        StrippableBlockRegistry.register(STRIPPED_CRIMSON_STEM, ENGRAVED_CRIMSON);
        StrippableBlockRegistry.register(STRIPPED_WARPED_STEM, ENGRAVED_WARPED);
        StrippableBlockRegistry.register(STRIPPED_MANGROVE_LOG, ENGRAVED_MANGROVE);
        StrippableBlockRegistry.register(STRIPPED_CHERRY_LOG, ENGRAVED_CHERRY);
        StrippableBlockRegistry.register(STRIPPED_OAK_WOOD, ENGRAVED_OAK_WOOD);
        StrippableBlockRegistry.register(STRIPPED_BIRCH_WOOD, ENGRAVED_BIRCH_WOOD);
        StrippableBlockRegistry.register(STRIPPED_SPRUCE_WOOD, ENGRAVED_SPRUCE_WOOD);
        StrippableBlockRegistry.register(STRIPPED_DARK_OAK_WOOD, ENGRAVED_DARK_OAK_WOOD);
        StrippableBlockRegistry.register(STRIPPED_JUNGLE_WOOD, ENGRAVED_JUNGLE_WOOD);
        StrippableBlockRegistry.register(STRIPPED_ACACIA_WOOD, ENGRAVED_ACACIA_WOOD);
        StrippableBlockRegistry.register(STRIPPED_CRIMSON_HYPHAE, ENGRAVED_CRIMSON_HYPHAE);
        StrippableBlockRegistry.register(STRIPPED_WARPED_HYPHAE, ENGRAVED_WARPED_HYPHAE);
        StrippableBlockRegistry.register(STRIPPED_MANGROVE_WOOD, ENGRAVED_MANGROVE_WOOD);
        StrippableBlockRegistry.register(STRIPPED_CHERRY_WOOD, ENGRAVED_CHERRY_WOOD);
    }
}
