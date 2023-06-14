
package net.centertain.cemm.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.centertain.cemm.procedures.AcidMobplayerCollidesBlockProcedure;
import net.centertain.cemm.procedures.AcidClientDisplayRandomTickProcedure;
import net.centertain.cemm.init.CemmModFluids;

public class AcidBlock extends LiquidBlock {
	public AcidBlock() {
		super(() -> CemmModFluids.ACID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		AcidMobplayerCollidesBlockProcedure.execute(entity);
	}

	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		AcidClientDisplayRandomTickProcedure.execute(Minecraft.getInstance().player);
	}
}
