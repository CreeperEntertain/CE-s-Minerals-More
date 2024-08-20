package net.centertain.cemm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.centertain.cemm.mixins.NoiseGeneratorSettingsAccess;

@Mod.EventBusSubscriber
public class CemmModSurfaceRules {
	@SubscribeEvent
	public static void init(ServerAboutToStartEvent event) {
		LevelStem levelStem = event.getServer().registryAccess().registryOrThrow(Registries.LEVEL_STEM).get(LevelStem.END);
		ChunkGenerator chunkGenerator = levelStem.generator();
		boolean hasEndBiomes = chunkGenerator.getBiomeSource().possibleBiomes().stream().anyMatch(biomeHolder -> biomeHolder.unwrapKey().orElseThrow().location().getNamespace().equals("cemm"));
		if (hasEndBiomes) {
			if (chunkGenerator instanceof NoiseBasedChunkGenerator generator) {
				NoiseGeneratorSettings noiseGeneratorSettings = generator.settings.value();
				registerSurfaceRules(new ResourceLocation("cemm:end_forest_highland"), noiseGeneratorSettings, CemmModBlocks.MOSSED_END_STONE.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:end_forest_midland"), noiseGeneratorSettings, CemmModBlocks.MOSSED_END_STONE.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:end_forest_barrens"), noiseGeneratorSettings, CemmModBlocks.MOSSED_END_STONE.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:purpur_forest_highland"), noiseGeneratorSettings, CemmModBlocks.PURPUR_MOSSED_END_STONE.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:purpur_forest_midland"), noiseGeneratorSettings, CemmModBlocks.PURPUR_MOSSED_END_STONE.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:purpur_forest_barrens"), noiseGeneratorSettings, CemmModBlocks.PURPUR_MOSSED_END_STONE.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:purpur_spikes_highland"), noiseGeneratorSettings, CemmModBlocks.PURPUR_STONE.get().defaultBlockState(), CemmModBlocks.RICH_END_STONE.get().defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:purpur_spikes_midland"), noiseGeneratorSettings, CemmModBlocks.PURPUR_STONE.get().defaultBlockState(), CemmModBlocks.RICH_END_STONE.get().defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:purpur_spikes_barrens"), noiseGeneratorSettings, CemmModBlocks.PURPUR_STONE.get().defaultBlockState(), CemmModBlocks.RICH_END_STONE.get().defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:midori_quarry_highland"), noiseGeneratorSettings, CemmModBlocks.END_STONE_LINED_MIDORI.get().defaultBlockState(), CemmModBlocks.MIDORI_LINED_END_STONE.get().defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:midori_quarry_midland"), noiseGeneratorSettings, CemmModBlocks.END_STONE_LINED_MIDORI.get().defaultBlockState(), CemmModBlocks.MIDORI_LINED_END_STONE.get().defaultBlockState());
				registerSurfaceRules(new ResourceLocation("cemm:midori_quarry_barrens"), noiseGeneratorSettings, CemmModBlocks.END_STONE_LINED_MIDORI.get().defaultBlockState(), CemmModBlocks.MIDORI_LINED_END_STONE.get().defaultBlockState());
			}
		}
	}

	public static void registerSurfaceRules(ResourceLocation biome, NoiseGeneratorSettings noiseGeneratorSettings, BlockState groundBlock, BlockState undergroundBlock) {
		((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings).addSurfaceRule(SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ResourceKey.create(Registries.BIOME, biome)),
				SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(groundBlock)), SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.state(undergroundBlock)))), noiseGeneratorSettings.surfaceRule()));
	}
}
