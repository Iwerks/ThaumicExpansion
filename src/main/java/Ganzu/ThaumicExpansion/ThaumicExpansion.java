package Ganzu.ThaumicExpansion;


import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import Ganzu.ThaumicExpansion.config.ConfigHandler;
import Ganzu.ThaumicExpansion.proxies.CommonProxy;
import Ganzu.ThaumicExpansion.client.gui.CreativeTabThaumicExpansion;
import Ganzu.ThaumicExpansion.items.ItemRegistry;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)

public class ThaumicExpansion {

	
	@Instance(ModInformation.ID)
	public static ThaumicExpansion instance;
	
	@SidedProxy(clientSide = "Ganzu.ThaumicExpansion.proxies.ClientProxy", serverSide= "Ganzu.ThaumicExpansion.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabThaumicExpansion = new CreativeTabThaumicExpansion(ModInformation.ID + ".creativeTab");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		ItemRegistry.registerItems();
//		proxy.initRenderers();
	}
	
	@EventHandler
	public void load(FMLPreInitializationEvent event) {
	
	}
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event) {
		
	}
}
