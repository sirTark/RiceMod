package net.tarksmods.ricemod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tarksmods.ricemod.RiceMod;

public class ModBlocks {

    public static final RiceCropBlock RICE_CROP_BLOCK = new RiceCropBlock(AbstractBlock.Settings
            .of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(RiceMod.MOD_ID,"rice_crop_block"), RICE_CROP_BLOCK);
    }

}
