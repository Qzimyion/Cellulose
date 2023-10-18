package net.qzimyion.cellulose.boats;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

public class CelluloseBoats {

    /*
    Note: If you want to copy this code for your project please remember to add Terraform Wood API
    to your Build.Gradlew file first otherwise it won't work.
    */


    public static final Identifier CACTUS_BOAT_ID = new Identifier(Cellulose.MOD_ID, "cactus_boat");
    public static final Identifier CACTUS_CHEST_BOAT_ID = new Identifier(Cellulose.MOD_ID, "cactus_chest_boat");
    public static final Identifier AZALEA_BOAT_ID = new Identifier(Cellulose.MOD_ID, "azalea_boat");
    public static final Identifier AZALEA_CHEST_BOAT_ID = new Identifier(Cellulose.MOD_ID, "azalea_chest_boat");
    public static final Identifier BLOOMING_AZALEA_BOAT_ID = new Identifier(Cellulose.MOD_ID, "blooming_azalea_boat");
    public static final Identifier BLOOMING_AZALEA_CHEST_BOAT_ID = new Identifier(Cellulose.MOD_ID, "blooming_azalea_chest_boat");


    public static final RegistryKey<TerraformBoatType> CACTUS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> CACTUS_CHEST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_CHEST_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> AZALEA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AZALEA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> AZALEA_CHEST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AZALEA_CHEST_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> BLOOMING_AZALEA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLOOMING_AZALEA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> BLOOMING_AZALEA_CHEST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLOOMING_AZALEA_CHEST_BOAT_ID);

    @SuppressWarnings("UnstableApiUsage")
    public static void registerBoats()
    {

        Item boatItem = TerraformBoatItemHelper.registerBoatItem(CACTUS_BOAT_ID, CACTUS_BOAT_KEY, false);
        Item chestBoatItem = TerraformBoatItemHelper.registerBoatItem(CACTUS_CHEST_BOAT_ID, CACTUS_CHEST_BOAT_KEY, true);
        Item boatItem1 = TerraformBoatItemHelper.registerBoatItem(AZALEA_BOAT_ID, AZALEA_BOAT_KEY, false);
        Item chestBoatItem1 = TerraformBoatItemHelper.registerBoatItem(AZALEA_CHEST_BOAT_ID, AZALEA_CHEST_BOAT_KEY, true);
        Item boatItem2 = TerraformBoatItemHelper.registerBoatItem(BLOOMING_AZALEA_BOAT_ID, BLOOMING_AZALEA_BOAT_KEY, false);
        Item chestBoatItem2 = TerraformBoatItemHelper.registerBoatItem(BLOOMING_AZALEA_CHEST_BOAT_ID, BLOOMING_AZALEA_CHEST_BOAT_KEY, true);

        TerraformBoatType boat = new TerraformBoatType.Builder()
                .item(boatItem)
                .chestItem(chestBoatItem)
                .build();

        TerraformBoatType ChestBoat = new TerraformBoatType.Builder()
                .chestItem(chestBoatItem)
                .build();

        TerraformBoatType boat1 = new TerraformBoatType.Builder()
                .item(boatItem1)
                .chestItem(chestBoatItem1)
                .build();

        TerraformBoatType ChestBoat1 = new TerraformBoatType.Builder()
                .chestItem(chestBoatItem1)
                .build();

        TerraformBoatType boat2 = new TerraformBoatType.Builder()
                .item(boatItem2)
                .chestItem(chestBoatItem2)
                .build();

        TerraformBoatType ChestBoat2 = new TerraformBoatType.Builder()
                .chestItem(chestBoatItem2)
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_BOAT_KEY, boat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_CHEST_BOAT_KEY, ChestBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AZALEA_BOAT_KEY, boat1);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AZALEA_CHEST_BOAT_KEY, ChestBoat1);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BLOOMING_AZALEA_BOAT_KEY, boat2);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BLOOMING_AZALEA_CHEST_BOAT_KEY, ChestBoat2);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.BAMBOO_CHEST_RAFT, boatItem, chestBoatItem);
            content.addAfter(Items.CHERRY_CHEST_BOAT, boatItem1, chestBoatItem1);
            content.addAfter(chestBoatItem1, boatItem2, chestBoatItem2);
        });


        Cellulose.LOGGER.info("Registering Mod Boats");

    }
}
