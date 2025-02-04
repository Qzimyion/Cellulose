package net.qzimyion.cellulose.util;

import net.minecraft.util.StringRepresentable;

public enum OmegaLilyBlockShape implements StringRepresentable {
    NORTH_WEST("north_west"),
    NORTH("north"),
    NORTH_EAST("north_east"),
    WEST("west"),
    CENTER("center"),
    EAST("east"),
    SOUTH_WEST("south_west"),
    SOUTH("south"),
    SOUTH_EAST("south_east");


    private final String name;
    OmegaLilyBlockShape(String name) {
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
