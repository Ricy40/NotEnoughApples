package com.ricy40.neapples;

import com.ricy40.neapples.custombits.BucketFoodItem;
import com.ricy40.neapples.custombits.OverpricedAppleItem;
import com.ricy40.neapples.custombits.RodFoodItem;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NEApples.MODID);

    public static List<RegistryObject<Item>> ITEM_LIST = new ArrayList<>();

    public static final RegistryObject<Item> APPLE_INGOT = registerItem("apple_ingot",
            () -> new Item(new Item.Properties().food(ModFoods.APPLE_INGOT)));
    public static final RegistryObject<Item> APPLE_NUGGET = registerItem("apple_nugget",
            () -> new Item(new Item.Properties().food(ModFoods.APPLE_NUGGET)));
    public static final RegistryObject<Item> APPLE_ON_A_STICK = registerItem("apple_on_a_stick",
            () -> new RodFoodItem(new Item.Properties().stacksTo(1).food(Foods.APPLE)));
    public static final RegistryObject<Item> APPLE_SWORD = registerItem("apple_sword",
            () -> new SwordItem(Tiers.WOOD, 4, -2.4F, new Item.Properties().food(ModFoods.APPLE_SWORD)));
    public static final RegistryObject<Item> BUCKET_OF_APPLE = registerItem("bucket_of_apple",
            () -> new BucketFoodItem(new Item.Properties().stacksTo(1).food(Foods.APPLE)));
    public static final RegistryObject<Item> COPPER_APPLE = registerItem("copper_apple",
            () -> new Item(new Item.Properties().food(ModFoods.COPPER_APPLE)));
    public static final RegistryObject<Item> DIAMOND_APPLE = registerItem("diamond_apple",
            () -> new Item(new Item.Properties().food(ModFoods.DIAMOND_APPLE)));
    public static final RegistryObject<Item> GOLDEN_LAPIS_APPLE = registerItem("golden_lapis_apple",
            () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_LAPIS_APPLE)));
    public static final RegistryObject<Item> IRON_APPLE = registerItem("iron_apple",
            () -> new Item(new Item.Properties().food(ModFoods.IRON_APPLE)));
    public static final RegistryObject<Item> LAPIS_APPLE = registerItem("lapis_apple",
            () -> new Item(new Item.Properties().food(ModFoods.LAPIS_APPLE)));
    public static final RegistryObject<Item> NETHERITE_APPLE = registerItem("netherite_apple",
            () -> new Item(new Item.Properties().food(ModFoods.NETHERITE_APPLE)));
    public static final RegistryObject<Item> NOTCH_APPLE = registerItem("notch_apple",
            () -> new Item(new Item.Properties().food(ModFoods.NOTCH_APPLE)));
    public static final RegistryObject<Item> ORANGE_APPLE = registerItem("orange_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ORANGE_APPLE)));
    public static final RegistryObject<Item> OVERPRICED_APPLE = registerItem("overpriced_apple",
            () -> new OverpricedAppleItem(new Item.Properties().food(Foods.APPLE)));
    public static final RegistryObject<Item> PINE_APPLE = registerItem("pine_apple",
            () -> new Item(new Item.Properties().food(ModFoods.PINE_APPLE)));
    public static final RegistryObject<Item> RAW_COPPER_APPLE = registerItem("raw_copper_apple",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_COPPER_APPLE)));
    public static final RegistryObject<Item> RAW_GOLDEN_APPLE = registerItem("raw_golden_apple",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_GOLDEN_APPLE)));
    public static final RegistryObject<Item> RAW_IRON_APPLE = registerItem("raw_iron_apple",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_IRON_APPLE)));
    public static final RegistryObject<Item> RED_CARROT = registerItem("red_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.RED_CARROT)));

    public static <T extends Item> RegistryObject<Item> registerItem(String name, Supplier<T> item) {
        RegistryObject<Item> toReturn = ITEMS.register(name, item);
        ITEM_LIST.add(toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
