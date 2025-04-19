package net.centertain.cemm.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;

public class RubblestoneWalkingTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
			if (!entity.isShiftKeyDown()) {
				if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.SLOW_FALLING)) || !(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					RubblestoneFallingProcedure.execute(world, x, y, z, entity);
				}
			}
		}
	}
}
