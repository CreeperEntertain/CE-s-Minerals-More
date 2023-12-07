
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NeodymiumPelletItem extends Item {
	public NeodymiumPelletItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
