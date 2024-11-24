package net.qzimyion.cellulose.util;

import net.minecraft.util.StringRepresentable;

public enum OmegaLilyBlockShape implements StringRepresentable {
    CENTER("center"),
    NORTH("north"),
    SOUTH("south"),
    EAST("east"),
    WEST("west"),
    NORTH_EAST("north_east"),
    NORTH_WEST("north_west"),
    SOUTH_EAST("south_east"),
    SOUTH_WEST("south_west");

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
