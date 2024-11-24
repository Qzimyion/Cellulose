package net.qzimyion.cellulose.util;

import net.minecraft.util.StringRepresentable;

public enum VictorianLilyBlockShape implements StringRepresentable {
    NORTH_EAST("north_east"),
    NORTH_WEST("north_west"),
    SOUTH_EAST("south_east"),
    SOUTH_WEST("south_west");

    private final String name;
    VictorianLilyBlockShape(String name) {
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
