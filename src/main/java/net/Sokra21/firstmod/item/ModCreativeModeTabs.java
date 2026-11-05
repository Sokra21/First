package net.Sokra21.firstmod.item;

import net.Sokra21.firstmod.FirstMod;
import net.Sokra21.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MODID);

    public static final Supplier<CreativeModeTab> HOLY_ITEM_TAB = CREATIVE_MODE_TAB.register("holy_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOLY.get()))
                    .title(Component.translatable("creativetab.firstmod.holy_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HOLY);
                        output.accept(ModItems.ODD_HOLY);
                    }).build());

    public static final Supplier<CreativeModeTab> HOLY_BLOCK_TAB = CREATIVE_MODE_TAB.register("holy_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HOLY_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FirstMod.MODID, "holy_items_tab"))
                    .title(Component.translatable("creativetab.firstmod.holy_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HOLY_BLOCK);
                        output.accept(ModBlocks.HOLY_ORE);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
