
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class XanthaniumNuggetItem extends Item {
	public XanthaniumNuggetItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
