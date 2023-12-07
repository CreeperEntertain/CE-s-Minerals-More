package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class AshGrowthIncreaseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.FARMLAND) {
			if (Math.random() <= 0.5) {
				world.scheduleTick(BlockPos.containing(x, y + 2, z), world.getBlockState(BlockPos.containing(x, y + 2, z)).getBlock(), 0);
			}
		}
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.NETHER && Math.random() <= 0.05 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR) {
			RAND = Math.random();
			if (RAND <= 0.03) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.ASHEN_SAPLING.get().defaultBlockState(), 3);
			} else if (RAND <= 0.1) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.DEATHBLOOM.get().defaultBlockState(), 3);
			} else if (RAND <= 0.25) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.SPRAYER_FLOWER.get().defaultBlockState(), 3);
			} else if (RAND <= 0.55) {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.ASH_SHRUB.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y + 1, z), CemmModBlocks.ASH_SPROUTS.get().defaultBlockState(), 3);
			}
		}
	}
}
