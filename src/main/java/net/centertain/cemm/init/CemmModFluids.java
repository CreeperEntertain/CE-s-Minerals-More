
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.centertain.cemm.fluid.OilFluid;
import net.centertain.cemm.fluid.LiquidGoldFluid;
import net.centertain.cemm.fluid.AcidFluid;
import net.centertain.cemm.CemmMod;

public class CemmModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CemmMod.MODID);
	public static final RegistryObject<FlowingFluid> ACID = REGISTRY.register("acid", () -> new AcidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ACID = REGISTRY.register("flowing_acid", () -> new AcidFluid.Flowing());
	public static final RegistryObject<FlowingFluid> OIL = REGISTRY.register("oil", () -> new OilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_OIL = REGISTRY.register("flowing_oil", () -> new OilFluid.Flowing());
	public static final RegistryObject<FlowingFluid> LIQUID_GOLD = REGISTRY.register("liquid_gold", () -> new LiquidGoldFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_GOLD = REGISTRY.register("flowing_liquid_gold", () -> new LiquidGoldFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ACID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ACID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIQUID_GOLD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_GOLD.get(), RenderType.translucent());
		}
	}
}
