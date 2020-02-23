package net.valeries.mod.content;

        import net.valeries.mod.blocks.Wood.CPlankBlock;

public class CPlank {

    public static CPlankBlock WHITE_PLANKS;

    public static void init() {

        WHITE_PLANKS = new CPlankBlock("white_wood", 1.5f, 6.0f);
    }
}