package net.qzimyion.cellulose.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseItems
{
  //[[PIPIS]]
  public static final Item PIPIS = registerItem("pipis", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Cellulose.MOD_ID, name), item);
    }
    public static void registerCelluloseItems()
    {
     Cellulose.LOGGER.info("Registering mod items for " + Cellulose.MOD_ID);
    }
}
