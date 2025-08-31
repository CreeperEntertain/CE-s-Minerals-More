
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.InstructionsElectrolyzerMenu;
import net.centertain.cemm.procedures.OpenInstructionsMainProcedure;
import net.centertain.cemm.procedures.EIButton9ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton8ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton7ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton6ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton5ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton4ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton3ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton2ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton1ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton15ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton14ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton13ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton12ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton11ExecuteProcedure;
import net.centertain.cemm.procedures.EIButton10ExecuteProcedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InstructionsElectrolyzerButtonMessage {
	private final int buttonID, x, y, z;

	public InstructionsElectrolyzerButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public InstructionsElectrolyzerButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(InstructionsElectrolyzerButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(InstructionsElectrolyzerButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = InstructionsElectrolyzerMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			EIButton1ExecuteProcedure.execute(entity);
		}
		if (buttonID == 1) {

			EIButton2ExecuteProcedure.execute(entity);
		}
		if (buttonID == 2) {

			EIButton3ExecuteProcedure.execute(entity);
		}
		if (buttonID == 3) {

			EIButton4ExecuteProcedure.execute(entity);
		}
		if (buttonID == 4) {

			EIButton6ExecuteProcedure.execute(entity);
		}
		if (buttonID == 5) {

			EIButton12ExecuteProcedure.execute(entity);
		}
		if (buttonID == 6) {

			EIButton5ExecuteProcedure.execute(entity);
		}
		if (buttonID == 7) {

			EIButton8ExecuteProcedure.execute(entity);
		}
		if (buttonID == 8) {

			EIButton9ExecuteProcedure.execute(entity);
		}
		if (buttonID == 9) {

			EIButton10ExecuteProcedure.execute(entity);
		}
		if (buttonID == 10) {

			EIButton11ExecuteProcedure.execute(entity);
		}
		if (buttonID == 11) {

			EIButton13ExecuteProcedure.execute(entity);
		}
		if (buttonID == 12) {

			EIButton7ExecuteProcedure.execute(entity);
		}
		if (buttonID == 13) {

			EIButton14ExecuteProcedure.execute(entity);
		}
		if (buttonID == 14) {

			EIButton15ExecuteProcedure.execute(entity);
		}
		if (buttonID == 15) {

			OpenInstructionsMainProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(InstructionsElectrolyzerButtonMessage.class, InstructionsElectrolyzerButtonMessage::buffer, InstructionsElectrolyzerButtonMessage::new, InstructionsElectrolyzerButtonMessage::handler);
	}
}
