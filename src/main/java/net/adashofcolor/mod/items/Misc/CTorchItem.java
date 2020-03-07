package net.adashofcolor.mod.items.Misc;

import net.adashofcolor.mod.ADashOfColor;
import net.adashofcolor.mod.blocks.Misc.CTorchBlock;
import net.adashofcolor.mod.content.CTorch;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CTorchItem {
    public CTorchItem(String name) {
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.PINK_TORCH, CTorch.PINK_WALL_TORCH, new Item.Settings().maxCount(64).group(ADashOfColor.DASHOFCOLOR_BLOCKS)));
    }
}
