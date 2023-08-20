package net.qzimyion.cellulose.client;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.ChestBoatEntityModel;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import net.qzimyion.cellulose.entities.CelluloseBoatEntity;

import java.util.Map;

public final class CelluloseBoatEntityRenderer extends BoatEntityRenderer {
    public Map<BoatEntity.Type, Pair<Identifier, CompositeEntityModel<BoatEntity>>> texturesAndModels;
    public CelluloseBoatEntityRenderer(EntityRendererFactory.Context context, boolean chest, CelluloseBoatEntity.CelluloseBoat boatData) {
        super(context, chest);
        var id = boatData.id();
        var texture = new Identifier(id.getNamespace(), "textures/entity/" + (chest ? "chest_boat/" : "boat/") + id.getPath() + ".png");
        var rootPart = context.getPart(getModelLayer(boatData, chest));
        var model = chest ? new ChestBoatEntityModel(rootPart) : new BoatEntityModel(rootPart);
        texturesAndModels = texturesAndModels.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, entry -> Pair.of(texture, model)));
    }

    public static EntityModelLayer getModelLayer(CelluloseBoatEntity.CelluloseBoat boat, boolean chest) {
        var id = boat.id();
        return new EntityModelLayer(new Identifier(id.getNamespace(), (chest ? "chest_boat/" : "boat/") + id.getPath()), "main");
    }
}