
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PrimedustItem extends Item {
	public PrimedustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
