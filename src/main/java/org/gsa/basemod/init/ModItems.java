package org.gsa.basemod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item balls2u;
	
	public static void init(){
		balls2u = new Item().setRegistryName("item_balls2u").setUnlocalizedName("balls2u").setCreativeTab(CreativeTabs.MISC);
	}
	
	public static void register(){
		GameRegistry.register(balls2u);
	}
	
	public static void registerRenders(){
		registerRender(balls2u);
	}
	
	private static void registerRender(Item item){
		//Method registers item with texture, DO NOT CHANGE!
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
