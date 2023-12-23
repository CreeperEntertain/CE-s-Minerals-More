
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.GeodeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Set;

public class DiamondGeodeFeature extends GeodeFeature {
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD, ResourceKey.create(Registries.DIMENSION, new ResourceLocation("cemm:chlorophyl_dimension")));

	public DiamondGeodeFeature() {
		super(GeodeConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<GeodeConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
