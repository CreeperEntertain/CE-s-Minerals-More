
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class CemmModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == CemmModItems.LIGNITE.get())
			event.setBurnTime(400);
		else if (itemstack.getItem() == CemmModBlocks.LIGNITE_BLOCK.get().asItem())
			event.setBurnTime(3600);
		else if (itemstack.getItem() == CemmModBlocks.PAPER_BLOCK.get().asItem())
			event.setBurnTime(4000);
		else if (itemstack.getItem() == CemmModBlocks.CHISELED_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == CemmModBlocks.CUT_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == CemmModBlocks.SOLIDIFIED_OIL.get().asItem())
			event.setBurnTime(1200);
		else if (itemstack.getItem() == CemmModBlocks.ALGAE.get().asItem())
			event.setBurnTime(200);
		else if (itemstack.getItem() == CemmModBlocks.DECAYING_ALGAE.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == CemmModBlocks.DECAYED_ALGAE.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == CemmModBlocks.DYING_ALGAE.get().asItem())
			event.setBurnTime(800);
		else if (itemstack.getItem() == CemmModBlocks.DEAD_ALGAE.get().asItem())
			event.setBurnTime(1000);
		else if (itemstack.getItem() == CemmModBlocks.WINDSWEPT_SAPLING.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == CemmModBlocks.WINEWOOD_SAPLING.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == CemmModBlocks.WINTER_OAK_SAPLING.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == CemmModBlocks.BURNT_PUMPKIN.get().asItem())
			event.setBurnTime(300);
	}
}
