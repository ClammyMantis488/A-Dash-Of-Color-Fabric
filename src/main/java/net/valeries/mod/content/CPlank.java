package net.valeries.mod.content;

        import net.valeries.mod.blocks.Wood.CPlankBlock;
        import net.valeries.mod.blocks.Wood.CPlankStairs;

public class CPlank {

    public static CPlankBlock BLEACHED_PLANKS;
    public static CPlankBlock BLUE_PLANKS;
    public static CPlankBlock BROWN_PLANKS;
    public static CPlankBlock CYAN_PLANKS;
    public static CPlankBlock GRAY_PLANKS;
    public static CPlankBlock GREEN_PLANKS;
    public static CPlankBlock LIGHT_BLUE_PLANKS;
    public static CPlankBlock LIGHT_GRAY_PLANKS;
    public static CPlankBlock LIME_PLANKS;
    public static CPlankBlock MAGENTA_PLANKS;
    public static CPlankBlock ORANGE_PLANKS;
    public static CPlankBlock PINK_PLANKS;
    public static CPlankBlock PURPLE_PLANKS;
    public static CPlankBlock RED_PLANKS;
    public static CPlankBlock WHITE_PLANKS;
    public static CPlankBlock YELLOW_PLANKS;

    public static CPlankStairs BLEACHED_PLANK_STAIRS;
    public static CPlankStairs BLUE_PLANK_STAIRS;
    public static CPlankStairs BROWN_PLANK_STAIRS;
    public static CPlankStairs CYAN_PLANK_STAIRS;
    public static CPlankStairs GRAY_PLANK_STAIRS;
    public static CPlankStairs GREEN_PLANK_STAIRS;
    public static CPlankStairs LIGHT_BLUE_PLANK_STAIRS;
    public static CPlankStairs LIGHT_GRAY_PLANK_STAIRS;
    public static CPlankStairs LIME_PLANK_STAIRS;
    public static CPlankStairs MAGENTA_PLANK_STAIRS;
    public static CPlankStairs ORANGE_PLANK_STAIRS;
    public static CPlankStairs PINK_PLANK_STAIRS;
    public static CPlankStairs PURPLE_PLANK_STAIRS;
    public static CPlankStairs RED_PLANK_STAIRS;
    public static CPlankStairs WHITE_PLANK_STAIRS;
    public static CPlankStairs YELLOW_PLANK_STAIRS;

    public static void init() {

        BLEACHED_PLANKS = new CPlankBlock("bleached_planks", 2.0f, 15.0f);
        BLUE_PLANKS = new CPlankBlock("blue_planks", 2.0f, 15.0f);
        BROWN_PLANKS = new CPlankBlock("brown_planks", 2.0f, 15.0f);
        CYAN_PLANKS = new CPlankBlock("cyan_planks", 2.0f, 15.0f);
        GRAY_PLANKS = new CPlankBlock("gray_planks", 2.0f, 15.0f);
        GREEN_PLANKS = new CPlankBlock("green_planks", 2.0f, 15.0f);
        LIGHT_BLUE_PLANKS = new CPlankBlock("light_blue_planks", 2.0f, 15.0f);
        LIGHT_GRAY_PLANKS = new CPlankBlock("light_gray_planks", 2.0f, 15.0f);
        LIME_PLANKS = new CPlankBlock("lime_planks", 2.0f, 15.0f);
        MAGENTA_PLANKS = new CPlankBlock("magenta_planks", 2.0f, 15.0f);
        ORANGE_PLANKS = new CPlankBlock("orange_planks", 2.0f, 15.0f);
        PINK_PLANKS = new CPlankBlock("pink_planks", 2.0f, 15.0f);
        PURPLE_PLANKS = new CPlankBlock("purple_planks", 2.0f, 15.0f);
        RED_PLANKS = new CPlankBlock("red_planks", 2.0f, 15.0f);
        WHITE_PLANKS = new CPlankBlock("white_planks", 2.0f, 15.0f);
        YELLOW_PLANKS = new CPlankBlock("yellow_planks", 2.0f, 15.0f);

        BLEACHED_PLANK_STAIRS = new CPlankStairs(BLEACHED_PLANKS.getDefaultState(), "bleached_plank_stairs", 2.0f, 15.0f);
        BLUE_PLANK_STAIRS = new CPlankStairs(BLUE_PLANKS.getDefaultState(),"blue_plank_stairs", 2.0f, 15.0f);
        BROWN_PLANK_STAIRS = new CPlankStairs(BROWN_PLANKS.getDefaultState(),"brown_plank_stairs", 2.0f, 15.0f);
        CYAN_PLANK_STAIRS = new CPlankStairs(CYAN_PLANKS.getDefaultState(),"cyan_plank_stairs", 2.0f, 15.0f);
        GRAY_PLANK_STAIRS = new CPlankStairs(GRAY_PLANKS.getDefaultState(),"gray_plank_stairs", 2.0f, 15.0f);
        GREEN_PLANK_STAIRS = new CPlankStairs(GREEN_PLANKS.getDefaultState(),"green_plank_stairs", 2.0f, 15.0f);
        LIGHT_BLUE_PLANK_STAIRS = new CPlankStairs(LIGHT_BLUE_PLANKS.getDefaultState(),"light_blue_plank_stairs", 2.0f, 15.0f);
        LIGHT_GRAY_PLANK_STAIRS = new CPlankStairs(LIGHT_GRAY_PLANKS.getDefaultState(),"light_gray_plank_stairs", 2.0f, 15.0f);
        LIME_PLANK_STAIRS = new CPlankStairs(LIME_PLANKS.getDefaultState(),"lime_plank_stairs", 2.0f, 15.0f);
        MAGENTA_PLANK_STAIRS = new CPlankStairs(MAGENTA_PLANKS.getDefaultState(),"magenta_plank_stairs", 2.0f, 15.0f);
        ORANGE_PLANK_STAIRS = new CPlankStairs(ORANGE_PLANKS.getDefaultState(),"orange_plank_stairs", 2.0f, 15.0f);
        PINK_PLANK_STAIRS = new CPlankStairs(PINK_PLANKS.getDefaultState(),"pink_plank_stairs", 2.0f, 15.0f);
        PURPLE_PLANK_STAIRS = new CPlankStairs(PURPLE_PLANKS.getDefaultState(),"purple_plank_stairs", 2.0f, 15.0f);
        RED_PLANK_STAIRS = new CPlankStairs(RED_PLANKS.getDefaultState(),"red_plank_stairs", 2.0f, 15.0f);
        WHITE_PLANK_STAIRS = new CPlankStairs(WHITE_PLANKS.getDefaultState(),"white_plank_stairs", 2.0f, 15.0f);
        YELLOW_PLANK_STAIRS = new CPlankStairs(YELLOW_PLANKS.getDefaultState(),"yellow_plank_stairs", 2.0f, 15.0f);


    }
}