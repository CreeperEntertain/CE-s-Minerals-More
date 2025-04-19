package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralEndSpruceTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		double RANDBranch = 0;
		double Y = 0;
		RANDBranch = Mth.nextInt(RandomSource.create(), 2, 3);
		Y = y;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) RANDBranch; index0++) {
			RAND = Mth.nextInt(RandomSource.create(), 2, 5);
			for (int index1 = 0; index1 < (int) RAND; index1++) {
				if ((world.getBlockState(BlockPos.containing(x, Y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, Y, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
					world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.END_SPRUCE_LOG.get().defaultBlockState(), 3);
					Y = Y + 1;
				} else {
					break;
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, Y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, Y, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
				world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.END_SPRUCE_LOG.get().defaultBlockState(), 3);
			}
			ProceduralEndSpruceBranchProcedure.execute(world, x, Y, z);
			Y = Y + 1;
		}
	}
}
