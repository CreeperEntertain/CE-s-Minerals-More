
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.JournalPage28Menu;
import net.centertain.cemm.procedures.OpenInstructionsMainProcedure;
import net.centertain.cemm.procedures.Journal29FinalProcedure;
import net.centertain.cemm.procedures.Journal27Procedure;
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
public class JournalPage28ButtonMessage {
	private final int buttonID, x, y, z;

	public JournalPage28ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public JournalPage28ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(JournalPage28ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(JournalPage28ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = JournalPage28Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Journal29FinalProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Journal27Procedure.execute(world, x, y, z, entity);
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

			Journal25Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			Journal21Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			Journal17Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			Journal13Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(JournalPage28ButtonMessage.class, JournalPage28ButtonMessage::buffer, JournalPage28ButtonMessage::new, JournalPage28ButtonMessage::handler);
	}
}
