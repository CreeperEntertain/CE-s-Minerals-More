package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class OreDisplayBarProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return "";
		String BarReturn = "";
		double LikelinessFinal = 0;
		double MinHeight = 0;
		double MaxHeight = 0;
		double MinGraph = 0;
		double MaxGraph = 0;
		if (DoesBiomeContainOreProcedure.execute(world, x, y, z, entity)) {
			if (IsOreTriangularProcedure.execute(world, x, y, z, entity)) {
				MinHeight = OreMinProcedure.execute(entity);
				MaxHeight = OreMaxProcedure.execute(entity);
				MinGraph = (entity.getY() - MinHeight) * (1 / ((MaxHeight - MinHeight) / 2));
				MaxGraph = (entity.getY() - MaxHeight) * (1 / ((MaxHeight - MinHeight) / 2)) * (-1);
				if (MinGraph <= MaxGraph) {
					LikelinessFinal = MinGraph;
				} else {
					LikelinessFinal = MaxGraph;
				}
				LikelinessFinal = LikelinessFinal * 35;
			} else {
				MinHeight = OreMinProcedure.execute(entity);
				MaxHeight = OreMaxProcedure.execute(entity);
				if (entity.getY() >= MinHeight && entity.getY() <= MaxHeight) {
					LikelinessFinal = 35;
				}
			}
		}
		for (int index0 = 0; index0 < (int) Math.ceil(LikelinessFinal); index0++) {
			BarReturn = BarReturn + "|";
		}
		if (LikelinessFinal <= 0) {
			if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("")) {
				BarReturn = "Select Resource";
			} else {
				BarReturn = "Out Of Reach";
			}
		}
		return BarReturn;
	}
}
