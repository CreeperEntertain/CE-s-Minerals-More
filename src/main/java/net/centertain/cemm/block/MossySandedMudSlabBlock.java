
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MossySandedMudSlabBlock extends SlabBlock {
	public MossySandedMudSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.PACKED_MUD).strength(1f, 3f).requiresCorrectToolForDrops().dynamicShape());
	}
}
