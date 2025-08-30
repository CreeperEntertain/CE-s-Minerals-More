
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class FramedPaperWallBlock extends IronBarsBlock {
	public FramedPaperWallBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.SCAFFOLDING).strength(0.75f, 1.5f));
	}
}
