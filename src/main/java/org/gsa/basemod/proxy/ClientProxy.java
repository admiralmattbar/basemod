package org.gsa.basemod.proxy;

import org.gsa.basemod.init.ModBlocks;
import org.gsa.basemod.init.ModItems;

public class ClientProxy implements ICommonProxy{

	@Override
	public void init() {
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

}
