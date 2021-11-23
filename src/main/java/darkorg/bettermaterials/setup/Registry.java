package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.blocks.ModBlocks;
import darkorg.bettermaterials.items.ModItems;
import darkorg.bettermaterials.tools.ModTools;
import net.minecraftforge.eventbus.api.IEventBus;

public class Registry {
    public static void init(IEventBus bus) {
        ModBlocks.init(bus);
        ModItems.init(bus);
        ModTools.init(bus);
    }
}
