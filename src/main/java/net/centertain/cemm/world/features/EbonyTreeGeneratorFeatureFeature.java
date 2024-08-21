
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.centertain.cemm.world.features.configurations.StructureFeatureConfiguration;
import net.centertain.cemm.procedures.EbonyTreeGeneratorExtensionProcedure;

public class EbonyTreeGeneratorFeatureFeature extends StructureFeature {
	public EbonyTreeGeneratorFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!EbonyTreeGeneratorExtensionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
