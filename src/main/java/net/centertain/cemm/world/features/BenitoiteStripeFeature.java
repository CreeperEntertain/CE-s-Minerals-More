
package net.centertain.cemm.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.Set;
import java.util.List;

public class BenitoiteStripeFeature extends Feature<NoneFeatureConfiguration> {
	public static BenitoiteStripeFeature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new BenitoiteStripeFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("cemm:benitoite_stripe", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("cemm:benitoite_stripe", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public BenitoiteStripeFeature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(CemmModBlocks.FAKE_ANDESITE.get(), CemmModBlocks.FAKE_DIORITE.get(), CemmModBlocks.FAKE_GRANITE.get(), CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get(), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get(),
				CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get(), CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get(), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get(), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get(), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get(),
				CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get(), CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get(), CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get(), CemmModBlocks.FIREGRASS_BLOCK_DIRT.get(), CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get(),
				CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get(), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get(), CemmModBlocks.FIREGRASS_BLOCK_STONE.get(), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get(), Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE,
				Blocks.DEEPSLATE, Blocks.TUFF, Blocks.DRIPSTONE_BLOCK, Blocks.DIRT, Blocks.MOSS_BLOCK);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("cemm", "benitoite_stripe"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 1000000) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.WORLD_SURFACE_WG, i, k);
				j = Mth.nextInt(context.random(), 8 + context.level().getMinBuildHeight(), Math.max(j, 9 + context.level().getMinBuildHeight()));
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + 0, j + -18, k + 0);
				if (template.placeInWorld(context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)]).setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
						.addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context.random(), 2)) {
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
