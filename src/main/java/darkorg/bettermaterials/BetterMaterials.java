package darkorg.bettermaterials;

import darkorg.bettermaterials.items.ModItems;
import darkorg.bettermaterials.setup.ModRegistryHelper;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
        ModRegistryHelper.init(bus);
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final ItemGroup TAB_BETTER_MATERIALS = new ItemGroup("better_materials") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.FLINT_BLOCK.get());
        }
    };

    private void setup(final FMLCommonSetupEvent event) {}
}
