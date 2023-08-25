package net.qzimyion.cellulose;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.qzimyion.cellulose.boats.CelluloseBoats;
import net.qzimyion.cellulose.events.SlabStrippingEvent;
import net.qzimyion.cellulose.util.CelluloseStats;
import net.qzimyion.cellulose.blocks.CelluloseFlammableBlocks;
import net.qzimyion.cellulose.util.CelluloseFuel;
import net.qzimyion.cellulose.blocks.CelluloseStrippableBlock;
import net.qzimyion.cellulose.util.CelluloseTags;
import net.qzimyion.cellulose.items.CelluloseItemGroups;
import net.qzimyion.cellulose.items.CelluloseItems;
import net.qzimyion.cellulose.recipe.CelluloseRecipes;
import net.qzimyion.cellulose.blocks.*;
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
		CelluloseBlocks.registerCelluloseBlocks();
		CelluloseFlammableBlocks.registerFlammableBlocks();
		CelluloseStrippableBlock.registerStrippableBlocks();
		CelluloseFuel.registerFuel();
		CelluloseRecipes.registerRecipes();
		CelluloseScreens.registerScreens();
		CelluloseStats.registerStats();
		CelluloseTags.registerTags();
		CelluloseItemGroups.registerItemGroups();
		CelluloseBoats.registerBoats();

		//Events
		SlabStrippingEvent.SlabStripping(Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB);
	}
}