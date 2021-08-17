package net.tarksmods.ricemod;

import net.fabricmc.api.ModInitializer;
import net.tarksmods.ricemod.utils.ModItems;


public class RiceMod implements ModInitializer {

    public static final String MOD_ID = "ricemod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();


    }
}
