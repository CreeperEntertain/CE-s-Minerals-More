
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class GildedBasaltTileSlabBlock extends SlabBlock {
	public GildedBasaltTileSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.NETHERITE_BLOCK).strength(1.25f, 4.2f).requiresCorrectToolForDrops().dynamicShape());
	}
}
