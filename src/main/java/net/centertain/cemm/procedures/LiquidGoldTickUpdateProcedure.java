package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class LiquidGoldTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		double surroundedOnSides = 0;
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getFluidState().isSource()) {
			surroundedOnSides = surroundedOnSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getFluidState().isSource()) {
			surroundedOnSides = surroundedOnSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getFluidState().isSource()) {
			surroundedOnSides = surroundedOnSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getFluidState().isSource()) {
			surroundedOnSides = surroundedOnSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getFluidState().isSource()) {
			surroundedOnSides = surroundedOnSides + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getFluidState().isSource()) {
			surroundedOnSides = surroundedOnSides + 1;
		}
		if (surroundedOnSides <= 3) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource() && Math.random() <= (((world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f) / 100) / 100) * (-1) + 0.02) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.RAW_GOLD_BLOCK.defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.35, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.35, 1, false);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.RAW_GOLD_BLOCK.defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.35, 1);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, (float) 0.35, 1, false);
				}
			}
		} else {
			if (Math.random() <= ((world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f) / 100) / 400 + 0.005) {
				RAND = Mth.nextInt(RandomSource.create(), 0, 5);
				if (RAND == 0) {
					if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:gold_blocks")))) {
						world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.LIQUID_GOLD.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x - 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1);
							} else {
								_level.playLocalSound((x - 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1, false);
							}
						}
					}
				} else if (RAND == 1) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:gold_blocks")))) {
						world.setBlock(BlockPos.containing(x + 1, y, z), CemmModBlocks.LIQUID_GOLD.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + 1.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1);
							} else {
								_level.playLocalSound((x + 1.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1, false);
							}
						}
					}
				} else if (RAND == 2) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:gold_blocks")))) {
						world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.LIQUID_GOLD.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + 0.5, y - 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1);
							} else {
								_level.playLocalSound((x + 0.5), (y - 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1, false);
							}
						}
					}
				} else if (RAND == 3) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:gold_blocks")))) {
						world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.LIQUID_GOLD.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + 0.5, y + 1.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1);
							} else {
								_level.playLocalSound((x + 0.5), (y + 1.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1, false);
							}
						}
					}
				} else if (RAND == 4) {
					if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:gold_blocks")))) {
						world.setBlock(BlockPos.containing(x, y, z - 1), CemmModBlocks.LIQUID_GOLD.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z - 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1);
							} else {
								_level.playLocalSound((x + 0.5), (y + 0.5), (z - 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1, false);
							}
						}
					}
				} else if (RAND == 5) {
					if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:gold_blocks")))) {
						world.setBlock(BlockPos.containing(x, y, z + 1), CemmModBlocks.LIQUID_GOLD.get().defaultBlockState(), 3);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 1.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1);
							} else {
								_level.playLocalSound((x + 0.5), (y + 0.5), (z + 1.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.BLOCKS, (float) 0.35, 1, false);
							}
						}
					}
				}
			}
		}
	}
}
