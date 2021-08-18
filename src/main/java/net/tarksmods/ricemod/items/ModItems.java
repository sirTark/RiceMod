package net.tarksmods.ricemod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tarksmods.ricemod.RiceMod;
import net.tarksmods.ricemod.blocks.ModBlocks;

public class ModItems {

    //General Items
    public static final Item RICE_ITEM = new Item(new FabricItemSettings().group(ItemGroup.FOOD));


    // Food Items
    public static final Item RICE_BALL_ITEM = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.RICE_BALL));
    public static final Item SUSHI_ITEM = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SUSHI));

    // Seed Items.
    public static final Item RICE_SEED_ITEM = new AliasedBlockItem(ModBlocks.RICE_CROP_BLOCK, new Item.Settings().group(ItemGroup.FOOD));


    //Item Registration
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"rice_seed_item"), RICE_SEED_ITEM);
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"rice_item"), RICE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"rice_ball_item"), RICE_BALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"sushi_item"), SUSHI_ITEM);
    }
}
