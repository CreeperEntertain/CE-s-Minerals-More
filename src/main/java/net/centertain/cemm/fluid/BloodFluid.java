
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

public abstract class BloodFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CemmModFluidTypes.BLOOD_TYPE.get(), () -> CemmModFluids.BLOOD.get(), () -> CemmModFluids.FLOWING_BLOOD.get()).explosionResistance(100f)
			.tickRate(10).slopeFindDistance(6).bucket(() -> CemmModItems.BLOOD_BUCKET.get()).block(() -> (LiquidBlock) CemmModBlocks.BLOOD.get());

	private BloodFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluid {
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
