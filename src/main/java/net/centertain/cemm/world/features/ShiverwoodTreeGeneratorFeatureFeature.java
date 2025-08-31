
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.centertain.cemm.world.features.configurations.StructureFeatureConfiguration;
import net.centertain.cemm.procedures.ShiverwoodTreeGeneratorExtensionProcedure;

public class ShiverwoodTreeGeneratorFeatureFeature extends StructureFeature {
	public ShiverwoodTreeGeneratorFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!ShiverwoodTreeGeneratorExtensionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
