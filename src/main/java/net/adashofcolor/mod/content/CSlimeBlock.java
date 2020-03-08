package net.adashofcolor.mod.content;

import net.adashofcolor.mod.blocks.Misc.CSlimeBlockBlock;

public class CSlimeBlock {

    public static CSlimeBlockBlock BLEACHED_SLIME_BLOCK;
    public static CSlimeBlockBlock PINK_SLIME_BLOCK;
    public static CSlimeBlockBlock BLUE_SLIME_BLOCK;

    public static void init() {
        BLEACHED_SLIME_BLOCK = new CSlimeBlockBlock("bleached_slime_block", 2.0f, 15.0f);
        PINK_SLIME_BLOCK = new CSlimeBlockBlock("pink_slime_block", 2.0f, 15.0f);
        BLUE_SLIME_BLOCK = new CSlimeBlockBlock("blue_slime_block", 2.0f, 15.0f);
    }
}
