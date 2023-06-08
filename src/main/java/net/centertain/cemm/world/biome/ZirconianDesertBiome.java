
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

public class ZirconianDesertBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-0.2666666666666666f, 2f), Climate.Parameter.span(-2f, 0.19999999999999996f), Climate.Parameter.span(0.29000000000000004f, 2f),
					Climate.Parameter.span(-1.9000000000000001f, 0.4999999999999998f), Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.6232921046824633f, 1.7767078953175366f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(-0.2666666666666666f, 2f), Climate.Parameter.span(-2f, 0.19999999999999996f), Climate.Parameter.span(0.29000000000000004f, 2f),
					Climate.Parameter.span(-1.9000000000000001f, 0.4999999999999998f), Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.6232921046824633f, 1.7767078953175366f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607).foliageColorOverride(10387789).grassColorOverride(9470285)
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("cemm:music.machine")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("cemm:disk_sand_zirconian_desert",
						FeatureUtils.register("cemm:disk_sand_zirconian_desert", Feature.DISK,
								new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.SAND), BlockPredicate.matchesBlocks(List.of(CemmModBlocks.ZIRCON_SAND.get(), CemmModBlocks.ZIRCON_SAND.get())), UniformInt.of(2, 6), 2)),
						List.of(CountPlacement.of(10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 20, 2, 4));
		mobSpawnInfo.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 20, 1, 4));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(1.9f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
