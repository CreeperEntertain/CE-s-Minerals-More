
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class TailoredStoneSlabBlock extends SlabBlock {
	public TailoredStoneSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GILDED_BLACKSTONE).strength(3f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
