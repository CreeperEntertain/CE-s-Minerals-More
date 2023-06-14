
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.InstructionsRefiningMenu;
import net.centertain.cemm.procedures.RIButton9ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton8ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton7ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton6ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton5ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton4ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton3ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton2ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton1ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton15ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton14ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton13ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton12ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton11ExecuteProcedure;
import net.centertain.cemm.procedures.RIButton10ExecuteProcedure;
import net.centertain.cemm.procedures.OpenInstructionsMainProcedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InstructionsRefiningButtonMessage {
	private final int buttonID, x, y, z;

	public InstructionsRefiningButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public InstructionsRefiningButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(InstructionsRefiningButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(InstructionsRefiningButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		Level world = entity.level;
		HashMap guistate = InstructionsRefiningMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			RIButton1ExecuteProcedure.execute(entity);
		}
		if (buttonID == 1) {

			RIButton2ExecuteProcedure.execute(entity);
		}
		if (buttonID == 2) {

			RIButton3ExecuteProcedure.execute(entity);
		}
		if (buttonID == 3) {

			RIButton5ExecuteProcedure.execute(entity);
		}
		if (buttonID == 4) {

			RIButton4ExecuteProcedure.execute(entity);
		}
		if (buttonID == 5) {

			RIButton7ExecuteProcedure.execute(entity);
		}
		if (buttonID == 6) {

			RIButton8ExecuteProcedure.execute(entity);
		}
		if (buttonID == 7) {

			RIButton10ExecuteProcedure.execute(entity);
		}
		if (buttonID == 8) {

			RIButton11ExecuteProcedure.execute(entity);
		}
		if (buttonID == 9) {

			RIButton9ExecuteProcedure.execute(entity);
		}
		if (buttonID == 10) {

			RIButton12ExecuteProcedure.execute(entity);
		}
		if (buttonID == 11) {

			RIButton13ExecuteProcedure.execute(entity);
		}
		if (buttonID == 12) {

			RIButton14ExecuteProcedure.execute(entity);
		}
		if (buttonID == 13) {

			RIButton15ExecuteProcedure.execute(entity);
		}
		if (buttonID == 14) {

			OpenInstructionsMainProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 15) {

			RIButton6ExecuteProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(InstructionsRefiningButtonMessage.class, InstructionsRefiningButtonMessage::buffer, InstructionsRefiningButtonMessage::new, InstructionsRefiningButtonMessage::handler);
	}
}
