
package net.centertain.cemm.world.biome;

import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedBlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.List;

public class NiterCaveBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(0.44666666666666677f, 0.4866666666666668f), Climate.Parameter.span(-0.21999999999999995f, -0.17999999999999997f), Climate.Parameter.span(0.27999999999999997f, 0.32f),
					Climate.Parameter.span(-0.32000000000000006f, -0.28f), Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.4830073811566111f, -0.4430073811566111f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(0.44666666666666677f, 0.4866666666666668f), Climate.Parameter.span(-0.21999999999999995f, -0.17999999999999997f), Climate.Parameter.span(0.27999999999999997f, 0.32f),
					Climate.Parameter.span(-0.32000000000000006f, -0.28f), Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.4830073811566111f, -0.4430073811566111f), 0));
	public static final List<Climate.ParameterPoint> UNDERGROUND_PARAMETER_POINTS = List
			.of(new Climate.ParameterPoint(Climate.Parameter.span(0.44666666666666677f, 0.4866666666666668f), Climate.Parameter.span(-0.21999999999999995f, -0.17999999999999997f), Climate.Parameter.span(0.27999999999999997f, 0.32f),
					Climate.Parameter.span(-0.32000000000000006f, -0.28f), Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.4830073811566111f, -0.4430073811566111f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607).foliageColorOverride(10387789).grassColorOverride(9470285)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("cemm:ambient.wind_0"))).ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("cemm:mood.cave")), 6000, 8, 2))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("cemm:music.machine")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("cemm:disk_sand_niter_cave",
						FeatureUtils.register("cemm:disk_sand_niter_cave", Feature.DISK,
								new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.SAND), BlockPredicate.matchesBlocks(List.of(CemmModBlocks.TRONDHJEMITE.get(), CemmModBlocks.TRONDHJEMITE.get())), UniformInt.of(2, 6), 2)),
						List.of(CountPlacement.of(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCrystalFormations(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDripstone(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		BiomeDefaultFeatures.addLushCavesVegetationFeatures(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
		BiomeDefaultFeatures.addMossyStoneBlock(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 20, 1, 3));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 10, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 10, 1, 2));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(1.2f).downfall(0.4f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
