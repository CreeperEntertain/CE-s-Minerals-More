
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ManganeseIronChunkItem extends Item {
	public ManganeseIronChunkItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
