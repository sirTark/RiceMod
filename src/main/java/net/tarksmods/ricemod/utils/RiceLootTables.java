package net.tarksmods.ricemod.utils;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.minecraft.util.Identifier;
import net.tarksmods.ricemod.items.RiceItems;

public class RiceLootTables {

    private static final Identifier CREEPER_LOOT_TABLE_ID = new Identifier("minecraft","entities/creeper");

    public static void modifyLootTables(){
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {

            if(CREEPER_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(BinomialLootNumberProvider.create(1,0.01f))
                        .withEntry(ItemEntry.builder(RiceItems.RICE_SEED_ITEM).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}
