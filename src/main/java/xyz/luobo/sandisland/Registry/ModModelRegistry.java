package xyz.luobo.sandisland.Registry;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import xyz.luobo.sandisland.Utils;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModModelRegistry  {
    @SubscribeEvent
    public static void register(FMLClientSetupEvent event) {
        Utils.setupBowModelProperties(ItemRegistry.SOLAR_BOW.get());
    }
}
