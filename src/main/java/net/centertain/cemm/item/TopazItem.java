
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TopazItem extends Item {
	public TopazItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
