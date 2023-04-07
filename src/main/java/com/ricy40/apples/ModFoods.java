package com.ricy40.apples;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties LAPIS_APPLE = (new FoodProperties.Builder())
            .nutrition(4)
            .saturationMod(0.3F).build();
    public static final FoodProperties COPPER_APPLE = (new FoodProperties.Builder())
            .nutrition(4)
            .saturationMod(0.6F).build();
    public static final FoodProperties IRON_APPLE = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationMod(0.6F).build();
    public static final FoodProperties GOLDEN_LAPIS_APPLE = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationMod(0.8F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 2), 1.0F)
            .alwaysEat().build();
    public static final FoodProperties DIAMOND_APPLE = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationMod(1.2F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
            .alwaysEat().build();
    public static final FoodProperties NETHERITE_APPLE = (new FoodProperties.Builder())
            .nutrition(10)
            .saturationMod(1.2F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0f)
            .alwaysEat().build();
    public static final FoodProperties NOTCH_APPLE = (new FoodProperties.Builder())
            .nutrition(10)
            .saturationMod(1.2F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 800, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 0), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 4800, 6), 1.0F)
            .alwaysEat().build();

    public static final FoodProperties RAW_IRON_APPLE = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationMod(0.4F).build();
    public static final FoodProperties RAW_GOLDEN_APPLE = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationMod(1.0F).build();
    public static final FoodProperties RAW_COPPER_APPLE = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationMod(0.4F).build();

    public static final FoodProperties ORANGE_APPLE = (new FoodProperties.Builder())
            .nutrition(7)
            .saturationMod(0.8F).build();
    public static final FoodProperties PINE_APPLE = (new FoodProperties.Builder())
            .nutrition(12)
            .saturationMod(0.8F).build();
    public static final FoodProperties RED_CARROT = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationMod(1.2F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0), 1.0F)
            .alwaysEat().build();
    public static final FoodProperties APPLE_NUGGET = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties APPLE_SWORD = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.3F).build();
    public static final FoodProperties APPLE_INGOT
            = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();

}
