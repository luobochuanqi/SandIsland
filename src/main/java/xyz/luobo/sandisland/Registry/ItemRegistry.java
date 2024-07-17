package xyz.luobo.sandisland.Registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.luobo.sandisland.SandIsland;
import xyz.luobo.sandisland.common.item.weapon.bow.SolarBow;
import net.minecraft.world.item.Items;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SandIsland.MODID);
    // Bow
    public static final RegistryObject<Item> SOLAR_BOW =
            ITEMS.register("solar_bow", () -> new SolarBow(new Item.Properties().durability(384).tab(CreativeModeTab.TAB_COMBAT)));
}
