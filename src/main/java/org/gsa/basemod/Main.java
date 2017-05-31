package org.gsa.basemod;

import org.gsa.basemod.init.ModCrafting;
import org.gsa.basemod.init.ModItems;
import org.gsa.basemod.proxy.ICommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static ICommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModItems.init();
		ModItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init();
		
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
