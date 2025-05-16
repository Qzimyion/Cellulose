package net.qzimyion.cellulose.util;

import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.state.properties.EnumProperty;

import java.util.Optional;

public enum SnowEnum implements StringRepresentable {
    NONE, LOW, MEDIUM, HIGH, FULL;

    public static final EnumProperty<SnowEnum> SNOWINESS = EnumProperty.create("snowiness", SnowEnum.class);

    @Override
    public String getSerializedName() {
        return this.name().toLowerCase();
    }

    public SnowEnum increase() {
        return this.ordinal() < values().length - 1 ? values()[this.ordinal() + 1] : this;
    }

    public SnowEnum decrease() {
        return this.ordinal() > 0 ? values()[this.ordinal() - 1] : this;
    }
}
