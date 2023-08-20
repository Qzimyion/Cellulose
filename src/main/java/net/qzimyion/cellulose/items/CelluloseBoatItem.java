package net.qzimyion.cellulose.items;

import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.qzimyion.cellulose.entities.CelluloseBoatEntity;

public class CelluloseBoatItem extends BoatItem {
    private final CelluloseBoatEntity.CelluloseBoat boatData;
    private final boolean chest;
    public CelluloseBoatItem(boolean chest, BoatEntity.Type type, Settings settings, CelluloseBoatEntity.CelluloseBoat boatData) {
        super(chest, BoatEntity.Type.OAK, settings);
        this.chest = chest;
        this.boatData = boatData;
    }
    public BoatEntity createEntity(World world, HitResult hitResult) {
        var entity = boatData.factory(chest).create(boatData.entityType(chest), world);
        entity.updatePosition(hitResult.getPos().x, hitResult.getPos().y, hitResult.getPos().z);
        return entity;
    }
}
