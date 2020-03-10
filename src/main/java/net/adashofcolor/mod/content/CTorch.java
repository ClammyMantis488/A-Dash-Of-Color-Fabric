package net.adashofcolor.mod.content;

import net.adashofcolor.mod.ADashOfColor;
import net.adashofcolor.mod.blocks.Misc.CTorchBlock;
import net.adashofcolor.mod.blocks.Misc.CWallTorchBlock;
import net.adashofcolor.mod.items.Misc.CTorchItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;


public class CTorch {

    public static CTorchBlock BLEACHED_TORCH;
    public static CTorchBlock BLACK_TORCH;
    public static CTorchBlock BLUE_TORCH;
    public static CTorchBlock BROWN_TORCH;
    public static CTorchBlock CYAN_TORCH;
    public static CTorchBlock GRAY_TORCH;
    public static CTorchBlock GREEN_TORCH;
    public static CTorchBlock LIGHT_BLUE_TORCH;
    public static CTorchBlock LIGHT_GRAY_TORCH;
    public static CTorchBlock LIME_TORCH;
    public static CTorchBlock MAGENTA_TORCH;
    public static CTorchBlock ORANGE_TORCH;
    public static CTorchBlock PINK_TORCH;
    public static CTorchBlock PURPLE_TORCH;
    public static CTorchBlock RED_TORCH;
    public static CTorchBlock WHITE_TORCH;
    public static CTorchBlock YELLOW_TORCH;

    public static CWallTorchBlock BLEACHED_WALL_TORCH;
    public static CWallTorchBlock BLACK_WALL_TORCH;
    public static CWallTorchBlock BLUE_WALL_TORCH;
    public static CWallTorchBlock BROWN_WALL_TORCH;
    public static CWallTorchBlock CYAN_WALL_TORCH;
    public static CWallTorchBlock GRAY_WALL_TORCH;
    public static CWallTorchBlock GREEN_WALL_TORCH;
    public static CWallTorchBlock LIGHT_BLUE_WALL_TORCH;
    public static CWallTorchBlock LIGHT_GRAY_WALL_TORCH;
    public static CWallTorchBlock LIME_WALL_TORCH;
    public static CWallTorchBlock MAGENTA_WALL_TORCH;
    public static CWallTorchBlock ORANGE_WALL_TORCH;
    public static CWallTorchBlock PINK_WALL_TORCH;
    public static CWallTorchBlock PURPLE_WALL_TORCH;
    public static CWallTorchBlock RED_WALL_TORCH;
    public static CWallTorchBlock WHITE_WALL_TORCH;
    public static CWallTorchBlock YELLOW_WALL_TORCH;

    public static CTorchItem BLEACHED_TORCH_ITEM;
    public static CTorchItem BLACK_TORCH_ITEM;
    public static CTorchItem BLUE_TORCH_ITEM;
    public static CTorchItem BROWN_TORCH_ITEM;
    public static CTorchItem CYAN_TORCH_ITEM;
    public static CTorchItem GRAY_TORCH_ITEM;
    public static CTorchItem GREEN_TORCH_ITEM;
    public static CTorchItem LIGHT_BLUE_TORCH_ITEM;
    public static CTorchItem LIGHT_GRAY_TORCH_ITEM;
    public static CTorchItem LIME_TORCH_ITEM;
    public static CTorchItem MAGENTA_TORCH_ITEM;
    public static CTorchItem ORANGE_TORCH_ITEM;
    public static CTorchItem PINK_TORCH_ITEM;
    public static CTorchItem PURPLE_TORCH_ITEM;
    public static CTorchItem RED_TORCH_ITEM;
    public static CTorchItem WHITE_TORCH_ITEM;
    public static CTorchItem YELLOW_TORCH_ITEM;

