package net.adashofcolor.mod.blocks.Wood;

import net.adashofcolor.mod.ADashOfColor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CPlankPressurePlate extends PressurePlateBlock {

    public CPlankPressurePlate(String name, float hardness, float resistance, ActivationRule type) {
        super(ActivationRule.EVERYTHING, Block.Settings.copy(Blocks.OAK_PRESSURE_PLATE));
        /*super(type, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES, 0).build());*/
        Registry.register(Registry.BLOCK, new Identifier(ADashOfColor.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(ADashOfColor.DASHOFCOLOR_BLOCKS)));

    }
}
