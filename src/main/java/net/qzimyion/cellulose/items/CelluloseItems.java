package net.qzimyion.cellulose.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.items.custom_items.AcornItem;
import net.qzimyion.cellulose.items.custom_items.bamboo_ladders.FreshBambooLadderItem;
import net.qzimyion.cellulose.items.custom_items.popacorn_bowls.PopacornBowlHalfItem;
import net.qzimyion.cellulose.items.custom_items.popacorn_bowls.PopacornBowlItem;
import net.qzimyion.cellulose.items.custom_items.popacorn_bowls.PopacornBowlQuaterItem;

public class CelluloseItems
{
    //[[PIPIS]]
    public static final Item PIPIS = registerItem("pipis", new Item(new FabricItemSettings()));

    //Nature and decor
    public static final Item APPLE_FLOWER = registerItem("apple_flower", new Item(new FabricItemSettings()));
    public static final Item APPLE_POLLEN = registerItem("apple_pollen", new Item(new FabricItemSettings()));

    //Food
    public static final Item ACORN = registerItem("acorn", new AcornItem(new FabricItemSettings()));
    public static final Item POPPED_ACORN = registerItem("popped_acorn", new Item(new FabricItemSettings()
          .food(CelluloseFoodComponent.POPPED_OAK_ACORN)));
    public static final Item POPACORN_BOWL = registerItem("popacorn_bowl", new PopacornBowlItem(new FabricItemSettings()
          .food(CelluloseFoodComponent.POPACRON_BOWL)));
    public static final Item POPACORN_BOWL_HALF = registerItem("popacorn_bowl_half", new PopacornBowlHalfItem(new FabricItemSettings()
          .food(CelluloseFoodComponent.POPACRON_BOWL)));
    public static final Item POPACORN_BOWL_QUATER = registerItem("popacorn_bowl_quater", new PopacornBowlQuaterItem(new FabricItemSettings()
          .food(CelluloseFoodComponent.POPACRON_BOWL)));

    //Barks
    public static final Item OAK_SAWDUST = registerItem("oak_sawdust", new Item(new FabricItemSettings()));
    public static final Item BIRCH_SAWDUST = registerItem("birch_sawdust", new Item(new FabricItemSettings()));
    public static final Item SPRUCE_SAWDUST = registerItem("spruce_sawdust", new Item(new FabricItemSettings()));
    public static final Item DARK_OAK_SAWDUST = registerItem("dark_oak_sawdust", new Item(new FabricItemSettings()));
    public static final Item JUNGLE_SAWDUST = registerItem("jungle_sawdust", new Item(new FabricItemSettings()));
    public static final Item ACACIA_SAWDUST = registerItem("acacia_sawdust", new Item(new FabricItemSettings()));
    public static final Item CRIMSON_SAWDUST = registerItem("crimson_sawdust", new Item(new FabricItemSettings()));
    public static final Item WARPED_SAWDUST = registerItem("warped_sawdust", new Item(new FabricItemSettings()));
    public static final Item MANGROVE_SAWDUST = registerItem("mangrove_sawdust", new Item(new FabricItemSettings()));
    public static final Item BAMBOO_SAWDUST = registerItem("bamboo_sawdust", new Item(new FabricItemSettings()));
    public static final Item CHERRY_SAWDUST = registerItem("cherry_sawdust", new Item(new FabricItemSettings()));
    public static final Item CACTUS_SAWDUST = registerItem("cactus_sawdust", new Item(new FabricItemSettings()));
    public static final Item AZALEA_SAWDUST = registerItem("azalea_sawdust", new Item(new FabricItemSettings()));

    //Misc
    public static final Item FRESH_BAMBOO_LADDER = registerItem("fresh_bamboo_ladder", new FreshBambooLadderItem(CelluloseBlocks.FRESH_BAMBOO_LADDER, new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Cellulose.MOD_ID, name), item);
    }
    public static void registerCelluloseItems()
    {
     Cellulose.LOGGER.info("Registering mod items");
    }
}
