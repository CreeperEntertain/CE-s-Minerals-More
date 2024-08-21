
package net.centertain.cemm.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class ObsidianBrickWallBlock extends WallBlock {
	public ObsidianBrickWallBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(50f, 1200f).requiresCorrectToolForDrops().pushReaction(PushReaction.BLOCK).dynamicShape().forceSolidOn());
	}
}
