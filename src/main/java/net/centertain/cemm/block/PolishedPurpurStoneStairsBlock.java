
package net.centertain.cemm.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;

public class PolishedPurpurStoneStairsBlock extends StairBlock {
	public PolishedPurpurStoneStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
						.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.step")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.hit")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.midori.fall"))))
						.strength(5f, 9f).requiresCorrectToolForDrops().dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 9f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
