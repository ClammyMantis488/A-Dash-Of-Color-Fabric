package net.adashofcolor.mod.blocks.Misc;

import net.adashofcolor.mod.ADashOfColor;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CTorchBlock extends TorchBlock {
    public CTorchBlock(String name) {
        super(FabricBlockSettings.copy(Blocks.TORCH).nonOpaque().build());
        Registry.register(Registry.BLOCK, new Identifier(ADashOfColor.MOD_ID, name), this);
    }
}
