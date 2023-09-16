package net.qzimyion.cellulose.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseTags
{
    public static class Blocks {
        //BlockTags
        public static final TagKey<Block> WOODEN_MOSAICS = createTag ("wooden_mosaics");
        public static final TagKey<Block> WOODEN_FRAMES = createTag ("wooden_frames");
        public static final TagKey<Block> LINTELS = createTag ("lintels");
        public static final TagKey<Block> VERTICAL_PLANKS = createTag ("vertical_planks");
        public static final TagKey<Block> TILES = createTag ("tiles");
        public static final TagKey<Block> BOARDS = createTag ("boards");
        public static final TagKey<Block> CARPENTED_WOOD = createTag ("carpented_wood");
        public static final TagKey<Block> CHARRABLE_WOOD = createTag ("charrable_wood");
        public static final TagKey<Block> CHIPPABLE_LOGS = createTag ("chippable_logs");
        public static final TagKey<Block> CHIPPED_PLANKS = createTag ("chipped_planks");
        public static final TagKey<Block> CHIPPED_PLANKS_SLAB = createTag ("chipped_planks_slabs");
        public static final TagKey<Block> CHIPPED_PLANKS_STAIRS = createTag ("chipped_planks_stairs");
        public static final TagKey<Block> CARVED_WOOD = createTag ("carved_wood");
        public static final TagKey<Block> GLAZED_WOOD = createTag ("glazed_wood");
        public static final TagKey<Block> WOODEN_PAVEMENTS = createTag ("wooden_pavements");
        public static final TagKey<Block> PLANK_PILLARS = createTag ("plank_pillars");
        public static final TagKey<Block> BEAMS = createTag("beams");
        public static final TagKey<Block> APPLE_PLACEABLE = createTag("apple_placeable");

        //Plants
        public static final TagKey<Block> FLOWERABLE = createTag("flowerable");
        public static final TagKey<Block> DEFLOWER = createTag("deflower");


        //Woodsets
        public static final TagKey<Block> CACTUS_LOGS = createTag("cactus_logs");
        public static final TagKey<Block> AZALEA_LOGS = createTag("azalea_logs");
        public static final TagKey<Block> CHARRED_LOGS = createTag("charred_logs");

        private static TagKey <Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, name));
        }

        private static TagKey <Block> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {

        public static final TagKey <Item> CHARRING_ITEMS = createTag("charring_items");
        public static final TagKey <Item> AZALEA_FLOWER = createCommonTag("azalea_flower");
        public static final TagKey <Item> WOODEN_MOSAICS = createTag("wooden_mosaics_slabs");
        public static final TagKey <Item> WOODEN_MOSAICS_SLABS = createTag("wooden_mosaics");
        public static final TagKey <Item> WOODEN_MOSAICS_STAIRS = createTag("wooden_mosaics_stairs");
        public static final TagKey <Item> CACTUS_LOGS = createTag("cactus_logs");
        public static final TagKey <Item> AZALEA_LOGS = createTag("azalea_logs");
        public static final TagKey <Item> ACORNS = createTag("acorns");

        private static TagKey <Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Cellulose.MOD_ID, name));
        }

        private static TagKey <Item> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }

}
