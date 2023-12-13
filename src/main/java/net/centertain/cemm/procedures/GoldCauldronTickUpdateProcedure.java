package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class GoldCauldronTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= ((world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f) / 100) / 400 + 0.005) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.LIQUID_GOLD_CAULDRON.get().defaultBlockState(), 3);
			}
		}
	}
}
