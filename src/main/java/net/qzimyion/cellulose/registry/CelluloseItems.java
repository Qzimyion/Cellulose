package net.qzimyion.cellulose.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;
public class CelluloseItems
{
  public static final Item PIPIS = registerItem("pipis", new Item(new FabricItemSettings()));
    public static final Item CACTUS_JUICE = registerItem("cactus_juice", new CactusJuiceItem(new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Cellulose.MOD_ID, name), item);
    }
    public static void registerCelluloseItems()
    {
     Cellulose.LOGGER.info("Registering mod items for " + Cellulose.MOD_ID);
    }
}
