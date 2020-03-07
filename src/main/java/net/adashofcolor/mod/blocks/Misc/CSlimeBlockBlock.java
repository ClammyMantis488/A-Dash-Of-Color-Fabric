package net.adashofcolor.mod.blocks.Misc;

import net.adashofcolor.mod.ADashOfColor;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlimeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CSlimeBlockBlock extends SlimeBlock {

    public CSlimeBlockBlock(String name, float hardness, float resistance) {
        super(FabricBlockSettings.copy(Blocks.SLIME_BLOCK).build()); 
        Registry.register(Registry.BLOCK, new Identifier(ADashOfColor.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(ADashOfColor.DASHOFCOLOR_BLOCKS)));

    }
}
