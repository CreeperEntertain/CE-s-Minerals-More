
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
	public static final RegistryObject<SoundEvent> BLOCK_SILENCE = REGISTRY.register("block.silence", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "block.silence")));
	public static final RegistryObject<SoundEvent> MOOD_VOID = REGISTRY.register("mood.void", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "mood.void")));
	public static final RegistryObject<SoundEvent> MOOD_CAVE = REGISTRY.register("mood.cave", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "mood.cave")));
	public static final RegistryObject<SoundEvent> AMBIENT_WIND_1 = REGISTRY.register("ambient.wind_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "ambient.wind_1")));
	public static final RegistryObject<SoundEvent> AMBIENT_WIND_2 = REGISTRY.register("ambient.wind_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "ambient.wind_2")));
	public static final RegistryObject<SoundEvent> AMBIENT_WIND_0 = REGISTRY.register("ambient.wind_0", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "ambient.wind_0")));
	public static final RegistryObject<SoundEvent> DISC_BLISS = REGISTRY.register("disc.bliss", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.bliss")));
	public static final RegistryObject<SoundEvent> DISC_CHALK = REGISTRY.register("disc.chalk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.chalk")));
	public static final RegistryObject<SoundEvent> DISC_CHANTS = REGISTRY.register("disc.chants", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.chants")));
	public static final RegistryObject<SoundEvent> DISC_FOEHN = REGISTRY.register("disc.foehn", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.foehn")));
	public static final RegistryObject<SoundEvent> DISC_HEPTAGONAL = REGISTRY.register("disc.heptagonal", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.heptagonal")));
	public static final RegistryObject<SoundEvent> DISC_HIRETH = REGISTRY.register("disc.hireth", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.hireth")));
	public static final RegistryObject<SoundEvent> DISC_MACHINE = REGISTRY.register("disc.machine", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.machine")));
	public static final RegistryObject<SoundEvent> DISC_WARPED_FRAMEWORK = REGISTRY.register("disc.warped_framework", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.warped_framework")));
	public static final RegistryObject<SoundEvent> DISC_HUSH = REGISTRY.register("disc.hush", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "disc.hush")));
	public static final RegistryObject<SoundEvent> MUSIC_BLISS = REGISTRY.register("music.bliss", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.bliss")));
	public static final RegistryObject<SoundEvent> MUSIC_CHALK = REGISTRY.register("music.chalk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.chalk")));
	public static final RegistryObject<SoundEvent> MUSIC_CHANTS = REGISTRY.register("music.chants", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.chants")));
	public static final RegistryObject<SoundEvent> MUSIC_FOEHN = REGISTRY.register("music.foehn", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.foehn")));
	public static final RegistryObject<SoundEvent> MUSIC_HEPTAGONAL = REGISTRY.register("music.heptagonal", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.heptagonal")));
	public static final RegistryObject<SoundEvent> MUSIC_HIRETH = REGISTRY.register("music.hireth", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.hireth")));
	public static final RegistryObject<SoundEvent> MUSIC_HUSH = REGISTRY.register("music.hush", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.hush")));
	public static final RegistryObject<SoundEvent> MUSIC_MACHINE = REGISTRY.register("music.machine", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.machine")));
	public static final RegistryObject<SoundEvent> MUSIC_WARPED_FRAMEWORK = REGISTRY.register("music.warped_framework", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "music.warped_framework")));
	public static final RegistryObject<SoundEvent> BLOCK_ELECTRICITY = REGISTRY.register("block.electricity", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "block.electricity")));
	public static final RegistryObject<SoundEvent> BLOCK_DEEPSTONE_PLACED = REGISTRY.register("block.deepstone.placed", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "block.deepstone.placed")));
	public static final RegistryObject<SoundEvent> BLOCK_DEEPSTONE_BREAK = REGISTRY.register("block.deepstone.break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "block.deepstone.break")));
	public static final RegistryObject<SoundEvent> BLOCK_DEEPSTONE_STEP = REGISTRY.register("block.deepstone.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cemm", "block.deepstone.step")));
}
