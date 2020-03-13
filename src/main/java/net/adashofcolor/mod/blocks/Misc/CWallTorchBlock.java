package net.adashofcolor.mod.blocks.Misc;

import net.adashofcolor.mod.ADashOfColor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CWallTorchBlock extends WallTorchBlock {
    public CWallTorchBlock(String name) {
        super(Block.Settings.copy(Blocks.WALL_TORCH));
        Registry.register(Registry.BLOCK, new Identifier(ADashOfColor.MOD_ID, name), this);
    }
}
