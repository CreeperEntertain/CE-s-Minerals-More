package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.centertain.cemm.CemmMod;

public class BlockRefineryRecipesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Count1 = 0;
		double Count2 = 0;
		double Result = 0;
		CemmMod.queueServerWork(1, () -> {
			BRMarbleGoldProcedure.execute(entity);
			BRMarbleCyanProcedure.execute(entity);
			BRRavenstoneIronProcedure.execute(entity);
			BRFramedWattleProcedure.execute(entity);
			BRFramedKaolinProcedure.execute(entity);
		});
	}
}
