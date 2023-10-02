package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.util.CelluloseTags;

import java.util.concurrent.CompletableFuture;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.registry.tag.BlockTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.util.CelluloseTags.Blocks.*;

public class CelluloseBlockTagsProvider extends FabricTagProvider.BlockTagProvider
{

    public CelluloseBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg)
    {
        //Misc
        TagKey<Block> LOG_SLABS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "log_slabs"));
        TagKey<Block> LOG_STAIRS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Cellulose.MOD_ID, "log_stairs"));

        ///Modded Tags

        getOrCreateTagBuilder(SAWDUST_LAYERS)
                .add(OAK_SAWDUST_LAYER)
                .add(BIRCH_SAWDUST_LAYER)
                .add(SPRUCE_SAWDUST_LAYER)
                .add(DARK_OAK_SAWDUST_LAYER)
                .add(JUNGLE_SAWDUST_LAYER)
                .add(ACACIA_SAWDUST_LAYER)
                .add(CRIMSON_SAWDUST_LAYER)
                .add(WARPED_SAWDUST_LAYER)
                .add(MANGROVE_SAWDUST_LAYER)
                .add(BAMBOO_SAWDUST_LAYER)
                .add(CHERRY_SAWDUST_LAYER)
                .add(CACTUS_SAWDUST_LAYER)
                .add(AZALEA_SAWDUST_LAYER)
        ;

        getOrCreateTagBuilder(BOOKSHELVES)
                .add(BOOKSHELF)
                .add(BIRCH_BOOKSHELF)
                .add(SPRUCE_BOOKSHELF)
                .add(DARK_OAK_BOOKSHELF)
                .add(JUNGLE_BOOKSHELF)
                .add(ACACIA_BOOKSHELF)
                .add(CRIMSON_BOOKSHELF)
                .add(WARPED_BOOKSHELF)
                .add(MANGROVE_BOOKSHELF)
                .add(BAMBOO_BOOKSHELF)
                .add(CHERRY_BOOKSHELF)
                .add(CACTUS_BOOKSHELF)
                .add(AZALEA_BOOKSHELF)
        ;

        getOrCreateTagBuilder(CHISELED_PLANKS)
                .add(CHISELED_OAK)
                .add(CHISELED_BIRCH)
                .add(CHISELED_SPRUCE)
                .add(CHISELED_DARK_OAK)
                .add(CHISELED_JUNGLE)
                .add(CHISELED_ACACIA)
                .add(CHISELED_CRIMSON)
                .add(CHISELED_WARPED)
                .add(CHISELED_MANGROVE)
                .add(CHISELED_BAMBOO)
                .add(CHISELED_CHERRY)
                .add(CHISELED_CACTUS)
                .add(CHISELED_ACACIA)
                .add(CHISELED_BLOOMING_AZALEA)
        ;

        getOrCreateTagBuilder(PAVEMENTS)
                .add(OAK_PLANK_PAVEMENT)
                .add(BIRCH_PLANK_PAVEMENT)
                .add(SPRUCE_PLANK_PAVEMENT)
                .add(DARK_OAK_PLANK_PAVEMENT)
                .add(JUNGLE_PLANK_PAVEMENT)
                .add(SPRUCE_PLANK_PAVEMENT)
                .add(CRIMSON_PLANK_PAVEMENT)
                .add(WARPED_PLANK_PAVEMENT)
                .add(MANGROVE_PLANK_PAVEMENT)
                .add(BAMBOO_PLANK_PAVEMENT)
                .add(CHERRY_PLANK_PAVEMENT)
                .add(CACTUS_PLANK_PAVEMENT)
                .add(AZALEA_PLANK_PAVEMENT)
                .add(BLOOMING_AZALEA_PLANK_PAVEMENT)
        ;

        getOrCreateTagBuilder(CHIPPABLE_LOGS)
                .add(OAK_LOG)
                .add(OAK_WOOD)
                .add(BIRCH_LOG)
                .add(BIRCH_WOOD)
                .add(SPRUCE_LOG)
                .add(SPRUCE_WOOD)
                .add(DARK_OAK_LOG)
                .add(DARK_OAK_WOOD)
                .add(JUNGLE_LOG)
                .add(JUNGLE_WOOD)
                .add(ACACIA_LOG)
                .add(ACACIA_WOOD)
                .add(CRIMSON_STEM)
                .add(CRIMSON_HYPHAE)
                .add(WARPED_STEM)
                .add(WARPED_HYPHAE)
                .add(MANGROVE_LOG)
                .add(MANGROVE_WOOD)
                .add(BAMBOO_BLOCK)
                .add(STRIPPED_BAMBOO_BLOCK)
                .add(CHERRY_LOG)
                .add(CHERRY_WOOD)
                .add(CACTUS_BUNDLE)
                .add(CACTUS_CROWN)
                .add(AZALEA_LOG)
                .add(AZALEA_WOOD)
        ;
        getOrCreateTagBuilder(FLOWERABLE)
                .add(AZALEA)
                .add(POTTED_AZALEA_BUSH)
                .add(AZALEA_LOG)
                .add(AZALEA_WOOD)
                .add(STRIPPED_AZALEA_LOG)
                .add(STRIPPED_AZALEA_WOOD)
                .add(ENGRAVED_AZALEA)
                .add(ENGRAVED_AZALEA_WOOD)
                .add(AZALEA_LEAVES)
                .add(AZALEA_PLANKS)
                .add(AZALEA_SLAB)
                .add(AZALEA_STAIRS)
                .add(CHIPPED_AZALEA_PLANKS)
                .add(CHIPPED_AZALEA_SLAB)
                .add(CHIPPED_AZALEA_STAIR)
                .add(VERTICAL_AZALEA_PLANKS)
                .add(VERTICAL_AZALEA_SLAB)
                .add(VERTICAL_AZALEA_STAIR)
                .add(AZALEA_MOSAIC)
                .add(AZALEA_MOSAIC_SLABS)
                .add(AZALEA_MOSAIC_STAIRS)
                .add(AZALEA_DOOR)
                .add(AZALEA_TRAPDOOR)
        ;

        getOrCreateTagBuilder(DEFLOWER)
                .add(FLOWERING_AZALEA)
                .add(POTTED_FLOWERING_AZALEA_BUSH)
                .add(BLOOMING_AZALEA_LOG)
                .add(BLOOMING_AZALEA_WOOD)
                .add(BLOOMING_STRIPPED_AZALEA)
                .add(BLOOMING_STRIPPED_AZALEA_WOOD)
                .add(ENGRAVED_BLOOMING_AZALEA)
                .add(ENGRAVED_BLOOMING_AZALEA_WOOD)
                .add(FLOWERING_AZALEA_LEAVES)
                .add(BLOOMING_AZALEA_PLANKS)
                .add(BLOOMING_AZALEA_SLAB)
                .add(BLOOMING_AZALEA_STAIRS)
                .add(CHIPPED_BLOOMING_AZALEA_PLANKS)
                .add(CHIPPED_BLOOMING_AZALEA_SLAB)
                .add(CHIPPED_BLOOMING_AZALEA_STAIR)
                .add(VERTICAL_BLOOMING_AZALEA_PLANKS)
                .add(VERTICAL_BLOOMING_AZALEA_SLAB)
                .add(VERTICAL_BLOOMING_AZALEA_STAIR)
                .add(BLOOMING_AZALEA_MOSAIC)
                .add(BLOOMING_AZALEA_MOSAIC_SLABS)
                .add(BLOOMING_AZALEA_MOSAIC_STAIRS)
                .add(BLOOMING_AZALEA_DOOR)
                .add(BLOOMING_AZALEA_TRAPDOOR)
                ;

        getOrCreateTagBuilder(VERTICAL_PLANKS)
                .add(VERTICAL_OAK_PLANKS)
                .add(VERTICAL_BIRCH_PLANKS)
                .add(VERTICAL_SPRUCE_PLANKS)
                .add(VERTICAL_DARK_OAK_PLANKS)
                .add(VERTICAL_JUNGLE_PLANKS)
                .add(VERTICAL_ACACIA_PLANKS)
                .add(VERTICAL_MANGROVE_PLANKS)
                .add(VERTICAL_CACTUS_PLANKS)
                .add(VERTICAL_CHERRY_PLANKS)
                .add(VERTICAL_AZALEA_PLANKS)
                .add(VERTICAL_BLOOMING_AZALEA_PLANKS);

        getOrCreateTagBuilder(LOG_SLABS)
                .add(OAK_LOG_SLABS)
                .add(STRIPPED_OAK_LOG_SLABS);

        getOrCreateTagBuilder(LOG_STAIRS)
                .add(OAK_LOG_STAIRS)
                .add(STRIPPED_OAK_LOG_STAIRS);

        getOrCreateTagBuilder(WOODEN_MOSAICS)
                .add(OAK_MOSAIC)
                .add(BIRCH_MOSAIC)
                .add(SPRUCE_MOSAIC)
                .add(DARK_OAK_MOSAIC)
                .add(JUNGLE_MOSAIC)
                .add(ACACIA_MOSAIC)
                .add(CRIMSON_MOSAIC)
                .add(WARPED_MOSAIC)
                .add(MANGROVE_MOSAIC)
                .add(BAMBOO_MOSAIC)
                .add(CHERRY_MOSAIC)
                .add(CACTUS_MOSAIC)
                .add(AZALEA_MOSAIC)
                .add(BLOOMING_AZALEA_MOSAIC);

        getOrCreateTagBuilder(WOODEN_MOSAICS_SLABS)
                .add(OAK_MOSAIC_SLABS)
                .add(BIRCH_MOSAIC_SLABS)
                .add(SPRUCE_MOSAIC_SLABS)
                .add(DARK_OAK_MOSAIC_SLABS)
                .add(JUNGLE_MOSAIC_SLABS)
                .add(ACACIA_MOSAIC_SLABS)
                .add(CRIMSON_MOSAIC_SLABS)
                .add(WARPED_MOSAIC_SLABS)
                .add(MANGROVE_MOSAIC_SLABS)
                .add(BAMBOO_MOSAIC_SLAB)
                .add(CHERRY_MOSAIC_SLABS)
                .add(CACTUS_MOSAIC_SLABS)
                .add(AZALEA_MOSAIC_SLABS)
                .add(BLOOMING_AZALEA_MOSAIC_SLABS);

        getOrCreateTagBuilder(WOODEN_MOSAICS_STAIRS)
                .add(OAK_MOSAIC_STAIRS)
                .add(BIRCH_MOSAIC_STAIRS)
                .add(SPRUCE_MOSAIC_STAIRS)
                .add(DARK_OAK_MOSAIC_STAIRS)
                .add(JUNGLE_MOSAIC_STAIRS)
                .add(ACACIA_MOSAIC_STAIRS)
                .add(CRIMSON_MOSAIC_STAIRS)
                .add(WARPED_MOSAIC_STAIRS)
                .add(MANGROVE_MOSAIC_STAIRS)
                .add(BAMBOO_MOSAIC_STAIRS)
                .add(CHERRY_MOSAIC_STAIRS)
                .add(CACTUS_MOSAIC_STAIRS)
                .add(AZALEA_MOSAIC_STAIRS)
                .add(BLOOMING_AZALEA_MOSAIC_STAIRS);

        getOrCreateTagBuilder(WOODEN_FRAMES)
                .add(OAK_FRAME)
                .add(BIRCH_FRAME)
                .add(SPRUCE_FRAME)
                .add(DARK_OAK_FRAME)
                .add(JUNGLE_FRAME)
                .add(ACACIA_FRAME)
                .add(CRIMSON_FRAME)
                .add(WARPED_FRAME)
                .add(MANGROVE_FRAME)
                .add(BAMBOO_FRAME)
                .add(CHERRY_FRAME)
                .add(CACTUS_FRAME)
                .add(AZALEA_FRAME)
                .add(BLOOMING_AZALEA_FRAME);

        getOrCreateTagBuilder(LINTELS)
                .add(OAK_LINTELS)
                .add(BIRCH_LINTELS)
                .add(SPRUCE_FRAME)
                .add(DARK_OAK_LINTELS)
                .add(JUNGLE_LINTELS)
                .add(ACACIA_LINTELS)
                .add(CRIMSON_LINTELS)
                .add(WARPED_LINTELS)
                .add(MANGROVE_LINTELS)
                .add(BAMBOO_LINTELS)
                .add(CHERRY_LINTELS)
                .add(CACTUS_LINTELS)
                .add(AZALEA_LINTELS)
                .add(BLOOMING_AZALEA_LINTELS);

        getOrCreateTagBuilder(CHIPPED_PLANKS)
                .add(CHIPPED_OAK_PLANKS)
                .add(CHIPPED_BIRCH_PLANKS)
                .add(CHIPPED_SPRUCE_PLANKS)
                .add(CHIPPED_DARK_OAK_PLANKS)
                .add(CHIPPED_JUNGLE_PLANKS)
                .add(CHIPPED_ACACIA_PLANKS)
                .add(CHIPPED_WARPED_PLANKS)
                .add(CHIPPED_CRIMSON_PLANKS)
                .add(CHIPPED_MANGROVE_PLANKS)
                .add(CHIPPED_BAMBOO_PLANKS)
                .add(CHIPPED_CHERRY_PLANKS)
                .add(CHIPPED_CACTUS_PLANKS)
                .add(CHIPPED_AZALEA_PLANKS)
                .add(CHIPPED_BLOOMING_AZALEA_PLANKS)
                .add(CHIPPED_VERTICAL_OAK_PLANKS)
                .add(CHIPPED_VERTICAL_BIRCH_PLANKS)
                .add(CHIPPED_VERTICAL_SPRUCE_PLANKS)
                .add(CHIPPED_VERTICAL_DARK_OAK_PLANKS)
                .add(CHIPPED_VERTICAL_JUNGLE_PLANKS)
                .add(CHIPPED_VERTICAL_ACACIA_PLANKS)
                .add(CHIPPED_VERTICAL_WARPED_PLANKS)
                .add(CHIPPED_VERTICAL_CRIMSON_PLANKS)
                .add(CHIPPED_VERTICAL_MANGROVE_PLANKS)
                .add(CHIPPED_VERTICAL_BAMBOO_PLANKS)
                .add(CHIPPED_VERTICAL_CHERRY_PLANKS)
                .add(CHIPPED_VERTICAL_CACTUS_PLANKS)
                .add(CHIPPED_VERTICAL_AZALEA_PLANKS)
                .add(CHIPPED_VERTICAL_BLOOMING_AZALEA_PLANKS);

        getOrCreateTagBuilder(CHIPPED_PLANKS_SLAB)
                .add(CHIPPED_AZALEA_SLAB)
                .add(CHIPPED_BLOOMING_AZALEA_SLAB)
                .add(CHIPPED_WARPED_SLAB)
                .add(CHIPPED_CRIMSON_SLAB)
                .add(CHIPPED_VERTICAL_OAK_SLAB)
                .add(CHIPPED_VERTICAL_BIRCH_SLAB)
                .add(CHIPPED_VERTICAL_SPRUCE_SLAB)
                .add(CHIPPED_VERTICAL_DARK_OAK_SLAB)
                .add(CHIPPED_VERTICAL_JUNGLE_SLAB)
                .add(CHIPPED_VERTICAL_ACACIA_SLAB)
                .add(CHIPPED_VERTICAL_WARPED_SLAB)
                .add(CHIPPED_VERTICAL_CRIMSON_SLAB)
                .add(CHIPPED_VERTICAL_MANGROVE_SLAB)
                .add(CHIPPED_VERTICAL_BAMBOO_SLAB)
                .add(CHIPPED_VERTICAL_CHERRY_SLAB)
                .add(CHIPPED_VERTICAL_CACTUS_SLAB)
                .add(CHIPPED_VERTICAL_AZALEA_SLAB)
                .add(CHIPPED_VERTICAL_BLOOMING_AZALEA_SLAB);

        getOrCreateTagBuilder(CHIPPED_PLANKS_STAIRS)
                .add(CHIPPED_AZALEA_STAIR)
                .add(CHIPPED_BLOOMING_AZALEA_STAIR)
                .add(CHIPPED_WARPED_STAIR)
                .add(CHIPPED_CRIMSON_STAIR)
                .add(CHIPPED_VERTICAL_OAK_STAIR)
                .add(CHIPPED_VERTICAL_BIRCH_STAIR)
                .add(CHIPPED_VERTICAL_SPRUCE_STAIR)
                .add(CHIPPED_VERTICAL_DARK_OAK_STAIR)
                .add(CHIPPED_VERTICAL_JUNGLE_STAIR)
                .add(CHIPPED_VERTICAL_ACACIA_STAIR)
                .add(CHIPPED_VERTICAL_WARPED_STAIR)
                .add(CHIPPED_VERTICAL_CRIMSON_STAIR)
                .add(CHIPPED_VERTICAL_MANGROVE_STAIR)
                .add(CHIPPED_VERTICAL_BAMBOO_STAIR)
                .add(CHIPPED_VERTICAL_CHERRY_STAIR)
                .add(CHIPPED_VERTICAL_CACTUS_STAIR)
                .add(CHIPPED_VERTICAL_AZALEA_STAIR)
                .add(CHIPPED_VERTICAL_BLOOMING_AZALEA_STAIR);

        getOrCreateTagBuilder(TILES)
                .add(OAK_TILES)
                .add(BIRCH_TILES)
                .add(SPRUCE_TILES)
                .add(DARK_OAK_TILES)
                .add(JUNGLE_TILES)
                .add(ACACIA_TILES)
                .add(CRIMSON_TILES)
                .add(WARPED_TILES)
                .add(MANGROVE_TILES)
                .add(BAMBOO_TILES)
                .add(CHERRY_TILES)
                .add(CACTUS_TILES)
                .add(AZALEA_TILES)
                .add(BLOOMING_AZALEA_TILES)
        ;

        getOrCreateTagBuilder(TILE_SLABS)
                .add(OAK_TILES_SLABS)
                .add(BIRCH_TILES_SLABS)
                .add(SPRUCE_TILES_SLABS)
                .add(DARK_OAK_TILES_SLABS)
                .add(JUNGLE_TILES_SLABS)
                .add(ACACIA_TILES_SLABS)
                .add(CRIMSON_TILES_SLABS)
                .add(WARPED_TILES_SLABS)
                .add(MANGROVE_TILES_SLABS)
                .add(BAMBOO_TILES_SLABS)
                .add(CHERRY_TILES_SLABS)
                .add(CACTUS_TILES_SLABS)
                .add(AZALEA_TILES_SLABS)
                .add(BLOOMING_AZALEA_TILES_SLABS)
        ;

        getOrCreateTagBuilder(TILE_STAIRS)
                .add(OAK_TILES_STAIRS)
                .add(BIRCH_TILES_STAIRS)
                .add(SPRUCE_TILES_STAIRS)
                .add(DARK_OAK_TILES_STAIRS)
                .add(JUNGLE_TILES_STAIRS)
                .add(ACACIA_TILES_STAIRS)
                .add(CRIMSON_TILES_STAIRS)
                .add(WARPED_TILES_STAIRS)
                .add(MANGROVE_TILES_STAIRS)
                .add(BAMBOO_TILES_STAIRS)
                .add(CHERRY_TILES_STAIRS)
                .add(CACTUS_TILES_STAIRS)
                .add(AZALEA_TILES_STAIRS)
                .add(BLOOMING_AZALEA_TILES_STAIRS)
        ;

        getOrCreateTagBuilder(PLANK_PILLARS)
                .add(OAK_PLANK_PILLARS)
                .add(BIRCH_PLANK_PILLARS)
                .add(SPRUCE_PLANK_PILLARS)
                .add(DARK_OAK_PLANK_PILLARS)
                .add(JUNGLE_PLANK_PILLARS)
                .add(ACACIA_PLANK_PILLARS)
                .add(CRIMSON_PLANK_PILLARS)
                .add(WARPED_PLANK_PILLARS)
                .add(MANGROVE_PLANK_PILLARS)
                .add(BAMBOO_PLANK_PILLARS)
                .add(CHERRY_PLANK_PILLARS)
                .add(CACTUS_PLANK_PILLARS)
                .add(AZALEA_PLANK_PILLARS)
                .add(BLOOMING_AZALEA_PLANK_PILLARS)
        ;

        getOrCreateTagBuilder(ENGRAVABLE_LOGS)
                .add(STRIPPED_OAK_LOG)
                .add(STRIPPED_BIRCH_LOG)
                .add(STRIPPED_SPRUCE_LOG)
                .add(STRIPPED_DARK_OAK_LOG)
                .add(STRIPPED_JUNGLE_LOG)
                .add(STRIPPED_ACACIA_LOG)
                .add(STRIPPED_CRIMSON_STEM)
                .add(STRIPPED_WARPED_STEM)
                .add(STRIPPED_MANGROVE_LOG)
                .add(STRIPPED_BAMBOO_BLOCK)
                .add(STRIPPED_CHERRY_LOG)
                .add(STRIPPED_CACTUS)
                .add(STRIPPED_AZALEA_LOG)

                .add(STRIPPED_OAK_WOOD)
                .add(STRIPPED_BIRCH_LOG)
                .add(STRIPPED_SPRUCE_WOOD)
                .add(STRIPPED_DARK_OAK_WOOD)
                .add(STRIPPED_JUNGLE_WOOD)
                .add(STRIPPED_ACACIA_WOOD)
                .add(STRIPPED_CRIMSON_HYPHAE)
                .add(STRIPPED_WARPED_HYPHAE)
                .add(STRIPPED_MANGROVE_WOOD)
                .add(STRIPPED_BAMBOO_BLOCK)
                .add(STRIPPED_CHERRY_WOOD)
                .add(STRIPPED_CACTUS)
                .add(STRIPPED_AZALEA_WOOD)
        ;

        ///Vanilla Tags
        getOrCreateTagBuilder(PLANKS)
                .add(AZALEA_PLANKS)
                .add(BLOOMING_AZALEA_PLANKS)
                .add(CACTUS_PLANKS)
                .forceAddTag(VERTICAL_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(AZALEA_SLAB)
                .add(BLOOMING_AZALEA_SLAB)
                .add(CACTUS_SLAB)
                .add(VERTICAL_OAK_SLAB)
                .add(VERTICAL_BIRCH_SLAB)
                .add(VERTICAL_SPRUCE_SLAB)
                .add(VERTICAL_DARK_OAK_SLAB)
                .add(VERTICAL_JUNGLE_SLAB)
                .add(VERTICAL_ACACIA_SLAB)
                .add(VERTICAL_CRIMSON_SLAB)
                .add(VERTICAL_WARPED_SLAB)
                .add(VERTICAL_MANGROVE_SLAB)
                .add(VERTICAL_BAMBOO_SLAB)
                .add(VERTICAL_CHERRY_SLAB)
                .add(VERTICAL_CACTUS_SLAB)
                .add(VERTICAL_AZALEA_SLAB)
                .add(VERTICAL_BLOOMING_AZALEA_SLAB)
                .add(OAK_MOSAIC_SLABS)
                .add(BIRCH_MOSAIC_SLABS)
                .add(SPRUCE_MOSAIC_SLABS)
                .add(DARK_OAK_MOSAIC_SLABS)
                .add(JUNGLE_MOSAIC_SLABS)
                .add(ACACIA_MOSAIC_SLABS)
                .add(CRIMSON_MOSAIC_SLABS)
                .add(WARPED_MOSAIC_SLABS)
                .add(MANGROVE_MOSAIC_SLABS)
                .add(CHERRY_MOSAIC_SLABS)
                .add(CACTUS_MOSAIC_SLABS)
                .add(AZALEA_MOSAIC_SLABS)
                .add(BLOOMING_AZALEA_MOSAIC_SLABS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(AZALEA_STAIRS)
                .add(BLOOMING_AZALEA_STAIRS)
                .add(CACTUS_STAIRS)
                .add(VERTICAL_OAK_STAIR)
                .add(VERTICAL_BIRCH_STAIR)
                .add(VERTICAL_SPRUCE_STAIR)
                .add(VERTICAL_DARK_OAK_STAIR)
                .add(VERTICAL_JUNGLE_STAIR)
                .add(VERTICAL_ACACIA_STAIR)
                .add(VERTICAL_CRIMSON_STAIR)
                .add(VERTICAL_WARPED_STAIR)
                .add(VERTICAL_MANGROVE_STAIR)
                .add(VERTICAL_BAMBOO_STAIR)
                .add(VERTICAL_CHERRY_STAIR)
                .add(VERTICAL_CACTUS_STAIR)
                .add(VERTICAL_AZALEA_STAIR)
                .add(VERTICAL_BLOOMING_AZALEA_STAIR)
                .add(OAK_MOSAIC_STAIRS)
                .add(BIRCH_MOSAIC_STAIRS)
                .add(SPRUCE_MOSAIC_STAIRS)
                .add(DARK_OAK_MOSAIC_STAIRS)
                .add(JUNGLE_MOSAIC_STAIRS)
                .add(ACACIA_MOSAIC_STAIRS)
                .add(CRIMSON_MOSAIC_STAIRS)
                .add(WARPED_MOSAIC_STAIRS)
                .add(MANGROVE_MOSAIC_STAIRS)
                .add(CHERRY_MOSAIC_STAIRS)
                .add(CACTUS_MOSAIC_STAIRS)
                .add(AZALEA_MOSAIC_STAIRS)
                .add(BLOOMING_AZALEA_MOSAIC_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(AZALEA_BUTTON)
                .add(CACTUS_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(AZALEA_PRESSURE_PLATE)
                .add(CACTUS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(AZALEA_DOOR)
                .add(BLOOMING_AZALEA_DOOR)
                .add(CACTUS_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(AZALEA_TRAPDOOR)
                .add(BLOOMING_AZALEA_TRAPDOOR)
                .add(CACTUS_TRAPDOOR);

        getOrCreateTagBuilder(ENCHANTMENT_POWER_PROVIDER)
                .add(BIRCH_BOOKSHELF)
                .add(SPRUCE_BOOKSHELF)
                .add(DARK_OAK_BOOKSHELF)
                .add(JUNGLE_BOOKSHELF)
                .add(ACACIA_BOOKSHELF)
                .add(CRIMSON_BOOKSHELF)
                .add(WARPED_BOOKSHELF)
                .add(MANGROVE_BOOKSHELF)
                .add(BAMBOO_BOOKSHELF)
                .add(CHERRY_BOOKSHELF)
                .add(CACTUS_BOOKSHELF)
                .add(AZALEA_BOOKSHELF)

                .add(ABANDONED_OAK_BOOKSHELF)
                .add(ABANDONED_BIRCH_BOOKSHELF)

                .add(COBWEBBED_OAK_BOOKSHELF)
                .add(COBWEBBED_BIRCH_BOOKSHELF)

                ;

        //Logs
        getOrCreateTagBuilder(BlockTags.OAK_LOGS)
                .add(ENGRAVED_OAK)
                .add(ENGRAVED_OAK_WOOD)
                .add(CHIPPED_OAK)
                .add(CHIPPED_OAK_WOOD);

        getOrCreateTagBuilder(BlockTags.BIRCH_LOGS)
                .add(ENGRAVED_BIRCH)
                .add(ENGRAVED_BIRCH_WOOD);

        getOrCreateTagBuilder(BlockTags.SPRUCE_LOGS)
                .add(ENGRAVED_SPRUCE)
                .add(ENGRAVED_SPRUCE_WOOD);

        getOrCreateTagBuilder(BlockTags.DARK_OAK_LOGS)
                .add(ENGRAVED_DARK_OAK)
                .add(ENGRAVED_DARK_OAK_WOOD);

        getOrCreateTagBuilder(BlockTags.ACACIA_LOGS)
                .add(ENGRAVED_ACACIA)
                .add(ENGRAVED_ACACIA_WOOD);

        getOrCreateTagBuilder(BlockTags.JUNGLE_LOGS)
                .add(ENGRAVED_JUNGLE)
                .add(ENGRAVED_JUNGLE_WOOD);

        getOrCreateTagBuilder(BlockTags.CRIMSON_STEMS)
                .add(ENGRAVED_CRIMSON)
                .add(ENGRAVED_CRIMSON_HYPHAE);

        getOrCreateTagBuilder(BlockTags.WARPED_STEMS)
                .add(ENGRAVED_WARPED)
                .add(ENGRAVED_WARPED_HYPHAE);

        getOrCreateTagBuilder(BlockTags.MANGROVE_LOGS)
                .add(ENGRAVED_MANGROVE)
                .add(ENGRAVED_MANGROVE_WOOD);

        getOrCreateTagBuilder(BlockTags.CHERRY_LOGS)
                .add(ENGRAVED_CHERRY)
                .add(ENGRAVED_CHERRY_WOOD);

        getOrCreateTagBuilder(CACTUS_LOGS)
                .add(CACTUS_BUNDLE)
                .add(CACTUS_CROWN)
                .add(STRIPPED_CACTUS)
                .add(STRIPPED_CACTUS_CROWN)
                .add(ENGRAVED_CACTUS)
                .add(ENGRAVED_CACTUS_CROWN);

        getOrCreateTagBuilder(AZALEA_LOGS)
                .add(BLOOMING_AZALEA_LOG)
                .add(BLOOMING_AZALEA_WOOD)
                .add(AZALEA_LOG)
                .add(AZALEA_WOOD)
                .add(BLOOMING_STRIPPED_AZALEA)
                .add(BLOOMING_STRIPPED_AZALEA_WOOD)
                .add(STRIPPED_AZALEA_LOG)
                .add(STRIPPED_AZALEA_WOOD)
                .add(ENGRAVED_BLOOMING_AZALEA)
                .add(ENGRAVED_BLOOMING_AZALEA_WOOD)
                .add(ENGRAVED_AZALEA)
                .add(ENGRAVED_AZALEA_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .forceAddTag(BlockTags.LOGS_THAT_BURN)
                .forceAddTag(CACTUS_LOGS)
                .forceAddTag(BlockTags.CRIMSON_STEMS)
                .forceAddTag(BlockTags.WARPED_STEMS);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .forceAddTag(BlockTags.OAK_LOGS)
                .forceAddTag(BlockTags.BIRCH_LOGS)
                .forceAddTag(BlockTags.SPRUCE_LOGS)
                .forceAddTag(BlockTags.DARK_OAK_LOGS)
                .forceAddTag(BlockTags.JUNGLE_LOGS)
                .forceAddTag(BlockTags.ACACIA_LOGS)
                .forceAddTag(BlockTags.MANGROVE_LOGS)
                .forceAddTag(BlockTags.CHERRY_LOGS)
                .forceAddTag(AZALEA_LOGS);

        getOrCreateTagBuilder(WOODEN_FENCES)
                .add(AZALEA_FENCE)
                .add(CACTUS_FENCE);

        getOrCreateTagBuilder(FENCES)
                .add(AZALEA_FENCE)
                .add(CACTUS_FENCE);

        getOrCreateTagBuilder(FENCE_GATES)
                .add(AZALEA_FENCE_GATE)
                .add(CACTUS_FENCE_GATE);


        ///Mining tags
        getOrCreateTagBuilder(AXE_MINEABLE)

                //Logs
                .forceAddTag(LOGS)

                //Planks
                .forceAddTag(PLANKS)
                .forceAddTag(WOODEN_SLABS)
                .forceAddTag(WOODEN_STAIRS)

                //Mosaic
                .forceAddTag(WOODEN_MOSAICS)

                //Sawmill
                .add(SAWMILL)

                //Frame and Lintels blocks
                .forceAddTag(WOODEN_FRAMES)
                .forceAddTag(LINTELS)

                //New stuff
                .forceAddTag(PAVEMENTS)
                .forceAddTag(BOOKSHELVES)

                //Fence and Fence Gates
                .forceAddTag(FENCES)
                .forceAddTag(FENCE_GATES)

                //Buttons
                .forceAddTag(BUTTONS)

                //Pressure Plate
                .forceAddTag(PRESSURE_PLATES)

                //Doors and Trapdoors
                .forceAddTag(DOORS)
                .forceAddTag(TRAPDOORS)
                ;

        getOrCreateTagBuilder(SHOVEL_MINEABLE)
                .forceAddTag(SAWDUST_LAYERS)
        ;
    }
}
