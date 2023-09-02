package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
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
        //Cactus Woodset
        translationBuilder.add(CACTUS_BUNDLE, "Cactus Bundle");
        translationBuilder.add(CACTUS_PLANKS, "Cactus Planks");
        translationBuilder.add(CACTUS_STAIRS, "Cactus Planks Stairs");
        translationBuilder.add(CACTUS_SLABS, "Cactus Planks Slab");
        translationBuilder.add(CACTUS_CROWN, "Cactus Crown");
        translationBuilder.add(STRIPPED_CACTUS, "Stripped Cactus");
        translationBuilder.add(STRIPPED_CACTUS_CROWN, "Stripped Cactus Crown");
        translationBuilder.add(CACTUS_FENCE, "Cactus Fence");
        translationBuilder.add(CACTUS_FENCE_GATE, "Cactus Fence gate");
        translationBuilder.add(CACTUS_BUTTON, "Cactus Button");
        translationBuilder.add(CACTUS_PRESSURE_PLATE, "Cactus Pressure Plate");
        translationBuilder.add(CACTUS_DOOR, "Cactus Door");
        translationBuilder.add(CACTUS_TRAPDOOR, "Cactus Trapdoor");
        translationBuilder.add(VERTICAL_CACTUS_PLANKS, "Vertical Cactus Planks");
        translationBuilder.add(VERTICAL_CACTUS_PLANKS_STAIRS, "Vertical Cactus Planks Stairs");
        translationBuilder.add(VERTICAL_CACTUS_PLANKS_SLABS, "Vertical Cactus Planks Stairs");
        translationBuilder.add(ENGRAVED_CACTUS, "Engraved Cactus");
        translationBuilder.add(ENGRAVED_CACTUS_CROWN, "Engraved Cactus Crown");
        translationBuilder.add(CACTUS_MOSAIC, "Cactus Mosaic");
        translationBuilder.add(CACTUS_MOSAIC_STAIRS, "Cactus Mosaic Stairs");
        translationBuilder.add(CACTUS_MOSAIC_SLABS, "Cactus Mosaic Slab");
        translationBuilder.add(CHIPPED_CACTUS_PLANKS, "Chipped Cactus Planks");
        translationBuilder.add(CHIPPED_CACTUS_PLANKS_SLABS, "Chipped Cactus Planks Slab");
        translationBuilder.add(CHIPPED_CACTUS_PLANKS_STAIRS, "Chipped Cactus Planks Stairs");
        translationBuilder.add(CACTUS_PLANK_PAVEMENT, "Cactus Pavement");
        translationBuilder.add(CACTUS_CARVED, "Carved cactus");
        /*Stats*/
        translationBuilder.add(CelluloseStats.INTERACT_WITH_SAWMILL, "Interaction with sawmill");
        //Item
        translationBuilder.add(PIPIS, "[[PIPIS]]");
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
        //Chipped Planks Slab
        translationBuilder.add(CHIPPED_OAK_PLANKS_SLABS, "Chipped Oak Planks Slab");
        translationBuilder.add(CHIPPED_BIRCH_PLANKS_SLABS, "Chipped Birch Planks Slab");
        translationBuilder.add(CHIPPED_SPRUCE_PLANKS_SLABS, "Chipped Spruce Planks Slab");
        translationBuilder.add(CHIPPED_DARK_OAK_PLANKS_SLABS, "Chipped Dark Oak Planks Slab");
        translationBuilder.add(CHIPPED_JUNGLE_PLANKS_SLABS, "Chipped Jungle Planks Slab");
        translationBuilder.add(CHIPPED_ACACIA_PLANKS_SLABS, "Chipped Acacia Planks Slab");
        translationBuilder.add(CHIPPED_CRIMSON_PLANKS_SLABS, "Chipped Crimson Planks Slab");
        translationBuilder.add(CHIPPED_WARPED_PLANKS_SLABS, "Chipped Warped Planks Slab");
        translationBuilder.add(CHIPPED_MANGROVE_PLANKS_SLABS, "Chipped Mangrove Planks Slab");
        translationBuilder.add(CHIPPED_BAMBOO_PLANKS_SLABS, "Chipped Bamboo Planks Slab");
        translationBuilder.add(CHIPPED_CHERRY_PLANKS_SLABS, "Chipped Cherry Planks Slab");
        //Chipped Planks
        translationBuilder.add(CHIPPED_OAK_PLANKS_STAIRS, "Chipped Oak Planks Stairs");
        translationBuilder.add(CHIPPED_BIRCH_PLANKS_STAIRS, "Chipped Birch Planks Stairs");
        translationBuilder.add(CHIPPED_SPRUCE_PLANKS_STAIRS, "Chipped Spruce Planks Stairs");
        translationBuilder.add(CHIPPED_DARK_OAK_PLANKS_STAIRS, "Chipped Dark Oak Planks Stairs");
        translationBuilder.add(CHIPPED_JUNGLE_PLANKS_STAIRS, "Chipped Jungle Planks Stairs");
        translationBuilder.add(CHIPPED_ACACIA_PLANKS_STAIRS, "Chipped Acacia Planks Stairs");
        translationBuilder.add(CHIPPED_CRIMSON_PLANKS_STAIRS, "Chipped Crimson Planks Stairs");
        translationBuilder.add(CHIPPED_WARPED_PLANKS_STAIRS, "Chipped Warped Planks Stairs");
        translationBuilder.add(CHIPPED_MANGROVE_PLANKS_STAIRS, "Chipped Mangrove Planks Stairs");
        translationBuilder.add(CHIPPED_BAMBOO_PLANKS_STAIRS, "Chipped Bamboo Planks Stairs");
        translationBuilder.add(CHIPPED_CHERRY_PLANKS_STAIRS, "Chipped Cherry Planks Stairs");
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
        translationBuilder.add(OAK_CARVED, "Carved Oak");
        translationBuilder.add(BIRCH_CARVED, "Carved Birch");
        translationBuilder.add(SPRUCE_CARVED, "Carved Spruce");
        translationBuilder.add(DARK_OAK_CARVED, "Carved Dark Oak");
        translationBuilder.add(JUNGLE_CARVED, "Carved Jungle");
        translationBuilder.add(ACACIA_CARVED, "Carved Acacia");
        translationBuilder.add(CRIMSON_CARVED, "Carved Crimson");
        translationBuilder.add(WARPED_CARVED, "Carved Warped");
        translationBuilder.add(MANGROVE_CARVED, "Carved Mangrove");
        translationBuilder.add(BAMBOO_CARVED, "Carved Bamboo");
        translationBuilder.add(CHERRY_CARVED, "Carved Cherry");
    }
}
