package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class MountainLaurelStemDestructionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x + 1, y, z), _level.getBlockState(BlockPos.containing(x + 1, y, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x - 1, y, z), _level.getBlockState(BlockPos.containing(x - 1, y, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y + 1, z), _level.getBlockState(BlockPos.containing(x, y + 1, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y - 1, z), _level.getBlockState(BlockPos.containing(x, y - 1, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y, z + 1), _level.getBlockState(BlockPos.containing(x, y, z + 1)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y, z - 1), _level.getBlockState(BlockPos.containing(x, y, z - 1)).getBlock());
	}
}
