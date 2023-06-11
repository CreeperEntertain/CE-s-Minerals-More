package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class FlowerCactusWiltingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getLevelData().isRaining() || world.getLevelData().isThundering()) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && Math.random() >= 0.25) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.FLOWERLESS_CACTUS.get().defaultBlockState(), 3);
		}
	}
}
