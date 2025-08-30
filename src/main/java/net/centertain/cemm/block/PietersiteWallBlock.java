
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class PietersiteWallBlock extends WallBlock {
	public PietersiteWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(10f, 20f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
