package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModEntities;

public class InfestedFleshTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 0, 2); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CemmModEntities.MAGGOT.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		} else if (!world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 0, 2); index1++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CemmModEntities.MAGGOT.get().spawn(_level, BlockPos.containing(x - 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		} else if (!world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
			for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 0, 2); index2++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CemmModEntities.MAGGOT.get().spawn(_level, BlockPos.containing(x + 1.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		} else if (!world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
			for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 0, 2); index3++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CemmModEntities.MAGGOT.get().spawn(_level, BlockPos.containing(x + 0.5, y, z - 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		} else if (!world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
			for (int index4 = 0; index4 < Mth.nextInt(RandomSource.create(), 0, 2); index4++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CemmModEntities.MAGGOT.get().spawn(_level, BlockPos.containing(x + 0.5, y, z + 1.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		} else if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 0, 2); index5++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CemmModEntities.MAGGOT.get().spawn(_level, BlockPos.containing(x + 0.5, y - 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.hatch")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
	}
}
