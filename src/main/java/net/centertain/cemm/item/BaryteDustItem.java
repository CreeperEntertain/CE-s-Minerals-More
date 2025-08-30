
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BaryteDustItem extends Item {
	public BaryteDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
