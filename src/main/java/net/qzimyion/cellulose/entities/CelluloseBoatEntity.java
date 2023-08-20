package net.qzimyion.cellulose.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.world.World;
import net.qzimyion.cellulose.Cellulose;
import net.qzimyion.cellulose.blocks.CelluloseBlocks;
import net.qzimyion.cellulose.items.CelluloseItems;

import java.util.function.Supplier;

public class CelluloseBoatEntity extends BoatEntity {
    private final CelluloseBoat boatData;

    public CelluloseBoatEntity(EntityType<? extends BoatEntity> entityType, World world, CelluloseBoat boatData) {
        super(entityType, world);
        this.boatData = boatData;
    }

    public CelluloseBoat getBoatData() {
        return boatData;
    }

    @Override
    public Type getVariant() {
        return Type.OAK;
    }

    @Override
    public void setVariant(Type type) {
    }

    @Override
    public Item asItem() {
        return boatData.boat().asItem();
    }

    public static BoatEntity copy(BoatEntity original, CelluloseBoat boatData) {
        var chest = original instanceof ChestBoatEntity;
        var boat = boatData.factory(chest).create(boatData.entityType(chest), original.getEntityWorld());
        boat.updatePosition(original.getX(), original.getY(), original.getZ());
        return boat;
    }

    public enum CelluloseBoat implements StringIdentifiable {
        CACTUS("cactus",
                () -> CelluloseBlocks.CACTUS_BUNDLE,
                () -> CelluloseItems.CACTUS_BOAT,
                () -> CelluloseItems.CACTUS_CHEST_BOAT,
                () -> CelluloseEntity.CACTUS_BOAT,
                () -> CelluloseEntity.CACTUS_CHEST_BOAT
        );

        private final String name;
        private final Supplier<ItemConvertible> planks;
        private final Supplier<ItemConvertible> boat;
        private final Supplier<ItemConvertible> chestBoat;
        private final Supplier<EntityType<BoatEntity>> entityType;
        private final Supplier<EntityType<BoatEntity>> chestEntityType;
        public static final StringIdentifiable.Codec <CelluloseBoat> CODEC = StringIdentifiable.createCodec(CelluloseBoatEntity.CelluloseBoat::values);

        CelluloseBoat(
                String name,
                Supplier<ItemConvertible> planks,
                Supplier<ItemConvertible> boat,
                Supplier<ItemConvertible> chestBoat,
                Supplier<EntityType<BoatEntity>> entityType,
                Supplier<EntityType<BoatEntity>> chestEntityType
        ) {
            this.name = name;
            this.planks = planks;
            this.boat = boat;
            this.chestBoat = chestBoat;
            this.entityType = entityType;
            this.chestEntityType = chestEntityType;
        }

        public ItemConvertible planks() {
            return planks.get();
        }

        public ItemConvertible boat() {
            return boat.get();
        }

        public ItemConvertible chestBoat() {
            return chestBoat.get();
        }

        public EntityType<BoatEntity> entityType(boolean chest) {
            return chest ? chestEntityType.get() : entityType.get();
        }
        public static CelluloseBoat getType(String name) {
            return CODEC.byId(name, CACTUS);
        }

        public EntityType.EntityFactory<BoatEntity> factory(boolean chest) {
            return (type, world) -> chest
                    ? new CelluloseChestBoatEntity(type, world, this)
                    : new CelluloseBoatEntity(type, world, this);
        }

        public Identifier id() {
            return new Identifier(Cellulose.MOD_ID, name);
        }

        @Override public String asString() {
            return name;
        }
    }

}

