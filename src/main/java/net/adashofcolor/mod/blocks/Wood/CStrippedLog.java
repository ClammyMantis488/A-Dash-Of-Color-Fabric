package net.adashofcolor.mod.blocks.Wood;

import net.adashofcolor.mod.ADashOfColor;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class CStrippedLog extends PillarBlock {

    Block result;

    public CStrippedLog(Block source, Block result)
    {
        super(Settings.copy(source));
        this.result = result;
    }

    public CStrippedLog(String name, float hardness, float resistance) {
        super(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).build());
        Registry.register(Registry.BLOCK, new Identifier(ADashOfColor.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(ADashOfColor.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(ADashOfColor.DASHOFCOLOR_BLOCKS)));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        if (player.getMainHandStack().getItem() instanceof AxeItem)
        {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (!world.isClient)
            {
                world.setBlockState(pos, result.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)), 11);
                if (player != null && !player.isCreative())
                {
                    player.getMainHandStack().damage(1, world.random, (ServerPlayerEntity) player);
                }
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }
}

// Log has top texture (STRIPPED_OAK_LOG)