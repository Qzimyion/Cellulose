package net.qzimyion.cellulose.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PlaceableOnWaterItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.items.custom_items.AcornItem;
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

    //Lotus
    public static final Item LOTUS = registerItem("lotus", new PlaceableOnWaterItem(CelluloseBlocks.LOTUS, new FabricItemSettings()));
    public static final Item WHITE_LOTUS = registerItem("white_lotus", new PlaceableOnWaterItem(CelluloseBlocks.WHITE_LOTUS, new FabricItemSettings()));
    public static final Item PINK_LOTUS = registerItem("pink_lotus", new PlaceableOnWaterItem(CelluloseBlocks.PINK_LOTUS, new FabricItemSettings()));
    public static final Item YELLOW_LOTUS = registerItem("yellow_lotus", new PlaceableOnWaterItem(CelluloseBlocks.YELLOW_LOTUS, new FabricItemSettings()));
    public static final Item BLUE_LOTUS = registerItem("blue_lotus", new PlaceableOnWaterItem(CelluloseBlocks.BLUE_LOTUS, new FabricItemSettings()));
    public static final Item INDIGO_LOTUS = registerItem("indigo_lotus", new PlaceableOnWaterItem(CelluloseBlocks.INDIGO_LOTUS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Cellulose.MOD_ID, name), item);
    }
    public static void registerCelluloseItems()
    {
     Cellulose.LOGGER.info("Registering mod items");
    }
}
