
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class FlintBrickWallBlock extends WallBlock {
	public FlintBrickWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.NETHER_BRICKS).strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
