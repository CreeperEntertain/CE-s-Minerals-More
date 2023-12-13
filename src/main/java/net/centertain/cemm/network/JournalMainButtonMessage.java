
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.JournalMainMenu;
import net.centertain.cemm.procedures.OpenInstructionsMainProcedure;
import net.centertain.cemm.procedures.JournalPreface01Procedure;
import net.centertain.cemm.procedures.JournalFinalProcedure;
import net.centertain.cemm.procedures.Journal29Procedure;
import net.centertain.cemm.procedures.Journal25Procedure;
import net.centertain.cemm.procedures.Journal21Procedure;
import net.centertain.cemm.procedures.Journal17Procedure;
import net.centertain.cemm.procedures.Journal13Procedure;
import net.centertain.cemm.procedures.Journal10Procedure;
import net.centertain.cemm.procedures.Journal07Procedure;
import net.centertain.cemm.procedures.Journal04Procedure;
import net.centertain.cemm.procedures.Journal01Procedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JournalMainButtonMessage {
	private final int buttonID, x, y, z;

	public JournalMainButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public JournalMainButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(JournalMainButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(JournalMainButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = JournalMainMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			JournalPreface01Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			JournalFinalProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenInstructionsMainProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Journal01Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Journal04Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			Journal07Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			Journal10Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			Journal13Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			Journal17Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			Journal21Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			Journal25Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			Journal29Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(JournalMainButtonMessage.class, JournalMainButtonMessage::buffer, JournalMainButtonMessage::new, JournalMainButtonMessage::handler);
	}
}
