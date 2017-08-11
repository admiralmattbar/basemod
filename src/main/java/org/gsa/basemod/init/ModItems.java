package org.gsa.basemod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.gsa.basemod.itemclasses.ItemSeedPlanty;

public class ModItems {
	
	public static Item planty;
	public static Item planty_seeds;
	
	public static void init(){

		planty = new ItemFood(10, 8.3F, false).setUnlocalizedName("planty").setRegistryName(planty.getUnlocalizedName()).setCreativeTab(CreativeTabs.FOOD);
		planty_seeds = new ItemSeedPlanty(ModBlocks.crop_planty, Blocks.FARMLAND);
	}
	
	public static void register(){

		GameRegistry.register(planty);
		GameRegistry.register(planty_seeds);
	}
	
	public static void registerRenders(){

		registerRender(planty);
		registerRender(planty_seeds);
	}
	
	private static void registerRender(Item item){
		//Method registers item with texture, DO NOT CHANGE!
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
