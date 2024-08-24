package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class SpiderSucculentBladesTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.25) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SPIDER_EGG.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CRACKED_SPIDER_EGG.get().defaultBlockState(), 3);
		}
	}
}
