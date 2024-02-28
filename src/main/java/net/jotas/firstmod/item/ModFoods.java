package net.jotas.firstmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DONUT = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 200), 0.1f).build(); //The duration is in ticks, 200 = 10 seconds
}
