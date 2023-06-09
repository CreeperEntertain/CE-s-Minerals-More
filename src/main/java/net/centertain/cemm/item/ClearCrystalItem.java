
package net.centertain.cemm.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.centertain.cemm.init.CemmModTabs;

import java.util.List;

public class ClearCrystalItem extends Item {
	public ClearCrystalItem() {
		super(new Item.Properties().tab(CemmModTabs.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Breaks and aligns light rays"));
	}
}
