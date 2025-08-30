
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class XanthaniumIngotItem extends Item {
	public XanthaniumIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
