
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OscillatorItem extends Item {
	public OscillatorItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
