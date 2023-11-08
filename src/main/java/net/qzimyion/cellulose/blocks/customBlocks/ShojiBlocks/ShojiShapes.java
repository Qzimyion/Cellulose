package net.qzimyion.cellulose.blocks.customBlocks.ShojiBlocks;

import net.minecraft.util.StringIdentifiable;

public enum ShojiShapes implements StringIdentifiable {
    TOP("top"),
    MID("mid"),
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
    public String asString() {
        return null;
    }
}
