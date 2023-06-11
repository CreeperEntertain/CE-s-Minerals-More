
package net.centertain.cemm.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ChalkDiscItem extends RecordItem {
	public ChalkDiscItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:disc.chalk")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 7000);
	}
}
