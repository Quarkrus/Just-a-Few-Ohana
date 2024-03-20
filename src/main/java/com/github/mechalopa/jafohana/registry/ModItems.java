package com.github.mechalopa.jafohana.registry;

import java.util.function.Supplier;

import com.github.mechalopa.jafohana.JAFOhana;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
	private static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, JAFOhana.MODID);

	public static final Supplier<Item> DAYFLOWER = REGISTRY.register("dayflower", () -> new BlockItem(ModBlocks.DAYFLOWER.get(), new Item.Properties()));
	public static final Supplier<Item> EVENING_PRIMROSE = REGISTRY.register("evening_primrose", () -> new BlockItem(ModBlocks.EVENING_PRIMROSE.get(), new Item.Properties()));
	public static final Supplier<Item> MILK_VETCH = REGISTRY.register("milk_vetch", () -> new BlockItem(ModBlocks.MILK_VETCH.get(), new Item.Properties()));
	public static final Supplier<Item> FORGET_ME_NOT = REGISTRY.register("forget_me_not", () -> new BlockItem(ModBlocks.FORGET_ME_NOT.get(), new Item.Properties()));
	public static final Supplier<Item> YELLOW_AFRICAN_DAISY = REGISTRY.register("yellow_african_daisy", () -> new BlockItem(ModBlocks.YELLOW_AFRICAN_DAISY.get(), new Item.Properties()));
	public static final Supplier<Item> PINK_AFRICAN_DAISY = REGISTRY.register("pink_african_daisy", () -> new BlockItem(ModBlocks.PINK_AFRICAN_DAISY.get(), new Item.Properties()));
	public static final Supplier<Item> WHITE_AFRICAN_DAISY = REGISTRY.register("white_african_daisy", () -> new BlockItem(ModBlocks.WHITE_AFRICAN_DAISY.get(), new Item.Properties()));
	public static final Supplier<Item> BLACK_TULIP = REGISTRY.register("black_tulip", () -> new BlockItem(ModBlocks.BLACK_TULIP.get(), new Item.Properties()));
	public static final Supplier<Item> GREEN_TULIP = REGISTRY.register("green_tulip", () -> new BlockItem(ModBlocks.GREEN_TULIP.get(), new Item.Properties()));
	public static final Supplier<Item> BLOOD_RED_IRIS = REGISTRY.register("blood_red_iris", () -> new BlockItem(ModBlocks.BLOOD_RED_IRIS.get(), new Item.Properties()));
	public static final Supplier<Item> BLUEBELL = REGISTRY.register("bluebell", () -> new BlockItem(ModBlocks.BLUEBELL.get(), new Item.Properties()));
	public static final Supplier<Item> RED_SNAPDRAGON = REGISTRY.register("red_snapdragon", () -> new BlockItem(ModBlocks.RED_SNAPDRAGON.get(), new Item.Properties()));
	public static final Supplier<Item> YELLOW_SNAPDRAGON = REGISTRY.register("yellow_snapdragon", () -> new BlockItem(ModBlocks.YELLOW_SNAPDRAGON.get(), new Item.Properties()));
	public static final Supplier<Item> PINK_SNAPDRAGON = REGISTRY.register("pink_snapdragon", () -> new BlockItem(ModBlocks.PINK_SNAPDRAGON.get(), new Item.Properties()));
	public static final Supplier<Item> WHITE_EGRET_ORCHID = REGISTRY.register("white_egret_orchid", () -> new BlockItem(ModBlocks.WHITE_EGRET_ORCHID.get(), new Item.Properties()));
	public static final Supplier<Item> ORANGE_SPIDER_LILY = REGISTRY.register("orange_spider_lily", () -> new BlockItem(ModBlocks.ORANGE_SPIDER_LILY.get(), new Item.Properties()));
	public static final Supplier<Item> DANCING_LADIES_GINGER = REGISTRY.register("dancing_ladies_ginger", () -> new BlockItem(ModBlocks.DANCING_LADIES_GINGER.get(), new Item.Properties()));
	public static final Supplier<Item> FIREBALL_LILY = REGISTRY.register("fireball_lily", () -> new BlockItem(ModBlocks.FIREBALL_LILY.get(), new Item.Properties()));
	public static final Supplier<Item> SPATHIPHYLLUM = REGISTRY.register("spathiphyllum", () -> new BlockItem(ModBlocks.SPATHIPHYLLUM.get(), new Item.Properties()));
	public static final Supplier<Item> PURPLE_PANSY = REGISTRY.register("purple_pansy", () -> new BlockItem(ModBlocks.PURPLE_PANSY.get(), new Item.Properties()));
	public static final Supplier<Item> WHITE_PANSY = REGISTRY.register("white_pansy", () -> new BlockItem(ModBlocks.WHITE_PANSY.get(), new Item.Properties()));
	public static final Supplier<Item> YELLOW_PANSY = REGISTRY.register("yellow_pansy", () -> new BlockItem(ModBlocks.YELLOW_PANSY.get(), new Item.Properties()));
	public static final Supplier<Item> CREEPANSY = REGISTRY.register("creepansy", () -> new BlockItem(ModBlocks.CREEPANSY.get(), new Item.Properties()));
	public static final Supplier<Item> SNOWDROP = REGISTRY.register("snowdrop", () -> new BlockItem(ModBlocks.SNOWDROP.get(), new Item.Properties()));
	public static final Supplier<Item> WINTER_HEATH = REGISTRY.register("winter_heath", () -> new BlockItem(ModBlocks.WINTER_HEATH.get(), new Item.Properties()));
	public static final Supplier<Item> BLUE_DAISY = REGISTRY.register("blue_daisy", () -> new BlockItem(ModBlocks.BLUE_DAISY.get(), new Item.Properties()));
	public static final Supplier<Item> CRIMSON_CLOVER = REGISTRY.register("crimson_clover", () -> new BlockItem(ModBlocks.CRIMSON_CLOVER.get(), new Item.Properties()));
	public static final Supplier<Item> WHEEL_LILY = REGISTRY.register("wheel_lily", () -> new BlockItem(ModBlocks.WHEEL_LILY.get(), new Item.Properties()));
	public static final Supplier<Item> MAGENTA_SPOTTED_BELLFLOWER = REGISTRY.register("magenta_spotted_bellflower", () -> new BlockItem(ModBlocks.MAGENTA_SPOTTED_BELLFLOWER.get(), new Item.Properties()));
	public static final Supplier<Item> WHITE_SPOTTED_BELLFLOWER = REGISTRY.register("white_spotted_bellflower", () -> new BlockItem(ModBlocks.WHITE_SPOTTED_BELLFLOWER.get(), new Item.Properties()));
	public static final Supplier<Item> RED_SPIDER_LILY = REGISTRY.register("red_spider_lily", () -> new BlockItem(ModBlocks.RED_SPIDER_LILY.get(), new Item.Properties()));
	public static final Supplier<Item> BELLS_OF_IRELAND = REGISTRY.register("bells_of_ireland", () -> new BlockItem(ModBlocks.BELLS_OF_IRELAND.get(), new Item.Properties()));
	public static final Supplier<Item> ORANGE_MARIGOLD = REGISTRY.register("orange_marigold", () -> new DoubleHighBlockItem(ModBlocks.ORANGE_MARIGOLD.get(), new Item.Properties()));
	public static final Supplier<Item> YELLOW_MARIGOLD = REGISTRY.register("yellow_marigold", () -> new DoubleHighBlockItem(ModBlocks.YELLOW_MARIGOLD.get(), new Item.Properties()));
	public static final Supplier<Item> GLORIOSA = REGISTRY.register("gloriosa", () -> new DoubleHighBlockItem(ModBlocks.GLORIOSA.get(), new Item.Properties()));
	public static final Supplier<Item> BLACK_BAT_FLOWER = REGISTRY.register("black_bat_flower", () -> new DoubleHighBlockItem(ModBlocks.BLACK_BAT_FLOWER.get(), new Item.Properties()));
	public static final Supplier<Item> BIRD_OF_PARADISE = REGISTRY.register("bird_of_paradise", () -> new DoubleHighBlockItem(ModBlocks.BIRD_OF_PARADISE.get(), new Item.Properties()));
	public static final Supplier<Item> BRAZILIAN_PLUME = REGISTRY.register("brazilian_plume", () -> new DoubleHighBlockItem(ModBlocks.BRAZILIAN_PLUME.get(), new Item.Properties()));
	public static final Supplier<Item> WORSLEYA = REGISTRY.register("worsleya", () -> new DoubleHighBlockItem(ModBlocks.WORSLEYA.get(), new Item.Properties()));
	public static final Supplier<Item> FASCIATED_DANDELION = REGISTRY.register("fasciated_dandelion", () -> new DoubleHighBlockItem(ModBlocks.FASCIATED_DANDELION.get(), new Item.Properties()));
	public static final Supplier<Item> FASCIATED_OXEYE_DAISY = REGISTRY.register("fasciated_oxeye_daisy", () -> new DoubleHighBlockItem(ModBlocks.FASCIATED_OXEYE_DAISY.get(), new Item.Properties()));
	public static final Supplier<Item> JADE_VINE = REGISTRY.register("jade_vine", () -> new BlockItem(ModBlocks.JADE_VINE.get(), new Item.Properties()));

	@SubscribeEvent
	public static void register(IEventBus eventBus)
	{
		REGISTRY.register(eventBus);
	}

	public static DeferredRegister<Item> getItemRegistry()
	{
		return REGISTRY;
	}
}