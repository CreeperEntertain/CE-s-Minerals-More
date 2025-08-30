package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class AlgaeUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:salt"))) || (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:salt")))
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:salt"))) || (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:salt")))
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:salt"))) || (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:salt")))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.ALGAE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DECAYING_ALGAE.get().defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1, 1, 1, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECAYING_ALGAE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DECAYED_ALGAE.get().defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1, 1, 1, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECAYED_ALGAE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DYING_ALGAE.get().defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1, 1, 1, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DYING_ALGAE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DEAD_ALGAE.get().defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1, 1, 1, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.ALGAE_CARPET.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DECAYING_ALGAE_CARPET.get().defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1, 1, 1, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECAYING_ALGAE_CARPET.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DECAYED_ALGAE_CARPET.get().defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1, 1, 1, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECAYED_ALGAE_CARPET.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DYING_ALGAE_CARPET.get().defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1, 1, 1, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DYING_ALGAE_CARPET.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DEAD_ALGAE_CARPET.get().defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1, 1, 1, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.blow_out")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
