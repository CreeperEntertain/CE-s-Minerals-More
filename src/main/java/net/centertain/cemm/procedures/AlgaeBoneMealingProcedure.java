package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class AlgaeBoneMealingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DEAD_ALGAE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DYING_ALGAE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DYING_ALGAE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DECAYED_ALGAE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECAYED_ALGAE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DECAYING_ALGAE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECAYING_ALGAE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.ALGAE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DEAD_ALGAE_CARPET.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DYING_ALGAE_CARPET.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DYING_ALGAE_CARPET.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DECAYED_ALGAE_CARPET.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECAYED_ALGAE_CARPET.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DECAYING_ALGAE_CARPET.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECAYING_ALGAE_CARPET.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.ALGAE_CARPET.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.ALGAE_CARPET.get()) {
			AlgaeSpreadProcedure.execute(world, x, y, z);
		}
	}
}
