
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MiseryDropsItem extends Item {
	public MiseryDropsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
