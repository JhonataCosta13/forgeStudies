package net.jotas.firstmod.item;

import net.jotas.firstmod.FirstMod;
import net.jotas.firstmod.item.custom.FuelItem;
import net.jotas.firstmod.item.custom.GemsDetectorItem;
import net.jotas.firstmod.item.custom.RandomFileFinder;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    //Just copy this for more Items
    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));

    //Food Items
    public static final RegistryObject<Item> DONUT = ITEMS.register("donut",
            () -> new Item(new Item.Properties().food(ModFoods.DONUT)));

    //Fuel Items
    public static final RegistryObject<Item> GASOLINE = ITEMS.register("gasoline",
            () -> new FuelItem(new Item.Properties(), 400)); //burnTime is in ticks, 400 = 20 seconds

    //Advanced Items
    public static final RegistryObject<Item> GEMS_DETECTOR = ITEMS.register("gems_detector",
            () -> new GemsDetectorItem(new Item.Properties().durability(100))); //This item can be use 100 times

    public static final RegistryObject<Item> RANDOM_FILE_FINDER = ITEMS.register("random_file_finder",
            () -> new RandomFileFinder(new Item.Properties())); //This item can be use 100 times

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
