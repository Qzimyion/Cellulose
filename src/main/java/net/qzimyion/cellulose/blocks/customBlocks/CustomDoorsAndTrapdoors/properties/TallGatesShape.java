package net.qzimyion.cellulose.blocks.customBlocks.CustomDoorsAndTrapdoors.properties;

import net.minecraft.util.StringIdentifiable;

public enum TallGatesShape implements StringIdentifiable {
    WEST_UPPER("west_upper"),
    WEST_MIDDLE("west_middle"),
    WEST_LOWER("west_lower"),
    EAST_UPPER("east_upper"),
    EAST_MIDDLE("east_middle"),
    EAST_LOWER("east_lower");

    private final String name;

    TallGatesShape(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
