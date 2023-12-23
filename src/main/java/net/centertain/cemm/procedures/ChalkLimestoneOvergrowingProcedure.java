package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ChalkLimestoneOvergrowingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String registryName = "";
		if (!(ForgeRegistries.BLOCKS.getValue(
				new ResourceLocation((("cemm:grassed_" + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("cemm:", ""))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
			registryName = "cemm:grassed_" + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("cemm:", "");
		} else if (!(ForgeRegistries.BLOCKS.getValue(
				new ResourceLocation((("cemm:grassed_" + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("minecraft:", ""))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
			registryName = "cemm:grassed_" + (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("minecraft:", "");
		}
		if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((registryName).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
			world.setBlock(BlockPos.containing(x, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation((registryName).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
		}
	}
}
