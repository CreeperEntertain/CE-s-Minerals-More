package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class XPStoringProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.XP_STORAGE.get()) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 0) {
				if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 30) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.XP_STORAGE_FULL.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("XPLevel", 30);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(30));
				} else {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.XP_STORAGE_FULL.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("XPLevel", (entity instanceof Player _plr ? _plr.experienceLevel : 0));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(entity instanceof Player _plr ? _plr.experienceLevel : 0));
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.charge")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.respawn_anchor.charge")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.XP_STORAGE_FULL.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bottle.empty")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bottle.empty")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (entity instanceof Player _player)
				_player.giveExperienceLevels((int) (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "XPLevel")));
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.XP_STORAGE.get().defaultBlockState(), 3);
		}
	}
}
