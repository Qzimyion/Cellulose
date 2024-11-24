package net.qzimyion.cellulose.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
        public static final TagKey <Block> TIMERS = createTag ("timbers");
        public static final TagKey <Block> CHIPPED_PLANKS = createTag ("chipped_planks");
        public static final TagKey <Block> CHIPPED_PLANKS_SLAB = createTag ("chipped_planks_slabs");
        public static final TagKey <Block> CHIPPED_PLANKS_STAIRS = createTag ("chipped_planks_stairs");
        public static final TagKey <Block> CHISELED_PLANKS = createTag ("chiseled_planks");
        public static final TagKey <Block> GLAZED_WOOD = createTag ("glazed_wood");
        public static final TagKey <Block> PAVEMENTS = createTag ("pavements");
        public static final TagKey <Block> PLANK_PILLARS = createTag ("plank_pillars");
        public static final TagKey <Block> BEAMS = createTag("beams");
        public static final TagKey <Block> BOOKSHELVES = createTag("bookshelves");
        public static final TagKey <Block> EMPTY_BOOKSHELVES = createTag("empty_bookshelves");
        public static final TagKey <Block> COBWEBBED_BOOKSHELVES = createTag("cobwebbed_bookshelves");
        public static final TagKey <Block> COBWEBBED_EMPTY_BOOKSHELVES = createTag("cobwebbed_empty_bookshelves");
        public static final TagKey <Block> ABANDONED_BOOKSHELVES = createTag("abandoned_bookshelves");
        public static final TagKey <Block> CHISELED_BOOKSHELVES = createTag("chiseled_bookshelves");

        //Event only tags
        public static final TagKey <Block> ENGRAVABLE_LOGS = createTag ("engravable_logs");
        public static final TagKey <Block> CHIPPABLE_LOGS = createTag ("chippable_logs");
        public static final TagKey <Block> SHOJIS = createTag ("shojis");

        //Plants
        public static final TagKey <Block> FLOWERABLE = createTag("flowerable");
        public static final TagKey <Block> DEFLOWER = createTag("deflower");


        //Woodsets
        public static final TagKey <Block> CACTUS_LOGS = createTag("cactus_logs");
        public static final TagKey <Block> AZALEA_LOGS = createTag("azalea_logs");
        public static final TagKey <Block> CEDAR_LOGS = createTag ("cedar_logs");
        public static final TagKey <Block> CEDAR_LEAVES = createTag ("cedar_leaves");

        private static TagKey <Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(Cellulose.MOD_ID, name));
        }

        private static TagKey <Block> createCommonTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation("c", name));
        }
    }

    public static class Items {

        public static final TagKey <Item> PAVEMENTS = createTag ("pavements");
        public static final TagKey <Item> WOODEN_MOSAICS = createTag("wooden_mosaics_slabs");
        public static final TagKey <Item> WOODEN_FRAMES = createTag ("wooden_frames");
        public static final TagKey <Item> LINTELS = createTag ("lintels");
        public static final TagKey <Item> TILES = createTag ("tiles");
        public static final TagKey <Item> TIMERS = createTag ("timbers");
        public static final TagKey <Item> CHIPPED_PLANKS = createTag ("chipped_planks");
        public static final TagKey <Item> CHIPPED_PLANKS_SLAB = createTag ("chipped_planks_slabs");
        public static final TagKey <Item> CHIPPED_PLANKS_STAIRS = createTag ("chipped_planks_stairs");
        public static final TagKey <Item> CHISELED_PLANKS = createTag ("chiseled_planks");
        public static final TagKey <Item> AZALEA_FLOWER = createCommonTag("azalea_flower");
        public static final TagKey <Item> VERTICAL_PLANKS = createTag ("vertical_planks");
        public static final TagKey <Item> ACORNS = createTag("acorns");

        //Woodsets
        public static final TagKey <Item> CACTUS_LOGS = createTag("cactus_logs");
        public static final TagKey <Item> AZALEA_LOGS = createTag("azalea_logs");
        public static final TagKey <Item> CEDAR_LOGS = createTag("cedar_logs");

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

        //Wooden slab tags
        public static final TagKey <Item> OAK_SLABS = createTag("oak_slabs");
        public static final TagKey <Item> BIRCH_SLABS = createTag("birch_slabs");
        public static final TagKey <Item> SPRUCE_SLABS = createTag("spruce_slabs");
        public static final TagKey <Item> DARK_OAK_SLABS = createTag("dark_oak_slabs");
        public static final TagKey <Item> JUNGLE_SLABS = createTag("jungle_slabs");
        public static final TagKey <Item> ACACIA_SLABS = createTag("acacia_slabs");
        public static final TagKey <Item> CRIMSON_SLABS = createTag("crimson_slabs");
        public static final TagKey <Item> WARPED_SLABS = createTag("warped_slabs");
        public static final TagKey <Item> MANGROVE_SLABS = createTag("mangrove_slabs");
        public static final TagKey <Item> BAMBOO_SLABS = createTag("bamboo_slabs");
        public static final TagKey <Item> CHERRY_SLABS = createTag("cherry_slabs");
        public static final TagKey <Item> CACTUS_SLABS = createTag("cactus_slabs");
        public static final TagKey <Item> AZALEA_SLABS = createTag("azalea_slabs");
        public static final TagKey <Item> BLOOMING_AZALEA_SLABS = createTag("blooming_azalea_slabs");


        public static final TagKey <Item> BARK = createTag("bark");
        public static final TagKey <Item> POTION_RACK_POTIONS = createTag("potion_rack_potions");
        public static final TagKey <Item> BOOKSHELVES = createTag("bookshelves");
        public static final TagKey <Item> EMPTY_BOOKSHELVES = createTag("empty_bookshelves");
        public static final TagKey <Item> COBWEBBED_BOOKSHELVES = createTag("cobwebbed_bookshelves");
        public static final TagKey <Item> COBWEBBED_EMPTY_BOOKSHELVES = createTag("cobwebbed_empty_bookshelves");
        public static final TagKey <Item> ABANDONED_BOOKSHELVES = createTag("abandoned_bookshelves");

        //Common


        private static TagKey <Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(Cellulose.MOD_ID, name));
        }

        private static TagKey <Item> createCommonTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation("c", name));
        }
    }

}
