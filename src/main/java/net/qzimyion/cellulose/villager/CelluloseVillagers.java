package net.qzimyion.cellulose.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Block;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;

@SuppressWarnings("deprecation, unused")
public class CelluloseVillagers {

    public static final PoiType SAWMILL_POI = POI("sawmill_poi", CelluloseBlocks.SAWMILL);
    public static final VillagerProfession CARPENTER = Profession("carpenter", ResourceKey.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE.key(), new ResourceLocation(Cellulose.MOD_ID, "sawmill_poi")));

    public static VillagerProfession Profession (String name, ResourceKey<PoiType> Type){
        return Registry.register(BuiltInRegistries.VILLAGER_PROFESSION, new ResourceLocation(Cellulose.MOD_ID, name), VillagerProfessionBuilder.create().id(new ResourceLocation(Cellulose.MOD_ID, name)).workstation(Type).workSound(SoundEvents.VILLAGER_WORK_MASON).build());
    }
    public static PoiType POI (String name, Block block){
        return PointOfInterestHelper.register(new ResourceLocation(Cellulose.MOD_ID, name), 1,10, ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates()));
    }
    public static void registerVillagers(){
        Cellulose.LOGGER.info("Register Mod Villagers");
    }
}
