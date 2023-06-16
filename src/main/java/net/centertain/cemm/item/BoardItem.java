
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BoardItem extends Item {
	public BoardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
