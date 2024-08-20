package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class WinewoodTrunkLayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
			world.setBlock(BlockPos.containing(x - 1, y, z), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
			world.setBlock(BlockPos.containing(x + 1, y, z), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
			world.setBlock(BlockPos.containing(x, y, z - 1), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
			world.setBlock(BlockPos.containing(x, y, z + 1), CemmModBlocks.WINEWOOD_LOG.get().defaultBlockState(), 3);
		}
	}
}
