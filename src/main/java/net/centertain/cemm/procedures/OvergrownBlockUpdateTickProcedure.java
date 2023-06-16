package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class OvergrownBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 7
				&& ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:overgrown_placable"))) || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR)) {
			OvergrownBlockSpreadingProcedure.execute(world, (x - 1), y, z);
			OvergrownBlockSpreadingProcedure.execute(world, (x + 1), y, z);
			OvergrownBlockSpreadingProcedure.execute(world, x, y, (z - 1));
			OvergrownBlockSpreadingProcedure.execute(world, x, y, (z + 1));
			OvergrownBlockSpreadingProcedure.execute(world, (x - 1), (y - 1), z);
			OvergrownBlockSpreadingProcedure.execute(world, (x - 1), (y + 1), z);
			OvergrownBlockSpreadingProcedure.execute(world, (x + 1), (y - 1), z);
			OvergrownBlockSpreadingProcedure.execute(world, (x + 1), (y + 1), z);
			OvergrownBlockSpreadingProcedure.execute(world, x, (y - 1), (z - 1));
			OvergrownBlockSpreadingProcedure.execute(world, x, (y + 1), (z - 1));
			OvergrownBlockSpreadingProcedure.execute(world, x, (y - 1), (z + 1));
			OvergrownBlockSpreadingProcedure.execute(world, x, (y + 1), (z + 1));
		} else if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:overgrown_placable")))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_COBBLESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_DIRTY_COBBLESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.DIRTY_COBBLESTONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_MOSSY_COBBLESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_ROCKY_STONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.ROCKY_STONE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.OVERGROWN_STONE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
			}
		}
	}
}
