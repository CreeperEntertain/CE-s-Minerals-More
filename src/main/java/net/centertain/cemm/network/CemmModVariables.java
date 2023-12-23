package net.centertain.cemm.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.CemmMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CemmModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CemmMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		CemmMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.electrolyzerInstructionsRecipe = original.electrolyzerInstructionsRecipe;
			clone.enchantmentOutputLevel = original.enchantmentOutputLevel;
			clone.Goal1 = original.Goal1;
			clone.Goal10 = original.Goal10;
			clone.Goal2 = original.Goal2;
			clone.Goal3 = original.Goal3;
			clone.Goal4 = original.Goal4;
			clone.Goal5 = original.Goal5;
			clone.Goal6 = original.Goal6;
			clone.Goal7 = original.Goal7;
			clone.Goal8 = original.Goal8;
			clone.Goal9 = original.Goal9;
			clone.infoSignOpen = original.infoSignOpen;
			clone.launched = original.launched;
			clone.pressurizerInstructionsRecipe = original.pressurizerInstructionsRecipe;
			clone.refineryInstructionsRecipe = original.refineryInstructionsRecipe;
			clone.showTime = original.showTime;
			clone.vacuumizerInstructionsRecipe = original.vacuumizerInstructionsRecipe;
			clone.OreScanning = original.OreScanning;
			if (!event.isWasDeath()) {
				clone.bleedingDamageCooldown = original.bleedingDamageCooldown;
				clone.bleedingIncreaseDuration = original.bleedingIncreaseDuration;
				clone.currentlyUsed = original.currentlyUsed;
				clone.icaronLanded = original.icaronLanded;
				clone.oxygenLevel = original.oxygenLevel;
				clone.playerSalted = original.playerSalted;
				clone.ashenAngered = original.ashenAngered;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					CemmMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					CemmMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					CemmMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "cemm_worldvars";
		public boolean icaronPortalOpen = false;
		public boolean icaronPortalPlaced = false;
		public boolean voidPortalOpen = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			icaronPortalOpen = nbt.getBoolean("icaronPortalOpen");
			icaronPortalPlaced = nbt.getBoolean("icaronPortalPlaced");
			voidPortalOpen = nbt.getBoolean("voidPortalOpen");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("icaronPortalOpen", icaronPortalOpen);
			nbt.putBoolean("icaronPortalPlaced", icaronPortalPlaced);
			nbt.putBoolean("voidPortalOpen", voidPortalOpen);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				CemmMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "cemm_mapvars";

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				CemmMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("cemm", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double bleedingDamageCooldown = 0.0;
		public double bleedingIncreaseDuration = 5.0;
		public String currentlyUsed = "\"\"";
		public String electrolyzerInstructionsRecipe = "";
		public double enchantmentOutputLevel = 0.0;
		public String Goal1 = "";
		public String Goal10 = "";
		public String Goal2 = "";
		public String Goal3 = "";
		public String Goal4 = "";
		public String Goal5 = "";
		public String Goal6 = "";
		public String Goal7 = "";
		public String Goal8 = "";
		public String Goal9 = "";
		public boolean icaronLanded = true;
		public boolean infoSignOpen = false;
		public boolean launched = false;
		public double oxygenLevel = 3600.0;
		public boolean playerSalted = false;
		public String pressurizerInstructionsRecipe = "";
		public String refineryInstructionsRecipe = "";
		public boolean showTime = true;
		public String vacuumizerInstructionsRecipe = "";
		public boolean ashenAngered = true;
		public String OreScanning = "";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CemmMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("bleedingDamageCooldown", bleedingDamageCooldown);
			nbt.putDouble("bleedingIncreaseDuration", bleedingIncreaseDuration);
			nbt.putString("currentlyUsed", currentlyUsed);
			nbt.putString("electrolyzerInstructionsRecipe", electrolyzerInstructionsRecipe);
			nbt.putDouble("enchantmentOutputLevel", enchantmentOutputLevel);
			nbt.putString("Goal1", Goal1);
			nbt.putString("Goal10", Goal10);
			nbt.putString("Goal2", Goal2);
			nbt.putString("Goal3", Goal3);
			nbt.putString("Goal4", Goal4);
			nbt.putString("Goal5", Goal5);
			nbt.putString("Goal6", Goal6);
			nbt.putString("Goal7", Goal7);
			nbt.putString("Goal8", Goal8);
			nbt.putString("Goal9", Goal9);
			nbt.putBoolean("icaronLanded", icaronLanded);
			nbt.putBoolean("infoSignOpen", infoSignOpen);
			nbt.putBoolean("launched", launched);
			nbt.putDouble("oxygenLevel", oxygenLevel);
			nbt.putBoolean("playerSalted", playerSalted);
			nbt.putString("pressurizerInstructionsRecipe", pressurizerInstructionsRecipe);
			nbt.putString("refineryInstructionsRecipe", refineryInstructionsRecipe);
			nbt.putBoolean("showTime", showTime);
			nbt.putString("vacuumizerInstructionsRecipe", vacuumizerInstructionsRecipe);
			nbt.putBoolean("ashenAngered", ashenAngered);
			nbt.putString("OreScanning", OreScanning);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			bleedingDamageCooldown = nbt.getDouble("bleedingDamageCooldown");
			bleedingIncreaseDuration = nbt.getDouble("bleedingIncreaseDuration");
			currentlyUsed = nbt.getString("currentlyUsed");
			electrolyzerInstructionsRecipe = nbt.getString("electrolyzerInstructionsRecipe");
			enchantmentOutputLevel = nbt.getDouble("enchantmentOutputLevel");
			Goal1 = nbt.getString("Goal1");
			Goal10 = nbt.getString("Goal10");
			Goal2 = nbt.getString("Goal2");
			Goal3 = nbt.getString("Goal3");
			Goal4 = nbt.getString("Goal4");
			Goal5 = nbt.getString("Goal5");
			Goal6 = nbt.getString("Goal6");
			Goal7 = nbt.getString("Goal7");
			Goal8 = nbt.getString("Goal8");
			Goal9 = nbt.getString("Goal9");
			icaronLanded = nbt.getBoolean("icaronLanded");
			infoSignOpen = nbt.getBoolean("infoSignOpen");
			launched = nbt.getBoolean("launched");
			oxygenLevel = nbt.getDouble("oxygenLevel");
			playerSalted = nbt.getBoolean("playerSalted");
			pressurizerInstructionsRecipe = nbt.getString("pressurizerInstructionsRecipe");
			refineryInstructionsRecipe = nbt.getString("refineryInstructionsRecipe");
			showTime = nbt.getBoolean("showTime");
			vacuumizerInstructionsRecipe = nbt.getString("vacuumizerInstructionsRecipe");
			ashenAngered = nbt.getBoolean("ashenAngered");
			OreScanning = nbt.getString("OreScanning");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.bleedingDamageCooldown = message.data.bleedingDamageCooldown;
					variables.bleedingIncreaseDuration = message.data.bleedingIncreaseDuration;
					variables.currentlyUsed = message.data.currentlyUsed;
					variables.electrolyzerInstructionsRecipe = message.data.electrolyzerInstructionsRecipe;
					variables.enchantmentOutputLevel = message.data.enchantmentOutputLevel;
					variables.Goal1 = message.data.Goal1;
					variables.Goal10 = message.data.Goal10;
					variables.Goal2 = message.data.Goal2;
					variables.Goal3 = message.data.Goal3;
					variables.Goal4 = message.data.Goal4;
					variables.Goal5 = message.data.Goal5;
					variables.Goal6 = message.data.Goal6;
					variables.Goal7 = message.data.Goal7;
					variables.Goal8 = message.data.Goal8;
					variables.Goal9 = message.data.Goal9;
					variables.icaronLanded = message.data.icaronLanded;
					variables.infoSignOpen = message.data.infoSignOpen;
					variables.launched = message.data.launched;
					variables.oxygenLevel = message.data.oxygenLevel;
					variables.playerSalted = message.data.playerSalted;
					variables.pressurizerInstructionsRecipe = message.data.pressurizerInstructionsRecipe;
					variables.refineryInstructionsRecipe = message.data.refineryInstructionsRecipe;
					variables.showTime = message.data.showTime;
					variables.vacuumizerInstructionsRecipe = message.data.vacuumizerInstructionsRecipe;
					variables.ashenAngered = message.data.ashenAngered;
					variables.OreScanning = message.data.OreScanning;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
