
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.OreDisplayGUIMenu;
import net.centertain.cemm.procedures.OSZirconiumProcedure;
import net.centertain.cemm.procedures.OSZincProcedure;
import net.centertain.cemm.procedures.OSYttriumProcedure;
import net.centertain.cemm.procedures.OSVanadiumProcedure;
import net.centertain.cemm.procedures.OSTungstenProcedure;
import net.centertain.cemm.procedures.OSTinProcedure;
import net.centertain.cemm.procedures.OSSulfurProcedure;
import net.centertain.cemm.procedures.OSPlatinumProcedure;
import net.centertain.cemm.procedures.OSOsmiumProcedure;
import net.centertain.cemm.procedures.OSNiterProcedure;
import net.centertain.cemm.procedures.OSNiobiumProcedure;
import net.centertain.cemm.procedures.OSNeodymiumProcedure;
import net.centertain.cemm.procedures.OSManganeseProcedure;
import net.centertain.cemm.procedures.OSMagnesiumProcedure;
import net.centertain.cemm.procedures.OSLithiumProcedure;
import net.centertain.cemm.procedures.OSLeadProcedure;
import net.centertain.cemm.procedures.OSLanthanumProcedure;
import net.centertain.cemm.procedures.OSGraphiteProcedure;
import net.centertain.cemm.procedures.OSFluoriteProcedure;
import net.centertain.cemm.procedures.OSCobaltProcedure;
import net.centertain.cemm.procedures.OSChromiumProcedure;
import net.centertain.cemm.procedures.OSCesiumProcedure;
import net.centertain.cemm.procedures.OSCalciumProcedure;
import net.centertain.cemm.procedures.OSBerylliumProcedure;
import net.centertain.cemm.procedures.OSBaryteProcedure;
import net.centertain.cemm.procedures.OSArsenicProcedure;
import net.centertain.cemm.procedures.OSAntimonyProcedure;
import net.centertain.cemm.procedures.OSAluminumProcedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreDisplayGUIButtonMessage {
	private final int buttonID, x, y, z;

	public OreDisplayGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public OreDisplayGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(OreDisplayGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(OreDisplayGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = OreDisplayGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OSAluminumProcedure.execute(entity);
		}
		if (buttonID == 1) {

			OSAntimonyProcedure.execute(entity);
		}
		if (buttonID == 2) {

			OSArsenicProcedure.execute(entity);
		}
		if (buttonID == 3) {

			OSBaryteProcedure.execute(entity);
		}
		if (buttonID == 4) {

			OSBerylliumProcedure.execute(entity);
		}
		if (buttonID == 5) {

			OSCesiumProcedure.execute(entity);
		}
		if (buttonID == 6) {

			OSChromiumProcedure.execute(entity);
		}
		if (buttonID == 7) {

			OSCobaltProcedure.execute(entity);
		}
		if (buttonID == 8) {

			OSYttriumProcedure.execute(entity);
		}
		if (buttonID == 9) {

			OSFluoriteProcedure.execute(entity);
		}
		if (buttonID == 10) {

			OSLanthanumProcedure.execute(entity);
		}
		if (buttonID == 11) {

			OSCalciumProcedure.execute(entity);
		}
		if (buttonID == 12) {

			OSGraphiteProcedure.execute(entity);
		}
		if (buttonID == 13) {

			OSLeadProcedure.execute(entity);
		}
		if (buttonID == 14) {

			OSZirconiumProcedure.execute(entity);
		}
		if (buttonID == 15) {

			OSZincProcedure.execute(entity);
		}
		if (buttonID == 16) {

			OSLithiumProcedure.execute(entity);
		}
		if (buttonID == 17) {

			OSMagnesiumProcedure.execute(entity);
		}
		if (buttonID == 18) {

			OSManganeseProcedure.execute(entity);
		}
		if (buttonID == 19) {

			OSNeodymiumProcedure.execute(entity);
		}
		if (buttonID == 20) {

			OSNiobiumProcedure.execute(entity);
		}
		if (buttonID == 21) {

			OSPlatinumProcedure.execute(entity);
		}
		if (buttonID == 22) {

			OSOsmiumProcedure.execute(entity);
		}
		if (buttonID == 23) {

			OSTinProcedure.execute(entity);
		}
		if (buttonID == 24) {

			OSTungstenProcedure.execute(entity);
		}
		if (buttonID == 25) {

			OSVanadiumProcedure.execute(entity);
		}
		if (buttonID == 26) {

			OSSulfurProcedure.execute(entity);
		}
		if (buttonID == 27) {

			OSNiterProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(OreDisplayGUIButtonMessage.class, OreDisplayGUIButtonMessage::buffer, OreDisplayGUIButtonMessage::new, OreDisplayGUIButtonMessage::handler);
	}
}
