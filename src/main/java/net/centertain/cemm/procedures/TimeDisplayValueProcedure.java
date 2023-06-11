package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TimeDisplayValueProcedure {
	public static String execute(LevelAccessor world) {
		String finalizedTime = "";
		double currentHour = 0;
		currentHour = Math.round(((world.dayTime() + 6000) % 24000) / 1000);
		if (currentHour >= 12 && !(currentHour < 1)) {
			finalizedTime = " PM";
		} else {
			finalizedTime = " AM";
		}
		if (currentHour > 12) {
			currentHour = currentHour - 12;
		}
		if (currentHour == 0) {
			currentHour = 12;
		}
		finalizedTime = new java.text.DecimalFormat("##").format(currentHour) + "" + finalizedTime;
		return finalizedTime;
	}
}
