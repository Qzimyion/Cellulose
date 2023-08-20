package net.qzimyion.cellulose.entities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.Cellulose;

import static net.qzimyion.cellulose.Cellulose.MOD_ID;

public class CelluloseEntity
{
    public static final EntityType<BoatEntity> CACTUS_BOAT = register("cactus_boat", createBoatType(false, CelluloseBoatEntity.CelluloseBoat.CACTUS));
    public static final EntityType<BoatEntity> CACTUS_CHEST_BOAT = register("cactus_chest_boat", createBoatType(true, CelluloseBoatEntity.CelluloseBoat.CACTUS));

    private static <T extends EntityType<?>> T register(String id, T type) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(MOD_ID, id), type);
    }

    private static EntityType<BoatEntity> createBoatType(boolean chest, CelluloseBoatEntity.CelluloseBoat boat) {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, boat.factory(chest))
                .dimensions(EntityDimensions.changing(1.375f, 0.5625f))
                .trackRangeChunks(10)
                .build();

    }

    public static void registerEntityTypes()
    {
        Cellulose.LOGGER.info("Registering boats for " + Cellulose.MOD_ID);
    }
}
