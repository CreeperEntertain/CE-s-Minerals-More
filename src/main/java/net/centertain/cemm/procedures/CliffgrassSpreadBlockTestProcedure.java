package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class CliffgrassSpreadBlockTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double PhaseY = 0;
		PhaseY = -2;
		for (int index0 = 0; index0 < 4; index0++) {
			if (!world.getBlockState(BlockPos.containing(x, y + PhaseY + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + PhaseY + 1, z), Direction.DOWN)) {
				if ((world.getBlockState(BlockPos.containing(x, y + PhaseY, z))).getBlock() == CemmModBlocks.DARK_ANDESITE.get()) {
					world.setBlock(BlockPos.containing(x, y + PhaseY, z), CemmModBlocks.CLIFFGRASSED_DARK_ANDESITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y + PhaseY, z))).getBlock() == CemmModBlocks.CLIFFCOBBLES.get()) {
					world.setBlock(BlockPos.containing(x, y + PhaseY, z), CemmModBlocks.GRASSED_CLIFFCOBBLES.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y + PhaseY, z))).getBlock() == CemmModBlocks.CLIFFSTONE.get()) {
					world.setBlock(BlockPos.containing(x, y + PhaseY, z), CemmModBlocks.GRASSED_CLIFFSTONE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y + PhaseY, z))).getBlock() == CemmModBlocks.CLIFFDIRT.get()) {
					world.setBlock(BlockPos.containing(x, y + PhaseY, z), CemmModBlocks.GRASSED_CLIFFDIRT.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y + PhaseY, z))).getBlock() == CemmModBlocks.CLIFFPEAT.get()) {
					world.setBlock(BlockPos.containing(x, y + PhaseY, z), CemmModBlocks.GRASSED_CLIFFPEAT.get().defaultBlockState(), 3);
				}
			}
			PhaseY = PhaseY + 1;
		}
	}
}
