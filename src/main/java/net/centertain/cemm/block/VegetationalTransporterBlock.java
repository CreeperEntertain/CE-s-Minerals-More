
package net.centertain.cemm.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.procedures.VegetationalTransporterEntityWalksOnProcedure;

public class VegetationalTransporterBlock extends Block {
	public VegetationalTransporterBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANVIL).strength(50f, 10f).lightLevel(s -> 15).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		VegetationalTransporterEntityWalksOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
