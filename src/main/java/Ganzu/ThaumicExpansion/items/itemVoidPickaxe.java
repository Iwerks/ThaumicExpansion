package Ganzu.ThaumicExpansion.items;

import net.minecraft.creativetab.CreativeTabs;

public class itemVoidPickaxe extends ItemInfo{
	
	public String textureName;
	
	public itemVoidPickaxe() {
		super("voidinfusedpickaxe", "voidPickaxe");
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
	}

}
