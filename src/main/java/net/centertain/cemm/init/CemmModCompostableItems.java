
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CemmModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.BLACK_LOTUS.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.CACTUS_FRUIT.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.CREOSOTE_BUSH.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.CUCUMBER.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.CUCUMBER_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.DESERT_PRIMROSE.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.EBONY_LEAVES.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.EBONY_SAPLING.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.FLOWER_CACTUS.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.FLOWERLESS_CACTUS.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.GRAPE_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.GRAPES.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.TOMATO.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.TOMATO_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.CABBAGE_00.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.TEA_00.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.STRAWBERRY_00.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.STRAWBERRY.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.CHLOROGRASS.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.TALL_CHLOROGRASS.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.CHLOROLEAVES.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.CHLOROSTALK.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.CHLOROVINES.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.FIREFRUIT_SHRUB.get().asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.FIREGRASS.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.TALL_FIREGRASS.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.FIREFRUIT.get(), 1f);
	}
}
