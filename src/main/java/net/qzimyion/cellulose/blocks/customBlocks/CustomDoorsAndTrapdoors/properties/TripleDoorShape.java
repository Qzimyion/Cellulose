package net.qzimyion.cellulose.blocks.customBlocks.CustomDoorsAndTrapdoors.properties;

import net.minecraft.util.StringIdentifiable;

public enum TripleDoorShape implements StringIdentifiable {
    UPPER,
    MIDDLE,
    LOWER;

    public String toString() {
        return this.asString();
    }

    @Override
    public String asString() {
        return this == UPPER ? "upper" : this == MIDDLE ? "middle" : "lower";
    }
}
