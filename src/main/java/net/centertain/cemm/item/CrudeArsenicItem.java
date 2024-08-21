
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrudeArsenicItem extends Item {
	public CrudeArsenicItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
