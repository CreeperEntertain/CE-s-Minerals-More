
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MossyLargeDarkMudBrickSlabBlock extends SlabBlock {
	public MossyLargeDarkMudBrickSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.MUD_BRICKS).strength(1f, 3f).requiresCorrectToolForDrops().dynamicShape());
	}
}
