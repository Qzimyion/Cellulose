package net.qzimyion.cellulose.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

@SuppressWarnings("deprecation, unused")
public class CelluloseVillagers {

    public static final PointOfInterestType SAWMILL_POI = POI("sawmill_poi", CelluloseBlocks.SAWMILL);
    public static final VillagerProfession CARPENTER = Profession("carpenter", RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(Cellulose.MOD_ID, "sawmill_poi")));

    public static VillagerProfession Profession (String name, RegistryKey<PointOfInterestType> Type){
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(Cellulose.MOD_ID, name), VillagerProfessionBuilder.create().id(new Identifier(Cellulose.MOD_ID, name)).workstation(Type).workSound(SoundEvents.ENTITY_VILLAGER_WORK_MASON).build());
    }
    public static PointOfInterestType POI (String name, Block block){
        return PointOfInterestHelper.register(new Identifier(Cellulose.MOD_ID, name), 1,10, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }
    public static void registerVillagers(){
        Cellulose.LOGGER.info("Register Mod Villagers");
    }
}
