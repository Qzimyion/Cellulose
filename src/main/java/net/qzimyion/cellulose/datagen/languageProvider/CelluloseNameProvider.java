package net.qzimyion.cellulose.datagen.languageProvider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.world.level.block.Blocks;
import net.qzimyion.cellulose.blocks.customBlocks.SawmillBlock;
import net.qzimyion.cellulose.boats.CelluloseBoats;
import net.qzimyion.cellulose.util.CelluloseStats;

import static net.qzimyion.cellulose.blocks.CelluloseBlocks.*;
import static net.qzimyion.cellulose.items.CelluloseItems.*;

public class CelluloseNameProvider extends FabricLanguageProvider
{

    public CelluloseNameProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");

    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //For Vertical Planks
        translationBuilder.add(VERTICAL_OAK_PLANKS, "Vertical Oak Planks");
        translationBuilder.add(VERTICAL_BIRCH_PLANKS, "Vertical Birch Planks");
        translationBuilder.add(VERTICAL_SPRUCE_PLANKS, "Vertical Spruce Planks");
        translationBuilder.add(VERTICAL_DARK_OAK_PLANKS, "Vertical Dark Oak Planks");
        translationBuilder.add(VERTICAL_JUNGLE_PLANKS, "Vertical Jungle Planks");
        translationBuilder.add(VERTICAL_ACACIA_PLANKS, "Vertical Acacia Planks");
        translationBuilder.add(VERTICAL_CRIMSON_PLANKS, "Vertical Crimson Planks");
        translationBuilder.add(VERTICAL_WARPED_PLANKS, "Vertical Warped Planks");
        translationBuilder.add(VERTICAL_MANGROVE_PLANKS, "Vertical Mangrove Planks");
        translationBuilder.add(VERTICAL_BAMBOO_PLANKS, "Vertical Bamboo Planks");
        translationBuilder.add(VERTICAL_CHERRY_PLANKS, "Vertical Cherry Planks");
        //For Vertical Plank Slabs
        translationBuilder.add(VERTICAL_OAK_SLAB, "Vertical Oak Slab");
        translationBuilder.add(VERTICAL_BIRCH_SLAB, "Vertical Birch Slab");
        translationBuilder.add(VERTICAL_SPRUCE_SLAB, "Vertical Spruce Slab");
        translationBuilder.add(VERTICAL_DARK_OAK_SLAB, "Vertical Dark Oak Slab");
        translationBuilder.add(VERTICAL_JUNGLE_SLAB, "Vertical Jungle Slab");
        translationBuilder.add(VERTICAL_ACACIA_SLAB, "Vertical Acacia Slab");
        translationBuilder.add(VERTICAL_CRIMSON_SLAB, "Vertical Crimson Slab");
        translationBuilder.add(VERTICAL_WARPED_SLAB, "Vertical Warped Slab");
        translationBuilder.add(VERTICAL_MANGROVE_SLAB, "Vertical Mangrove Slab");
        translationBuilder.add(VERTICAL_BAMBOO_SLAB, "Vertical Bamboo Slab");
        translationBuilder.add(VERTICAL_CHERRY_SLAB, "Vertical Cherry Slab");
        //For Vertical Plank Stairs
        translationBuilder.add(VERTICAL_OAK_STAIR, "Vertical Oak Stairs");
        translationBuilder.add(VERTICAL_BIRCH_STAIR, "Vertical Birch Stairs");
        translationBuilder.add(VERTICAL_SPRUCE_STAIR, "Vertical Spruce Stairs");
        translationBuilder.add(VERTICAL_DARK_OAK_STAIR, "Vertical Dark Oak Stairs");
        translationBuilder.add(VERTICAL_JUNGLE_STAIR, "Vertical Jungle Stairs");
        translationBuilder.add(VERTICAL_ACACIA_STAIR, "Vertical Acacia Stairs");
        translationBuilder.add(VERTICAL_CRIMSON_STAIR, "Vertical Crimson Stairs");
        translationBuilder.add(VERTICAL_WARPED_STAIR, "Vertical Warped Stairs");
        translationBuilder.add(VERTICAL_MANGROVE_STAIR, "Vertical Mangrove Stairs");
        translationBuilder.add(VERTICAL_BAMBOO_STAIR, "Vertical Bamboo Stairs");
        translationBuilder.add(VERTICAL_CHERRY_STAIR, "Vertical Cherry Stairs");
        //For mosaic blocks
        translationBuilder.add(OAK_MOSAIC, "Oak Mosaic");
        translationBuilder.add(BIRCH_MOSAIC, "Birch Mosaic");
        translationBuilder.add(SPRUCE_MOSAIC, "Spruce Mosaic");
        translationBuilder.add(DARK_OAK_MOSAIC, "Dark Oak Mosaic");
        translationBuilder.add(JUNGLE_MOSAIC, "Jungle Mosaic");
        translationBuilder.add(ACACIA_MOSAIC, "Acacia Mosaic");
        translationBuilder.add(CRIMSON_MOSAIC, "Crimson Mosaic");
        translationBuilder.add(WARPED_MOSAIC, "Warped Mosaic");
        translationBuilder.add(MANGROVE_MOSAIC, "Mangrove Mosaic");
        translationBuilder.add(CHERRY_MOSAIC, "Cherry Mosaic");
        //For mosaic stairs
        translationBuilder.add(OAK_MOSAIC_STAIRS, "Oak Mosaic Stairs");
        translationBuilder.add(BIRCH_MOSAIC_STAIRS, "Birch Mosaic Stairs");
        translationBuilder.add(SPRUCE_MOSAIC_STAIRS, "Spruce Mosaic Stairs");
        translationBuilder.add(DARK_OAK_MOSAIC_STAIRS, "Dark Oak Mosaic Stairs");
        translationBuilder.add(JUNGLE_MOSAIC_STAIRS, "Jungle Mosaic Stairs");
        translationBuilder.add(ACACIA_MOSAIC_STAIRS, "Acacia Mosaic Stairs");
        translationBuilder.add(CRIMSON_MOSAIC_STAIRS, "Crimson Mosaic Stairs");
        translationBuilder.add(WARPED_MOSAIC_STAIRS, "Warped Mosaic Stairs");
        translationBuilder.add(MANGROVE_MOSAIC_STAIRS, "Mangrove Mosaic Stairs");
        translationBuilder.add(CHERRY_MOSAIC_STAIRS, "Cherry Mosaic Stairs");
        //For mosaic slabs
        translationBuilder.add(OAK_MOSAIC_SLABS, "Oak Mosaic Slab");
        translationBuilder.add(BIRCH_MOSAIC_SLABS, "Birch Mosaic Slab");
        translationBuilder.add(SPRUCE_MOSAIC_SLABS, "Spruce Mosaic Slab");
        translationBuilder.add(DARK_OAK_MOSAIC_SLABS, "Dark Oak Mosaic Slab");
        translationBuilder.add(JUNGLE_MOSAIC_SLABS, "Jungle Mosaic Slab");
        translationBuilder.add(ACACIA_MOSAIC_SLABS, "Acacia Mosaic Slab");
        translationBuilder.add(CRIMSON_MOSAIC_SLABS, "Crimson Mosaic Slab");
        translationBuilder.add(WARPED_MOSAIC_SLABS, "Warped Mosaic Slab");
        translationBuilder.add(MANGROVE_MOSAIC_SLABS, "Mangrove Mosaic Slab");
        translationBuilder.add(CHERRY_MOSAIC_SLABS, "Cherry Mosaic Slab");
        //For Frames
        translationBuilder.add(OAK_FRAME, "Oak Frame");
        translationBuilder.add(BIRCH_FRAME, "Birch Frame");
        translationBuilder.add(SPRUCE_FRAME, "Spruce Frame");
        translationBuilder.add(DARK_OAK_FRAME, "Dark Oak Frame");
        translationBuilder.add(JUNGLE_FRAME, "Jungle Frame");
        translationBuilder.add(ACACIA_FRAME, "Acacia Frame");
        translationBuilder.add(CRIMSON_FRAME, "Crimson Frame");
        translationBuilder.add(WARPED_FRAME, "Warped Frame");
        translationBuilder.add(BAMBOO_FRAME, "Bamboo Frame");
        translationBuilder.add(MANGROVE_FRAME, "Mangrove Frame");
        translationBuilder.add(CHERRY_FRAME, "Cherry Frame");
        //For Lintels
        translationBuilder.add(OAK_LINTELS, "Oak Lintels");
        translationBuilder.add(BIRCH_LINTELS, "Birch Lintels");
        translationBuilder.add(SPRUCE_LINTELS, "Spruce Lintels");
        translationBuilder.add(DARK_OAK_LINTELS, "Dark Oak Lintels");
        translationBuilder.add(JUNGLE_LINTELS, "Jungle Lintels");
        translationBuilder.add(ACACIA_LINTELS, "Acacia Lintels");
        translationBuilder.add(CRIMSON_LINTELS, "Crimson Lintels");
        translationBuilder.add(WARPED_LINTELS, "Warped Lintels");
        translationBuilder.add(BAMBOO_LINTELS, "Bamboo Lintels");
        translationBuilder.add(MANGROVE_LINTELS, "Mangrove Lintels");
        translationBuilder.add(CHERRY_LINTELS, "Cherry Lintels");
        //Sawmill
        translationBuilder.add(SAWMILL, "Sawmill");
        //Engraved logs and wood
        translationBuilder.add(ENGRAVED_OAK, "Engraved Oak Log");
        translationBuilder.add(ENGRAVED_BIRCH, "Engraved Birch Log");
        translationBuilder.add(ENGRAVED_SPRUCE, "Engraved Spruce Log");
        translationBuilder.add(ENGRAVED_JUNGLE, "Engraved Jungle Log");
        translationBuilder.add(ENGRAVED_ACACIA, "Engraved Acacia Log");
        translationBuilder.add(ENGRAVED_DARK_OAK, "Engraved Dark Oak Log");
        translationBuilder.add(ENGRAVED_CRIMSON, "Engraved Crimson Stem");
        translationBuilder.add(ENGRAVED_WARPED, "Engraved Warped Stem");
        translationBuilder.add(ENGRAVED_MANGROVE, "Engraved Mangrove Log");
        translationBuilder.add(ENGRAVED_CHERRY, "Engraved Cherry Log");
        translationBuilder.add(ENGRAVED_OAK_WOOD, "Engraved Oak Wood");
        translationBuilder.add(ENGRAVED_BIRCH_WOOD, "Engraved Birch Wood");
        translationBuilder.add(ENGRAVED_SPRUCE_WOOD, "Engraved Spruce Wood");
        translationBuilder.add(ENGRAVED_JUNGLE_WOOD, "Engraved Jungle Wood");
        translationBuilder.add(ENGRAVED_ACACIA_WOOD, "Engraved Acacia Wood");
        translationBuilder.add(ENGRAVED_DARK_OAK_WOOD, "Engraved Dark Oak Wood");
        translationBuilder.add(ENGRAVED_CRIMSON_HYPHAE, "Engraved Crimson Hyphae");
        translationBuilder.add(ENGRAVED_WARPED_HYPHAE, "Engraved Warped Hyphae");
        translationBuilder.add(ENGRAVED_MANGROVE_WOOD, "Engraved Mangrove Wood");
        translationBuilder.add(ENGRAVED_CHERRY_WOOD, "Engraved Cherry Wood");


