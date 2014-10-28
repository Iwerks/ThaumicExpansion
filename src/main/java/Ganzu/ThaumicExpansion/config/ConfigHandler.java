package Ganzu.ThaumicExpansion.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static Configuration config;
	
	public static String CATEGORY_RANDOM = "Random Configs";
	
	public static boolean enchanting;
	
	public static void init(File file) {
		config = new Configuration(file);
		syncConfig();
	}
	
	public static void syncConfig() {
		config.addCustomCategoryComment(CATEGORY_RANDOM, "Testing please ignore.");
		
		enchanting = config.get(CATEGORY_RANDOM, "Enable enchanting tools", false, "Warning: the enchantability is low.").getBoolean(enchanting);
		
		if (config.hasChanged()) {
			config.save();
		}
	}
		
}
