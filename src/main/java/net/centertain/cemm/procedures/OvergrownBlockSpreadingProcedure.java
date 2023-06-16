package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class OvergrownBlockSpreadingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.25) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
				if ((world.getLevelData().isRaining() || world.getLevelData().isThundering()) && world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 7
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:water")))
						|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:water")))) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COBBLESTONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_COBBLESTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DIRTY_COBBLESTONE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_DIRTY_COBBLESTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MOSSY_COBBLESTONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_MOSSY_COBBLESTONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.ROCKY_STONE.get()) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_ROCKY_STONE.get().defaultBlockState(), 3);
					} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.OVERGROWN_STONE.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
