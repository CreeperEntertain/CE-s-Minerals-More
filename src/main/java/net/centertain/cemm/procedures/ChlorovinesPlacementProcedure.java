package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChlorovinesPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_0.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_1.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_2.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_3.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_4.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_5.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROWOOD_LEAVES_6.get() || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROVINES_PLANT.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CemmModBlocks.CHLOROVINES.get()) {
			return true;
		}
		return false;
	}
}
