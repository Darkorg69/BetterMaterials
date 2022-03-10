package darkorg.bettermaterials.items;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModHorseArmor {
    public static final DeferredRegister<Item> HORSE_ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = HORSE_ARMOR.register("emerald_horse_armor", ()-> new HorseArmorItem(8, "emerald", new Item.Properties().group(BetterMaterials.TAB_BETTER_MATERIALS).maxStackSize(1)));

    public static void init(IEventBus bus) {
        HORSE_ARMOR.register(bus);
    }
}
