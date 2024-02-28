package net.jotas.firstmod.item;

import net.jotas.firstmod.FirstMod;
import net.jotas.firstmod.block.ModBlocks;
import net.jotas.firstmod.item.custom.GemsDetectorItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIRST_TAB = CREATIVE_MODE_TABS.register("first_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItens.RUBY.get()))
                    .title(Component.translatable("creativetab.first_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Add custom item
                        output.accept(ModItens.COIN.get());
                        output.accept(ModItens.RUBY.get());
                        output.accept(ModItens.GEMS_DETECTOR.get());

                        //Add custom block
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        //Add vanilla item
                        output.accept(Items.DIAMOND_HOE);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
