package net.qzimyion.cellulose.util;

import net.minecraft.util.StringRepresentable;

public enum ThreeByThreeShapeEnum implements StringRepresentable {
    SOUTH_WEST("south_west"),
    SOUTH("south"),
    SOUTH_EAST("south_east"),
    WEST("west"),
    CENTER("center"),
    EAST("east"),
    NORTH_WEST("north_west"),
    NORTH("north"),
    NORTH_EAST("north_east");


    private final String name;
    ThreeByThreeShapeEnum(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}
