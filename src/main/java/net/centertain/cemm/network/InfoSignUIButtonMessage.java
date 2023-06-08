
package net.centertain.cemm.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.world.inventory.InfoSignUIMenu;
import net.centertain.cemm.procedures.ISDesign98Procedure;
import net.centertain.cemm.procedures.ISDesign97Procedure;
import net.centertain.cemm.procedures.ISDesign96Procedure;
import net.centertain.cemm.procedures.ISDesign95Procedure;
import net.centertain.cemm.procedures.ISDesign94Procedure;
import net.centertain.cemm.procedures.ISDesign93Procedure;
import net.centertain.cemm.procedures.ISDesign92Procedure;
import net.centertain.cemm.procedures.ISDesign91Procedure;
import net.centertain.cemm.procedures.ISDesign90Procedure;
import net.centertain.cemm.procedures.ISDesign89Procedure;
import net.centertain.cemm.procedures.ISDesign88Procedure;
import net.centertain.cemm.procedures.ISDesign87Procedure;
import net.centertain.cemm.procedures.ISDesign86Procedure;
import net.centertain.cemm.procedures.ISDesign85Procedure;
import net.centertain.cemm.procedures.ISDesign84Procedure;
import net.centertain.cemm.procedures.ISDesign83Procedure;
import net.centertain.cemm.procedures.ISDesign82Procedure;
import net.centertain.cemm.procedures.ISDesign81Procedure;
import net.centertain.cemm.procedures.ISDesign80Procedure;
import net.centertain.cemm.procedures.ISDesign79Procedure;
import net.centertain.cemm.procedures.ISDesign78Procedure;
import net.centertain.cemm.procedures.ISDesign77Procedure;
import net.centertain.cemm.procedures.ISDesign76Procedure;
import net.centertain.cemm.procedures.ISDesign75Procedure;
import net.centertain.cemm.procedures.ISDesign74Procedure;
import net.centertain.cemm.procedures.ISDesign73Procedure;
import net.centertain.cemm.procedures.ISDesign72Procedure;
import net.centertain.cemm.procedures.ISDesign71Procedure;
import net.centertain.cemm.procedures.ISDesign70Procedure;
import net.centertain.cemm.procedures.ISDesign69Procedure;
import net.centertain.cemm.procedures.ISDesign68Procedure;
import net.centertain.cemm.procedures.ISDesign67Procedure;
import net.centertain.cemm.procedures.ISDesign66Procedure;
import net.centertain.cemm.procedures.ISDesign65Procedure;
import net.centertain.cemm.procedures.ISDesign64Procedure;
import net.centertain.cemm.procedures.ISDesign63Procedure;
import net.centertain.cemm.procedures.ISDesign62Procedure;
import net.centertain.cemm.procedures.ISDesign61Procedure;
import net.centertain.cemm.procedures.ISDesign60Procedure;
import net.centertain.cemm.procedures.ISDesign59Procedure;
import net.centertain.cemm.procedures.ISDesign58Procedure;
import net.centertain.cemm.procedures.ISDesign57Procedure;
import net.centertain.cemm.procedures.ISDesign56Procedure;
import net.centertain.cemm.procedures.ISDesign55Procedure;
import net.centertain.cemm.procedures.ISDesign54Procedure;
import net.centertain.cemm.procedures.ISDesign53Procedure;
import net.centertain.cemm.procedures.ISDesign52Procedure;
import net.centertain.cemm.procedures.ISDesign51Procedure;
import net.centertain.cemm.procedures.ISDesign50Procedure;
import net.centertain.cemm.procedures.ISDesign49Procedure;
import net.centertain.cemm.procedures.ISDesign48Procedure;
import net.centertain.cemm.procedures.ISDesign47Procedure;
import net.centertain.cemm.procedures.ISDesign46Procedure;
import net.centertain.cemm.procedures.ISDesign45Procedure;
import net.centertain.cemm.procedures.ISDesign44Procedure;
import net.centertain.cemm.procedures.ISDesign43Procedure;
import net.centertain.cemm.procedures.ISDesign42Procedure;
import net.centertain.cemm.procedures.ISDesign41Procedure;
import net.centertain.cemm.procedures.ISDesign40Procedure;
import net.centertain.cemm.procedures.ISDesign39Procedure;
import net.centertain.cemm.procedures.ISDesign38Procedure;
import net.centertain.cemm.procedures.ISDesign37Procedure;
import net.centertain.cemm.procedures.ISDesign36Procedure;
import net.centertain.cemm.procedures.ISDesign35Procedure;
import net.centertain.cemm.procedures.ISDesign34Procedure;
import net.centertain.cemm.procedures.ISDesign33Procedure;
import net.centertain.cemm.procedures.ISDesign32Procedure;
import net.centertain.cemm.procedures.ISDesign31Procedure;
import net.centertain.cemm.procedures.ISDesign30Procedure;
import net.centertain.cemm.procedures.ISDesign29Procedure;
import net.centertain.cemm.procedures.ISDesign28Procedure;
import net.centertain.cemm.procedures.ISDesign27Procedure;
import net.centertain.cemm.procedures.ISDesign26Procedure;
import net.centertain.cemm.procedures.ISDesign25Procedure;
import net.centertain.cemm.procedures.ISDesign24Procedure;
import net.centertain.cemm.procedures.ISDesign23Procedure;
import net.centertain.cemm.procedures.ISDesign22Procedure;
import net.centertain.cemm.procedures.ISDesign21Procedure;
import net.centertain.cemm.procedures.ISDesign20Procedure;
import net.centertain.cemm.procedures.ISDesign19Procedure;
import net.centertain.cemm.procedures.ISDesign18Procedure;
import net.centertain.cemm.procedures.ISDesign17Procedure;
import net.centertain.cemm.procedures.ISDesign16Procedure;
import net.centertain.cemm.procedures.ISDesign15Procedure;
import net.centertain.cemm.procedures.ISDesign14Procedure;
import net.centertain.cemm.procedures.ISDesign13Procedure;
import net.centertain.cemm.procedures.ISDesign12Procedure;
import net.centertain.cemm.procedures.ISDesign11Procedure;
import net.centertain.cemm.procedures.ISDesign10Procedure;
import net.centertain.cemm.procedures.ISDesign09Procedure;
import net.centertain.cemm.procedures.ISDesign08Procedure;
import net.centertain.cemm.procedures.ISDesign07Procedure;
import net.centertain.cemm.procedures.ISDesign06Procedure;
import net.centertain.cemm.procedures.ISDesign05Procedure;
import net.centertain.cemm.procedures.ISDesign04Procedure;
import net.centertain.cemm.procedures.ISDesign03Procedure;
import net.centertain.cemm.procedures.ISDesign02Procedure;
import net.centertain.cemm.procedures.ISDesign01Procedure;
import net.centertain.cemm.procedures.ISDesign00Procedure;
import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InfoSignUIButtonMessage {
	private final int buttonID, x, y, z;

	public InfoSignUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public InfoSignUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(InfoSignUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(InfoSignUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = InfoSignUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ISDesign00Procedure.execute(world, entity);
		}
		if (buttonID == 1) {

			ISDesign01Procedure.execute(world, entity);
		}
		if (buttonID == 2) {

			ISDesign02Procedure.execute(world, entity);
		}
		if (buttonID == 3) {

			ISDesign03Procedure.execute(world, entity);
		}
		if (buttonID == 4) {

			ISDesign04Procedure.execute(world, entity);
		}
		if (buttonID == 5) {

			ISDesign05Procedure.execute(world, entity);
		}
		if (buttonID == 6) {

			ISDesign06Procedure.execute(world, entity);
		}
		if (buttonID == 7) {

			ISDesign07Procedure.execute(world, entity);
		}
		if (buttonID == 8) {

			ISDesign08Procedure.execute(world, entity);
		}
		if (buttonID == 9) {

			ISDesign09Procedure.execute(world, entity);
		}
		if (buttonID == 10) {

			ISDesign10Procedure.execute(world, entity);
		}
		if (buttonID == 11) {

			ISDesign11Procedure.execute(world, entity);
		}
		if (buttonID == 12) {

			ISDesign12Procedure.execute(world, entity);
		}
		if (buttonID == 13) {

			ISDesign13Procedure.execute(world, entity);
		}
		if (buttonID == 14) {

			ISDesign14Procedure.execute(world, entity);
		}
		if (buttonID == 15) {

			ISDesign15Procedure.execute(world, entity);
		}
		if (buttonID == 16) {

			ISDesign16Procedure.execute(world, entity);
		}
		if (buttonID == 17) {

			ISDesign17Procedure.execute(world, entity);
		}
		if (buttonID == 18) {

			ISDesign18Procedure.execute(world, entity);
		}
		if (buttonID == 19) {

			ISDesign19Procedure.execute(world, entity);
		}
		if (buttonID == 20) {

			ISDesign20Procedure.execute(world, entity);
		}
		if (buttonID == 21) {

			ISDesign21Procedure.execute(world, entity);
		}
		if (buttonID == 22) {

			ISDesign22Procedure.execute(world, entity);
		}
		if (buttonID == 23) {

			ISDesign23Procedure.execute(world, entity);
		}
		if (buttonID == 24) {

			ISDesign24Procedure.execute(world, entity);
		}
		if (buttonID == 25) {

			ISDesign25Procedure.execute(world, entity);
		}
		if (buttonID == 26) {

			ISDesign26Procedure.execute(world, entity);
		}
		if (buttonID == 27) {

			ISDesign27Procedure.execute(world, entity);
		}
		if (buttonID == 28) {

			ISDesign28Procedure.execute(world, entity);
		}
		if (buttonID == 29) {

			ISDesign29Procedure.execute(world, entity);
		}
		if (buttonID == 30) {

			ISDesign30Procedure.execute(world, entity);
		}
		if (buttonID == 31) {

			ISDesign31Procedure.execute(world, entity);
		}
		if (buttonID == 32) {

			ISDesign32Procedure.execute(world, entity);
		}
		if (buttonID == 33) {

			ISDesign33Procedure.execute(world, entity);
		}
		if (buttonID == 34) {

			ISDesign34Procedure.execute(world, entity);
		}
		if (buttonID == 35) {

			ISDesign35Procedure.execute(world, entity);
		}
		if (buttonID == 36) {

			ISDesign36Procedure.execute(world, entity);
		}
		if (buttonID == 37) {

			ISDesign37Procedure.execute(world, entity);
		}
		if (buttonID == 38) {

			ISDesign38Procedure.execute(world, entity);
		}
		if (buttonID == 39) {

			ISDesign39Procedure.execute(world, entity);
		}
		if (buttonID == 40) {

			ISDesign40Procedure.execute(world, entity);
		}
		if (buttonID == 41) {

			ISDesign41Procedure.execute(world, entity);
		}
		if (buttonID == 42) {

			ISDesign42Procedure.execute(world, entity);
		}
		if (buttonID == 43) {

			ISDesign43Procedure.execute(world, entity);
		}
		if (buttonID == 44) {

			ISDesign44Procedure.execute(world, entity);
		}
		if (buttonID == 45) {

			ISDesign45Procedure.execute(world, entity);
		}
		if (buttonID == 46) {

			ISDesign46Procedure.execute(world, entity);
		}
		if (buttonID == 47) {

			ISDesign47Procedure.execute(world, entity);
		}
		if (buttonID == 48) {

			ISDesign48Procedure.execute(world, entity);
		}
		if (buttonID == 49) {

			ISDesign49Procedure.execute(world, entity);
		}
		if (buttonID == 50) {

			ISDesign50Procedure.execute(world, entity);
		}
		if (buttonID == 51) {

			ISDesign51Procedure.execute(world, entity);
		}
		if (buttonID == 52) {

			ISDesign52Procedure.execute(world, entity);
		}
		if (buttonID == 53) {

			ISDesign53Procedure.execute(world, entity);
		}
		if (buttonID == 54) {

			ISDesign54Procedure.execute(world, entity);
		}
		if (buttonID == 55) {

			ISDesign55Procedure.execute(world, entity);
		}
		if (buttonID == 56) {

			ISDesign56Procedure.execute(world, entity);
		}
		if (buttonID == 57) {

			ISDesign57Procedure.execute(world, entity);
		}
		if (buttonID == 58) {

			ISDesign58Procedure.execute(world, entity);
		}
		if (buttonID == 59) {

			ISDesign59Procedure.execute(world, entity);
		}
		if (buttonID == 60) {

			ISDesign60Procedure.execute(world, entity);
		}
		if (buttonID == 61) {

			ISDesign61Procedure.execute(world, entity);
		}
		if (buttonID == 62) {

			ISDesign62Procedure.execute(world, entity);
		}
		if (buttonID == 63) {

			ISDesign63Procedure.execute(world, entity);
		}
		if (buttonID == 64) {

			ISDesign64Procedure.execute(world, entity);
		}
		if (buttonID == 65) {

			ISDesign65Procedure.execute(world, entity);
		}
		if (buttonID == 66) {

			ISDesign66Procedure.execute(world, entity);
		}
		if (buttonID == 67) {

			ISDesign67Procedure.execute(world, entity);
		}
		if (buttonID == 68) {

			ISDesign68Procedure.execute(world, entity);
		}
		if (buttonID == 69) {

			ISDesign69Procedure.execute(world, entity);
		}
		if (buttonID == 70) {

			ISDesign70Procedure.execute(world, entity);
		}
		if (buttonID == 71) {

			ISDesign71Procedure.execute(world, entity);
		}
		if (buttonID == 72) {

			ISDesign72Procedure.execute(world, entity);
		}
		if (buttonID == 73) {

			ISDesign73Procedure.execute(world, entity);
		}
		if (buttonID == 74) {

			ISDesign74Procedure.execute(world, entity);
		}
		if (buttonID == 75) {

			ISDesign75Procedure.execute(world, entity);
		}
		if (buttonID == 76) {

			ISDesign76Procedure.execute(world, entity);
		}
		if (buttonID == 77) {

			ISDesign77Procedure.execute(world, entity);
		}
		if (buttonID == 78) {

			ISDesign78Procedure.execute(world, entity);
		}
		if (buttonID == 79) {

			ISDesign79Procedure.execute(world, entity);
		}
		if (buttonID == 80) {

			ISDesign80Procedure.execute(world, entity);
		}
		if (buttonID == 81) {

			ISDesign81Procedure.execute(world, entity);
		}
		if (buttonID == 82) {

			ISDesign82Procedure.execute(world, entity);
		}
		if (buttonID == 83) {

			ISDesign83Procedure.execute(world, entity);
		}
		if (buttonID == 84) {

			ISDesign84Procedure.execute(world, entity);
		}
		if (buttonID == 85) {

			ISDesign85Procedure.execute(world, entity);
		}
		if (buttonID == 86) {

			ISDesign86Procedure.execute(world, entity);
		}
		if (buttonID == 87) {

			ISDesign87Procedure.execute(world, entity);
		}
		if (buttonID == 88) {

			ISDesign88Procedure.execute(world, entity);
		}
		if (buttonID == 89) {

			ISDesign89Procedure.execute(world, entity);
		}
		if (buttonID == 90) {

			ISDesign90Procedure.execute(world, entity);
		}
		if (buttonID == 91) {

			ISDesign91Procedure.execute(world, entity);
		}
		if (buttonID == 92) {

			ISDesign92Procedure.execute(world, entity);
		}
		if (buttonID == 93) {

			ISDesign93Procedure.execute(world, entity);
		}
		if (buttonID == 94) {

			ISDesign94Procedure.execute(world, entity);
		}
		if (buttonID == 95) {

			ISDesign95Procedure.execute(world, entity);
		}
		if (buttonID == 96) {

			ISDesign96Procedure.execute(world, entity);
		}
		if (buttonID == 97) {

			ISDesign97Procedure.execute(world, entity);
		}
		if (buttonID == 98) {

			ISDesign98Procedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(InfoSignUIButtonMessage.class, InfoSignUIButtonMessage::buffer, InfoSignUIButtonMessage::new, InfoSignUIButtonMessage::handler);
	}
}
