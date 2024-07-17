package xyz.luobo.sandisland.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xyz.luobo.sandisland.SandIsland;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = SandIsland.MODID)
public class DataGenEvent {
    @SubscribeEvent
    public static void register(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        gen.addProvider(event.includeClient(), new ModItemModelProvider(gen, SandIsland.MODID, helper));
    }
}
