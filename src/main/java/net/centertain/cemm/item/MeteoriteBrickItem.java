
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MeteoriteBrickItem extends Item {
	public MeteoriteBrickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
