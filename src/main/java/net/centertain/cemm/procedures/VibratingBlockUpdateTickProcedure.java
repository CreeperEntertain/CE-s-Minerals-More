package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class VibratingBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_PYROXENE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.PYROXENE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_PHYLLITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.PHYLLITE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_WHITE_GRANITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.WHITE_GRANITE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_SOAPSTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SOAPSTONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_SERANDITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SERANDITE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_SANIDINE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SANIDINE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_RED_SALT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.RED_SALT.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_QUARTZITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.QUARTZITE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_OLIGOCLASE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OLIGOCLASE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_MYLONITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.MYLONITE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_MONZONITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.MONZONITE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_MICROCLINE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.MICROCLINE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.VIBRATING_ANORTHITE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.ANORTHITE.get().defaultBlockState(), 3);
			}
		}
	}
}
