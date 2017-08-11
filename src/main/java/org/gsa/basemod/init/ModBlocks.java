package org.gsa.basemod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.gsa.basemod.blockclasses.BlockClimber;
import org.gsa.basemod.blockclasses.BlockDiceFacer;
import org.gsa.basemod.blockclasses.BlockFlamingo;

public class ModBlocks {

    public static Block dice;
    public static Block flamingo;
    public static Block climber;
    public static Block crop_planty;

    public static void init(){
        dice = new BlockDiceFacer(Material.ANVIL).setUnlocalizedName("dice").setRegistryName("block_dice");
        flamingo = new BlockFlamingo(Material.WOOD).setUnlocalizedName("flamingo").setRegistryName("block_flamingo").setCreativeTab(CreativeTabs.DECORATIONS);
        climber = new BlockClimber().setUnlocalizedName("climber").setRegistryName("block_climber").setCreativeTab(CreativeTabs.MISC);
        crop_planty = new BlockCropPlanty();
    }

    public static void register(){
        registerBlock(dice);
        registerBlock(flamingo);
        registerBlock(climber);
        registerBlock(crop_planty);
    }

    public static void registerRenders(){
        registerRender(dice);
        registerRender(flamingo);
        registerRender(climber);
        registerRender(crop_planty);
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