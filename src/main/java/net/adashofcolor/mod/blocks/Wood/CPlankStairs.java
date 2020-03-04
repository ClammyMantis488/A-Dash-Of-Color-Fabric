package net.adashofcolor.mod.blocks.Wood;

import net.adashofcolor.mod.ADashOfColor;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CPlankStairs extends StairsBlock {

    public CPlankStairs(Block block, String name, float hardness, float resistance) {
        super(block.getDefaultState(), Block.Settings.copy(Blocks.OAK_STAIRS));
        /*super(state, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES, 0).build());*/
        Registry.register(Registry.BLOCK, new Identifier(ADashOfColor.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(ADashOfColor.DASHOFCOLOR_BLOCKS)));
    }
}