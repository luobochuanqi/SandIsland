package xyz.luobo.sandisland;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import xyz.luobo.sandisland.Registry.ItemRegistry;

@Mod(SandIsland.MODID)
public class SandIsland {
    public static final String MODID = "sandisland";
    public static final Logger LOGGER = LogUtils.getLogger();
//    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
//    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));

    public SandIsland()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
//        BLOCKS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
