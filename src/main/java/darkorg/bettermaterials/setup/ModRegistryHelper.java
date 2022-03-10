package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.items.ModArmor;
import darkorg.bettermaterials.items.ModHorseArmor;
import darkorg.bettermaterials.blocks.ModBlocks;
import darkorg.bettermaterials.items.ModItems;
import darkorg.bettermaterials.items.ModTools;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModRegistryHelper {
    public static void init(IEventBus bus) {
        ModBlocks.init(bus);
        ModItems.init(bus);
        ModTools.init(bus);
        ModArmor.init(bus);
        ModHorseArmor.init(bus);
    }
}
