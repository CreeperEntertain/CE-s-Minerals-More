
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.ReplaceSphereConfiguration;
import net.minecraft.world.level.levelgen.feature.ReplaceBlobsFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Set;

public class BromianThicketVibratingMossPlacementFeature extends ReplaceBlobsFeature {
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("cemm:icaron")));

	public BromianThicketVibratingMossPlacementFeature() {
		super(ReplaceSphereConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<ReplaceSphereConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
