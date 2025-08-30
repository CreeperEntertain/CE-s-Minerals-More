
package net.centertain.cemm.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;

public class HardenedSandBrickStairsBlock extends StairBlock {
	public HardenedSandBrickStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE)
						.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.break")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.place")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.hit")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.hardened_sand.step"))))
						.strength(0.75f, 0.5f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 0.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
