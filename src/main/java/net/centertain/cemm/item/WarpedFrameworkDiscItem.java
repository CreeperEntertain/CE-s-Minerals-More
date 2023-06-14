
package net.centertain.cemm.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WarpedFrameworkDiscItem extends RecordItem {
	public WarpedFrameworkDiscItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:disc.warped_framework")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5240);
	}
}
