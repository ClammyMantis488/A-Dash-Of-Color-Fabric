package net.adashofcolor.mod.blocks.Misc;

import net.adashofcolor.mod.ADashOfColor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CSandBlock extends FallingBlock {
    public CSandBlock(String name, float hardness, float resistance) {
        super(Block.Settings.copy(Blocks.SAND));
        Registry.register(Registry.BLOCK, new Identifier(ADashOfColor.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(ADashOfColor.DASHOFCOLOR_BLOCKS)));
    }
}
