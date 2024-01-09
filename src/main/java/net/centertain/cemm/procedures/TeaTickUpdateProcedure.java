package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class TeaTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 7 && Math.random() <= 0.25) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.TEA_00.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.TEA_01.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.TEA_01.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.TEA_02.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.TEA_02.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.TEA_03.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.TEA_03.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.TEA_04.get().defaultBlockState(), 3);
			}
		}
	}
}
