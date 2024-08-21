package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class FiregrassRottingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String RegistryKey = "";
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			RegistryKey = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
			RegistryKey = RegistryKey.replace("cemm:firegrass_block_", "");
			RegistryKey = "minecraft:" + RegistryKey;
			try {
				if (!(ForgeRegistries.BLOCKS.getValue(new ResourceLocation((RegistryKey).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR)) {
					world.setBlock(BlockPos.containing(x, y, z), ForgeRegistries.BLOCKS.getValue(new ResourceLocation((RegistryKey).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState(), 3);
				}
			} catch (Exception e) {
			}
		}
	}
}
