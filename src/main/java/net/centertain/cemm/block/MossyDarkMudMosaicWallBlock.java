
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class MossyDarkMudMosaicWallBlock extends WallBlock {
	public MossyDarkMudMosaicWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.MUD_BRICKS).strength(1f, 3f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
