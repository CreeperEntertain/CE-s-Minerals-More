
package net.centertain.cemm.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.centertain.cemm.init.CemmModTabs;

public class HeptagonalDiscItem extends RecordItem {
	public HeptagonalDiscItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:disc.heptagonal")), new Item.Properties().tab(CemmModTabs.TAB_TECHNICAL_BLOCKS).stacksTo(1).rarity(Rarity.RARE), 1280);
	}
}
