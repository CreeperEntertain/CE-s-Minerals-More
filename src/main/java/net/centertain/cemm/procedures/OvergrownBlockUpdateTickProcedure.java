package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class OvergrownBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String registryName = "";
		GrassblockGrassRegrowthProcedure.execute(world, x, y, z);
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) >= 7 && (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:moss_blocks"))))) {
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
		} else if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("cemm:moss_blocks")))) {
			if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).startsWith("cemm:overgrown_")) {
				registryName = (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("cemm:overgrown_", "");
				if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("minecraft:" + registryName)).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					world.setBlock(BlockPos.containing(x, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("minecraft:" + registryName)).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
				} else if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("cemm:" + registryName)).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					world.setBlock(BlockPos.containing(x, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation((("cemm:" + registryName)).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
				}
			}
		}
	}
}
