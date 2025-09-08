package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class FleshConversionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("cemm:flesh_convertible")))) {
			if (Math.random() <= 0.75) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.FLESH.get().defaultBlockState(), 3);
			} else {
				if (Math.random() <= 0.75) {
					if (Math.random() <= 0.5) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.POROUS_FLESH.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.SCARRED_FLESH.get().defaultBlockState(), 3);
					}
				} else {
					if (Math.random() <= 0.75) {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.PEERING_FLESH.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.HUNGERING_FLESH.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
