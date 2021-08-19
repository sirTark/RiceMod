package net.tarksmods.ricemod;

import net.fabricmc.api.ModInitializer;
import net.tarksmods.ricemod.blocks.RiceBlocks;
import net.tarksmods.ricemod.items.RiceItems;
import net.tarksmods.ricemod.utils.RiceLootTables;
public class RiceMod implements ModInitializer {


    // Mod ID
    public static final String MOD_ID = "ricemod";

    @Override
    public void onInitialize() {
        RiceItems.registerItems();
        RiceBlocks.registerBlocks();
        RiceLootTables.modifyLootTables();
    }

}