        ///Cactus Woodset
        translationBuilder.add(CACTUS_BUNDLE, "Cactus Bundle");
        translationBuilder.add(CACTUS_PLANKS, "Cactus Planks");
        translationBuilder.add(CACTUS_STAIRS, "Cactus Stairs");
        translationBuilder.add(CACTUS_SLAB, "Cactus Slab");
        translationBuilder.add(CACTUS_CROWN, "Cactus Crown");
        translationBuilder.add(STRIPPED_CACTUS, "Stripped Cactus");
        translationBuilder.add(STRIPPED_CACTUS_BUNDLE, "Stripped Cactus Bundle");
        translationBuilder.add(CACTUS_FENCE, "Cactus Fence");
        translationBuilder.add(CACTUS_FENCE_GATE, "Cactus Fence gate");
        translationBuilder.add(CACTUS_BUTTON, "Cactus Button");
        translationBuilder.add(CACTUS_PRESSURE_PLATE, "Cactus Pressure Plate");
        translationBuilder.add(CACTUS_DOOR, "Cactus Door");
        translationBuilder.add(CACTUS_TRAPDOOR, "Cactus Trapdoor");
        translationBuilder.add(VERTICAL_CACTUS_PLANKS, "Vertical Cactus Planks");
        translationBuilder.add(VERTICAL_CACTUS_STAIR, "Vertical Cactus Stairs");
        translationBuilder.add(VERTICAL_CACTUS_SLAB, "Vertical Cactus Stairs");
        translationBuilder.add(ENGRAVED_CACTUS, "Engraved Cactus");
        translationBuilder.add(ENGRAVED_CACTUS_CROWN, "Engraved Cactus Crown");
        translationBuilder.add(CACTUS_MOSAIC, "Cactus Mosaic");
        translationBuilder.add(CACTUS_MOSAIC_STAIRS, "Cactus Mosaic Stairs");
        translationBuilder.add(CACTUS_MOSAIC_SLABS, "Cactus Mosaic Slab");
        translationBuilder.add(CHIPPED_CACTUS_PLANKS, "Chipped Cactus Planks");
        translationBuilder.add(CHIPPED_CACTUS_SLAB, "Chipped Cactus Slab");
        translationBuilder.add(CHIPPED_CACTUS_STAIRS, "Chipped Cactus Stairs");
        translationBuilder.add(CACTUS_PLANK_PAVEMENT, "Cactus Pavement");
        translationBuilder.add(CHISELED_CACTUS, "Carved cactus");
        translationBuilder.add(CACTUS_GLAZED, "Glazed Cactus");
        translationBuilder.add(GLAZED_CACTUS_STAIRS, "Glazed Cactus Stairs");
        translationBuilder.add(CACTUS_TILES, "Cactus Tiles");
        translationBuilder.add(CACTUS_TILES_STAIRS, "Cactus Tiles Stairs");
        translationBuilder.add(CACTUS_TILES_SLABS, "Cactus Tiles Slab");
        translationBuilder.add(CACTUS_TIMBERS, "Cactus Timbers");
        translationBuilder.add(CACTUS_TIMBERS_STAIRS, "Cactus Timbers Stairs");
        translationBuilder.add(CACTUS_TIMBERS_SLABS, "Cactus Timbers Slab");
        translationBuilder.add(CACTUS_LOG_MOSAIC, "Cactus Beam");
        translationBuilder.add(CACTUS_PLANK_PILLARS, "Cactus Plank Pillar");
        translationBuilder.add(CACTUS_FRAME, "Cactus Frame");
        translationBuilder.add(CACTUS_LINTELS, "Cactus Lintels");
        translationBuilder.add(CelluloseBoats.CACTUS_BOAT_ID, "Cactus Boat");
        translationBuilder.add(CelluloseBoats.CACTUS_CHEST_BOAT_ID, "Cactus Chest Boat");
        ///Azalea woodset
        translationBuilder.add(AZALEA_LOG, "Azalea Log");
        translationBuilder.add(AZALEA_PLANKS, "Azalea Planks");
        translationBuilder.add(AZALEA_STAIRS, "Azalea Stairs");
        translationBuilder.add(AZALEA_SLAB, "Azalea Slab");
        translationBuilder.add(AZALEA_WOOD, "Azalea Wood");
        translationBuilder.add(STRIPPED_AZALEA_LOG, "Stripped Azalea Log");
        translationBuilder.add(STRIPPED_AZALEA_WOOD, "Stripped Azalea Wood");
        translationBuilder.add(AZALEA_FENCE, "Azalea Fence");
        translationBuilder.add(AZALEA_FENCE_GATE, "Azalea Fence gate");
        translationBuilder.add(AZALEA_BUTTON, "Azalea Button");
        translationBuilder.add(AZALEA_PRESSURE_PLATE, "Azalea Pressure Plate");
        translationBuilder.add(AZALEA_DOOR, "Azalea Door");
        translationBuilder.add(AZALEA_TRAPDOOR, "Azalea Trapdoor");
        translationBuilder.add(VERTICAL_AZALEA_PLANKS, "Vertical Azalea Planks");
        translationBuilder.add(VERTICAL_AZALEA_STAIR, "Vertical Azalea Stairs");
        translationBuilder.add(VERTICAL_AZALEA_SLAB, "Vertical Azalea Stairs");
        translationBuilder.add(ENGRAVED_AZALEA, "Engraved Azalea");
        translationBuilder.add(ENGRAVED_AZALEA_WOOD, "Engraved Azalea Wood");
        translationBuilder.add(AZALEA_MOSAIC, "Azalea Mosaic");
        translationBuilder.add(AZALEA_MOSAIC_STAIRS, "Azalea Mosaic Stairs");
        translationBuilder.add(AZALEA_MOSAIC_SLABS, "Azalea Mosaic Slab");
        translationBuilder.add(CHIPPED_AZALEA_PLANKS, "Chipped Azalea Planks");
        translationBuilder.add(CHIPPED_AZALEA_SLAB, "Chipped Azalea Slab");
        translationBuilder.add(CHIPPED_AZALEA_STAIRS, "Chipped Azalea Stairs");
        translationBuilder.add(AZALEA_PLANK_PAVEMENT, "Azalea Pavement");
        translationBuilder.add(AZALEA_FRAME, "Azalea Frame");
        translationBuilder.add(AZALEA_LINTELS, "Azalea Lintels");

