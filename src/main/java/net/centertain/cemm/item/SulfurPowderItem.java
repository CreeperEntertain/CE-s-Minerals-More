
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.centertain.cemm.init.CemmModTabs;

public class SulfurPowderItem extends Item {
	public SulfurPowderItem() {
		super(new Item.Properties().tab(CemmModTabs.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
