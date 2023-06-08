
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
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
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.centertain.cemm.world.biome.ZirconianDesertBiome;
import net.centertain.cemm.world.biome.VoidPitsBiome;
import net.centertain.cemm.world.biome.VoidPillarsBiome;
import net.centertain.cemm.world.biome.VoidForestBiome;
import net.centertain.cemm.world.biome.VoidFlatsBiome;
import net.centertain.cemm.world.biome.SulfurCaveBiome;
import net.centertain.cemm.world.biome.ShungiteMinesBiome;
import net.centertain.cemm.world.biome.RedWastesBiome;
import net.centertain.cemm.world.biome.QuartzCaveBiome;
import net.centertain.cemm.world.biome.NiterCaveBiome;
import net.centertain.cemm.world.biome.MonaziteDesertBiome;
import net.centertain.cemm.world.biome.MarbleCaveBiome;
import net.centertain.cemm.world.biome.LimestoneSteppesBiome;
import net.centertain.cemm.world.biome.LigniteFlatsBiome;
import net.centertain.cemm.world.biome.JasperCaveBiome;
import net.centertain.cemm.world.biome.HornfelsOverhangsBiome;
import net.centertain.cemm.world.biome.GypsumCaveBiome;
import net.centertain.cemm.world.biome.GraniteCaveBiome;
import net.centertain.cemm.world.biome.DioriteCaveBiome;
import net.centertain.cemm.world.biome.ClaystoneMountainsBiome;
import net.centertain.cemm.world.biome.ChlorophylBiome;
import net.centertain.cemm.world.biome.ChalkSteppesBiome;
import net.centertain.cemm.world.biome.ChalkMountainsBiome;
import net.centertain.cemm.world.biome.BlueschistFormationsBiome;
import net.centertain.cemm.world.biome.BismuthCaveBiome;
import net.centertain.cemm.world.biome.BauxiteSteppesBiome;
import net.centertain.cemm.world.biome.AndesiteCaveBiome;
import net.centertain.cemm.CemmMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