    public static void init() {

        BLEACHED_TORCH = new CTorchBlock("bleached_torch_block");
        BLACK_TORCH = new CTorchBlock("black_torch_block");
        BLUE_TORCH = new CTorchBlock("blue_torch_block");
        BROWN_TORCH = new CTorchBlock("brown_torch_block");
        CYAN_TORCH = new CTorchBlock("cyan_torch_block");
        GRAY_TORCH = new CTorchBlock("gray_torch_block");
        GREEN_TORCH = new CTorchBlock("green_torch_block");
        LIGHT_BLUE_TORCH = new CTorchBlock("light_blue_torch_block");
        LIGHT_GRAY_TORCH = new CTorchBlock("light_gray_torch_block");
        LIME_TORCH = new CTorchBlock("lime_torch_block");
        MAGENTA_TORCH = new CTorchBlock("magenta_torch_block");
        ORANGE_TORCH = new CTorchBlock("orange_torch_block");
        PINK_TORCH = new CTorchBlock("pink_torch_block");
        PURPLE_TORCH = new CTorchBlock("purple_torch_block");
        RED_TORCH = new CTorchBlock("red_torch_block");
        WHITE_TORCH = new CTorchBlock("white_torch_block");
        YELLOW_TORCH = new CTorchBlock("yellow_torch_block");

        BLEACHED_WALL_TORCH = new CWallTorchBlock("bleached_wall_torch");
        BLACK_WALL_TORCH = new CWallTorchBlock("black_wall_torch");
        BLUE_WALL_TORCH = new CWallTorchBlock("blue_wall_torch");
        BROWN_WALL_TORCH = new CWallTorchBlock("brown_wall_torch");
        CYAN_WALL_TORCH = new CWallTorchBlock("cyan_wall_torch");
        GRAY_WALL_TORCH = new CWallTorchBlock("gray_wall_torch");
        GREEN_WALL_TORCH = new CWallTorchBlock("green_wall_torch");
        LIGHT_BLUE_WALL_TORCH = new CWallTorchBlock("light_blue_wall_torch");
        LIGHT_GRAY_WALL_TORCH = new CWallTorchBlock("light_gray_wall_torch");
        LIME_WALL_TORCH = new CWallTorchBlock("lime_wall_torch");
        MAGENTA_WALL_TORCH = new CWallTorchBlock("magenta_wall_torch");
        ORANGE_WALL_TORCH = new CWallTorchBlock("orange_wall_torch");
        PINK_WALL_TORCH = new CWallTorchBlock("pink_wall_torch");
        PURPLE_WALL_TORCH = new CWallTorchBlock("purple_wall_torch");
        RED_WALL_TORCH = new CWallTorchBlock("red_wall_torch");
        WHITE_WALL_TORCH = new CWallTorchBlock("white_wall_torch");
        YELLOW_WALL_TORCH = new CWallTorchBlock("yellow_wall_torch");

        BLEACHED_TORCH_ITEM = new CTorchItem("bleached_torch");
        BLACK_TORCH_ITEM = new CTorchItem("black_torch");
        BLUE_TORCH_ITEM = new CTorchItem("blue_torch");
        BROWN_TORCH_ITEM = new CTorchItem("brown_torch");
        CYAN_TORCH_ITEM = new CTorchItem("cyan_torch");
        GRAY_TORCH_ITEM = new CTorchItem("gray_torch");
        GREEN_TORCH_ITEM = new CTorchItem("green_torch");
        LIGHT_BLUE_TORCH_ITEM = new CTorchItem("light_blue_torch");
        LIGHT_GRAY_TORCH_ITEM = new CTorchItem("light_gray_torch");
        LIME_TORCH_ITEM = new CTorchItem("lime_torch");
        MAGENTA_TORCH_ITEM = new CTorchItem("magenta_torch");
        ORANGE_TORCH_ITEM = new CTorchItem("orange_torch");
        PINK_TORCH_ITEM = new CTorchItem("pink_torch");
        PURPLE_TORCH_ITEM = new CTorchItem("purple_torch");
        RED_TORCH_ITEM = new CTorchItem("red_torch");
        WHITE_TORCH_ITEM = new CTorchItem("white_torch");
        YELLOW_TORCH_ITEM = new CTorchItem("yellow_torch");
    }
}
