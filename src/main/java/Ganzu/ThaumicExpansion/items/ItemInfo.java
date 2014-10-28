package Ganzu.ThaumicExpansion.items;

import net.minecraft.item.Item;
import Ganzu.ThaumicExpansion.ModInformation;
import Ganzu.ThaumicExpansion.ThaumicExpansion;

public class ItemInfo extends Item {
	
	public ItemInfo(String unlocName, String textureName) {
		super();
		
		setUnlocalizedName(ModInformation.ID + "." + unlocName);
		setTextureName(ModInformation.TEXTUREPATH + ":" + textureName);
		setCreativeTab(ThaumicExpansion.tabThaumicExpansion);
	}
	
	public ItemInfo(String unlocName) {
		super();

		setUnlocalizedName(ModInformation.ID + "." + unlocName);
		setCreativeTab(ThaumicExpansion.tabThaumicExpansion);
	}
}

