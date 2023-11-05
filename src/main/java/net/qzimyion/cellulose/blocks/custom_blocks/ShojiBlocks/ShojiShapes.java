package net.qzimyion.cellulose.blocks.custom_blocks.ShojiBlocks;

import net.minecraft.util.StringIdentifiable;

public enum ShojiShapes implements StringIdentifiable {
    BOTTOM("bottom"),
    MID("mid"),
    TOP("top");
    /*
    INNER_LEFT_BOTTOM("inner_left_bottom"),
    INNER_RIGHT_BOTTOM("inner_right_bottom"),
    OUTER_LEFT_BOTTOM("outer_left_bottom"),
    OUTER_RIGHT_BOTTOM("outer_right_bottom"),
    INNER_LEFT_TOP("inner_left_top"),
    INNER_RIGHT_TOP("inner_right_top"),
    OUTER_LEFT_TOP("outer_left_top"),
    OUTER_RIGHT_TOP("outer_right_top");

     */


    private final String name;

    private ShojiShapes(String name){
        this.name = name;
    }

    public String toString() {
        return this.asString();
    }

    @Override
    public String asString() {
        return name;
    }
}
