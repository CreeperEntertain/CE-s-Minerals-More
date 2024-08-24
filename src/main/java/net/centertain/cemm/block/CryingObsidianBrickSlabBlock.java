
package net.centertain.cemm.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CryingObsidianBrickSlabBlock extends SlabBlock {
	public CryingObsidianBrickSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(50f, 1200f).lightLevel(s -> 10).requiresCorrectToolForDrops().pushReaction(PushReaction.BLOCK).dynamicShape());
	}
}
