package net.qzimyion.cellulose;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.qzimyion.cellulose.datagen.*;
import net.qzimyion.cellulose.datagen.languageProvider.CelluloseNameProvider;
import net.qzimyion.cellulose.datagen.languageProvider.CelluloseNameProvider_en_gb;
import net.qzimyion.cellulose.worldgen.CelluloseConfiguredFeatures;
import net.qzimyion.cellulose.worldgen.CellulosePlacedFeatures;

public class CelluloseDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(CelluloseRecipeGenerator::new);
		pack.addProvider(CelluloseModelProvider::new);
		pack.addProvider(CelluloseNameProvider::new);
		pack.addProvider(CelluloseNameProvider_en_gb::new);
		pack.addProvider(CelluloseBlockLootTableProvider::new);
		pack.addProvider(CelluloseBlockTagsProvider::new);
		pack.addProvider(CelluloseItemTagsProvider::new);
		pack.addProvider(CelluloseWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder){
		registryBuilder.add(Registries.CONFIGURED_FEATURE, CelluloseConfiguredFeatures::boostrap);
		registryBuilder.add(Registries.PLACED_FEATURE, CellulosePlacedFeatures::boostrap);
	}
}
