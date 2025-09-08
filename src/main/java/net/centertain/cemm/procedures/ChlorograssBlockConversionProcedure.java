package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ChlorograssBlockConversionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String RegistryName = "";
		if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			if (Math.random() < 0.5) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIRT) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MOSS_BLOCK) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ANDESITE) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRANITE) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DIORITE) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TUFF) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DRIPSTONE_BLOCK) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
