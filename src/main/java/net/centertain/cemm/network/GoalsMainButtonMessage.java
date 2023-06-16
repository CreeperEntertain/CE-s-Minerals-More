
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.GoalsMainMenu;
import net.centertain.cemm.procedures.ObjectiveAddButtonExecuteProcedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry9Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry8Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry7Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry6Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry5Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry4Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry3Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry2Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry1Procedure;
import net.centertain.cemm.procedures.GoalArrayRemoveEntry10Procedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GoalsMainButtonMessage {
	private final int buttonID, x, y, z;

	public GoalsMainButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public GoalsMainButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(GoalsMainButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(GoalsMainButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = GoalsMainMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ObjectiveAddButtonExecuteProcedure.execute(entity, guistate);
		}
		if (buttonID == 1) {

			GoalArrayRemoveEntry1Procedure.execute(entity);
		}
		if (buttonID == 2) {

			GoalArrayRemoveEntry2Procedure.execute(entity);
		}
		if (buttonID == 3) {

			GoalArrayRemoveEntry3Procedure.execute(entity);
		}
		if (buttonID == 4) {

			GoalArrayRemoveEntry4Procedure.execute(entity);
		}
		if (buttonID == 5) {

			GoalArrayRemoveEntry5Procedure.execute(entity);
		}
		if (buttonID == 6) {

			GoalArrayRemoveEntry6Procedure.execute(entity);
		}
		if (buttonID == 7) {

			GoalArrayRemoveEntry7Procedure.execute(entity);
		}
		if (buttonID == 8) {

			GoalArrayRemoveEntry8Procedure.execute(entity);
		}
		if (buttonID == 9) {

			GoalArrayRemoveEntry9Procedure.execute(entity);
		}
		if (buttonID == 10) {

			GoalArrayRemoveEntry10Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(GoalsMainButtonMessage.class, GoalsMainButtonMessage::buffer, GoalsMainButtonMessage::new, GoalsMainButtonMessage::handler);
	}
}
