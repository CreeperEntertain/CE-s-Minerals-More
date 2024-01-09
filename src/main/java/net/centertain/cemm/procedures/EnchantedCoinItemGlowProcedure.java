package net.centertain.cemm.procedures;

import net.minecraft.world.item.ItemStack;

public class EnchantedCoinItemGlowProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("xTpPos") != 0 && itemstack.getOrCreateTag().getDouble("yTpPos") != 0 && itemstack.getOrCreateTag().getDouble("zTpPos") != 0) {
			return true;
		}
		return false;
	}
}
