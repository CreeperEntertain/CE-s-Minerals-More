package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralWinterOakTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Y = 0;
		Y = y;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 5, 8); index0++) {
			world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.WINTER_OAK_LOG.get().defaultBlockState(), 3);
			Y = Y + 1;
			if (!((world.getBlockState(BlockPos.containing(x, Y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, Y, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))))) {
				break;
			}
		}
		WinterOakCrownProcedure.execute(world, x, Y, z);
	}
}
