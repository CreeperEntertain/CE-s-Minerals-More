package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class AlgaeSpreadTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && CemmModBlocks.ALGAE_CARPET.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.ALGAE_CARPET.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR && CemmModBlocks.ALGAE_CARPET.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z))) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.ALGAE_CARPET.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && CemmModBlocks.ALGAE_CARPET.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y - 1, z))) {
			world.setBlock(BlockPos.containing(x, y - 1, z), CemmModBlocks.ALGAE_CARPET.get().defaultBlockState(), 3);
		}
	}
}
