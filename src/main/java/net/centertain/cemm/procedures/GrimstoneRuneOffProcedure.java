package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class GrimstoneRuneOffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_01_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_01.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_02_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_02.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_03_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_03.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_04_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_04.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_05_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_05.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_06_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_06.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_07_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_07.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_08_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_08.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_09_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_09.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.GRIMSTONE_RUNE_10_ACTIVE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GRIMSTONE_RUNE_10.get().defaultBlockState(), 3);
		}
	}
}
