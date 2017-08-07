package org.gsa.basemod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.gsa.basemod.blockclasses.BlockDice;

public class ModBlocks {

    public static Block dice;

    public static void init(){
        dice = new BlockDice(Material.ANVIL).setUnlocalizedName("dice").setRegistryName("block_dice");
    }

    public static void register(){
        registerBlock(dice);
    }

    public static void registerRenders(){
        registerRender(dice);
    }

    public static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    private static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

}