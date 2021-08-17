package net.tarksmods.ricemod.utils;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent RICE_BALL = (new FoodComponent.Builder().hunger(1).saturationModifier(.6f).build());
    public static final FoodComponent SUSHI = (new FoodComponent.Builder().hunger(2).saturationModifier(2.0f).build());
}
