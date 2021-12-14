package darkorg.bettermaterials;

import darkorg.bettermaterials.setup.Registry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterMaterials.MOD_ID)
public class BetterMaterials {

    public static final String MOD_ID = "bettermaterials";
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

    public BetterMaterials() {
        Registry.init(bus);
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {}
}
