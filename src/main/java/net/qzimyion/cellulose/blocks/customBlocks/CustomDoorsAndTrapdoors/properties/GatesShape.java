package net.qzimyion.cellulose.blocks.customBlocks.CustomDoorsAndTrapdoors.properties;

import net.minecraft.util.StringIdentifiable;

public enum GatesShape implements StringIdentifiable {
    WEST_UPPER,
    WEST_LOWER,
    EAST_UPPER,
    EAST_LOWER,
    ;

    public String toString() {
        return this.asString();
    }


    @Override
    public String asString() {
        return this == WEST_UPPER ? "west_upper" : this == WEST_LOWER ? "west_lower" : this == EAST_UPPER ? "east_upper" : "east_lower";
    }
}
