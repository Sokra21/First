package net.Sokra21.firstmod.item;

import net.Sokra21.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FirstMod.MODID);

    public static final DeferredItem<Item> HOLY = ITEMS.register("holy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ODD_HOLY = ITEMS.register("odd_holy",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
