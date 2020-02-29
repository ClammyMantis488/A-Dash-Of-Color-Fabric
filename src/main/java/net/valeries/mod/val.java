package net.valeries.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
/*import net.valeries.mod.blocks.Misc.CHopperBlock;*/
import net.valeries.mod.content.CPlank;


public class val implements ModInitializer {

	public static final String MOD_ID = "val";
	public static final ItemGroup VALSMOD_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "valsmod_blocks"), () -> new ItemStack(CPlank.BLEACHED_PLANKS));

	@Override
	public void onInitialize() {
		CPlank.init();
	/*	CHopperBlock.init();*/

	}
}
