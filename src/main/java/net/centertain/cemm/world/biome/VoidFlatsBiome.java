
package net.centertain.cemm.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;

public class VoidFlatsBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16777216).waterColor(-16777216).waterFogColor(-16777216).skyColor(-16777216).foliageColorOverride(-6710887).grassColorOverride(-6710887)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("cemm:ambient.wind_1"))).ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("cemm:mood.void")), 2400, 8, 2))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("cemm:music.warped_framework")), 12000, 24000, true)).ambientParticle(new AmbientParticleSettings(ParticleTypes.LARGE_SMOKE, 0.001f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITHER_SKELETON, 20, 1, 4));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(0.5f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
