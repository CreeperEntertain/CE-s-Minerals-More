
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.InstructionsPressurizerMenu;
import net.centertain.cemm.procedures.PIButton9ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton8ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton7ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton6ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton5ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton4ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton3ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton2ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton1ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton13ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton12ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton11ExecuteProcedure;
import net.centertain.cemm.procedures.PIButton10ExecuteProcedure;
import net.centertain.cemm.procedures.OpenInstructionsMainProcedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InstructionsPressurizerButtonMessage {
	private final int buttonID, x, y, z;

	public InstructionsPressurizerButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public InstructionsPressurizerButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(InstructionsPressurizerButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(InstructionsPressurizerButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = InstructionsPressurizerMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PIButton1ExecuteProcedure.execute(entity);
		}
		if (buttonID == 1) {

			PIButton2ExecuteProcedure.execute(entity);
		}
		if (buttonID == 2) {

			PIButton5ExecuteProcedure.execute(entity);
		}
		if (buttonID == 3) {

			PIButton6ExecuteProcedure.execute(entity);
		}
		if (buttonID == 4) {

			PIButton8ExecuteProcedure.execute(entity);
		}
		if (buttonID == 5) {

			PIButton7ExecuteProcedure.execute(entity);
		}
		if (buttonID == 6) {

			PIButton10ExecuteProcedure.execute(entity);
		}
		if (buttonID == 7) {

			PIButton9ExecuteProcedure.execute(entity);
		}
		if (buttonID == 8) {

			PIButton11ExecuteProcedure.execute(entity);
		}
		if (buttonID == 9) {

			PIButton12ExecuteProcedure.execute(entity);
		}
		if (buttonID == 10) {

			PIButton4ExecuteProcedure.execute(entity);
		}
		if (buttonID == 11) {

			PIButton13ExecuteProcedure.execute(entity);
		}
		if (buttonID == 12) {

			PIButton3ExecuteProcedure.execute(entity);
		}
		if (buttonID == 13) {

			OpenInstructionsMainProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(InstructionsPressurizerButtonMessage.class, InstructionsPressurizerButtonMessage::buffer, InstructionsPressurizerButtonMessage::new, InstructionsPressurizerButtonMessage::handler);
	}
}
