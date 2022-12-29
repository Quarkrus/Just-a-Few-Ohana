package com.github.mechalopa.jafohana;

import com.github.mechalopa.jafohana.registry.ModItems;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = JAFOhana.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber
{
	@SubscribeEvent
	public static void setup(final FMLCommonSetupEvent event)
	{
		event.enqueueWork(() -> {
			registerCompostables();
		});
	}

	public static void registerCompostables()
	{
		ComposterBlock.COMPOSTABLES.put(ModItems.DAYFLOWER.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ModItems.EVENING_PRIMROSE.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ModItems.MILK_VETCH.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ModItems.FORGET_ME_NOT.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ModItems.YELLOW_AFRICAN_DAISY.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ModItems.PINK_AFRICAN_DAISY.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ModItems.WHITE_AFRICAN_DAISY.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ModItems.RED_SPIDER_LILY.get(), 0.65F);
	}
}