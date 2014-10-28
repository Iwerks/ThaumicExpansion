package Ganzu.ThaumicExpansion.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry {

	public static Item VoidInfusedPickaxe;

	public static void registerItems() {
		VoidInfusedPickaxe = new itemVoidPickaxe();
		GameRegistry.registerItem(VoidInfusedPickaxe, "VoidInfusedPickaxe");

	}
}