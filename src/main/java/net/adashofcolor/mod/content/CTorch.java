package net.adashofcolor.mod.content;

import net.adashofcolor.mod.blocks.Misc.CTorchBlock;
import net.adashofcolor.mod.blocks.Misc.CWallTorchBlock;
import net.adashofcolor.mod.items.Misc.CTorchItem;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;


public class CTorch {

    public static CTorchBlock PINK_TORCH;
    public static CWallTorchBlock PINK_WALL_TORCH;
    public static CTorchItem PINK_TORCH_ITEM;

    public static void init() {
        PINK_TORCH = new CTorchBlock("pink_torch");
        PINK_WALL_TORCH = new CWallTorchBlock("pink_wall_torch");
        PINK_TORCH_ITEM = new CTorchItem("pink_torch_item");
    }
}
