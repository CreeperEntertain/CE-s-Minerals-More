
package net.centertain.cemm.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class ObsidianSlabBlock extends SlabBlock {
	public ObsidianSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(50f, 1200f).requiresCorrectToolForDrops().pushReaction(PushReaction.BLOCK).dynamicShape());
	}
}
