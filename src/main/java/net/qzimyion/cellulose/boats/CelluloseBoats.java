package net.qzimyion.cellulose.boats;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

@SuppressWarnings("UnstableApiUsage")
public class CelluloseBoats {

    /*
    Note: If you want to copy this code for your project please remember to add Terraform Wood API
    to your Build.Gradlew file first otherwise it won't work.
    */


    private static final Identifier CACTUS_BOAT_ID = new Identifier(Cellulose.MOD_ID, "cactus_boat");
    private static final Identifier CACTUS_CHEST_BOAT_ID = new Identifier(Cellulose.MOD_ID, "cactus_chest_boat");

    private static final RegistryKey<TerraformBoatType> CACTUS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_BOAT_ID);
    private static final RegistryKey<TerraformBoatType> CACTUS_CHEST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_CHEST_BOAT_ID);

    public static void registerBoats()
    {

        Item boatItem = TerraformBoatItemHelper.registerBoatItem(CACTUS_BOAT_ID, CACTUS_BOAT_KEY, false);
        Item chestBoatItem = TerraformBoatItemHelper.registerBoatItem(CACTUS_CHEST_BOAT_ID, CACTUS_CHEST_BOAT_KEY, true);

        TerraformBoatType boat = new TerraformBoatType.Builder()
                .item(boatItem)
                .chestItem(chestBoatItem)
                .build();

        TerraformBoatType ChestBoat = new TerraformBoatType.Builder()
                .chestItem(chestBoatItem)
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_BOAT_KEY, boat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_CHEST_BOAT_KEY, ChestBoat);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.addAfter(
                Items.CHERRY_CHEST_BOAT, boatItem, chestBoatItem));
    }
}
