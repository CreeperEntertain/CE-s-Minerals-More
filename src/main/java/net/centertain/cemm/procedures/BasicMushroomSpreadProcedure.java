package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BasicMushroomSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		double XCheck = 0;
		double ZCheck = 0;
		double YCheck = 0;
		if (Math.random() < 0.002) {
			XCheck = x + Mth.nextInt(RandomSource.create(), -1, 1);
			ZCheck = z + Mth.nextInt(RandomSource.create(), -1, 1);
			YCheck = y + 1;
			for (int index0 = 0; index0 < 3; index0++) {
				if ((world.getBlockState(BlockPos.containing(XCheck, YCheck, ZCheck))).getBlock() == Blocks.AIR
						&& world.getBlockState(BlockPos.containing(XCheck, YCheck - 1, ZCheck)).isFaceSturdy(world, BlockPos.containing(XCheck, YCheck - 1, ZCheck), Direction.UP)) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).canSurvive(world, BlockPos.containing(XCheck, YCheck, ZCheck))
							&& world.getBlockState(BlockPos.containing(XCheck, YCheck, ZCheck)).getLightEmission(world, BlockPos.containing(XCheck, YCheck, ZCheck)) <= 3) {
						world.setBlock(BlockPos.containing(XCheck, YCheck, ZCheck), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
					}
				}
				YCheck = YCheck - 1;
			}
		}
	}
}
