package net.centertain.cemm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.network.CemmModVariables;

public class DoesBiomeContainOreProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Beryllium")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Cesium")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Fluorite")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Calcium")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Graphite")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Lead")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Zinc")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Lithium")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Manganese")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Osmium")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Sulfur")
				|| ((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Niter")) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Aluminum")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_aluminum")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Antimony")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_antimony")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Arsenic")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_arsenic")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Baryte")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_baryte")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Chromium")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_chromium")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Cobalt")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_cobalt")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Yttrium")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_yttrium")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Lanthanum")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_lanthanum")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Zirconium")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("cemm:zirconian_desert"))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Magnesium")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_magnesium")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Neodymium")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_neodymium")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Niobium")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_niobium")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Platinum")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_platinum")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Tin")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_tin")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Tungsten")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_tungsten")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Vanadium")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_vanadium")))) {
			return true;
		} else if (((entity.getCapability(CemmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CemmModVariables.PlayerVariables())).OreScanning).equals("Ytterbium")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("cemm:contains_ytterbium")))) {
			return true;
		}
		return false;
	}
}
