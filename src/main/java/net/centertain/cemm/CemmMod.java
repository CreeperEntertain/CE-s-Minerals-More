/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.centertain.cemm;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.centertain.cemm.init.CemmModTabs;
import net.centertain.cemm.init.CemmModSounds;
import net.centertain.cemm.init.CemmModParticleTypes;
import net.centertain.cemm.init.CemmModMobEffects;
import net.centertain.cemm.init.CemmModMenus;
import net.centertain.cemm.init.CemmModItems;
import net.centertain.cemm.init.CemmModFluids;
import net.centertain.cemm.init.CemmModFluidTypes;
import net.centertain.cemm.init.CemmModFeatures;
import net.centertain.cemm.init.CemmModEntities;
import net.centertain.cemm.init.CemmModEnchantments;
import net.centertain.cemm.init.CemmModBlocks;
import net.centertain.cemm.init.CemmModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("cemm")
public class CemmMod {
	public static final Logger LOGGER = LogManager.getLogger(CemmMod.class);
	public static final String MODID = "cemm";

	public CemmMod() {
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		CemmModSounds.REGISTRY.register(bus);
		CemmModBlocks.REGISTRY.register(bus);
		CemmModBlockEntities.REGISTRY.register(bus);
		CemmModItems.REGISTRY.register(bus);
		CemmModEntities.REGISTRY.register(bus);
		CemmModEnchantments.REGISTRY.register(bus);
		CemmModTabs.REGISTRY.register(bus);
		CemmModFeatures.REGISTRY.register(bus);
		CemmModMobEffects.REGISTRY.register(bus);

		CemmModParticleTypes.REGISTRY.register(bus);

		CemmModMenus.REGISTRY.register(bus);
		CemmModFluids.REGISTRY.register(bus);
		CemmModFluidTypes.REGISTRY.register(bus);
	}

	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		workQueue.add(new AbstractMap.SimpleEntry(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
