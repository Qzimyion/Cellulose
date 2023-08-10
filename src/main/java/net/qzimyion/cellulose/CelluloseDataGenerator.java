package net.qzimyion.cellulose;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.qzimyion.cellulose.datagen.*;

public class CelluloseDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(CelluloseRecipeGenerator::new);
		pack.addProvider(CelluloseModelProvider::new);
		pack.addProvider(CelluloseNameProvider::new);
		pack.addProvider(CelluloseLootTableProvider::new);
		pack.addProvider(CelluloseBlockTagsProvider::new);
	}
}
