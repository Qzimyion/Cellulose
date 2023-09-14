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

import static net.minecraft.item.Items.DRIED_KELP;
import static net.minecraft.item.Items.SUSPICIOUS_STEW;
import static net.qzimyion.cellulose.items.CelluloseItems.POPACORN_BOWL;
import static net.qzimyion.cellulose.items.CelluloseItems.POPPED_ACORN;

@SuppressWarnings("All")
public class CelluloseBoats {

    /*
    Note: If you want to copy this code for your project please remember to add Terraform Wood API
    to your Build.Gradlew file first otherwise it won't work.
    */


    private static final Identifier CACTUS_BOAT_ID = new Identifier(Cellulose.MOD_ID, "cactus_boat");
    private static final Identifier CACTUS_CHEST_BOAT_ID = new Identifier(Cellulose.MOD_ID, "cactus_chest_boat");
    private static final Identifier AZALEA_BOAT_ID = new Identifier(Cellulose.MOD_ID, "azalea_boat");
    private static final Identifier AZALEA_CHEST_BOAT_ID = new Identifier(Cellulose.MOD_ID, "azalea_chest_boat");

    private static final RegistryKey<TerraformBoatType> CACTUS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_BOAT_ID);
    private static final RegistryKey<TerraformBoatType> CACTUS_CHEST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_CHEST_BOAT_ID);
    private static final RegistryKey<TerraformBoatType> AZALEA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AZALEA_BOAT_ID);
    private static final RegistryKey<TerraformBoatType> AZALEA_CHEST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AZALEA_CHEST_BOAT_ID);

    public static void registerBoats()
    {

        Item boatItem = TerraformBoatItemHelper.registerBoatItem(CACTUS_BOAT_ID, CACTUS_BOAT_KEY, false);
        Item chestBoatItem = TerraformBoatItemHelper.registerBoatItem(CACTUS_CHEST_BOAT_ID, CACTUS_CHEST_BOAT_KEY, true);
        Item boatItem1 = TerraformBoatItemHelper.registerBoatItem(AZALEA_BOAT_ID, AZALEA_BOAT_KEY, false);
        Item chestBoatItem1 = TerraformBoatItemHelper.registerBoatItem(AZALEA_CHEST_BOAT_ID, AZALEA_CHEST_BOAT_KEY, true);

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

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_BOAT_KEY, boat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_CHEST_BOAT_KEY, ChestBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AZALEA_BOAT_KEY, boat1);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AZALEA_CHEST_BOAT_KEY, ChestBoat1);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.BAMBOO_CHEST_RAFT, boatItem, chestBoatItem);
            content.addAfter(Items.CHERRY_CHEST_BOAT, boatItem1, chestBoatItem1);
        });

    }
}
