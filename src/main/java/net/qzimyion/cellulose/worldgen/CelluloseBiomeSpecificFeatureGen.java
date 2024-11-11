package net.qzimyion.cellulose.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseBiomeSpecificFeatureGen {
    public static void registerBiomeSpecificFeature(){

        //Trees
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, CellulosePlacedFeatures.DARK_OAK_ROOFED_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, CellulosePlacedFeatures.PINE_TREE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, CellulosePlacedFeatures.PINE_TREE_PLACED);

        //Fallen logs
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, CellulosePlacedFeatures.FALLEN_OAK_LOG_PLACED);

        Cellulose.LOGGER.info("Registering Cellulose Biome Specific Mod Features");
    }
}