@Mod.EventBusSubscriber
public class CemmModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, CemmMod.MODID);
	public static final RegistryObject<Biome> CHALK_MOUNTAINS = REGISTRY.register("chalk_mountains", ChalkMountainsBiome::createBiome);
	public static final RegistryObject<Biome> CHALK_STEPPES = REGISTRY.register("chalk_steppes", ChalkSteppesBiome::createBiome);
	public static final RegistryObject<Biome> CLAYSTONE_MOUNTAINS = REGISTRY.register("claystone_mountains", ClaystoneMountainsBiome::createBiome);
	public static final RegistryObject<Biome> SHUNGITE_MINES = REGISTRY.register("shungite_mines", ShungiteMinesBiome::createBiome);
	public static final RegistryObject<Biome> HORNFELS_OVERHANGS = REGISTRY.register("hornfels_overhangs", HornfelsOverhangsBiome::createBiome);
	public static final RegistryObject<Biome> LIGNITE_FLATS = REGISTRY.register("lignite_flats", LigniteFlatsBiome::createBiome);
	public static final RegistryObject<Biome> BAUXITE_STEPPES = REGISTRY.register("bauxite_steppes", BauxiteSteppesBiome::createBiome);
	public static final RegistryObject<Biome> MONAZITE_DESERT = REGISTRY.register("monazite_desert", MonaziteDesertBiome::createBiome);
	public static final RegistryObject<Biome> ZIRCONIAN_DESERT = REGISTRY.register("zirconian_desert", ZirconianDesertBiome::createBiome);
	public static final RegistryObject<Biome> LIMESTONE_STEPPES = REGISTRY.register("limestone_steppes", LimestoneSteppesBiome::createBiome);
	public static final RegistryObject<Biome> BLUESCHIST_FORMATIONS = REGISTRY.register("blueschist_formations", BlueschistFormationsBiome::createBiome);
	public static final RegistryObject<Biome> GYPSUM_CAVE = REGISTRY.register("gypsum_cave", GypsumCaveBiome::createBiome);
	public static final RegistryObject<Biome> MARBLE_CAVE = REGISTRY.register("marble_cave", MarbleCaveBiome::createBiome);
	public static final RegistryObject<Biome> JASPER_CAVE = REGISTRY.register("jasper_cave", JasperCaveBiome::createBiome);
	public static final RegistryObject<Biome> BISMUTH_CAVE = REGISTRY.register("bismuth_cave", BismuthCaveBiome::createBiome);
	public static final RegistryObject<Biome> QUARTZ_CAVE = REGISTRY.register("quartz_cave", QuartzCaveBiome::createBiome);
	public static final RegistryObject<Biome> SULFUR_CAVE = REGISTRY.register("sulfur_cave", SulfurCaveBiome::createBiome);
	public static final RegistryObject<Biome> DIORITE_CAVE = REGISTRY.register("diorite_cave", DioriteCaveBiome::createBiome);
	public static final RegistryObject<Biome> ANDESITE_CAVE = REGISTRY.register("andesite_cave", AndesiteCaveBiome::createBiome);
	public static final RegistryObject<Biome> GRANITE_CAVE = REGISTRY.register("granite_cave", GraniteCaveBiome::createBiome);
	public static final RegistryObject<Biome> NITER_CAVE = REGISTRY.register("niter_cave", NiterCaveBiome::createBiome);
	public static final RegistryObject<Biome> VOID_PILLARS = REGISTRY.register("void_pillars", VoidPillarsBiome::createBiome);
	public static final RegistryObject<Biome> VOID_PITS = REGISTRY.register("void_pits", VoidPitsBiome::createBiome);
	public static final RegistryObject<Biome> VOID_FLATS = REGISTRY.register("void_flats", VoidFlatsBiome::createBiome);
	public static final RegistryObject<Biome> VOID_FOREST = REGISTRY.register("void_forest", VoidForestBiome::createBiome);
	public static final RegistryObject<Biome> CHLOROPHYL = REGISTRY.register("chlorophyl", ChlorophylBiome::createBiome);
	public static final RegistryObject<Biome> RED_WASTES = REGISTRY.register("red_wastes", RedWastesBiome::createBiome);

	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
		WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
		for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
			DimensionType dimensionType = entry.getValue().typeHolder().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = entry.getValue().generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
					for (Climate.ParameterPoint parameterPoint : ChalkMountainsBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, CHALK_MOUNTAINS.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : ChalkSteppesBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, CHALK_STEPPES.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : ClaystoneMountainsBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, CLAYSTONE_MOUNTAINS.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : ShungiteMinesBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, SHUNGITE_MINES.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : HornfelsOverhangsBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, HORNFELS_OVERHANGS.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : LigniteFlatsBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, LIGNITE_FLATS.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : BauxiteSteppesBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, BAUXITE_STEPPES.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : MonaziteDesertBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, MONAZITE_DESERT.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : ZirconianDesertBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, ZIRCONIAN_DESERT.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : LimestoneSteppesBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, LIMESTONE_STEPPES.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : BlueschistFormationsBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, BLUESCHIST_FORMATIONS.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : GypsumCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, GYPSUM_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : MarbleCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, MARBLE_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : JasperCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, JASPER_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : BismuthCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, BISMUTH_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : QuartzCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, QUARTZ_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : SulfurCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, SULFUR_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : DioriteCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, DIORITE_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : AndesiteCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, ANDESITE_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : GraniteCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, GRANITE_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : NiterCaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, NITER_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : ChlorophylBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, CHLOROPHYL.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : RedWastesBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, RED_WASTES.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : GypsumCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, GYPSUM_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : MarbleCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, MARBLE_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : JasperCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, JASPER_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : BismuthCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, BISMUTH_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : QuartzCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, QUARTZ_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : SulfurCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, SULFUR_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : DioriteCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, DIORITE_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : AndesiteCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, ANDESITE_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : GraniteCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, GRANITE_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : NiterCaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, NITER_CAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : ChlorophylBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, CHLOROPHYL.getId()))));
					}

					chunkGenerator.biomeSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters), noiseSource.preset);
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, GYPSUM_CAVE.getId()), CemmModBlocks.GYPSUM.get().defaultBlockState(), CemmModBlocks.GYPSUM.get().defaultBlockState(),
								CemmModBlocks.GYPSUM.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, MARBLE_CAVE.getId()), CemmModBlocks.MARBLE.get().defaultBlockState(), CemmModBlocks.MARBLE.get().defaultBlockState(),
								CemmModBlocks.MARBLE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, JASPER_CAVE.getId()), CemmModBlocks.JASPER.get().defaultBlockState(), CemmModBlocks.JASPER.get().defaultBlockState(),
								CemmModBlocks.JASPER.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, BISMUTH_CAVE.getId()), CemmModBlocks.BISMUTHINITE.get().defaultBlockState(), CemmModBlocks.BISMUTHINITE.get().defaultBlockState(),
								CemmModBlocks.BISMUTHINITE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, QUARTZ_CAVE.getId()), CemmModBlocks.MASUYITE.get().defaultBlockState(), CemmModBlocks.MASUYITE.get().defaultBlockState(),
								CemmModBlocks.MASUYITE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, SULFUR_CAVE.getId()), Blocks.COARSE_DIRT.defaultBlockState(), CemmModBlocks.MASUYITE.get().defaultBlockState(),
								CemmModBlocks.MASUYITE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, DIORITE_CAVE.getId()), Blocks.DIORITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, ANDESITE_CAVE.getId()), Blocks.ANDESITE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, GRANITE_CAVE.getId()), Blocks.GRANITE.defaultBlockState(), Blocks.GRANITE.defaultBlockState(), Blocks.GRANITE.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, NITER_CAVE.getId()), CemmModBlocks.TRONDHJEMITE.get().defaultBlockState(), CemmModBlocks.TRONDHJEMITE.get().defaultBlockState(),
								CemmModBlocks.TRONDHJEMITE.get().defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, CHLOROPHYL.getId()), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), Blocks.MOSS_BLOCK.defaultBlockState(),
								Blocks.MOSS_BLOCK.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, CHALK_MOUNTAINS.getId()), CemmModBlocks.CHALK.get().defaultBlockState(), CemmModBlocks.CHALK.get().defaultBlockState(),
								CemmModBlocks.CHALK.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, CHALK_STEPPES.getId()), CemmModBlocks.CHALK.get().defaultBlockState(), CemmModBlocks.CHALK.get().defaultBlockState(),
								CemmModBlocks.CHALK.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, CLAYSTONE_MOUNTAINS.getId()), CemmModBlocks.CLAYSTONE.get().defaultBlockState(), CemmModBlocks.CLAYSTONE.get().defaultBlockState(),
								CemmModBlocks.CLAYSTONE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, SHUNGITE_MINES.getId()), CemmModBlocks.SHUNGITE.get().defaultBlockState(), CemmModBlocks.SHUNGITE.get().defaultBlockState(),
								Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, HORNFELS_OVERHANGS.getId()), CemmModBlocks.HORNFELS.get().defaultBlockState(), CemmModBlocks.HORNFELS.get().defaultBlockState(),
								CemmModBlocks.HORNFELS.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, LIGNITE_FLATS.getId()), Blocks.GRASS_BLOCK.defaultBlockState(), CemmModBlocks.LIGNITE_BLOCK.get().defaultBlockState(),
								CemmModBlocks.LIGNITE_BLOCK.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, BAUXITE_STEPPES.getId()), CemmModBlocks.BAUXITE_BLOCK.get().defaultBlockState(), CemmModBlocks.BAUXITE_BLOCK.get().defaultBlockState(),
								CemmModBlocks.BAUXITE_BLOCK.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, MONAZITE_DESERT.getId()), CemmModBlocks.MONAZITE_SAND.get().defaultBlockState(), CemmModBlocks.MONAZITE_SAND.get().defaultBlockState(),
								Blocks.STONE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, ZIRCONIAN_DESERT.getId()), CemmModBlocks.ZIRCON_SAND.get().defaultBlockState(), CemmModBlocks.ZIRCON_SAND.get().defaultBlockState(),
								Blocks.STONE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, LIMESTONE_STEPPES.getId()), CemmModBlocks.LIMESTONE.get().defaultBlockState(), CemmModBlocks.LIMESTONE.get().defaultBlockState(),
								CemmModBlocks.LIMESTONE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, BLUESCHIST_FORMATIONS.getId()), CemmModBlocks.BLUESCHIST.get().defaultBlockState(), CemmModBlocks.BLUESCHIST.get().defaultBlockState(),
								CemmModBlocks.BLUESCHIST.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, GYPSUM_CAVE.getId()), CemmModBlocks.GYPSUM.get().defaultBlockState(), CemmModBlocks.GYPSUM.get().defaultBlockState(),
								CemmModBlocks.GYPSUM.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, MARBLE_CAVE.getId()), CemmModBlocks.MARBLE.get().defaultBlockState(), CemmModBlocks.MARBLE.get().defaultBlockState(),
								CemmModBlocks.MARBLE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, JASPER_CAVE.getId()), CemmModBlocks.JASPER.get().defaultBlockState(), CemmModBlocks.JASPER.get().defaultBlockState(),
								CemmModBlocks.JASPER.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, BISMUTH_CAVE.getId()), CemmModBlocks.BISMUTHINITE.get().defaultBlockState(), CemmModBlocks.BISMUTHINITE.get().defaultBlockState(),
								CemmModBlocks.BISMUTHINITE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, QUARTZ_CAVE.getId()), CemmModBlocks.MASUYITE.get().defaultBlockState(), CemmModBlocks.MASUYITE.get().defaultBlockState(),
								CemmModBlocks.MASUYITE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, SULFUR_CAVE.getId()), Blocks.COARSE_DIRT.defaultBlockState(), CemmModBlocks.MASUYITE.get().defaultBlockState(),
								CemmModBlocks.MASUYITE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, DIORITE_CAVE.getId()), Blocks.DIORITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState(), Blocks.DIORITE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, ANDESITE_CAVE.getId()), Blocks.ANDESITE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState(), Blocks.ANDESITE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, GRANITE_CAVE.getId()), Blocks.GRANITE.defaultBlockState(), Blocks.GRANITE.defaultBlockState(), Blocks.GRANITE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, NITER_CAVE.getId()), CemmModBlocks.TRONDHJEMITE.get().defaultBlockState(), CemmModBlocks.TRONDHJEMITE.get().defaultBlockState(),
								CemmModBlocks.TRONDHJEMITE.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, CHLOROPHYL.getId()), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), Blocks.MOSS_BLOCK.defaultBlockState(),
								Blocks.MOSS_BLOCK.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, RED_WASTES.getId()), Blocks.RED_SAND.defaultBlockState(), CemmModBlocks.JASPILITE.get().defaultBlockState(), Blocks.STONE.defaultBlockState()));
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
