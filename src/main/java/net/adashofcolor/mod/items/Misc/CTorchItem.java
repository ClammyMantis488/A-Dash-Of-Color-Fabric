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
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.BLEACHED_TORCH, CTorch.BLEACHED_WALL_TORCH,  new Item.Settings().maxCount(64).group(ADashOfColor.DASHOFCOLOR_BLOCKS)));
        /*Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.BLACK_TORCH, CTorch.BLACK_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.BLUE_TORCH, CTorch.BLUE_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.BROWN_TORCH, CTorch.BROWN_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.CYAN_TORCH, CTorch.CYAN_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.GRAY_TORCH, CTorch.GRAY_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.GREEN_TORCH, CTorch.GREEN_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.LIGHT_BLUE_TORCH, CTorch.LIGHT_BLUE_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.LIGHT_GRAY_TORCH, CTorch.LIGHT_GRAY_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.LIME_TORCH, CTorch.LIME_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.MAGENTA_TORCH, CTorch.MAGENTA_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.ORANGE_TORCH, CTorch.ORANGE_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.PINK_TORCH, CTorch.PINK_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.PURPLE_TORCH, CTorch.PURPLE_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.RED_TORCH, CTorch.RED_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.WHITE_TORCH, CTorch.WHITE_WALL_TORCH, new Item.Settings().maxCount(64)));
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new WallStandingBlockItem(CTorch.YELLOW_TORCH, CTorch.YELLOW_WALL_TORCH, new Item.Settings().maxCount(64)));*/
    }
}
