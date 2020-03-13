package net.adashofcolor.mod;

import net.adashofcolor.mod.content.CMisc;
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


public class ADashOfColor implements ModInitializer {

	public static final String MOD_ID = "dashofcolor";
	public static final ItemGroup DASHOFCOLOR_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "dashofcolor_blocks"), () -> new ItemStack(CPlank.BLEACHED_PLANKS));

	@Override
	public void onInitialize() {
		CPlank.init();
		CSlimeBlock.init();
		CTorch.init();
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				CTorch.BLEACHED_TORCH,
				CTorch.BLEACHED_WALL_TORCH,
				CTorch.BLACK_TORCH,
				CTorch.BLACK_WALL_TORCH,
				CTorch.BLUE_TORCH,
				CTorch.BLUE_WALL_TORCH,
				CTorch.BROWN_TORCH,
				CTorch.BROWN_WALL_TORCH,
				CTorch.CYAN_TORCH,
				CTorch.CYAN_WALL_TORCH,
				CTorch.GRAY_TORCH,
				CTorch.GRAY_WALL_TORCH,
				CTorch.GREEN_TORCH,
				CTorch.GREEN_WALL_TORCH,
				CTorch.LIGHT_BLUE_TORCH,
				CTorch.LIGHT_BLUE_WALL_TORCH,
				CTorch.LIGHT_GRAY_TORCH,
				CTorch.LIGHT_GRAY_WALL_TORCH,
				CTorch.LIME_TORCH,
				CTorch.LIME_WALL_TORCH,
				CTorch.MAGENTA_TORCH,
				CTorch.MAGENTA_WALL_TORCH,
				CTorch.ORANGE_TORCH,
				CTorch.ORANGE_WALL_TORCH,
				CTorch.PINK_TORCH,
				CTorch.PINK_WALL_TORCH,
				CTorch.PURPLE_TORCH,
				CTorch.PURPLE_WALL_TORCH,
				CTorch.RED_TORCH,
				CTorch.RED_WALL_TORCH,
				CTorch.WHITE_TORCH,
				CTorch.WHITE_WALL_TORCH,
				CTorch.YELLOW_TORCH,
				CTorch.YELLOW_WALL_TORCH);
		CMisc.init();
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				CMisc.BLEACHED_LANTERN,
				CMisc.BLACK_LANTERN,
				CMisc.BLUE_LANTERN,
				CMisc.BROWN_LANTERN,
				CMisc.CYAN_LANTERN,
				CMisc.GRAY_LANTERN,
				CMisc.GREEN_LANTERN,
				CMisc.LIGHT_BLUE_LANTERN,
				CMisc.LIGHT_GRAY_LANTERN,
				CMisc.LIME_LANTERN,
				CMisc.MAGENTA_LANTERN,
				CMisc.ORANGE_LANTERN,
				CMisc.PINK_LANTERN,
				CMisc.PURPLE_LANTERN,
				CMisc.RED_LANTERN,
				CMisc.WHITE_LANTERN,
				CMisc.YELLOW_LANTERN);
	}
}
