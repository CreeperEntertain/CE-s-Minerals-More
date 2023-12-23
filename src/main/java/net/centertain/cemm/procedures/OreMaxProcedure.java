package net.centertain.cemm.procedures;

import net.minecraft.world.entity.Entity;

import net.centertain.cemm.network.CemmModVariables;

public class OreMaxProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Aluminum")) {
			return 512;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Antimony")) {
			return 256;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Arsenic")) {
			return 128;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Baryte")) {
			return 192;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Beryllium")) {
			return 64;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Cesium")) {
			return 32;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Chromium")) {
			return 48;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Cobalt")) {
			return 128;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Yttrium")) {
			return 192;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Fluorite")) {
			return 128;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Lanthanum")) {
			return 256;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Calcium")) {
			return 64;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Graphite")) {
			return 256;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Lead")) {
			return 128;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Zirconium")) {
			return 512;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Zinc")) {
			return 16;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Lithium")) {
			return 32;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Magnesium")) {
			return 48;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Manganese")) {
			return 64;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Neodymium")) {
			return 32;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Niobium")) {
			return 512;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Platinum")) {
			return 512;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Osmium")) {
			return 16;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Tin")) {
			return 32;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Tungsten")) {
			return 48;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Vanadium")) {
			return 48;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Ytterbium")) {
			return 32;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Sulfur")) {
			return 256;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Niter")) {
			return 72;
		}
		return -1000000;
	}
}
