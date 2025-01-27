package com.github.mechalopa.jafohana.world.level.modifiers;

import java.util.List;

import com.github.mechalopa.jafohana.registry.ModBiomeModifiers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeGenerationSettingsBuilder;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.ModifiableBiomeInfo;

public record ModAddFeaturesBiomeModifier(List<List<ModAddFeaturesBiomeModifier.BiomeProp>> biomePropLists, HolderSet<PlacedFeature> features, Decoration step) implements BiomeModifier
{
	public static final MapCodec<ModAddFeaturesBiomeModifier> CODEC = RecordCodecBuilder.mapCodec(builder -> builder.group(
			BiomeProp.CODEC.listOf().listOf().fieldOf("biomes").forGetter(ModAddFeaturesBiomeModifier::biomePropLists),
			PlacedFeature.LIST_CODEC.fieldOf("features").forGetter(ModAddFeaturesBiomeModifier::features),
			Decoration.CODEC.fieldOf("step").forGetter(ModAddFeaturesBiomeModifier::step))
			.apply(builder, ModAddFeaturesBiomeModifier::new));

	@Override
	public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder)
	{
		if (phase == Phase.ADD && matches(biome, this.biomePropLists))
		{
			BiomeGenerationSettingsBuilder generationSettings = builder.getGenerationSettings();
			this.features.forEach(holder -> generationSettings.addFeature(this.step, holder));
		}
	}

	public static boolean matches(Holder<Biome> biome, List<List<BiomeProp>> biomePropLists)
	{
		if (biomePropLists != null && !biomePropLists.isEmpty())
		{
			for (List<BiomeProp> biomeProps : biomePropLists)
			{
				boolean flag = true;

				for (BiomeProp biomeProp : biomeProps)
				{
					if (!biomeProp.biomes().contains(biome) ^ biomeProp.negate())
					{
						flag = false;
						break;
					}
				}

				if (flag)
				{
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public MapCodec<? extends BiomeModifier> codec()
	{
		return ModBiomeModifiers.ADD_FEATURES.get();
	}

	public static record BiomeProp(HolderSet<Biome> biomes, boolean negate)
	{
		public static final Codec<BiomeProp> CODEC = RecordCodecBuilder.create((p -> {
			return p.group(Biome.LIST_CODEC.fieldOf("name").forGetter(BiomeProp::biomes), Codec.BOOL.optionalFieldOf("negate", false).forGetter(BiomeProp::negate)).apply(p, BiomeProp::new);
		}));
	}
}