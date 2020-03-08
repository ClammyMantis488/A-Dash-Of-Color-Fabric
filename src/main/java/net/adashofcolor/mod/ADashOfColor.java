package net.adashofcolor.mod;

import net.adashofcolor.mod.content.CPlank;
import net.adashofcolor.mod.content.CSlimeBlock;
import net.adashofcolor.mod.content.CTorch;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
/*import net.valeries.mod.blocks.Misc.CHopperBlock;*/


public class ADashOfColor implements ModInitializer {

	public static final String MOD_ID = "dashofcolor";
	public static final ItemGroup DASHOFCOLOR_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "dashofcolor_blocks"), () -> new ItemStack(CPlank.BLEACHED_PLANKS));

	@Override
	public void onInitialize() {
		CPlank.init();
		CSlimeBlock.init();
		CTorch.init();
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				CTorch.PINK_TORCH,
				CTorch.PINK_WALL_TORCH);
	/*	CHopperBlock.init();*/

	}
}