        /*Stats*/
        translationBuilder.add(CelluloseStats.INTERACT_WITH_SAWMILL, "Interaction with sawmill");
        //Item
        translationBuilder.add(PIPIS, "[[PIPIS]]");
        translationBuilder.add(AZALEA_FLOWERS, "Azalea Flowers");

        //Chipped woodset
        translationBuilder.add(CHIPPED_OAK, "Chipped Oak Log");
        translationBuilder.add(CHIPPED_OAK_WOOD, "Chipped Oak Wood");
        translationBuilder.add(CHIPPED_BIRCH, "Chipped Birch Log");
        translationBuilder.add(CHIPPED_BIRCH_WOOD, "Chipped Birch Wood");
        translationBuilder.add(CHIPPED_SPRUCE, "Chipped Spruce Log");
        translationBuilder.add(CHIPPED_SPRUCE_WOOD, "Chipped Spruce Wood");
        translationBuilder.add(CHIPPED_DARK_OAK, "Chipped Spruce Log");
        translationBuilder.add(CHIPPED_DARK_OAK_WOOD, "Chipped Spruce Wood");
        translationBuilder.add(CHIPPED_JUNGLE, "Chipped Spruce Log");
        translationBuilder.add(CHIPPED_JUNGLE_WOOD, "Chipped spruce Wood");
        translationBuilder.add(CHIPPED_ACACIA, "Chipped Spruce Log");
        translationBuilder.add(CHIPPED_ACACIA_WOOD, "Chipped Spruce Wood");
        //Chipped Planks
        translationBuilder.add(CHIPPED_OAK_PLANKS, "Chipped Oak Planks");
        translationBuilder.add(CHIPPED_BIRCH_PLANKS, "Chipped Birch Planks");
        translationBuilder.add(CHIPPED_SPRUCE_PLANKS, "Chipped Spruce Planks");
        translationBuilder.add(CHIPPED_DARK_OAK_PLANKS, "Chipped Dark Oak Planks");
        translationBuilder.add(CHIPPED_JUNGLE_PLANKS, "Chipped Jungle Planks");
        translationBuilder.add(CHIPPED_ACACIA_PLANKS, "Chipped Acacia Planks");
        translationBuilder.add(CHIPPED_CRIMSON_PLANKS, "Chipped Crimson Planks");
        translationBuilder.add(CHIPPED_WARPED_PLANKS, "Chipped Warped Planks");
        translationBuilder.add(CHIPPED_MANGROVE_PLANKS, "Chipped Mangrove Planks");
        translationBuilder.add(CHIPPED_BAMBOO_PLANKS, "Chipped Bamboo Planks");
        translationBuilder.add(CHIPPED_CHERRY_PLANKS, "Chipped Cherry Planks");
        //Chipped Slab
        translationBuilder.add(CHIPPED_OAK_SLAB, "Chipped Oak Slab");
        translationBuilder.add(CHIPPED_BIRCH_SLAB, "Chipped Birch Slab");
        translationBuilder.add(CHIPPED_SPRUCE_SLAB, "Chipped Spruce Slab");
        translationBuilder.add(CHIPPED_DARK_OAK_SLAB, "Chipped Dark Oak Slab");
        translationBuilder.add(CHIPPED_JUNGLE_SLAB, "Chipped Jungle Slab");
        translationBuilder.add(CHIPPED_ACACIA_SLAB, "Chipped Acacia Slab");
        translationBuilder.add(CHIPPED_CRIMSON_SLAB, "Chipped Crimson Slab");
        translationBuilder.add(CHIPPED_WARPED_SLAB, "Chipped Warped Slab");
        translationBuilder.add(CHIPPED_MANGROVE_SLAB, "Chipped Mangrove Slab");
        translationBuilder.add(CHIPPED_BAMBOO_SLAB, "Chipped Bamboo Slab");
        translationBuilder.add(CHIPPED_CHERRY_SLAB, "Chipped Cherry Slab");
        //Chipped Planks
        translationBuilder.add(CHIPPED_OAK_STAIRS, "Chipped Oak Stairs");
        translationBuilder.add(CHIPPED_BIRCH_STAIRS, "Chipped Birch Stairs");
        translationBuilder.add(CHIPPED_SPRUCE_STAIRS, "Chipped Spruce Stairs");
        translationBuilder.add(CHIPPED_DARK_OAK_STAIRS, "Chipped Dark Oak Stairs");
        translationBuilder.add(CHIPPED_JUNGLE_STAIRS, "Chipped Jungle Stairs");
        translationBuilder.add(CHIPPED_ACACIA_STAIRS, "Chipped Acacia Stairs");
        translationBuilder.add(CHIPPED_CRIMSON_STAIRS, "Chipped Crimson Stairs");
        translationBuilder.add(CHIPPED_WARPED_STAIRS, "Chipped Warped Stairs");
        translationBuilder.add(CHIPPED_MANGROVE_STAIRS, "Chipped Mangrove Stairs");
        translationBuilder.add(CHIPPED_BAMBOO_STAIRS, "Chipped Bamboo Stairs");
        translationBuilder.add(CHIPPED_CHERRY_STAIRS, "Chipped Cherry Stairs");
        //Pavements
        translationBuilder.add(OAK_PLANK_PAVEMENT, "Oak Pavement");
        translationBuilder.add(BIRCH_PLANK_PAVEMENT, "Birch Pavement");
        translationBuilder.add(SPRUCE_PLANK_PAVEMENT, "Spruce Pavement");
        translationBuilder.add(DARK_OAK_PLANK_PAVEMENT, "Dark Oak Pavement");
        translationBuilder.add(JUNGLE_PLANK_PAVEMENT, "Jungle Pavement");
        translationBuilder.add(ACACIA_PLANK_PAVEMENT, "Acacia Pavement");
        translationBuilder.add(CRIMSON_PLANK_PAVEMENT, "Crimson Pavement");
        translationBuilder.add(WARPED_PLANK_PAVEMENT, "Warped Pavement");
        translationBuilder.add(MANGROVE_PLANK_PAVEMENT, "Mangrove Pavement");
        translationBuilder.add(BAMBOO_PLANK_PAVEMENT, "Bamboo Pavement");
        translationBuilder.add(CHERRY_PLANK_PAVEMENT, "Cherry Pavement");
        //Carved Wood
        translationBuilder.add(CHISELED_OAK, "Carved Oak");
        translationBuilder.add(CHISELED_BIRCH, "Carved Birch");
        translationBuilder.add(CHISELED_SPRUCE, "Carved Spruce");
        translationBuilder.add(CHISELED_DARK_OAK, "Carved Dark Oak");
        translationBuilder.add(CHISELED_JUNGLE, "Carved Jungle");
        translationBuilder.add(CHISELED_ACACIA, "Carved Acacia");
        translationBuilder.add(CHISELED_CRIMSON, "Carved Crimson");
        translationBuilder.add(CHISELED_WARPED, "Carved Warped");
        translationBuilder.add(CHISELED_MANGROVE, "Carved Mangrove");
        translationBuilder.add(CHISELED_BAMBOO, "Carved Bamboo");
        translationBuilder.add(CHISELED_CHERRY, "Carved Cherry");
        //Glazed Wood
        translationBuilder.add(OAK_GLAZED, "Glazed Oak");
        translationBuilder.add(BIRCH_GLAZED, "Glazed Birch");
        translationBuilder.add(SPRUCE_GLAZED, "Glazed Spruce");
        translationBuilder.add(DARK_OAK_GLAZED, "Glazed Dark Oak");
        translationBuilder.add(JUNGLE_GLAZED, "Glazed Jungle");
        translationBuilder.add(ACACIA_GLAZED, "Glazed Acacia");
        translationBuilder.add(CRIMSON_GLAZED, "Glazed Crimson");
        translationBuilder.add(WARPED_GLAZED, "Glazed Warped");
        translationBuilder.add(MANGROVE_GLAZED, "Glazed Mangrove");
        translationBuilder.add(BAMBOO_GLAZED, "Glazed Bamboo");
        translationBuilder.add(CHERRY_GLAZED, "Glazed Cherry");
        //Glazed Stairs
        translationBuilder.add(GLAZED_OAK_STAIRS, "Glazed Oak Stairs");
        translationBuilder.add(GLAZED_BIRCH_STAIRS, "Glazed Birch Stairs");
        translationBuilder.add(GLAZED_SPRUCE_STAIRS, "Glazed Spruce Stairs");
        translationBuilder.add(GLAZED_DARK_OAK_STAIRS, "Glazed Dark Oak Stairs");
        translationBuilder.add(GLAZED_JUNGLE_STAIRS, "Glazed Jungle Stairs");
        translationBuilder.add(GLAZED_ACACIA_STAIRS, "Glazed Acacia Stairs");
        translationBuilder.add(GLAZED_CRIMSON_STAIRS, "Glazed Crimson Stairs");
        translationBuilder.add(GLAZED_WARPED_STAIRS, "Glazed Warped Stairs");
        translationBuilder.add(GLAZED_MANGROVE_STAIRS, "Glazed Mangrove Stairs");
        translationBuilder.add(GLAZED_BAMBOO_STAIRS, "Glazed Bamboo Stairs");
        translationBuilder.add(GLAZED_CHERRY_STAIRS, "Glazed Cherry Stairs");
        //Glazed Slabs
        translationBuilder.add(GLAZED_OAK_SLABS, "Glazed Oak Slab");
        translationBuilder.add(GLAZED_BIRCH_SLABS, "Glazed Birch Slab");
        translationBuilder.add(GLAZED_SPRUCE_SLABS, "Glazed Spruce Slab");
        translationBuilder.add(GLAZED_DARK_OAK_SLABS, "Glazed Dark Oak Slab");
        translationBuilder.add(GLAZED_JUNGLE_SLABS, "Glazed Jungle Slab");
        translationBuilder.add(GLAZED_ACACIA_SLABS, "Glazed Acacia Slab");
        translationBuilder.add(GLAZED_CRIMSON_SLABS, "Glazed Crimson Slab");
        translationBuilder.add(GLAZED_WARPED_SLABS, "Glazed Warped Slab");
        translationBuilder.add(GLAZED_MANGROVE_SLABS, "Glazed Mangrove Slab");
        translationBuilder.add(GLAZED_BAMBOO_SLABS, "Glazed Bamboo Slab");
        translationBuilder.add(GLAZED_CHERRY_SLABS, "Glazed Cherry Slab");
        //Tiles
        translationBuilder.add(OAK_BOARDS, "Oak Tiles");
        translationBuilder.add(BIRCH_TILES, "Birch Tiles");
        translationBuilder.add(SPRUCE_TILES, "Spruce Tiles");
        translationBuilder.add(DARK_OAK_TILES, "Dark Oak Tiles");
        translationBuilder.add(JUNGLE_TILES, "Jungle Tiles");
        translationBuilder.add(ACACIA_TILES, "Acacia Tiles");
        translationBuilder.add(CRIMSON_TILES, "Crimson Tiles");
        translationBuilder.add(WARPED_TILES, "Warped Tiles");
        translationBuilder.add(MANGROVE_TILES, "Mangrove Tiles");
        translationBuilder.add(BAMBOO_TILES, "Bamboo Tiles");
        translationBuilder.add(CHERRY_TILES, "Cherry Tiles");
        //Tiles Stairs
        translationBuilder.add(OAK_TILES_STAIRS, "Oak Tiles Stairs");
        translationBuilder.add(BIRCH_TILES_STAIRS, "Birch Tiles Stairs");
        translationBuilder.add(SPRUCE_TILES_STAIRS, "Spruce Tiles Stairs");
        translationBuilder.add(DARK_OAK_TILES_STAIRS, "Dark Oak Tiles Stairs");
        translationBuilder.add(JUNGLE_TILES_STAIRS, "Jungle Tiles Stairs");
        translationBuilder.add(ACACIA_TILES_STAIRS, "Acacia Tiles Stairs");
        translationBuilder.add(CRIMSON_TILES_STAIRS, "Crimson Tiles Stairs");
        translationBuilder.add(WARPED_TILES_STAIRS, "Warped Tiles Stairs");
        translationBuilder.add(MANGROVE_TILES_STAIRS, "Mangrove Tiles Stairs");
        translationBuilder.add(BAMBOO_TILES_STAIRS, "Bamboo Tiles Stairs");
        translationBuilder.add(CHERRY_TILES_STAIRS, "Cherry Tiles Stairs");
        //Tiles Slab
        translationBuilder.add(OAK_TILES_SLABS, "Oak Tiles Slab");
        translationBuilder.add(BIRCH_TILES_SLABS, "Birch Tiles Slab");
        translationBuilder.add(SPRUCE_TILES_SLABS, "Spruce Tiles Slab");
        translationBuilder.add(DARK_OAK_TILES_SLABS, "Dark Oak Tiles Slab");
        translationBuilder.add(JUNGLE_TILES_SLABS, "Jungle Tiles Slab");
        translationBuilder.add(ACACIA_TILES_SLABS, "Acacia Tiles Slab");
        translationBuilder.add(CRIMSON_TILES_SLABS, "Crimson Tiles Slab");
        translationBuilder.add(WARPED_TILES_SLABS, "Warped Tiles Slab");
        translationBuilder.add(MANGROVE_TILES_SLABS, "Mangrove Tiles Slab");
        translationBuilder.add(BAMBOO_TILES_SLABS, "Bamboo Tiles Slab");
        translationBuilder.add(CHERRY_TILES_SLABS, "Cherry Tiles Slab");
        //Timbers
        translationBuilder.add(OAK_TIMBERS, "Oak Timbers");
        translationBuilder.add(BIRCH_TIMBERS, "Birch Timbers");
        translationBuilder.add(SPRUCE_TIMBERS, "Spruce Timbers");
        translationBuilder.add(DARK_OAK_TIMBERS, "Dark Oak Timbers");
        translationBuilder.add(JUNGLE_TIMBERS, "Jungle Timbers");
        translationBuilder.add(ACACIA_TIMBERS, "Acacia Timbers");
        translationBuilder.add(CRIMSON_TIMBERS, "Crimson Timbers");
        translationBuilder.add(WARPED_TIMBERS, "Warped Timbers");
        translationBuilder.add(MANGROVE_TIMBERS, "Mangrove Timbers");
        translationBuilder.add(BAMBOO_TIMBERS, "Bamboo Timbers");
        translationBuilder.add(CHERRY_TIMBERS, "Cherry Timbers");
        //Board Stairs
        translationBuilder.add(OAK_TIMBERS_STAIRS, "Oak Timbers Stairs");
        translationBuilder.add(BIRCH_TIMBERS_STAIRS, "Birch Timbers Stairs");
        translationBuilder.add(SPRUCE_TIMBERS_STAIRS, "Spruce Timbers Stairs");
        translationBuilder.add(DARK_OAK_TIMBERS_STAIRS, "Dark Oak Timbers Stairs");
        translationBuilder.add(JUNGLE_TIMBERS_STAIRS, "Jungle Timbers Stairs");
        translationBuilder.add(ACACIA_TIMBERS_STAIRS, "Acacia Timbers Stairs");
        translationBuilder.add(CRIMSON_TIMBERS_STAIRS, "Crimson Timbers Stairs");
        translationBuilder.add(WARPED_TIMBERS_STAIRS, "Warped Timbers Stairs");
        translationBuilder.add(MANGROVE_TIMBERS_STAIRS, "Mangrove Timbers Stairs");
        translationBuilder.add(BAMBOO_TIMBERS_STAIRS, "Bamboo Timbers Stairs");
        translationBuilder.add(CHERRY_TIMBERS_STAIRS, "Cherry Timbers Stairs");
        //Board Slab
        translationBuilder.add(OAK_TIMBERS_SLABS, "Oak Timbers Slab");
        translationBuilder.add(BIRCH_TIMBERS_SLABS, "Birch Timbers Slab");
        translationBuilder.add(SPRUCE_TIMBERS_SLABS, "Spruce Timbers Slab");
        translationBuilder.add(DARK_OAK_TIMBERS_SLABS, "Dark Oak Timbers Slab");
        translationBuilder.add(JUNGLE_TIMBERS_SLABS, "Jungle Timbers Slab");
        translationBuilder.add(ACACIA_TIMBERS_SLABS, "Acacia Timbers Slab");
        translationBuilder.add(CRIMSON_TIMBERS_SLABS, "Crimson Timbers Slab");
        translationBuilder.add(WARPED_TIMBERS_SLABS, "Warped Timbers Slab");
        translationBuilder.add(MANGROVE_TIMBERS_SLABS, "Mangrove Timbers Slab");
        translationBuilder.add(BAMBOO_TIMBERS_SLABS, "Bamboo Timbers Slab");
        translationBuilder.add(CHERRY_TIMBERS_SLABS, "Cherry Timbers Slab");
        //Beams
        translationBuilder.add(OAK_LOG_MOSAIC, "Oak Beam");
        translationBuilder.add(BIRCH_LOG_MOSAIC, "Birch Beam");
        translationBuilder.add(SPRUCE_LOG_MOSAIC, "Spruce Beam");
        translationBuilder.add(DARK_LOG_MOSAIC, "Dark Oak Beam");
        translationBuilder.add(JUNGLE_LOG_MOSAIC, "Jungle Beam");
        translationBuilder.add(ACACIA_LOG_MOSAIC, "Acacia Beam");
        translationBuilder.add(CRIMSON_LOG_MOSAIC, "Crimson Beam");
        translationBuilder.add(WARPED_LOG_MOSAIC, "Warped Beam");
        translationBuilder.add(MANGROVE_LOG_MOSAIC, "Mangrove Beam");
        translationBuilder.add(BAMBOO_LOG_MOSAIC, "Bamboo Beam");
        translationBuilder.add(CHERRY_LOG_MOSAIC, "Cherry Beam");
        //Plank pillars
        translationBuilder.add(OAK_PLANK_PILLARS, "Oak Plank Pillar");
        translationBuilder.add(BIRCH_PLANK_PILLARS, "Birch Plank Pillar");
        translationBuilder.add(SPRUCE_PLANK_PILLARS, "Spruce Plank Pillar");
        translationBuilder.add(DARK_OAK_PLANK_PILLARS, "Dark Oak Plank Pillar");
        translationBuilder.add(JUNGLE_PLANK_PILLARS, "Jungle Plank Pillar");
        translationBuilder.add(ACACIA_PLANK_PILLARS, "Acacia Plank Pillar");
        translationBuilder.add(CRIMSON_PLANK_PILLARS, "Crimson Plank Pillar");
        translationBuilder.add(WARPED_PLANK_PILLARS, "Warped Plank Pillar");
        translationBuilder.add(MANGROVE_PLANK_PILLARS, "Mangrove Plank Pillar");
        translationBuilder.add(BAMBOO_PLANK_PILLARS, "Bamboo Plank Pillar");
        translationBuilder.add(CHERRY_PLANK_PILLARS, "Cherry Plank Pillar");

