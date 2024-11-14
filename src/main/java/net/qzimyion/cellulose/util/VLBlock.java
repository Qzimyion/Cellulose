package net.qzimyion.cellulose.util;

import net.minecraft.util.StringIdentifiable;

public enum VLBlock implements StringIdentifiable {
    N_EAST("n_east"),
    N_WEST("n_west"),
    S_EAST("s_east"),
    S_WEST("s_west");

    private final String name;
    VLBlock(String name) {
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
