package net.valeries.mod;

import net.fabricmc.api.ModInitializer;
import net.valeries.mod.content.CPlank;


public class val implements ModInitializer {

	public static final String MOD_ID = "val";

	@Override
	public void onInitialize() {
		CPlank.init();
	}
}
