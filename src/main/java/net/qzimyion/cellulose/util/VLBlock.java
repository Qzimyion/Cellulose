package net.qzimyion.cellulose.util;

import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.Direction;

public enum VLBlock implements StringIdentifiable {
    X("x_axis"),
    Z("z_axis");

    public final String name;

    VLBlock(String name){
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }

    public static VLBlock getInstance(Direction.Axis axis){
        return axis == Direction.Axis.X ? VLBlock.X : VLBlock.Z;
    }
}
