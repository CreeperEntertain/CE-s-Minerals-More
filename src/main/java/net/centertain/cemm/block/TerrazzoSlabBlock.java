
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class TerrazzoSlabBlock extends SlabBlock {
	public TerrazzoSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DECORATED_POT).strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}
}
