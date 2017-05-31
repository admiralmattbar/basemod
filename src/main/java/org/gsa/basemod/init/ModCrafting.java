package org.gsa.basemod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register(){
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.balls2u, 2), "PAP"," A ","AAA", 'A', Items.POTATO, 'P', Items.APPLE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.balls2u), "AP ", " P ", "   ", 'A', Items.POTATO, 'P', Items.APPLE);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.balls2u), new ItemStack(Items.ARROW), new ItemStack(Items.BED));
		
		GameRegistry.addSmelting(Blocks.DIRT, new ItemStack(ModItems.balls2u), 1.2F);
	}

}
