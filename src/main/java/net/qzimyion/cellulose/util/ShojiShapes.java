package net.qzimyion.cellulose.util;

import net.minecraft.util.StringRepresentable;

public enum ShojiShapes implements StringRepresentable {
    TOP("top"),
    MIDDLE("middle"),
    BOTTOM("bottom"),
    NONE("none");

    private final String name;
    ShojiShapes(String name) {
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
