
package net.centertain.cemm.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import java.util.List;

public class LigniteFlatsBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-0.4f, 0.7999999999999999f), Climate.Parameter.span(-0.7999999999999999f, 0.4f), Climate.Parameter.span(0f, 1.2f), Climate.Parameter.span(0.29999999999999993f, 1.5f),
					Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.5571823263715584f, 0.6428176736284416f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(-0.4f, 0.7999999999999999f), Climate.Parameter.span(-0.7999999999999999f, 0.4f), Climate.Parameter.span(0f, 1.2f), Climate.Parameter.span(0.29999999999999993f, 1.5f),
					Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.5571823263715584f, 0.6428176736284416f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-8743825).waterColor(-5068944).waterFogColor(-10992581).skyColor(-8743825).foliageColorOverride(-10066432).grassColorOverride(-7504066)
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("cemm:music.bliss")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		BiomeDefaultFeatures.addMossyStoneBlock(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 20, 2, 6));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.8f).downfall(0.4f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
