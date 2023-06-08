
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.InstructionsMiningSelectionMenu;
import net.centertain.cemm.procedures.OpenInstructionsMainProcedure;
import net.centertain.cemm.procedures.OMIZrProcedure;
import net.centertain.cemm.procedures.OMIZnProcedure;
import net.centertain.cemm.procedures.OMIYbProcedure;
import net.centertain.cemm.procedures.OMIYProcedure;
import net.centertain.cemm.procedures.OMIWProcedure;
import net.centertain.cemm.procedures.OMIVProcedure;
import net.centertain.cemm.procedures.OMISnProcedure;
import net.centertain.cemm.procedures.OMISiO2Procedure;
import net.centertain.cemm.procedures.OMISiO2PProcedure;
import net.centertain.cemm.procedures.OMISbProcedure;
import net.centertain.cemm.procedures.OMISProcedure;
import net.centertain.cemm.procedures.OMIPtProcedure;
import net.centertain.cemm.procedures.OMIPmProcedure;
import net.centertain.cemm.procedures.OMIPbProcedure;
import net.centertain.cemm.procedures.OMIOsProcedure;
import net.centertain.cemm.procedures.OMINdProcedure;
import net.centertain.cemm.procedures.OMINbProcedure;
import net.centertain.cemm.procedures.OMIMnProcedure;
import net.centertain.cemm.procedures.OMIMgProcedure;
import net.centertain.cemm.procedures.OMIMdProcedure;
import net.centertain.cemm.procedures.OMILiProcedure;
import net.centertain.cemm.procedures.OMILaProcedure;
import net.centertain.cemm.procedures.OMIKNO3Procedure;
import net.centertain.cemm.procedures.OMIFeProcedure;
import net.centertain.cemm.procedures.OMICuProcedure;
import net.centertain.cemm.procedures.OMICsProcedure;
import net.centertain.cemm.procedures.OMICrProcedure;
import net.centertain.cemm.procedures.OMICoProcedure;
import net.centertain.cemm.procedures.OMIClPProcedure;
import net.centertain.cemm.procedures.OMICaProcedure;
import net.centertain.cemm.procedures.OMICaF2Procedure;
import net.centertain.cemm.procedures.OMICProcedure;
import net.centertain.cemm.procedures.OMICPProcedure;
import net.centertain.cemm.procedures.OMIBiProcedure;
import net.centertain.cemm.procedures.OMIBeProcedure;
import net.centertain.cemm.procedures.OMIBASO4Procedure;
import net.centertain.cemm.procedures.OMIAsProcedure;
import net.centertain.cemm.procedures.OMIAlProcedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InstructionsMiningSelectionButtonMessage {
	private final int buttonID, x, y, z;

	public InstructionsMiningSelectionButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public InstructionsMiningSelectionButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(InstructionsMiningSelectionButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(InstructionsMiningSelectionButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = InstructionsMiningSelectionMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenInstructionsMainProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OMIAlProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OMIAsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OMIBASO4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OMIBeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OMIBiProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OMIClPProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			OMICProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			OMICPProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			OMICaProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			OMICaF2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			OMICoProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			OMICrProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			OMICsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 14) {

			OMICuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 15) {

			OMIFeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 16) {

			OMIKNO3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 17) {

			OMILaProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 18) {

			OMILiProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 19) {

			OMIMdProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 20) {

			OMIMgProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 21) {

			OMIMnProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 22) {

			OMINbProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 23) {

			OMINdProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 24) {

			OMIOsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 25) {

			OMIPmProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 26) {

			OMIPbProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 27) {

			OMIPtProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 28) {

			OMISProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 29) {

			OMISbProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 30) {

			OMISiO2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 31) {

			OMISiO2PProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 32) {

			OMISnProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 33) {

			OMIVProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 34) {

			OMIWProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 35) {

			OMIYProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 36) {

			OMIYbProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 37) {

			OMIZnProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 38) {

			OMIZrProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(InstructionsMiningSelectionButtonMessage.class, InstructionsMiningSelectionButtonMessage::buffer, InstructionsMiningSelectionButtonMessage::new, InstructionsMiningSelectionButtonMessage::handler);
	}
}
