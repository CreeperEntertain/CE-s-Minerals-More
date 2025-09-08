package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class RedSeagrassMinedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double REP = 0;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1) < 2) {
			REP = 1;
		} else {
			REP = Mth.nextDouble(RandomSource.create(), 1, 3);
		}
		for (int index0 = 0; index0 < (int) REP; index0++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + Math.random()), (y + Math.random()), (z + Math.random()), new ItemStack(CemmModBlocks.RED_SEAGRASS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
