package com.ricy40.neapples;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NEApples.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {

    public static CreativeModeTab APPLES;

    @SubscribeEvent
    public static void register(CreativeModeTabEvent.Register event) {
        APPLES = event.registerCreativeModeTab(new ResourceLocation(NEApples.MODID, "apples"),
                builder -> builder
                        .icon(() -> new ItemStack(Items.APPLE))
                        .title(Component.translatable("apples_tab"))
                        .build());
    }
}
