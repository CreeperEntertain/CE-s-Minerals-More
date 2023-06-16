
package net.centertain.cemm.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class HushDiscItem extends RecordItem {
	public HushDiscItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:disc.hush")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3940);
	}
}
