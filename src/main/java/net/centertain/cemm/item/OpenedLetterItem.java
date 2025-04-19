
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OpenedLetterItem extends Item {
	public OpenedLetterItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
