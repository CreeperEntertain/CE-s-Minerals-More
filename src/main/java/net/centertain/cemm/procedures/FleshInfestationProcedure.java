package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;
import net.centertain.cemm.entity.MaggotEntity;

public class FleshInfestationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MaggotEntity) {
			if (entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().y() == 0 && entity.getDeltaMovement().z() == 0) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.step")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.frogspawn.step")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.INFESTED_FLESH.get())) {
					world.setBlock(BlockPos.containing(x, y, z), CemmModBlocks.INFESTED_FLESH.get().defaultBlockState(), 3);
				}
			}
		} else if (entity instanceof ExperienceOrb) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (!world.isClientSide()) {
				FleshSpreadProcedure.execute(world, x, y, z);
			}
		}
	}
}
