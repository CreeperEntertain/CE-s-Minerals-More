package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PlainsGenerationCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("snowy_plains"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("sunflower_plains"))) {
			return false;
		}
		return true;
	}
}
