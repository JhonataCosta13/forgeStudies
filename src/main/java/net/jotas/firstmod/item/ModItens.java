package net.jotas.firstmod.item;

import net.jotas.firstmod.FirstMod;
import net.jotas.firstmod.item.custom.GemsDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItens {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    //Just copy this for more Items
    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    //Custom item classes
    public static final RegistryObject<Item> GEMS_DETECTOR = ITEMS.register("gems_detector",
            () -> new GemsDetectorItem(new Item.Properties().durability(100))); //This item can be use 100 times

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
