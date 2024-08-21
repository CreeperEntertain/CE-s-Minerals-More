
package net.centertain.cemm.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.resources.ResourceLocation;

public class OchrePlasterSlabBlock extends SlabBlock {
	public OchrePlasterSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.decorated_pot.shatter")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.decorated_pot.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.decorated_pot.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.decorated_pot.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.decorated_pot.fall"))))
				.strength(1f, 3f).requiresCorrectToolForDrops().dynamicShape());
	}
}
