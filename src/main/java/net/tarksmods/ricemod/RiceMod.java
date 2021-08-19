package net.tarksmods.ricemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.tarksmods.ricemod.blocks.RiceBlocks;
import net.tarksmods.ricemod.items.RiceItems;
import net.tarksmods.ricemod.utils.RiceLootTables;


public class RiceMod implements ModInitializer {


    // Mod ID
    public static final String MOD_ID = "ricemod";

    // Creative Item Group
    public static final ItemGroup RICE_ITEM_GROUP = FabricItemGroupBuilder.create(
                        new Identifier(RiceMod.MOD_ID, "rice_item_group"))
                .icon(() -> new ItemStack(Items.BOWL))
                .build();

    @Override
    public void onInitialize() {
        RiceItems.registerItems();
        RiceBlocks.registerBlocks();
        RiceLootTables.modifyLootTables();
    }

}
