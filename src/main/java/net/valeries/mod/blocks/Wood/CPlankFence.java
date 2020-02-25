package net.valeries.mod.blocks.Wood;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.valeries.mod.val;

public class CPlankFence extends FenceBlock {

    public CPlankFence(String name, float hardness, float resistance) {
        super(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES, 0).build());
        Registry.register(Registry.BLOCK, new Identifier(val.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(val.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(val.VALSMOD_BLOCKS)));

    }
}
