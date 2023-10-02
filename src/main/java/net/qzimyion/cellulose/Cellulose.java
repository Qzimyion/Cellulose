package net.qzimyion.cellulose;


import net.fabricmc.api.ModInitializer;
import net.qzimyion.cellulose.boats.CelluloseBoats;
import net.qzimyion.cellulose.entity.CelluloseEntities;
import net.qzimyion.cellulose.events.CelluloseEvents;
import net.qzimyion.cellulose.signs.CelluloseSigns;
import net.qzimyion.cellulose.util.CelluloseStats;
import net.qzimyion.cellulose.blocks.CelluloseFlammableBlocks;
import net.qzimyion.cellulose.util.CelluloseFuel;
import net.qzimyion.cellulose.blocks.CelluloseStrippableBlock;
import net.qzimyion.cellulose.items.CelluloseItemGroups;
import net.qzimyion.cellulose.items.CelluloseItems;
import net.qzimyion.cellulose.recipe.CelluloseRecipes;
import net.qzimyion.cellulose.blocks.*;
import net.qzimyion.cellulose.screen.CelluloseScreens;
import net.qzimyion.cellulose.villager.CelluloseVillagerTrades;
import net.qzimyion.cellulose.villager.CelluloseVillagers;
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
		CelluloseBlocks.registerCelluloseBlocks();
		CelluloseFlammableBlocks.registerFlammableBlocks();
		CelluloseStrippableBlock.registerStrippableBlocks();
		CelluloseFuel.registerFuel();
		CelluloseRecipes.registerRecipes();
		CelluloseScreens.registerScreens();
		CelluloseStats.registerStats();
		CelluloseItemGroups.registerItemGroups();
		CelluloseSigns.registerSigns();
		CelluloseBoats.registerBoats();
		CelluloseEvents.registerEvents();
		CelluloseVillagers.registerVillagers();
		CelluloseVillagerTrades.registerTrades();
		CelluloseEntities.registerEntities();
	}
}