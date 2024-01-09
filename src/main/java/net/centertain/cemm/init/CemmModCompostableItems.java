
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.Blocks;

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
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.ASH_SHRUB.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.ASH_SPROUTS.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.ASHEN_LEAVES.get().asItem(), 0.75f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.ASHEN_SAPLING.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.DEATHBLOOM.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.SPRAYER_FLOWER.get().asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(Blocks.BAMBOO.asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.SUGAR_CANE_BLOCK.get().asItem(), 0.8f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.DENSE_FERN.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.LUSH_FERN.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.ABELIA.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.ALOE_VERA.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModItems.ALOE_VERA_GEL.get(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.BLOOMING_SWAMPFLOWER.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.BUSH_PLANT.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.CHINESE_LANTERN.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.DENSE_DUNE_GRASS.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.DUNE_GRASS.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.FORSYTHIA.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.FOXGLOVE.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.GENTIAN.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.HIBISCUS.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.LAVENDAR.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.NETTLE.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.RED_SPIDER_LILY.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.SHRUB.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.SWAMP_SEDGE.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.SWAMPFLOWER.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.TUSSOCK.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.AMBER_LEAF_CARPET.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.AMBER_SENTINEL_SAPLING.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.AMBER_SENTINEL_LEAVES.get().asItem(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.AMBER_BUSH.get().asItem(), 0.35f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.MOUNTAIN_LAUREL_SAPLING.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.MOUNTAIN_LAUREL_LEAVES.get().asItem(), 0.25f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.FLOWERING_MOUNTAIN_LAUREL_LEAVES.get().asItem(), 0.45f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.VANILLA_VINE.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.LARKSPUR.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.FUCHSIA.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.BUTTERFLY_WEED.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.HORTENSIA.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(CemmModBlocks.BLUE_SAGE.get().asItem(), 0.4f);
	}
}
