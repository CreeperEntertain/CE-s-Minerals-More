package net.centertain.cemm.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.centertain.cemm.init.CemmModBlocks;

import java.util.Map;

public class DecorativeBookshelfSwitchingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double bookshelfIdNumber = 0;
		String bookshelfId = "";
		String NumberId = "";
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_02.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_02.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_03.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_03.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_04.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_04.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_05.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_05.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_06.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_06.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_07.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_07.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_08.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_08.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_09.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_09.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_10.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_10.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_11.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_11.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF_12.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CemmModBlocks.DECORATIVE_BOOKSHELF_12.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CemmModBlocks.DECORATIVE_BOOKSHELF.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chiseled_bookshelf.pickup")), SoundSource.BLOCKS, (float) 0.8, 1);
			} else {
				_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chiseled_bookshelf.pickup")), SoundSource.BLOCKS, (float) 0.8, 1, false);
			}
		}
	}
}
