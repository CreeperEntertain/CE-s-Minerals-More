
package net.centertain.cemm.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.centertain.cemm.init.CemmModTabs;

public class DimensionalPocketInactiveItem extends Item {
	public DimensionalPocketInactiveItem() {
		super(new Item.Properties().tab(CemmModTabs.TAB_VOID_ITEMS_AND_BLOCKS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
