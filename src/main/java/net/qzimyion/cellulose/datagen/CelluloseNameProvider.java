package net.qzimyion.cellulose.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.qzimyion.cellulose.registry.CelluloseBlocks;
import net.qzimyion.cellulose.registry.CelluloseItems;
import net.qzimyion.cellulose.registry.CelluloseStats;

import java.nio.file.Path;

import static net.qzimyion.cellulose.registry.CelluloseBlocks.*;

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
        translationBuilder.add(CACTUS_SLABS, "Cactus Planks Slabs");
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
        /*Stats*/
        translationBuilder.add(CelluloseStats.INTERACT_WITH_SAWMILL, "Interaction with sawmill");
        //Misc
        translationBuilder.add(CelluloseItems.CACTUS_JUICE, "Cactus Juice");

    }
}
