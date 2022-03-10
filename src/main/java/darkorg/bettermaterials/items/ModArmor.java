package darkorg.bettermaterials.items;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.setup.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModArmor {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    public static final RegistryObject<Item> EMERALD_HELMET = ARMOR.register("emerald_helmet", ()-> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ARMOR.register("emerald_chestplate", ()-> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ARMOR.register("emerald_leggings", ()-> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(BetterMaterials.TAB_BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ARMOR.register("emerald_boots", ()-> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(BetterMaterials.TAB_BETTER_MATERIALS)));

    public static void init(IEventBus bus) {
        ARMOR.register(bus);
    }
}
