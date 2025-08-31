
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.centertain.cemm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CemmModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(CemmModItems.BUBBLE_CORAL.get()),

					new ItemStack(Items.EMERALD, 4), 25, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(CemmModItems.REDSTONE_GEODE.get()),

					new ItemStack(Items.EMERALD, 3), 25, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(CemmModItems.AMETHYST_GEODE.get()),

					new ItemStack(Items.EMERALD, 3), 25, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(CemmModItems.TOPAZ_GEODE.get()),

					new ItemStack(Items.EMERALD, 5), 25, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(CemmModItems.AQUAMARINE_GEODE.get()),

					new ItemStack(Items.EMERALD, 5), 25, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModItems.AMMONITE_FOSSIL.get()),

					new ItemStack(Items.EMERALD, 3), 25, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModItems.BRACHIOPOD_FOSSIL.get()),

					new ItemStack(Items.EMERALD, 3), 25, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModItems.ORTHOCONE_FOSSIL.get()),

					new ItemStack(Items.EMERALD, 3), 25, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModItems.TRILOBITE_FOSSIL.get()),

					new ItemStack(Items.EMERALD, 3), 25, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(CemmModItems.FLARECLAM.get()),

					new ItemStack(Items.EMERALD, 6), 10, 5, 0.05f));
		}
	}
}
