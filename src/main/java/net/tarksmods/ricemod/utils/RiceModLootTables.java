package net.tarksmods.ricemod.utils;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.minecraft.util.Identifier;
import net.tarksmods.ricemod.items.RiceModItems;

public class RiceModLootTables {

    private static final Identifier GRASS_LOOT_TABLE_ID = new Identifier("minecraft","blocks/grass");

    public static void modifyLootTables(){
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {

            if(GRASS_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootNumberProvider.create(1,0.10f))
                        .withEntry(ItemEntry.builder(RiceModItems.RICE_SEED_ITEM).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}
