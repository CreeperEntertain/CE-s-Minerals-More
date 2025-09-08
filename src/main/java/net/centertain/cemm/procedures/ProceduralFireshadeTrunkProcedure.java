package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class ProceduralFireshadeTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Y = 0;
		double RAND = 0;
		Y = y;
		RAND = Mth.nextInt(RandomSource.create(), 5, 8);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) RAND; index0++) {
			if (!((world.getBlockState(BlockPos.containing(x, Y, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))) || (world.getBlockState(BlockPos.containing(x, Y, z))).getBlock() == Blocks.AIR)) {
				break;
			}
			world.setBlock(BlockPos.containing(x, Y, z), CemmModBlocks.FIRESHADE_LOG.get().defaultBlockState(), 3);
			Y = Y + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, Y, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
			FireshadeCrownProcedure.execute(world, x, Y, z);
		} else {
			FireshadeCrownProcedure.execute(world, x, (Y - 1), z);
		}
	}
}
