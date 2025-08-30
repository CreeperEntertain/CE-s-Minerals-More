
package net.centertain.cemm.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.resources.ResourceLocation;

public class MidoriBrickSlabBlock extends SlabBlock {
	public MidoriBrickSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.fall"))))
				.strength(3f, 9f).requiresCorrectToolForDrops().dynamicShape());
	}
}
