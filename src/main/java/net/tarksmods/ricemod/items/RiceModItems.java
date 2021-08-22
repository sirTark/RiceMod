package net.tarksmods.ricemod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tarksmods.ricemod.RiceMod;
import net.tarksmods.ricemod.blocks.RiceModBlocks;

public class RiceModItems {

    //General Items
    public static final Item RICE_ITEM = new Item(new FabricItemSettings().group(RiceMod.RICE_ITEM_GROUP));

    // Food Items
    public static final Item RICE_BALL_ITEM = new Item(new FabricItemSettings().group(RiceMod.RICE_ITEM_GROUP).food(RiceModFoodComponents.RICE_BALL));
    public static final Item SUSHI_ITEM = new Item(new FabricItemSettings().group(RiceMod.RICE_ITEM_GROUP).food(RiceModFoodComponents.SUSHI));
    public static final Item SUSHI_BALL = new Item(new FabricItemSettings().group(RiceMod.RICE_ITEM_GROUP).food(RiceModFoodComponents.SUSHI_BALL));


    // Seed Items.
    public static final Item RICE_SEED_ITEM = new AliasedBlockItem(RiceModBlocks.RICE_CROP_BLOCK, new Item.Settings().group(RiceMod.RICE_ITEM_GROUP));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Item Registration
    public static void registerItems(){

        //General Items
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"rice_item"), RICE_ITEM);

        //Food Items
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"rice_ball_item"), RICE_BALL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"sushi_item"), SUSHI_ITEM);
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"sushi_ball"), SUSHI_BALL);

        //Seed Items
        Registry.register(Registry.ITEM, new Identifier(RiceMod.MOD_ID,"rice_seed_item"), RICE_SEED_ITEM);


    }
}
