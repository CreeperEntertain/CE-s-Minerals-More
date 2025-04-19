
package net.centertain.cemm.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.centertain.cemm.init.CemmModItems;
import net.centertain.cemm.init.CemmModFluids;
import net.centertain.cemm.init.CemmModFluidTypes;
import net.centertain.cemm.init.CemmModBlocks;

public abstract class LiquidGoldFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CemmModFluidTypes.LIQUID_GOLD_TYPE.get(), () -> CemmModFluids.LIQUID_GOLD.get(), () -> CemmModFluids.FLOWING_LIQUID_GOLD.get())
			.explosionResistance(100f).tickRate(30).levelDecreasePerBlock(2).slopeFindDistance(2).bucket(() -> CemmModItems.LIQUID_GOLD_BUCKET.get()).block(() -> (LiquidBlock) CemmModBlocks.LIQUID_GOLD.get());

	private LiquidGoldFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_LAVA;
	}

	public static class Source extends LiquidGoldFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidGoldFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
