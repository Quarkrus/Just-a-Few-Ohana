package com.github.mechalopa.jafohana.world.level.block;

import com.github.mechalopa.jafohana.util.ModTags;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class BeachSpiderLilyBlock extends MediumFlowerBlock
{
	public BeachSpiderLilyBlock(Holder<MobEffect> effect, int effectDuration)
	{
		super(effect, effectDuration);
	}

	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter world, BlockPos pos)
	{
		return state.is(ModTags.BlockTags.BEACH_SPIDER_LILY_PLANTABLE_ON);
	}
}