        translationBuilder.add(OAK_PLANK_BOX, "Oak Plank Box");
        translationBuilder.add(BIRCH_PLANK_BOX, "Birch Plank Box");
        translationBuilder.add(SPRUCE_PLANK_BOX, "Spruce Plank Box");
        translationBuilder.add(DARK_OAK_PLANK_BOX, "Dark Oak Plank Box");
        translationBuilder.add(JUNGLE_PLANK_BOX, "Jungle Plank Box");
        translationBuilder.add(ACACIA_PLANK_BOX, "Acacia Plank Box");
        translationBuilder.add(CRIMSON_PLANK_BOX, "Crimson Plank Box");
        translationBuilder.add(WARPED_PLANK_BOX, "Warped Plank Box");
        translationBuilder.add(MANGROVE_PLANK_BOX, "Mangrove Plank Box");
        translationBuilder.add(BAMBOO_PLANK_BOX, "Bamboo Plank Box");
        translationBuilder.add(CHERRY_PLANK_BOX, "Cherry Plank Box");
        //UI
        translationBuilder.add(SawmillBlock.TITLE.toString(), "Sawmill");

        /*
        Compressed Blocks
         */
        translationBuilder.add(PAPER_BLOCK, "Paper Block");
        translationBuilder.add(SOAKED_PAPER_BLOCK, "Soaked Paper Block");

