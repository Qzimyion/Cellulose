package net.qzimyion.cellulose.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class CelluloseChestBoatEntity extends ChestBoatEntity implements CelluloseBoatEntityWithData {
    private final CelluloseBoatEntity.CelluloseBoat boatData;
    public CelluloseChestBoatEntity(EntityType<? extends BoatEntity> entityType, World world, CelluloseBoatEntity.CelluloseBoat boatData) {
        super(entityType, world);
        this.boatData = boatData;
    }

    @Override
    public CelluloseBoatEntity.CelluloseBoat getBoatdata() {
        return null;
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
        return boatData.chestBoat().asItem();
    }
}
