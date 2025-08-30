package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class BloodFluidMixingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getFluidState().isSource()) {
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.LAVA
					|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.LAVA
					|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA
					|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LAVA
					|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.LAVA
					|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == CemmModBlocks.LIQUID_GOLD.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.LAVA) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.LAVASLATE.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.extinguish")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			} else if ((world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).getBlock() == CemmModBlocks.OIL.get()
					|| (world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).getBlock() == CemmModBlocks.OIL.get()
					|| (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == CemmModBlocks.OIL.get()
					|| (world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y + 1, z)).createLegacyBlock()).getBlock() == CemmModBlocks.OIL.get()
					|| (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).getBlock() == CemmModBlocks.OIL.get()
					|| (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).getBlock() == CemmModBlocks.OIL.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BLOODSTONE.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		}
	}
}
