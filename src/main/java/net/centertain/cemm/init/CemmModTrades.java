
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
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(CemmModBlocks.CABBAGE_00.get(), 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModBlocks.CABBAGE_00.get(), 10),

					new ItemStack(Items.EMERALD, 2), 15, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(CemmModItems.TOMATO.get(), 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModItems.TOMATO.get(), 10),

					new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(CemmModItems.CUCUMBER.get(), 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModItems.CUCUMBER.get(), 10),

					new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(CemmModBlocks.CABBAGE_00.get(), 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModBlocks.CABBAGE_00.get(), 10),

					new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(CemmModItems.STRAWBERRY.get(), 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModItems.STRAWBERRY.get(), 10),

					new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(CemmModBlocks.TEA_00.get(), 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CemmModBlocks.TEA_00.get(), 10),

					new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
		}
	}
}
