
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.InstructionsMainMenu;
import net.centertain.cemm.procedures.OpenInstructionsVacuumizerProcedure;
import net.centertain.cemm.procedures.OpenInstructionsRefineryProcedure;
import net.centertain.cemm.procedures.OpenInstructionsPressurizerProcedure;
import net.centertain.cemm.procedures.OpenInstructionsMiningSelectionProcedure;
import net.centertain.cemm.procedures.OpenInstructionsElectrolyzerProcedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InstructionsMainButtonMessage {
	private final int buttonID, x, y, z;

	public InstructionsMainButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public InstructionsMainButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(InstructionsMainButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(InstructionsMainButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = InstructionsMainMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenInstructionsElectrolyzerProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenInstructionsPressurizerProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenInstructionsRefineryProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenInstructionsVacuumizerProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenInstructionsMiningSelectionProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(InstructionsMainButtonMessage.class, InstructionsMainButtonMessage::buffer, InstructionsMainButtonMessage::new, InstructionsMainButtonMessage::handler);
	}
}
