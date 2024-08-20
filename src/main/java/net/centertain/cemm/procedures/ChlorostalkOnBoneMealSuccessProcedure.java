package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChlorostalkOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.CHLOROSTALK.get().defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROSTALK_PLANT.get().defaultBlockState(), 3);
	}
}
