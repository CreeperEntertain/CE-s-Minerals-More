
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class TopazTileSlabBlock extends SlabBlock {
	public TopazTileSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).strength(2f, 6.5f).requiresCorrectToolForDrops().dynamicShape());
	}
}
