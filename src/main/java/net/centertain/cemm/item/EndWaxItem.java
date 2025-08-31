
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EndWaxItem extends Item {
	public EndWaxItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
