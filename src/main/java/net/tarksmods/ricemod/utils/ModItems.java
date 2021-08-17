package net.tarksmods.ricemod.utils;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tarksmods.ricemod.RiceMod;

public class ModItems {

    public static final Item RICE_ITEM = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
    public static final Item RICEBALL_ITEM = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.RICE_BALL));
    public static final Item SUSHI_ITEM = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SUSHI));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"rice_item"), RICE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"riceball_item"), RICEBALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"sushi_item"), SUSHI_ITEM);
    }
}