        //Bookshelves
        translationBuilder.add(Blocks.BOOKSHELF, "Oak Bookshelf");
        translationBuilder.add(EMPTY_OAK_BOOKSHELF, "Empty Oak Bookshelf");
        translationBuilder.add(COBWEBBED_OAK_BOOKSHELF, "Cobwebbed Bookshelf");
        translationBuilder.add(COBWEBBED_EMPTY_OAK_BOOKSHELF, "Cobwebbed Empty Oak Bookshelf");
        translationBuilder.add(ABANDONED_OAK_BOOKSHELF, "Abandoned Oak Bookshelf");

        //Potion rack
        translationBuilder.add(POTION_RACK, "Potion Rack");

        //Chiseled Bookshelves
        translationBuilder.add(Blocks.CHISELED_BOOKSHELF, "Oak Chiseled Bookshelf");
        translationBuilder.add(BIRCH_CHISELED_BOOKSHELF, "Birch Chiseled Bookshelf");
        translationBuilder.add(SPRUCE_CHISELED_BOOKSHELF, "Spruce Chiseled Bookshelf");
        translationBuilder.add(DARK_OAK_CHISELED_BOOKSHELF, "Dark Oak Chiseled Bookshelf");
        translationBuilder.add(JUNGLE_CHISELED_BOOKSHELF, "Jungle Chiseled Bookshelf");
        translationBuilder.add(ACACIA_CHISELED_BOOKSHELF, "Acacia Chiseled Bookshelf");
        translationBuilder.add(CRIMSON_CHISELED_BOOKSHELF, "Crimson Chiseled Bookshelf");
        translationBuilder.add(WARPED_CHISELED_BOOKSHELF, "Warped Chiseled Bookshelf");
        translationBuilder.add(MANGROVE_CHISELED_BOOKSHELF, "Mangrove Chiseled Bookshelf");
        translationBuilder.add(BAMBOO_CHISELED_BOOKSHELF, "Bamboo Chiseled Bookshelf");
        translationBuilder.add(CHERRY_CHISELED_BOOKSHELF, "Cherry Chiseled Bookshelf");
        translationBuilder.add(CACTUS_CHISELED_BOOKSHELF, "Cactus Chiseled Bookshelf");
        translationBuilder.add(AZALEA_CHISELED_BOOKSHELF, "Azalea Chiseled Bookshelf");
    }
}
