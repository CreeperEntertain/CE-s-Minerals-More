
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.centertain.cemm.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.centertain.cemm.client.gui.VacuumizerInterfaceScreen;
import net.centertain.cemm.client.gui.RefineryInterfaceScreen;
import net.centertain.cemm.client.gui.PurifierInterfaceScreen;
import net.centertain.cemm.client.gui.PressurizerInterfaceScreen;
import net.centertain.cemm.client.gui.InstructionsVacuumizingScreen;
import net.centertain.cemm.client.gui.InstructionsRefiningScreen;
import net.centertain.cemm.client.gui.InstructionsPressurizerScreen;
import net.centertain.cemm.client.gui.InstructionsMiningZirconiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningZincScreen;
import net.centertain.cemm.client.gui.InstructionsMiningYttriumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningYtterbiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningVanadiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningTungstenScreen;
import net.centertain.cemm.client.gui.InstructionsMiningTinScreen;
import net.centertain.cemm.client.gui.InstructionsMiningSulfurScreen;
import net.centertain.cemm.client.gui.InstructionsMiningSmokeyQuartzScreen;
import net.centertain.cemm.client.gui.InstructionsMiningSelectionScreen;
import net.centertain.cemm.client.gui.InstructionsMiningPolymorousScreen;
import net.centertain.cemm.client.gui.InstructionsMiningPlatinumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningOsmiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningNiterScreen;
import net.centertain.cemm.client.gui.InstructionsMiningNiobiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningNeodymiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningMountainSquartzScreen;
import net.centertain.cemm.client.gui.InstructionsMiningMiseryScreen;
import net.centertain.cemm.client.gui.InstructionsMiningManganeseScreen;
import net.centertain.cemm.client.gui.InstructionsMiningMalachiteScreen;
import net.centertain.cemm.client.gui.InstructionsMiningMagnetiteScreen;
import net.centertain.cemm.client.gui.InstructionsMiningMagnesiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningLithiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningLigniteScreen;
import net.centertain.cemm.client.gui.InstructionsMiningLeadScreen;
import net.centertain.cemm.client.gui.InstructionsMiningLanthanumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningGraphiteScreen;
import net.centertain.cemm.client.gui.InstructionsMiningFluoriteScreen;
import net.centertain.cemm.client.gui.InstructionsMiningCobaltScreen;
import net.centertain.cemm.client.gui.InstructionsMiningChromiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningChlorophylScreen;
import net.centertain.cemm.client.gui.InstructionsMiningCesiumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningCalciumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningBismuthScreen;
import net.centertain.cemm.client.gui.InstructionsMiningBerylliumScreen;
import net.centertain.cemm.client.gui.InstructionsMiningBaryteScreen;
import net.centertain.cemm.client.gui.InstructionsMiningArsenicScreen;
import net.centertain.cemm.client.gui.InstructionsMiningAntimonyScreen;
import net.centertain.cemm.client.gui.InstructionsMiningAluminumScreen;
import net.centertain.cemm.client.gui.InstructionsMainScreen;
import net.centertain.cemm.client.gui.InstructionsElectrolyzerScreen;
import net.centertain.cemm.client.gui.InfoSignUIScreen;
import net.centertain.cemm.client.gui.GoalsMainScreen;
import net.centertain.cemm.client.gui.EnergyInterfaceScreen;
import net.centertain.cemm.client.gui.ElectrolyzerInterfaceScreen;
import net.centertain.cemm.client.gui.DimensionalPocketUIScreen;
import net.centertain.cemm.client.gui.ComparerInterfaceScreen;
import net.centertain.cemm.client.gui.CoalGeneratorInterfaceScreen;
import net.centertain.cemm.client.gui.CableInterfaceScreen;
import net.centertain.cemm.client.gui.BlockPlacerInterfaceScreen;
import net.centertain.cemm.client.gui.AdvancementAltarInterfaceScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CemmModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CemmModMenus.ENERGY_INTERFACE.get(), EnergyInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.CABLE_INTERFACE.get(), CableInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.ELECTROLYZER_INTERFACE.get(), ElectrolyzerInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.REFINERY_INTERFACE.get(), RefineryInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.VACUUMIZER_INTERFACE.get(), VacuumizerInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.PRESSURIZER_INTERFACE.get(), PressurizerInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.DIMENSIONAL_POCKET_UI.get(), DimensionalPocketUIScreen::new);
			MenuScreens.register(CemmModMenus.COAL_GENERATOR_INTERFACE.get(), CoalGeneratorInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.BLOCK_PLACER_INTERFACE.get(), BlockPlacerInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.INFO_SIGN_UI.get(), InfoSignUIScreen::new);
			MenuScreens.register(CemmModMenus.ADVANCEMENT_ALTAR_INTERFACE.get(), AdvancementAltarInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MAIN.get(), InstructionsMainScreen::new);
			MenuScreens.register(CemmModMenus.GOALS_MAIN.get(), GoalsMainScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_ELECTROLYZER.get(), InstructionsElectrolyzerScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_PRESSURIZER.get(), InstructionsPressurizerScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_REFINING.get(), InstructionsRefiningScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_VACUUMIZING.get(), InstructionsVacuumizingScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_SELECTION.get(), InstructionsMiningSelectionScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_ALUMINUM.get(), InstructionsMiningAluminumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_CALCIUM.get(), InstructionsMiningCalciumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_COBALT.get(), InstructionsMiningCobaltScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_FLUORITE.get(), InstructionsMiningFluoriteScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_GRAPHITE.get(), InstructionsMiningGraphiteScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_LITHIUM.get(), InstructionsMiningLithiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_MAGNESIUM.get(), InstructionsMiningMagnesiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_MANGANESE.get(), InstructionsMiningManganeseScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_NEODYMIUM.get(), InstructionsMiningNeodymiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_NIOBIUM.get(), InstructionsMiningNiobiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_NITER.get(), InstructionsMiningNiterScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_OSMIUM.get(), InstructionsMiningOsmiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_PLATINUM.get(), InstructionsMiningPlatinumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_SULFUR.get(), InstructionsMiningSulfurScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_TIN.get(), InstructionsMiningTinScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_TUNGSTEN.get(), InstructionsMiningTungstenScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_VANADIUM.get(), InstructionsMiningVanadiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_YTTERBIUM.get(), InstructionsMiningYtterbiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_YTTRIUM.get(), InstructionsMiningYttriumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_ZINC.get(), InstructionsMiningZincScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_ANTIMONY.get(), InstructionsMiningAntimonyScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_ARSENIC.get(), InstructionsMiningArsenicScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_BARYTE.get(), InstructionsMiningBaryteScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_BERYLLIUM.get(), InstructionsMiningBerylliumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_BISMUTH.get(), InstructionsMiningBismuthScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_CESIUM.get(), InstructionsMiningCesiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_CHLOROPHYL.get(), InstructionsMiningChlorophylScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_CHROMIUM.get(), InstructionsMiningChromiumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_LANTHANUM.get(), InstructionsMiningLanthanumScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_LEAD.get(), InstructionsMiningLeadScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_LIGNITE.get(), InstructionsMiningLigniteScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_MAGNETITE.get(), InstructionsMiningMagnetiteScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_MALACHITE.get(), InstructionsMiningMalachiteScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_MISERY.get(), InstructionsMiningMiseryScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_MOUNTAIN_SQUARTZ.get(), InstructionsMiningMountainSquartzScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_POLYMOROUS.get(), InstructionsMiningPolymorousScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_SMOKEY_QUARTZ.get(), InstructionsMiningSmokeyQuartzScreen::new);
			MenuScreens.register(CemmModMenus.INSTRUCTIONS_MINING_ZIRCONIUM.get(), InstructionsMiningZirconiumScreen::new);
			MenuScreens.register(CemmModMenus.PURIFIER_INTERFACE.get(), PurifierInterfaceScreen::new);
			MenuScreens.register(CemmModMenus.COMPARER_INTERFACE.get(), ComparerInterfaceScreen::new);
		});
	}
}
