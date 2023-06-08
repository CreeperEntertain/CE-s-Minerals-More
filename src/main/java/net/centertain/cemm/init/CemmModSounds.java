
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.centertain.cemm.CemmMod;

public class CemmModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CemmMod.MODID);
	public static final RegistryObject<SoundEvent> BLOCK_SILENCE = REGISTRY.register("block.silence", () -> new SoundEvent(new ResourceLocation("cemm", "block.silence")));
	public static final RegistryObject<SoundEvent> MOOD_VOID = REGISTRY.register("mood.void", () -> new SoundEvent(new ResourceLocation("cemm", "mood.void")));
	public static final RegistryObject<SoundEvent> MOOD_CAVE = REGISTRY.register("mood.cave", () -> new SoundEvent(new ResourceLocation("cemm", "mood.cave")));
	public static final RegistryObject<SoundEvent> AMBIENT_WIND_1 = REGISTRY.register("ambient.wind_1", () -> new SoundEvent(new ResourceLocation("cemm", "ambient.wind_1")));
	public static final RegistryObject<SoundEvent> AMBIENT_WIND_2 = REGISTRY.register("ambient.wind_2", () -> new SoundEvent(new ResourceLocation("cemm", "ambient.wind_2")));
	public static final RegistryObject<SoundEvent> AMBIENT_WIND_0 = REGISTRY.register("ambient.wind_0", () -> new SoundEvent(new ResourceLocation("cemm", "ambient.wind_0")));
	public static final RegistryObject<SoundEvent> DISC_BLISS = REGISTRY.register("disc.bliss", () -> new SoundEvent(new ResourceLocation("cemm", "disc.bliss")));
	public static final RegistryObject<SoundEvent> DISC_CHALK = REGISTRY.register("disc.chalk", () -> new SoundEvent(new ResourceLocation("cemm", "disc.chalk")));
	public static final RegistryObject<SoundEvent> DISC_CHANTS = REGISTRY.register("disc.chants", () -> new SoundEvent(new ResourceLocation("cemm", "disc.chants")));
	public static final RegistryObject<SoundEvent> DISC_FOEHN = REGISTRY.register("disc.foehn", () -> new SoundEvent(new ResourceLocation("cemm", "disc.foehn")));
	public static final RegistryObject<SoundEvent> DISC_HEPTAGONAL = REGISTRY.register("disc.heptagonal", () -> new SoundEvent(new ResourceLocation("cemm", "disc.heptagonal")));
	public static final RegistryObject<SoundEvent> DISC_HIRETH = REGISTRY.register("disc.hireth", () -> new SoundEvent(new ResourceLocation("cemm", "disc.hireth")));
	public static final RegistryObject<SoundEvent> DISC_MACHINE = REGISTRY.register("disc.machine", () -> new SoundEvent(new ResourceLocation("cemm", "disc.machine")));
	public static final RegistryObject<SoundEvent> DISC_WARPED_FRAMEWORK = REGISTRY.register("disc.warped_framework", () -> new SoundEvent(new ResourceLocation("cemm", "disc.warped_framework")));
	public static final RegistryObject<SoundEvent> DISC_HUSH = REGISTRY.register("disc.hush", () -> new SoundEvent(new ResourceLocation("cemm", "disc.hush")));
	public static final RegistryObject<SoundEvent> MUSIC_BLISS = REGISTRY.register("music.bliss", () -> new SoundEvent(new ResourceLocation("cemm", "music.bliss")));
	public static final RegistryObject<SoundEvent> MUSIC_CHALK = REGISTRY.register("music.chalk", () -> new SoundEvent(new ResourceLocation("cemm", "music.chalk")));
	public static final RegistryObject<SoundEvent> MUSIC_CHANTS = REGISTRY.register("music.chants", () -> new SoundEvent(new ResourceLocation("cemm", "music.chants")));
	public static final RegistryObject<SoundEvent> MUSIC_FOEHN = REGISTRY.register("music.foehn", () -> new SoundEvent(new ResourceLocation("cemm", "music.foehn")));
	public static final RegistryObject<SoundEvent> MUSIC_HEPTAGONAL = REGISTRY.register("music.heptagonal", () -> new SoundEvent(new ResourceLocation("cemm", "music.heptagonal")));
	public static final RegistryObject<SoundEvent> MUSIC_HIRETH = REGISTRY.register("music.hireth", () -> new SoundEvent(new ResourceLocation("cemm", "music.hireth")));
	public static final RegistryObject<SoundEvent> MUSIC_HUSH = REGISTRY.register("music.hush", () -> new SoundEvent(new ResourceLocation("cemm", "music.hush")));
	public static final RegistryObject<SoundEvent> MUSIC_MACHINE = REGISTRY.register("music.machine", () -> new SoundEvent(new ResourceLocation("cemm", "music.machine")));
	public static final RegistryObject<SoundEvent> MUSIC_WARPED_FRAMEWORK = REGISTRY.register("music.warped_framework", () -> new SoundEvent(new ResourceLocation("cemm", "music.warped_framework")));
	public static final RegistryObject<SoundEvent> BLOCK_ELECTRICITY = REGISTRY.register("block.electricity", () -> new SoundEvent(new ResourceLocation("cemm", "block.electricity")));
}
