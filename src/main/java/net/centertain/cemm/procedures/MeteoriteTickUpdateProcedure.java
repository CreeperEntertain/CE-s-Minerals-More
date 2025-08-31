package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class MeteoriteTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
			if (Math.random() <= 0.2) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.WHITE_ASH, x, y, z, 5, 3, 3, 3, 0.1);
			}
			if (Math.random() <= 0.2) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3, 3, 3, 0.1);
			}
			if (Math.random() <= 0.2) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMALL_FLAME, x, y, z, 15, 3, 3, 3, 0.1);
			}
		}
	}
}
