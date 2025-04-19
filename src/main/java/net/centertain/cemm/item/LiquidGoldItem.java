
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.centertain.cemm.init.CemmModFluids;

public class LiquidGoldItem extends BucketItem {
	public LiquidGoldItem() {
		super(CemmModFluids.LIQUID_GOLD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
