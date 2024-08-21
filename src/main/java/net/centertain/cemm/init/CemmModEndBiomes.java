package net.centertain.cemm.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.centertain.cemm.endbiomes.TheEndBiomes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CemmModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:end_forest_highland")), 0.65d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:end_forest_highland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:end_forest_midland")), 0.65d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:end_forest_highland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:end_forest_barrens")), 0.65d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_forest_highland")), 0.65d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_forest_highland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_forest_midland")), 0.65d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_forest_highland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_forest_barrens")), 0.65d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_spikes_highland")), 1.25d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_spikes_highland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_spikes_midland")), 1.25d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_spikes_highland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:purpur_spikes_barrens")), 1.25d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:midori_quarry_highland")), 1.25d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:midori_quarry_highland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:midori_quarry_midland")), 1.25d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:midori_quarry_highland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm:midori_quarry_barrens")), 1.25d);
		});
	}
}
