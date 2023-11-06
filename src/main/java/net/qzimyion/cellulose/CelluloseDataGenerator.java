package net.qzimyion.cellulose;

import com.google.gson.JsonElement;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.client.BlockStateSupplier;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.datagen.*;
import net.qzimyion.cellulose.datagen.languageProvider.CelluloseNameProvider;
import net.qzimyion.cellulose.datagen.languageProvider.CelluloseNameProvider_en_gb;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

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
	}
}
