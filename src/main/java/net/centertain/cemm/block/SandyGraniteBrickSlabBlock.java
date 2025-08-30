
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class SandyGraniteBrickSlabBlock extends SlabBlock {
	public SandyGraniteBrickSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE_BRICKS).strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
