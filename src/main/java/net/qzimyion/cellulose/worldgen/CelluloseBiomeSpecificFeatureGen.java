package net.qzimyion.cellulose.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseBiomeSpecificFeatureGen {
    public static void registerBiomeSpecificFeature(){

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, CellulosePlacedFeatures.DARK_OAK_ROOFED_PLACED);

        Cellulose.LOGGER.info("Registering Biome Specific Mod Features");
    }
}
