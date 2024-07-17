package xyz.luobo.sandisland.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import xyz.luobo.sandisland.Registry.ItemRegistry;
import xyz.luobo.sandisland.SandIsland;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        SandIsland.LOGGER.info("item/%s".formatted(ItemRegistry.SOLAR_BOW.get().toString()));
        this.singleTexture(ItemRegistry.SOLAR_BOW.get().toString(), new ResourceLocation("item/generated"), "layer0", new ResourceLocation(SandIsland.MODID, "item/%s".formatted(ItemRegistry.SOLAR_BOW.get().toString())));
    }
}
