package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

public class LiquidGoldCauldronTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RAND = 0;
		if (Math.random() <= (((world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f) / 100) / 100) * (-1) + 0.02) {
			if (!(world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
					&& !(world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
					&& !(world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
					&& !(world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
					&& !(world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))
					&& !(world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("cemm:hot_blocks")))) {
				world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.GOLD_CAULDRON.get().defaultBlockState(), 3);
			}
		}
	}
}
