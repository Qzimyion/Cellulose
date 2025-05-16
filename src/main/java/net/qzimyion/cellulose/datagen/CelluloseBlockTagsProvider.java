package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

import java.util.concurrent.CompletableFuture;
import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.tags.BlockTags.*;
import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.util.CelluloseTags.Blocks.*;

public class CelluloseBlockTagsProvider extends FabricTagProvider.BlockTagProvider
{

    public CelluloseBlockTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg)
    {

        //==Modded Tags==//
        getOrCreateTagBuilder(TIMERS)
                .add(OAK_TIMBERS)
                .add(BIRCH_TIMBERS)
                .add(SPRUCE_TIMBERS)
                .add(DARK_OAK_TIMBERS)
                .add(JUNGLE_TIMBERS)
                .add(ACACIA_TIMBERS)
                .add(CRIMSON_TIMBERS)
                .add(WARPED_TIMBERS)
                .add(MANGROVE_TIMBERS)
                .add(BAMBOO_TIMBERS)
                .add(CHERRY_TIMBERS)
                .add(CACTUS_TIMBERS)
                .add(AZALEA_TIMBERS)
        ;

        getOrCreateTagBuilder(SHOJIS)
                .add(OAK_SHOJI)
                .add(BIRCH_SHOJI)
                .add(SPRUCE_SHOJI)
                .add(DARK_OAK_SHOJI)
                .add(JUNGLE_SHOJI)
                .add(ACACIA_SHOJI)
                .add(CRIMSON_SHOJI)
                .add(WARPED_SHOJI)
                .add(MANGROVE_SHOJI)
                .add(BAMBOO_SHOJI)
                .add(CHERRY_SHOJI)
                .add(CACTUS_SHOJI)
                .add(AZALEA_SHOJI)
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

        getOrCreateTagBuilder(CHISELED_BOOKSHELVES)
                .add(CHISELED_BOOKSHELF)
                .add(BIRCH_CHISELED_BOOKSHELF)
                .add(SPRUCE_CHISELED_BOOKSHELF)
                .add(DARK_OAK_CHISELED_BOOKSHELF)
                .add(JUNGLE_CHISELED_BOOKSHELF)
                .add(ACACIA_CHISELED_BOOKSHELF)
                .add(CRIMSON_CHISELED_BOOKSHELF)
                .add(WARPED_CHISELED_BOOKSHELF)
                .add(MANGROVE_CHISELED_BOOKSHELF)
                .add(BAMBOO_CHISELED_BOOKSHELF)
                .add(CHERRY_CHISELED_BOOKSHELF)
                .add(CACTUS_CHISELED_BOOKSHELF)
                .add(AZALEA_CHISELED_BOOKSHELF)
        ;

        getOrCreateTagBuilder(EMPTY_BOOKSHELVES)
                .add(EMPTY_OAK_BOOKSHELF)
                .add(EMPTY_BIRCH_BOOKSHELF)
                .add(EMPTY_SPRUCE_BOOKSHELF)
                .add(EMPTY_DARK_OAK_BOOKSHELF)
                .add(EMPTY_JUNGLE_BOOKSHELF)
                .add(EMPTY_ACACIA_BOOKSHELF)
                .add(EMPTY_CRIMSON_BOOKSHELF)
                .add(EMPTY_WARPED_BOOKSHELF)
                .add(EMPTY_MANGROVE_BOOKSHELF)
                .add(EMPTY_BAMBOO_BOOKSHELF)
                .add(EMPTY_CHERRY_BOOKSHELF)
                .add(EMPTY_CACTUS_BOOKSHELF)
                .add(EMPTY_AZALEA_BOOKSHELF)
        ;

        getOrCreateTagBuilder(COBWEBBED_BOOKSHELVES)
                .add(COBWEBBED_OAK_BOOKSHELF)
                .add(COBWEBBED_BIRCH_BOOKSHELF)
                .add(COBWEBBED_SPRUCE_BOOKSHELF)
                .add(COBWEBBED_DARK_OAK_BOOKSHELF)
                .add(COBWEBBED_JUNGLE_BOOKSHELF)
                .add(COBWEBBED_ACACIA_BOOKSHELF)
                .add(COBWEBBED_CRIMSON_BOOKSHELF)
                .add(COBWEBBED_WARPED_BOOKSHELF)
                .add(COBWEBBED_MANGROVE_BOOKSHELF)
                .add(COBWEBBED_BAMBOO_BOOKSHELF)
                .add(COBWEBBED_CHERRY_BOOKSHELF)
                .add(COBWEBBED_CACTUS_BOOKSHELF)
                .add(COBWEBBED_AZALEA_BOOKSHELF)
        ;

        getOrCreateTagBuilder(COBWEBBED_EMPTY_BOOKSHELVES)
                .add(COBWEBBED_EMPTY_OAK_BOOKSHELF)
                .add(COBWEBBED_EMPTY_BIRCH_BOOKSHELF)
                .add(COBWEBBED_EMPTY_SPRUCE_BOOKSHELF)
                .add(COBWEBBED_EMPTY_DARK_OAK_BOOKSHELF)
                .add(COBWEBBED_EMPTY_JUNGLE_BOOKSHELF)
                .add(COBWEBBED_EMPTY_ACACIA_BOOKSHELF)
                .add(COBWEBBED_EMPTY_CRIMSON_BOOKSHELF)
                .add(COBWEBBED_EMPTY_WARPED_BOOKSHELF)
                .add(COBWEBBED_EMPTY_MANGROVE_BOOKSHELF)
                .add(COBWEBBED_EMPTY_BAMBOO_BOOKSHELF)
                .add(COBWEBBED_EMPTY_CHERRY_BOOKSHELF)
                .add(COBWEBBED_EMPTY_CACTUS_BOOKSHELF)
                .add(COBWEBBED_EMPTY_AZALEA_BOOKSHELF)
        ;

        getOrCreateTagBuilder(ABANDONED_BOOKSHELVES)
                .add(ABANDONED_OAK_BOOKSHELF)
                .add(ABANDONED_BIRCH_BOOKSHELF)
                .add(ABANDONED_SPRUCE_BOOKSHELF)
                .add(ABANDONED_DARK_OAK_BOOKSHELF)
                .add(ABANDONED_JUNGLE_BOOKSHELF)
                .add(ABANDONED_ACACIA_BOOKSHELF)
                .add(ABANDONED_CRIMSON_BOOKSHELF)
                .add(ABANDONED_WARPED_BOOKSHELF)
                .add(ABANDONED_MANGROVE_BOOKSHELF)
                .add(ABANDONED_BAMBOO_BOOKSHELF)
                .add(ABANDONED_CHERRY_BOOKSHELF)
                .add(ABANDONED_CACTUS_BOOKSHELF)
                .add(ABANDONED_AZALEA_BOOKSHELF)
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
        ;

        getOrCreateTagBuilder(GLAZED_WOOD)
                .add(OAK_GLAZED)
                .add(BIRCH_GLAZED)
                .add(SPRUCE_GLAZED)
                .add(DARK_OAK_GLAZED)
                .add(JUNGLE_GLAZED)
                .add(SPRUCE_GLAZED)
                .add(CRIMSON_GLAZED)
                .add(WARPED_GLAZED)
                .add(MANGROVE_GLAZED)
                .add(BAMBOO_GLAZED)
                .add(CHERRY_GLAZED)
                .add(CACTUS_GLAZED)
                .add(AZALEA_GLAZED)
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

                //Stripped log
                .add(STRIPPED_OAK_LOG)
                .add(STRIPPED_BIRCH_LOG)
                .add(STRIPPED_SPRUCE_LOG)
                .add(STRIPPED_DARK_OAK_LOG)
                .add(STRIPPED_JUNGLE_LOG)
                .add(STRIPPED_ACACIA_LOG)
                .add(STRIPPED_CRIMSON_STEM)
                .add(STRIPPED_WARPED_STEM)
                .add(STRIPPED_MANGROVE_LOG)
                .add(STRIPPED_CHERRY_LOG)
                .add(STRIPPED_CACTUS)
                .add(STRIPPED_AZALEA_LOG)
                .add(STRIPPED_OAK_WOOD)
                .add(STRIPPED_BIRCH_WOOD)
                .add(STRIPPED_SPRUCE_WOOD)
                .add(STRIPPED_DARK_OAK_WOOD)
                .add(STRIPPED_JUNGLE_WOOD)
                .add(STRIPPED_ACACIA_WOOD)
                .add(STRIPPED_CRIMSON_STEM)
                .add(STRIPPED_WARPED_STEM)
                .add(STRIPPED_MANGROVE_WOOD)
                .add(STRIPPED_CHERRY_WOOD)
                .add(STRIPPED_CACTUS)
                .add(STRIPPED_AZALEA_WOOD)
        ;

        getOrCreateTagBuilder(FLOWERABLE)
                .add(AZALEA)
                .add(POTTED_AZALEA)
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
                .add(CHIPPED_AZALEA_STAIRS)
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
                .add(POTTED_FLOWERING_AZALEA)
                .add(FLOWERING_AZALEA_LEAVES)
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
                .add(VERTICAL_PINE_PLANKS);

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
        ;

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
        ;

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
        ;

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
                ;

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
                ;

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
                ;

        getOrCreateTagBuilder(CHIPPED_PLANKS_SLAB)
                .add(CHIPPED_AZALEA_SLAB)
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
                ;

        getOrCreateTagBuilder(CHIPPED_PLANKS_STAIRS)
                .add(CHIPPED_AZALEA_STAIRS)
                .add(CHIPPED_WARPED_STAIRS)
                .add(CHIPPED_CRIMSON_STAIRS)
                .add(CHIPPED_VERTICAL_OAK_STAIRS)
                .add(CHIPPED_VERTICAL_BIRCH_STAIRS)
                .add(CHIPPED_VERTICAL_SPRUCE_STAIRS)
                .add(CHIPPED_VERTICAL_DARK_OAK_STAIRS)
                .add(CHIPPED_VERTICAL_JUNGLE_STAIRS)
                .add(CHIPPED_VERTICAL_ACACIA_STAIRS)
                .add(CHIPPED_VERTICAL_WARPED_STAIRS)
                .add(CHIPPED_VERTICAL_CRIMSON_STAIRS)
                .add(CHIPPED_VERTICAL_MANGROVE_STAIRS)
                .add(CHIPPED_VERTICAL_BAMBOO_STAIRS)
                .add(CHIPPED_VERTICAL_CHERRY_STAIRS)
                .add(CHIPPED_VERTICAL_CACTUS_STAIRS)
                .add(CHIPPED_VERTICAL_AZALEA_STAIRS)
        ;

        getOrCreateTagBuilder(TILES)
                .add(OAK_BOARDS)
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

        getOrCreateTagBuilder(HOLLOW_LOGS)
                .add(HOLLOW_OAK_LOG)
                .add(HOLLOW_BIRCH_LOG)
                .add(HOLLOW_SPRUCE_LOG)
                .add(HOLLOW_DARK_OAK_LOG)
                .add(HOLLOW_JUNGLE_LOG)
                .add(HOLLOW_ACACIA_LOG)
                .add(HOLLOW_CRIMSON_LOG)
                .add(HOLLOW_WARPED_LOG)
                .add(HOLLOW_MANGROVE_LOG)
                .add(HOLLOW_CHERRY_LOG)
                .add(HOLLOW_AZALEA_LOG)
        ;

        //==Vanilla Tags==//
        getOrCreateTagBuilder(LEAVES)
                .add(CelluloseBlocks.PINE_LEAVES)
        ;

        getOrCreateTagBuilder(PLANKS)
                .add(AZALEA_PLANKS)
                .add(CACTUS_PLANKS)
                .add(PINE_PLANKS)
                .forceAddTag(VERTICAL_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(AZALEA_SLAB)
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
                .add(VERTICAL_PINE_SLAB)

                //Mosaic
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

                //Tiles
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
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(AZALEA_STAIRS)
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
                .add(VERTICAL_PINE_STAIR)

                //Mosaic
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

                //Tiles
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
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(AZALEA_BUTTON)
                .add(CACTUS_BUTTON)
                .add(PINE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(AZALEA_PRESSURE_PLATE)
                .add(CACTUS_PRESSURE_PLATE)
                .add(PINE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(AZALEA_DOOR)
                .add(CACTUS_DOOR)
                .add(PINE_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(AZALEA_TRAPDOOR)
                .add(CACTUS_TRAPDOOR)
                .add(PINE_TRAPDOOR);

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
                .add(SPRUCE_TRUNK)
                .add(ENGRAVED_SPRUCE)
                .add(ENGRAVED_SPRUCE_WOOD);

        getOrCreateTagBuilder(BlockTags.DARK_OAK_LOGS)
                .add(DARK_OAK_TRUNK)
                .add(ENGRAVED_DARK_OAK)
                .add(ENGRAVED_DARK_OAK_WOOD);

        getOrCreateTagBuilder(BlockTags.ACACIA_LOGS)
                .add(ENGRAVED_ACACIA)
                .add(ENGRAVED_ACACIA_WOOD);

        getOrCreateTagBuilder(BlockTags.JUNGLE_LOGS)
                .add(JUNGLE_TRUNK)
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
                .add(STRIPPED_CACTUS_BUNDLE)
                .add(ENGRAVED_CACTUS)
                .add(ENGRAVED_CACTUS_CROWN);

        getOrCreateTagBuilder(AZALEA_LOGS)
                .add(AZALEA_LOG)
                .add(AZALEA_WOOD)
                .add(STRIPPED_AZALEA_LOG)
                .add(STRIPPED_AZALEA_WOOD)
                .add(ENGRAVED_AZALEA)
                .add(ENGRAVED_AZALEA_WOOD);

        getOrCreateTagBuilder(CEDAR_LOGS)
                .add(PINE_LOG)
                .add(PINE_WOOD)
                .add(STRIPPED_PINE_LOG)
                .add(STRIPPED_PINE_WOOD);

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
                .forceAddTag(AZALEA_LOGS)
                .forceAddTag(CEDAR_LOGS)
        ;

        getOrCreateTagBuilder(WOODEN_FENCES)
                .add(AZALEA_FENCE)
                .add(CACTUS_FENCE)
                .add(PINE_FENCE);

        getOrCreateTagBuilder(FENCES)
                .add(AZALEA_FENCE)
                .add(CACTUS_FENCE)
                .add(PINE_FENCE);

        getOrCreateTagBuilder(FENCE_GATES)
                .add(AZALEA_FENCE_GATE)
                .add(CACTUS_FENCE_GATE)
                .add(PINE_FENCE_GATE);

        //Mining tags
        getOrCreateTagBuilder(MINEABLE_WITH_AXE)
                .add(POTION_RACK)
                //Logs
                .forceAddTag(LOGS)
                //Planks
                .forceAddTag(PLANKS)
                .forceAddTag(WOODEN_SLABS)
                .forceAddTag(WOODEN_STAIRS)
                //Sawmill
                .add(SAWMILL)
                //New stuff
                .forceAddTag(WOODEN_MOSAICS)
                .forceAddTag(WOODEN_MOSAICS_SLABS)
                .forceAddTag(WOODEN_MOSAICS_STAIRS)
                .forceAddTag(PAVEMENTS)
                .forceAddTag(WOODEN_FRAMES)
                .forceAddTag(LINTELS)
                .forceAddTag(BOOKSHELVES)
                .forceAddTag(EMPTY_BOOKSHELVES)
                .forceAddTag(COBWEBBED_BOOKSHELVES)
                .forceAddTag(ABANDONED_BOOKSHELVES)
                .forceAddTag(COBWEBBED_EMPTY_BOOKSHELVES)
                .forceAddTag(CHISELED_BOOKSHELVES)
                .forceAddTag(TILES)
                .forceAddTag(TIMERS)
                .forceAddTag(CHIPPED_PLANKS)
                .forceAddTag(CHIPPED_PLANKS_SLAB)
                .forceAddTag(CHIPPED_PLANKS_STAIRS)
                .forceAddTag(CHISELED_PLANKS)
                .forceAddTag(PLANK_PILLARS)
                .forceAddTag(SHOJIS)
                .forceAddTag(GLAZED_WOOD)

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

        getOrCreateTagBuilder(MINEABLE_WITH_HOE)
                .add(CelluloseBlocks.PINE_LEAVES);

        getOrCreateTagBuilder(CLIMBABLE)
                .forceAddTag(HOLLOW_LOGS);
    }
}
