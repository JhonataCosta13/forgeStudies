package net.jotas.firstmod.item;

import net.jotas.firstmod.FirstMod;
import net.jotas.firstmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(2, 750, 2f, 2f, 25,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())), //Level 4 = netherite
            new ResourceLocation(FirstMod.MOD_ID, "ruby"), List.of(Tiers.IRON), List.of());
}
