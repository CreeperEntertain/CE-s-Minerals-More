
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedPorphyrySlabBlock extends SlabBlock {
	public PolishedPorphyrySlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.BASALT).strength(2f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
