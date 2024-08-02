package net.qzimyion.cellulose.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;


public class CelluloseItems
{
    //[[PIPIS]]
    public static final Item PIPIS = registerItem("pipis", new Item(new FabricItemSettings()));

    //Barks
    public static final Item OAK_BARK = registerItem("oak_bark", new Item(new FabricItemSettings()));
    public static final Item BIRCH_BARK = registerItem("birch_bark", new Item(new FabricItemSettings()));
    public static final Item SPRUCE_BARK = registerItem("spruce_bark", new Item(new FabricItemSettings()));
    public static final Item DARK_OAK_BARK = registerItem("dark_oak_bark", new Item(new FabricItemSettings()));
    public static final Item JUNGLE_BARK = registerItem("jungle_bark", new Item(new FabricItemSettings()));
    public static final Item ACACIA_BARK = registerItem("acacia_bark", new Item(new FabricItemSettings()));
    public static final Item CRIMSON_BARK = registerItem("crimson_bark", new Item(new FabricItemSettings()));
    public static final Item WARPED_BARK = registerItem("warped_bark", new Item(new FabricItemSettings()));
    public static final Item MANGROVE_BARK = registerItem("mangrove_bark", new Item(new FabricItemSettings()));
    public static final Item BAMBOO_BARK = registerItem("bamboo_bark", new Item(new FabricItemSettings()));
    public static final Item CHERRY_BARK = registerItem("cherry_bark", new Item(new FabricItemSettings()));
    public static final Item CACTUS_BARK = registerItem("cactus_bark", new Item(new FabricItemSettings()));
    public static final Item AZALEA_BARK = registerItem("azalea_bark", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Cellulose.MOD_ID, name), item);
    }
    public static void registerCelluloseItems()
    {
     Cellulose.LOGGER.info("Registering mod items");
    }
}
