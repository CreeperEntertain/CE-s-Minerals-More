package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class SlagProductionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:lava")))
				|| (world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:lava")))) {
			world.setBlock(BlockPos.containing(x + 1, y, z), CemmModBlocks.SLAG.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 1.5, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6));
				} else {
					_level.playLocalSound((x + 1.5), y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6), false);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:lava")))
				|| (world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:lava")))) {
			world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.SLAG.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x - 0.5, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6));
				} else {
					_level.playLocalSound((x - 0.5), y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6), false);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:lava")))
				|| (world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:lava")))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.SLAG.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y + 1.5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6));
				} else {
					_level.playLocalSound(x, (y + 1.5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6), false);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:lava")))
				|| (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:lava")))) {
			world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.SLAG.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y - 0.5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6));
				} else {
					_level.playLocalSound(x, (y - 0.5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6), false);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:lava")))
				|| (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:lava")))) {
			world.setBlock(BlockPos.containing(x, y, z + 1), CemmModBlocks.SLAG.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z + 1.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6));
				} else {
					_level.playLocalSound(x, y, (z + 1.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6), false);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:lava")))
				|| (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).is(BlockTags.create(new ResourceLocation("cemm:lava")))) {
			world.setBlock(BlockPos.containing(x, y, z - 1), CemmModBlocks.SLAG.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z - 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6));
				} else {
					_level.playLocalSound(x, y, (z - 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.5, (float) (1.8 + Math.random() * 1.6), false);
				}
			}
		}
	}
}
