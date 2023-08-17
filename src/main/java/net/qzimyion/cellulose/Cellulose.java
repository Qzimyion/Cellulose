package net.qzimyion.cellulose;

import net.fabricmc.api.ModInitializer;
import net.qzimyion.cellulose.events.WoodChipperEvent;
import net.qzimyion.cellulose.recipe.CelluloseRecipes;
import net.qzimyion.cellulose.registry.*;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cellulose implements ModInitializer
{
	public static final String MOD_ID = "cellulose";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		CelluloseItems.registerCelluloseItems();
		CelluloseItemGroups.registerItemGroups();
		CelluloseBlocks.registerCelluloseBlocks();
		CelluloseFlammableBlocks.registerFlammableBlocks();
		CelluloseStrippableBlock.registerStrippableBlocks();
		CelluloseFuel.registerFuel();
		CelluloseRecipes.registerRecipes();
		CelluloseScreens.registerScreens();
		CelluloseStats.registerStats();
		CelluloseTags.registerTags();

		//Events
		WoodChipperEvent.registerEvents();
	}
}