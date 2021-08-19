package net.tarksmods.ricemod.items;

import net.minecraft.item.FoodComponent;

public class RiceFoodComponents {

    public static final FoodComponent RICE_BALL = (new FoodComponent.Builder().hunger(3).saturationModifier(.6f).build());
    public static final FoodComponent SUSHI = (new FoodComponent.Builder().hunger(8).saturationModifier(1.6f).build());
}
