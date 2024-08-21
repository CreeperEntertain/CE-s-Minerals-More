
package net.centertain.cemm.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.centertain.cemm.init.CemmModItems;
import net.centertain.cemm.init.CemmModFluids;
import net.centertain.cemm.init.CemmModFluidTypes;
import net.centertain.cemm.init.CemmModBlocks;

public abstract class OilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CemmModFluidTypes.OIL_TYPE.get(), () -> CemmModFluids.OIL.get(), () -> CemmModFluids.FLOWING_OIL.get()).explosionResistance(100f).tickRate(20)
			.bucket(() -> CemmModItems.OIL_BUCKET.get()).block(() -> (LiquidBlock) CemmModBlocks.OIL.get());

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
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
