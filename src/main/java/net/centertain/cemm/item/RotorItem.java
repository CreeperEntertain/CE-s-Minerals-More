
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.centertain.cemm.init.CemmModTabs;

public class RotorItem extends Item {
	public RotorItem() {
		super(new Item.Properties().tab(CemmModTabs.TAB_TECHNICAL_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
