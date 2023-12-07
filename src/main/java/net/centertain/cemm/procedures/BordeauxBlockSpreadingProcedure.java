package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class BordeauxBlockSpreadingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.65) {
			if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.PYROXENE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_PYROXENE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.PHYLLITE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_PHYLLITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.WHITE_GRANITE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_WHITE_GRANITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SOAPSTONE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_SOAPSTONE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SERANDITE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_SERANDITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.SANIDINE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_SANIDINE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.RED_SALT.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_RED_SALT.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.QUARTZITE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_QUARTZITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OLIGOCLASE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_OLIGOCLASE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.MYLONITE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_MYLONITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.MONZONITE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_MONZONITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.MICROCLINE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_MICROCLINE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.ANORTHITE.get()) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.BORDEAUX_ANORTHITE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
