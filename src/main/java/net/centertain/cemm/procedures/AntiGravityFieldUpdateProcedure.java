package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class AntiGravityFieldUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.ANTI_GRAVITY_FIELD.get())) {
			if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.ANTI_GRAVITY_FIELD.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CemmModBlocks.ANTI_GRAVITY.get())) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.ANTI_GRAVITY.get().defaultBlockState(), 3);
		}
	}
}
