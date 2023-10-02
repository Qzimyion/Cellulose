package net.qzimyion.cellulose.util;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseTags
{
    public static class Blocks {
        //BlockTags
        public static final TagKey <Block> WOODEN_MOSAICS = createTag ("wooden_mosaics");
        public static final TagKey <Block> WOODEN_MOSAICS_SLABS = createTag("wooden_mosaics");
        public static final TagKey <Block> WOODEN_MOSAICS_STAIRS = createTag("wooden_mosaics_stairs");
        public static final TagKey <Block> WOODEN_FRAMES = createTag ("wooden_frames");
        public static final TagKey <Block> LINTELS = createTag ("lintels");
        public static final TagKey <Block> VERTICAL_PLANKS = createTag ("vertical_planks");
        public static final TagKey <Block> TILES = createTag ("tiles");
        public static final TagKey <Block> TILE_SLABS = createTag ("tiles_slab");
        public static final TagKey <Block> TILE_STAIRS = createTag ("tiles_stairs");
        public static final TagKey <Block> BOARDS = createTag ("boards");
        public static final TagKey <Block> BOARD_SLABS = createTag ("boards_slabs");
        public static final TagKey <Block> BOARD_STAIRS = createTag ("boards_stairs");
        public static final TagKey <Block> CHIPPED_PLANKS = createTag ("chipped_planks");
        public static final TagKey <Block> CHIPPED_PLANKS_SLAB = createTag ("chipped_planks_slabs");
        public static final TagKey <Block> CHIPPED_PLANKS_STAIRS = createTag ("chipped_planks_stairs");
        public static final TagKey <Block> CHISELED_PLANKS = createTag ("chiseled_planks");
        public static final TagKey <Block> GLAZED_WOOD = createTag ("glazed_wood");
        public static final TagKey <Block> GLAZED_SLABS = createTag ("glazed_slabs");
        public static final TagKey <Block> GLAZED_STAIRS = createTag ("glazed_stairs");
        public static final TagKey <Block> PAVEMENTS = createTag ("pavements");
        public static final TagKey <Block> PLANK_PILLARS = createTag ("plank_pillars");
        public static final TagKey <Block> BEAMS = createTag("beams");
        public static final TagKey <Block> PLANK_BARRICADE = createTag("plank_barricade");
        public static final TagKey <Block> LOG_BARRICADE = createTag("log_barricade");
        public static final TagKey <Block> STRIPPED_LOG_BARRICADE = createTag("stripped_log_barricade");
        public static final TagKey <Block> CHIPPED_PLANK_BARRICADE = createTag("chipped_plank_barricade");
        public static final TagKey <Block> CHIPPED_LOG_BARRICADE = createTag("chipped_log_barricade");
        public static final TagKey <Block> CHIPPED_STRIPPED_LOG_BARRICADE = createTag("chipped_stripped_log_barricade");
        public static final TagKey <Block> MOSAIC_BARRICADE = createTag("mosaic_barricade");
        public static final TagKey <Block> TILE_BARRICADE = createTag("tile_barricade");
        public static final TagKey <Block> PLANK_PILLAR_BARRICADE = createTag("plank_pillar_barricade");
        public static final TagKey <Block> GLAZED_BARRICADE = createTag("glazed_barricade");
        public static final TagKey <Block> BOARDS_BARRICADE = createTag("boards_barricade");
        public static final TagKey <Block> SAWDUST_LAYERS = createTag("sawdust_layers");

        public static final TagKey <Block> BOOKSHELVES = createTag("bookshelves");
        public static final TagKey <Block> EMPTY_BOOKSHELVES = createTag("empty_bookshelves");
        public static final TagKey <Block> COBWEBBED_BOOKSHELVES = createTag("cobwebbed_bookshelves");
        public static final TagKey <Block> EMPTY_COBWEBBED_BOOKSHELVES = createTag("empty_cobwebbed_bookshelves");
        public static final TagKey <Block> ABANDONED_BOOKSHELVES = createTag("abandoned_bookshelves");

        //Event only tags
        public static final TagKey <Block> ENGRAVABLE_LOGS = createTag ("engravable_logs");
        public static final TagKey <Block> CHIPPABLE_LOGS = createTag ("chippable_logs");

        //Plants
        public static final TagKey <Block> FLOWERABLE = createTag("flowerable");
        public static final TagKey <Block> DEFLOWER = createTag("deflower");


        //Woodsets
        public static final TagKey <Block> CACTUS_LOGS = createTag("cactus_logs");
        public static final TagKey <Block> AZALEA_LOGS = createTag("azalea_logs");

        private static TagKey <Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, name));
        }

        private static TagKey <Block> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {

        public static final TagKey <Item> PAVEMENTS = createTag ("pavements");
        public static final TagKey <Item> WOODEN_MOSAICS = createTag("wooden_mosaics_slabs");
        public static final TagKey <Item> WOODEN_MOSAICS_SLABS = createTag("wooden_mosaics");
        public static final TagKey <Item> WOODEN_MOSAICS_STAIRS = createTag("wooden_mosaics_stairs");
        public static final TagKey <Item> WOODEN_FRAMES = createTag ("wooden_frames");
        public static final TagKey <Item> LINTELS = createTag ("lintels");
        public static final TagKey <Item> TILES = createTag ("tiles");
        public static final TagKey <Item> TILE_SLABS = createTag ("tiles_slab");
        public static final TagKey <Item> TILE_STAIRS = createTag ("tiles_stairs");
        public static final TagKey <Item> BOARDS = createTag ("boards");
        public static final TagKey <Item> BOARD_SLABS = createTag ("boards_slabs");
        public static final TagKey <Item> BOARD_STAIRS = createTag ("boards_stairs");
        public static final TagKey <Item> CHIPPED_PLANKS = createTag ("chipped_planks");
        public static final TagKey <Item> CHIPPED_PLANKS_SLAB = createTag ("chipped_planks_slabs");
        public static final TagKey <Item> CHIPPED_PLANKS_STAIRS = createTag ("chipped_planks_stairs");
        public static final TagKey <Item> CHISELED_PLANKS = createTag ("chiseled_planks");
        public static final TagKey <Item> GLAZED_WOOD = createTag ("glazed_wood");
        public static final TagKey <Item> GLAZED_SLABS = createTag ("glazed_slabs");
        public static final TagKey <Item> GLAZED_STAIRS = createTag ("glazed_stairs");
        public static final TagKey <Item> AZALEA_FLOWER = createCommonTag("azalea_flower");
        public static final TagKey <Item> VERTICAL_PLANKS = createTag ("vertical_planks");

        public static final TagKey <Item> ACORNS = createTag("acorns");

        //Woodsets
        public static final TagKey <Item> CACTUS_LOGS = createTag("cactus_logs");
        public static final TagKey <Item> AZALEA_LOGS = createTag("azalea_logs");

        //Plank tags
        public static final TagKey <Item> OAK_PLANKS = createTag("oak_planks");
        public static final TagKey <Item> BIRCH_PLANKS = createTag("birch_planks");
        public static final TagKey <Item> SPRUCE_PLANKS = createTag("spruce_planks");
        public static final TagKey <Item> DARK_OAK_PLANKS = createTag("dark_oak_planks");
        public static final TagKey <Item> JUNGLE_PLANKS = createTag("jungle_planks");
        public static final TagKey <Item> ACACIA_PLANKS = createTag("acacia_planks");
        public static final TagKey <Item> CRIMSON_PLANKS = createTag("crimson_planks");
        public static final TagKey <Item> WARPED_PLANKS = createTag("warped_planks");
        public static final TagKey <Item> MANGROVE_PLANKS = createTag("mangrove_planks");
        public static final TagKey <Item> BAMBOO_PLANKS = createTag("bamboo_planks");
        public static final TagKey <Item> CHERRY_PLANKS = createTag("cherry_planks");
        public static final TagKey <Item> CACTUS_PLANKS = createTag("cactus_planks");
        public static final TagKey <Item> AZALEA_PLANKS = createTag("azalea_planks");
        public static final TagKey <Item> BLOOMING_AZALEA_PLANKS = createTag("blooming_azalea_planks");
        public static final TagKey <Item> SAWDUST = createTag("sawdust");

        //Common


        private static TagKey <Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Cellulose.MOD_ID, name));
        }

        private static TagKey <Item> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }

}
