
package net.centertain.cemm.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.resources.ResourceLocation;

public class EndSpruceSlabBlock extends SlabBlock {
	public EndSpruceSlabBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.end_wood.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.end_wood.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.end_wood.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.end_wood.dig")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.end_wood.fall"))))
				.strength(5f).dynamicShape());
	}
}
