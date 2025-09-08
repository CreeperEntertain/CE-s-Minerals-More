
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OmenboneItem extends Item {
	public OmenboneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
