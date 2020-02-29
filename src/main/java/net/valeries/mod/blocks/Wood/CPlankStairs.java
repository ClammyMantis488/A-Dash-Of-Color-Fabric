package net.valeries.mod.blocks.Wood;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.valeries.mod.val;

public class CPlankStairs extends StairsBlock {

    public CPlankStairs(Block block, String name, float hardness, float resistance) {
        super(block.getDefaultState(), Block.Settings.copy(Blocks.OAK_STAIRS));
        /*super(state, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES, 0).build());*/
        Registry.register(Registry.BLOCK, new Identifier(val.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(val.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(val.VALSMOD_BLOCKS)));
    }
}