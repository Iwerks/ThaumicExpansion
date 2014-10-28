package Ganzu.ThaumicExpansion.client.gui;

import Ganzu.ThaumicExpansion.ModInformation;
import Ganzu.ThaumicExpansion.items.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabThaumicExpansion extends CreativeTabs {

	public CreativeTabThaumicExpansion(String tabLabel) {
		super(tabLabel);
		setBackgroundImageName(ModInformation.ID + ".png");
	}

	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ItemRegistry.VoidInfusedPickaxe);
	}

	@Override
	public Item getTabIconItem() {
		return new Item();
	}
}