package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.features.DisableStoneTools;
import darkorg.bettermaterials.features.DisableWoodenTools;
import darkorg.bettermaterials.features.EasySticks;
import darkorg.bettermaterials.features.PermaTools;
import net.minecraftforge.common.MinecraftForge;

public class Events {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new DisableStoneTools());
        MinecraftForge.EVENT_BUS.register(new DisableWoodenTools());
        MinecraftForge.EVENT_BUS.register(new EasySticks());
        MinecraftForge.EVENT_BUS.register(new PermaTools());
    }
}
