
package net.centertain.cemm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.centertain.cemm.init.CemmModTabs;

public class FirefruitItem extends Item {
	public FirefruitItem() {
		super(new Item.Properties().tab(CemmModTabs.TAB_CHLOROPHYL_ITEMS_AND_BLOCKS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.5f)

				.build()));
	}
}
