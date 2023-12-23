
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

@Mod.EventBusSubscriber
public class CemmModBiomes {
	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.8728745f, -0.42344f), Climate.Parameter.span(-0.9821f, 1.2f), Climate.Parameter.span(-0.2141f, 0.0854f), Climate.Parameter.span(-0.6f, 0.6f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.8614425392f, 0.3385574608f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "chalk_steppes")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.8728745f, -0.42344f), Climate.Parameter.span(-0.9821f, 1.2f), Climate.Parameter.span(-0.2141f, 0.0854f), Climate.Parameter.span(-0.6f, 0.6f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.8614425392f, 0.3385574608f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "chalk_steppes")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.7043f, 1.3333f), Climate.Parameter.span(-1.4f, 1f), Climate.Parameter.span(0.764f, 2f), Climate.Parameter.span(-0.213f, 1.36f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.5446080429f, 1.42425f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "claystone_mountains")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.7043f, 1.3333f), Climate.Parameter.span(-1.4f, 1f), Climate.Parameter.span(0.764f, 2f), Climate.Parameter.span(-0.213f, 1.36f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.5446080429f, 1.42425f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "claystone_mountains")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.8f, 0.5333333333f), Climate.Parameter.span(-0.564353f, 1.2f), Climate.Parameter.span(0f, 1.2113f), Climate.Parameter.span(-0.1f, 1.1f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.1999303892f, 1.3999303892f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "shungite_mines")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.8f, 0.5333333333f), Climate.Parameter.span(-0.564353f, 1.2f), Climate.Parameter.span(0f, 1.2113f), Climate.Parameter.span(-0.1f, 1.1f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.1999303892f, 1.3999303892f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "shungite_mines")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1.8f, 0.3036f), Climate.Parameter.span(-0.2036f, 1.8f), Climate.Parameter.span(0.4795f, 2f), Climate.Parameter.span(-1.5029f, 0.5018f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.5705320725f, 1.4294679275f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "hornfels_overhangs")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1.8f, 0.3036f), Climate.Parameter.span(-0.2036f, 1.8f), Climate.Parameter.span(0.4795f, 2f), Climate.Parameter.span(-1.5029f, 0.5018f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.5705320725f, 1.4294679275f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "hornfels_overhangs")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4f, 0.94353f), Climate.Parameter.span(-0.8f, 0.6046f), Climate.Parameter.span(0f, 1.2f), Climate.Parameter.span(-0.5416f, 0.54358f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.2728346f, 1.2313f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "lignite_flats")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4f, 0.94353f), Climate.Parameter.span(-0.8f, 0.6046f), Climate.Parameter.span(0f, 1.2f), Climate.Parameter.span(-0.5416f, 0.54358f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.2728346f, 1.2313f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "lignite_flats")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.561f, 1.5324f), Climate.Parameter.span(-1.237f, -0.1019f), Climate.Parameter.span(-0.124534f, 1.324435f), Climate.Parameter.span(-0.921375f, 0.98345f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.3983f, 1.43234f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "bauxite_steppes")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.561f, 1.5324f), Climate.Parameter.span(-1.237f, -0.1019f), Climate.Parameter.span(-0.124534f, 1.324435f), Climate.Parameter.span(-0.921375f, 0.98345f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.3983f, 1.43234f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "bauxite_steppes")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.33134f, 2f), Climate.Parameter.span(-2f, 0.102f), Climate.Parameter.span(0.1733224f, 0.89243246f), Climate.Parameter.span(-1.6007f, 0.875f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.7428461428f, 1.4571538572f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "monazite_desert")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.33134f, 2f), Climate.Parameter.span(-2f, 0.102f), Climate.Parameter.span(0.1733224f, 0.89243246f), Climate.Parameter.span(-1.6007f, 0.875f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.7428461428f, 1.4571538572f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "monazite_desert")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.2666666667f, 2f), Climate.Parameter.span(-2f, 0.2f), Climate.Parameter.span(0.29f, 2f), Climate.Parameter.span(-1.9f, 0.5f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.6232921047f, 1.7767078953f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "zirconian_desert")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.2666666667f, 2f), Climate.Parameter.span(-2f, 0.2f), Climate.Parameter.span(0.29f, 2f), Climate.Parameter.span(-1.9f, 0.5f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.6232921047f, 1.7767078953f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "zirconian_desert")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.7666666667f, 0.65f), Climate.Parameter.span(-0.1f, 1.3f), Climate.Parameter.span(-0.0616f, 2f), Climate.Parameter.span(-0.7075f, 1f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.4516867496f, 0.0213f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "limestone_steppes")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.7666666667f, 0.65f), Climate.Parameter.span(-0.1f, 1.3f), Climate.Parameter.span(-0.0616f, 2f), Climate.Parameter.span(-0.7075f, 1f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.4516867496f, 0.0213f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "limestone_steppes")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1.9f, 0.3f), Climate.Parameter.span(-0.8523424f, 1.9f), Climate.Parameter.span(0.534f, 2f), Climate.Parameter.span(-0.5f, 1.7f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.5329f, 0.6671f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "blueschist_formations")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1.9f, 0.3f), Climate.Parameter.span(-0.8523424f, 1.9f), Climate.Parameter.span(0.534f, 2f), Climate.Parameter.span(-0.5f, 1.7f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.5329f, 0.6671f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "blueschist_formations")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.1533333333f, 0.4234f), Climate.Parameter.span(-0.42f, -0.18f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.62f, -0.38f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.4234f, 0.9405626295f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "gypsum_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.1533333333f, 0.4234f), Climate.Parameter.span(-0.42f, -0.18f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.62f, -0.38f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.4234f, 0.9405626295f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "gypsum_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.56734f, 1.3928f), Climate.Parameter.span(0.3f, 0.62f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(0.4199f, 0.75454f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.5643620682f, -0.2232f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "marble_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.56734f, 1.3928f), Climate.Parameter.span(0.3f, 0.62f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(0.4199f, 0.75454f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.5643620682f, -0.2232f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "marble_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.513f, 0.7533333333f), Climate.Parameter.span(0.18f, 0.52f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.52f, 0.4773f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.8364637836f, -0.6465f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "jasper_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.513f, 0.7533333333f), Climate.Parameter.span(0.18f, 0.52f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.52f, 0.4773f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.8364637836f, -0.6465f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "jasper_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.1f, 0.9066666667f), Climate.Parameter.span(-0.143242f, 0.04f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1.04f, -0.8423f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.686f, -0.44345f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "bismuth_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.1f, 0.9066666667f), Climate.Parameter.span(-0.143242f, 0.04f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1.04f, -0.8423f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.686f, -0.44345f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "bismuth_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.92f, -0.58f), Climate.Parameter.span(-0.62f, -0.18f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.92f, -0.48f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.9184592033f, -0.6785f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "quartz_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.92f, -0.58f), Climate.Parameter.span(-0.62f, -0.18f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.92f, -0.48f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.9184592033f, -0.6785f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "quartz_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.6797f, 1.32f), Climate.Parameter.span(0.18f, 0.62f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.52f, 0.4f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.2207f, -0.0788429703f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "sulfur_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.6797f, 1.32f), Climate.Parameter.span(0.18f, 0.62f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.52f, 0.4f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.2207f, -0.0788429703f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "sulfur_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.33333333f, 0.3333f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.82f, -0.78f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.4289f, 0.1888f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "diorite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.33333333f, 0.3333f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.82f, -0.78f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.4289f, 0.1888f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "diorite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-2f, -0.333333333f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.92f, -0.8333f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.9630625073f, -0.3243f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "andesite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-2f, -0.333333333f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.92f, -0.8333f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.9630625073f, -0.3243f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "andesite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.21255f, 2f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.72f, -0.68f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.4582f, 1.2342f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "granite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.21255f, 2f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.72f, -0.68f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.4582f, 1.2342f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "granite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.4474f, 0.4812f), Climate.Parameter.span(-0.2829f, 0.5827f), Climate.Parameter.span(-0.9966f, 0.9965f), Climate.Parameter.span(-0.72f, -0.2868f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.4830073812f, 0.3497f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "niter_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.4474f, 0.4812f), Climate.Parameter.span(-0.2829f, 0.5827f), Climate.Parameter.span(-0.9966f, 0.9965f), Climate.Parameter.span(-0.72f, -0.2868f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.4830073812f, 0.3497f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "niter_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.16f, 0.2655f), Climate.Parameter.span(-0.16f, 0.16f), Climate.Parameter.span(-1f, 0.52434f), Climate.Parameter.span(-0.56f, -0.24f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.2881f, 0.8081f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "chlorophyl")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.16f, 0.2655f), Climate.Parameter.span(-0.16f, 0.16f), Climate.Parameter.span(-1f, 0.52434f), Climate.Parameter.span(-0.56f, -0.24f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.2881f, 0.8081f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "chlorophyl")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(-1f, 0f), Climate.Parameter.span(0f, 1f), Climate.Parameter.span(-0.4f, 1f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "red_wastes")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(-1f, 0f), Climate.Parameter.span(0f, 1f), Climate.Parameter.span(-0.4f, 1f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "red_wastes")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.1533333333f, 0.4234f), Climate.Parameter.span(-0.42f, -0.18f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.62f, -0.38f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(0.4234f, 0.9405626295f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "gypsum_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.56734f, 1.3928f), Climate.Parameter.span(0.3f, 0.62f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(0.4199f, 0.75454f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.5643620682f, -0.2232f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "marble_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.513f, 0.7533333333f), Climate.Parameter.span(0.18f, 0.52f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.52f, 0.4773f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.8364637836f, -0.6465f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "jasper_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.1f, 0.9066666667f), Climate.Parameter.span(-0.143242f, 0.04f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1.04f, -0.8423f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-1.686f, -0.44345f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "bismuth_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.92f, -0.58f), Climate.Parameter.span(-0.62f, -0.18f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.92f, -0.48f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.9184592033f, -0.6785f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "quartz_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.6797f, 1.32f), Climate.Parameter.span(0.18f, 0.62f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.52f, 0.4f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.2207f, -0.0788429703f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "sulfur_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.33333333f, 0.3333f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.82f, -0.78f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.4289f, 0.1888f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "diorite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-2f, -0.333333333f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.92f, -0.8333f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.9630625073f, -0.3243f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "andesite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.21255f, 2f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.72f, -0.68f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(0.4582f, 1.2342f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "granite_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.4474f, 0.4812f), Climate.Parameter.span(-0.2829f, 0.5827f), Climate.Parameter.span(-0.9966f, 0.9965f), Climate.Parameter.span(-0.72f, -0.2868f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.4830073812f, 0.3497f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "niter_cave")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.16f, 0.2655f), Climate.Parameter.span(-0.16f, 0.16f), Climate.Parameter.span(-1f, 0.52434f), Climate.Parameter.span(-0.56f, -0.24f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(0.2881f, 0.8081f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "chlorophyl")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.06f, 0.06f), Climate.Parameter.span(-0.06f, 0.06f), Climate.Parameter.span(0.45f, 0.57f), Climate.Parameter.span(-0.46f, -0.34f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(0.4880890755f, 0.6080890755f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "megachloron_surface")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "gypsum_cave")), CemmModBlocks.GYPSUM.get().defaultBlockState(), CemmModBlocks.GYPSUM.get().defaultBlockState(),
								CemmModBlocks.GYPSUM.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "marble_cave")), CemmModBlocks.MARBLE.get().defaultBlockState(), CemmModBlocks.MARBLE.get().defaultBlockState(),
								CemmModBlocks.MARBLE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "jasper_cave")), CemmModBlocks.JASPER.get().defaultBlockState(), CemmModBlocks.JASPER.get().defaultBlockState(),
								CemmModBlocks.JASPER.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "bismuth_cave")), CemmModBlocks.BISMUTHINITE.get().defaultBlockState(), CemmModBlocks.BISMUTHINITE.get().defaultBlockState(),
								CemmModBlocks.BISMUTHINITE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "quartz_cave")), CemmModBlocks.MASUYITE.get().defaultBlockState(), CemmModBlocks.MASUYITE.get().defaultBlockState(),
								CemmModBlocks.MASUYITE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "sulfur_cave")), Blocks.COARSE_DIRT.defaultBlockState(), CemmModBlocks.MASUYITE.get().defaultBlockState(),
								CemmModBlocks.MASUYITE.get().defaultBlockState()));
						surfaceRules.add(1,
								anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "diorite_cave")), Blocks.DIORITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState()));
						surfaceRules.add(1,
								anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "andesite_cave")), Blocks.ANDESITE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState()));
						surfaceRules.add(1,
								anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "granite_cave")), Blocks.GRANITE.defaultBlockState(), Blocks.GRANITE.defaultBlockState(), Blocks.GRANITE.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "niter_cave")), CemmModBlocks.HORNFELS.get().defaultBlockState(), CemmModBlocks.TRONDHJEMITE.get().defaultBlockState(),
								CemmModBlocks.TRONDHJEMITE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "chlorophyl")), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), Blocks.MOSS_BLOCK.defaultBlockState(),
								Blocks.MOSS_BLOCK.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "megachloron_surface")), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(),
								Blocks.MOSS_BLOCK.defaultBlockState(), Blocks.MOSS_BLOCK.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "chalk_steppes")), CemmModBlocks.GRASSED_CHALK.get().defaultBlockState(),
								CemmModBlocks.CHALK.get().defaultBlockState(), CemmModBlocks.CHALK.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "claystone_mountains")), CemmModBlocks.CLAYSTONE.get().defaultBlockState(),
								CemmModBlocks.CLAYSTONE.get().defaultBlockState(), CemmModBlocks.CLAYSTONE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "shungite_mines")), CemmModBlocks.SHUNGITE.get().defaultBlockState(),
								CemmModBlocks.SHUNGITE.get().defaultBlockState(), Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "hornfels_overhangs")), CemmModBlocks.HORNFELS.get().defaultBlockState(),
								CemmModBlocks.HORNFELS.get().defaultBlockState(), CemmModBlocks.HORNFELS.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "lignite_flats")), Blocks.GRASS_BLOCK.defaultBlockState(), CemmModBlocks.LIGNITE_BLOCK.get().defaultBlockState(),
								CemmModBlocks.LIGNITE_BLOCK.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "bauxite_steppes")), CemmModBlocks.BAUXITE_BLOCK.get().defaultBlockState(),
								CemmModBlocks.BAUXITE_BLOCK.get().defaultBlockState(), CemmModBlocks.BAUXITE_BLOCK.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "monazite_desert")), CemmModBlocks.MONAZITE_SAND.get().defaultBlockState(),
								CemmModBlocks.MONAZITE_SAND.get().defaultBlockState(), Blocks.STONE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "zirconian_desert")), CemmModBlocks.ZIRCON_SAND.get().defaultBlockState(),
								CemmModBlocks.ZIRCON_SAND.get().defaultBlockState(), Blocks.STONE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "limestone_steppes")), CemmModBlocks.LIMESTONE.get().defaultBlockState(),
								CemmModBlocks.LIMESTONE.get().defaultBlockState(), CemmModBlocks.LIMESTONE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "blueschist_formations")), CemmModBlocks.BLUESCHIST.get().defaultBlockState(),
								CemmModBlocks.BLUESCHIST.get().defaultBlockState(), CemmModBlocks.BLUESCHIST.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "gypsum_cave")), CemmModBlocks.GYPSUM.get().defaultBlockState(), CemmModBlocks.GYPSUM.get().defaultBlockState(),
								CemmModBlocks.GYPSUM.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "marble_cave")), CemmModBlocks.MARBLE.get().defaultBlockState(), CemmModBlocks.MARBLE.get().defaultBlockState(),
								CemmModBlocks.MARBLE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "jasper_cave")), CemmModBlocks.JASPER.get().defaultBlockState(), CemmModBlocks.JASPER.get().defaultBlockState(),
								CemmModBlocks.JASPER.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "bismuth_cave")), CemmModBlocks.BISMUTHINITE.get().defaultBlockState(),
								CemmModBlocks.BISMUTHINITE.get().defaultBlockState(), CemmModBlocks.BISMUTHINITE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "quartz_cave")), CemmModBlocks.MASUYITE.get().defaultBlockState(), CemmModBlocks.MASUYITE.get().defaultBlockState(),
								CemmModBlocks.MASUYITE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "sulfur_cave")), Blocks.COARSE_DIRT.defaultBlockState(), CemmModBlocks.MASUYITE.get().defaultBlockState(),
								CemmModBlocks.MASUYITE.get().defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "diorite_cave")), Blocks.DIORITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "andesite_cave")), Blocks.ANDESITE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState(),
								Blocks.ANDESITE.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "granite_cave")), Blocks.GRANITE.defaultBlockState(), Blocks.GRANITE.defaultBlockState(), Blocks.GRANITE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "niter_cave")), CemmModBlocks.HORNFELS.get().defaultBlockState(),
								CemmModBlocks.TRONDHJEMITE.get().defaultBlockState(), CemmModBlocks.TRONDHJEMITE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "chlorophyl")), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(),
								Blocks.MOSS_BLOCK.defaultBlockState(), Blocks.MOSS_BLOCK.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "red_wastes")), Blocks.RED_SAND.defaultBlockState(), CemmModBlocks.JASPILITE.get().defaultBlockState(),
								Blocks.STONE.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(SurfaceRules.RuleSource[]::new)), noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct<>(moddedNoiseGeneratorSettings);
					}
				}
			}
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.NETHER)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.6f, 0.6f), Climate.Parameter.span(-0.6f, 0f), Climate.Parameter.span(0.25f, 0.5f), Climate.Parameter.span(0f, 0.55f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(-0.3f, 0.3f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "ash_barrens")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.6f, 0.6f), Climate.Parameter.span(-0.6f, 0f), Climate.Parameter.span(0.25f, 0.5f), Climate.Parameter.span(0f, 0.55f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(-0.3f, 0.3f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "ash_barrens")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(2, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("cemm", "ash_barrens")), CemmModBlocks.ASH.get().defaultBlockState(), CemmModBlocks.HARDENED_ASH.get().defaultBlockState(),
								Blocks.TUFF.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(SurfaceRules.RuleSource[]::new)), noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct<>(moddedNoiseGeneratorSettings);
					}
				}
			}
		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}

	private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.sequence(
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
								SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))));
	}
}
