
package net.centertain.cemm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class MossySmallMudstoneBrickWallBlock extends WallBlock {
	public MossySmallMudstoneBrickWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.NETHERRACK).strength(1f, 6f).requiresCorrectToolForDrops().dynamicShape().forceSolidOn());
	}
}
