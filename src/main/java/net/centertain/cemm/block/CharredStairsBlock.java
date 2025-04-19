
package net.centertain.cemm.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CharredStairsBlock extends StairBlock {
	public CharredStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS)
						.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.charred_wood.break")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.charred_wood.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.charred_wood.place")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.hit")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cemm:block.charred_wood.place"))))
						.strength(2f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 2f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 20;
	}
}
