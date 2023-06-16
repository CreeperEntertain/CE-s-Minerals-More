
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.InstructionsVacuumizingMenu;
import net.centertain.cemm.procedures.VIButton2ExecuteProcedure;
import net.centertain.cemm.procedures.VIButton1ExecuteProcedure;
import net.centertain.cemm.procedures.OpenInstructionsMainProcedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InstructionsVacuumizingButtonMessage {
	private final int buttonID, x, y, z;

	public InstructionsVacuumizingButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public InstructionsVacuumizingButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(InstructionsVacuumizingButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(InstructionsVacuumizingButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = InstructionsVacuumizingMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			VIButton1ExecuteProcedure.execute(entity);
		}
		if (buttonID == 1) {

			VIButton2ExecuteProcedure.execute(entity);
		}
		if (buttonID == 2) {

			OpenInstructionsMainProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(InstructionsVacuumizingButtonMessage.class, InstructionsVacuumizingButtonMessage::buffer, InstructionsVacuumizingButtonMessage::new, InstructionsVacuumizingButtonMessage::handler);
	}
}
