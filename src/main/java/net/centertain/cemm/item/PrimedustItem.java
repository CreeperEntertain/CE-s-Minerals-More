
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.centertain.cemm.init.CemmModTabs;

public class PrimedustItem extends Item {
	public PrimedustItem() {
		super(new Item.Properties().tab(CemmModTabs.TAB_VOID_ITEMS_AND_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
