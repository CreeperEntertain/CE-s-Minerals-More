
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class LightGrayShingleSlabBlock extends SlabBlock {
	public LightGrayShingleSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.NETHER_BRICKS).strength(1.25f, 4.2f).requiresCorrectToolForDrops().dynamicShape());
	}
}
