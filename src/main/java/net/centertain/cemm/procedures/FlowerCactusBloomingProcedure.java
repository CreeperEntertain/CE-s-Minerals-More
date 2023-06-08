package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class FlowerCactusBloomingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getLevelData().isRaining() || world.getLevelData().isThundering()) && world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && Math.random() >= 0.5) {
			world.setBlock(new BlockPos(x, y, z), CemmModBlocks.FLOWER_CACTUS.get().defaultBlockState(), 3);
		}
	}
}
