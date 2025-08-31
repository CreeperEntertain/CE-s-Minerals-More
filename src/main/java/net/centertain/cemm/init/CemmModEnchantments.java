
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.centertain.cemm.enchantment.AcidResistanceEnchantment;
import net.centertain.cemm.CemmMod;

public class CemmModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CemmMod.MODID);
	public static final RegistryObject<Enchantment> ACID_RESISTANCE = REGISTRY.register("acid_resistance", () -> new AcidResistanceEnchantment());
}
