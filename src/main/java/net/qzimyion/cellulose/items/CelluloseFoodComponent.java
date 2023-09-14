package net.qzimyion.cellulose.items;

import net.minecraft.item.FoodComponent;

public class CelluloseFoodComponent {
    public static final FoodComponent POPPED_OAK_ACORN = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.3f).snack().build();
     public static final FoodComponent POPACRON_BOWL = new FoodComponent.Builder()
            .hunger(3).saturationModifier(1.5f).snack().build();
}
