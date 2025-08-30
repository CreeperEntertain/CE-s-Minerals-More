
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AmmoniteFossilItem extends Item {
	public AmmoniteFossilItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
