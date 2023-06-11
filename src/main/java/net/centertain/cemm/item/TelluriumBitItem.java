
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TelluriumBitItem extends Item {
	public TelluriumBitItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
