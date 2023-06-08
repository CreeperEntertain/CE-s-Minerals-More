
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
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.procedures.ProceduralEbonyTrunkProcedure;
import net.centertain.cemm.init.CemmModBlocks;

import java.util.Set;
import java.util.List;

public class EbonyTreeGeneratorFeature extends Feature<NoneFeatureConfiguration> {
	public static EbonyTreeGeneratorFeature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new EbonyTreeGeneratorFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("cemm:ebony_tree_generator", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("cemm:ebony_tree_generator", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public EbonyTreeGeneratorFeature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(CemmModBlocks.MONAZITE_SAND.get(), CemmModBlocks.ZIRCON_SAND.get(), Blocks.SAND, Blocks.RED_SAND, CemmModBlocks.CHLOROGRASS_BLOCK_DIRT.get(), CemmModBlocks.CHLOROGRASS_BLOCK_STONE.get(),
				CemmModBlocks.CHLOROGRASS_BLOCK_MOSS.get(), CemmModBlocks.CHLOROGRASS_BLOCK_ANDESITE.get(), CemmModBlocks.CHLOROGRASS_BLOCK_GRANITE.get(), CemmModBlocks.CHLOROGRASS_BLOCK_DIORITE.get(), CemmModBlocks.CHLOROGRASS_BLOCK_TUFF.get(),
				CemmModBlocks.CHLOROGRASS_BLOCK_DRIPSTONE.get(), CemmModBlocks.FIREGRASS_BLOCK_ANDESITE.get(), CemmModBlocks.FIREGRASS_BLOCK_DIORITE.get(), CemmModBlocks.FIREGRASS_BLOCK_DIRT.get(), CemmModBlocks.FIREGRASS_BLOCK_DRIPSTONE.get(),
				CemmModBlocks.FIREGRASS_BLOCK_GRANITE.get(), CemmModBlocks.FIREGRASS_BLOCK_MOSS.get(), CemmModBlocks.FIREGRASS_BLOCK_STONE.get(), CemmModBlocks.FIREGRASS_BLOCK_TUFF.get(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.COARSE_DIRT,
				Blocks.PODZOL, Blocks.ROOTED_DIRT, Blocks.MOSS_BLOCK, Blocks.MUD, CemmModBlocks.JASPILITE.get(), CemmModBlocks.SCORIA.get(), CemmModBlocks.RED_SHALE.get(), CemmModBlocks.ORPIMENT.get(), CemmModBlocks.SMOOTH_JASPILITE.get());
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("cemm", "ebony_generator"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 30000) {
			int count = context.random().nextInt(4) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);
				WorldGenLevel world = context.level();
				int x = spawnTo.getX();
				int y = spawnTo.getY();
				int z = spawnTo.getZ();
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false), context.random(), 2)) {
					ProceduralEbonyTrunkProcedure.execute(world, x, y, z);
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
