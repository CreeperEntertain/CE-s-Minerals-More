
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class CobbledTravertineWallBlock extends WallBlock {
	public CobbledTravertineWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1.25f, 10f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
