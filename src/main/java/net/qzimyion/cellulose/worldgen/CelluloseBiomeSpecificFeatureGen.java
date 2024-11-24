package net.qzimyion.cellulose.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.qzimyion.cellulose.Cellulose;

import static net.qzimyion.cellulose.Cellulose.MOD_ID;

public class CelluloseBiomeSpecificFeatureGen {

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static void registerBiomeSpecificFeature(){

//        BiomeModifications.create(id("fallen_log_generation")).add(ModificationPhase.ADDITIONS, BiomeSelectors.all(),
//                ((biomeModificationContext, context) -> {
//                    //Fallen logs
//                    BiomeModificationContext.GenerationSettingsContext generationSettings = context.getGenerationSettings();
//
//                    if(biomeModificationContext.hasTag(BiomeTags.IS_JUNGLE)){
//                        generationSettings.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, CellulosePlacedFeatures.FALLEN_OAK_LOG_PLACED);
//                    }
//                }));

        //Trees


        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DARK_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, CellulosePlacedFeatures.DARK_OAK_ROOFED_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, CellulosePlacedFeatures.PINE_TREE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SNOWY_TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, CellulosePlacedFeatures.PINE_TREE_PLACED);

        //Fallen logs
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, CellulosePlacedFeatures.FALLEN_OAK_LOG_PLACED);

        Cellulose.LOGGER.info("Registering Cellulose Biome Specific Mod Features");
    }
}
