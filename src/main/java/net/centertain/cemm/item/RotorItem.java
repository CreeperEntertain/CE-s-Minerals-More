
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RotorItem extends Item {
	public RotorItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
