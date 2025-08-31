package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class FleshSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double X = 0;
		double Y = 0;
		double Z = 0;
		X = x;
		Y = y;
		Z = z;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 4); index0++) {
			if (!world.isClientSide()) {
				X = X + Mth.nextInt(RandomSource.create(), -1, 1);
				Y = Y + Mth.nextInt(RandomSource.create(), -1, 1);
				Z = Z + Mth.nextInt(RandomSource.create(), -1, 1);
				FleshCoveringProcedure.execute(world, X, Y, Z);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.hit")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.hit")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		}
	}
}
