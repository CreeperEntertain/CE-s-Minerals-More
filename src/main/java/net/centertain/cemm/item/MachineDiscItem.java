
package net.centertain.cemm.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MachineDiscItem extends RecordItem {
	public MachineDiscItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:disc.machine")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 10400);
	}
}
