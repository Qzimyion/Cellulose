package net.qzimyion.cellulose.Util;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseTags
{
    TagKey<Block> WOODEN_MOSAICS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("cellulose", "wooden_mosaics"));
    TagKey<Block> WOODEN_MOSAICS_SLABS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("cellulose", "wooden_mosaics_slabs"));
    TagKey<Block> WOODEN_MOSAICS_STAIRS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("cellulose", "wooden_mosaics_stairs"));
    TagKey<Block> WOODEN_FRAMES = TagKey.of(Registries.BLOCK.getKey(), new Identifier("cellulose", "wooden_frames"));
    TagKey<Block> LINTELS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("cellulose", "lintels"));

    public static void registerTags(){
        Cellulose.LOGGER.info("Registering Tags for" + Cellulose.MOD_ID);
    }
}
