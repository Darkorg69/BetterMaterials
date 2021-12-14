package darkorg.bettermaterials.tools;

import darkorg.bettermaterials.BetterMaterials;
import darkorg.bettermaterials.setup.ModTab;
import darkorg.bettermaterials.tiers.ModItemTier;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ModTools {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMaterials.MOD_ID);

    //Bone
    public static final RegistryObject<Item> BONE_SWORD = TOOLS.register("bone_sword", ()-> new SwordItem(ModItemTier.BONE, 3, -2.4F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> BONE_SHOVEL = TOOLS.register("bone_shovel", ()-> new ShovelItem(ModItemTier.BONE, 1.5F, -3.0F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> BONE_PICKAXE = TOOLS.register("bone_pickaxe", ()-> new PickaxeItem(ModItemTier.BONE, 1, -2.8F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> BONE_AXE = TOOLS.register("bone_axe", ()-> new AxeItem(ModItemTier.BONE, 6.0F, -3.2F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> BONE_HOE = TOOLS.register("bone_hoe", ()-> new HoeItem(ModItemTier.BONE, 0, -3.0F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    //Flint
    public static final RegistryObject<Item> FLINT_SWORD = TOOLS.register("flint_sword", ()-> new SwordItem(ModItemTier.FLINT, 3, -2.4F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> FLINT_SHOVEL = TOOLS.register("flint_shovel", ()-> new ShovelItem(ModItemTier.FLINT, 1.5F, -3.0F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> FLINT_PICKAXE = TOOLS.register("flint_pickaxe", ()-> new PickaxeItem(ModItemTier.FLINT, 1, -2.8F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> FLINT_AXE = TOOLS.register("flint_axe", ()-> new AxeItem(ModItemTier.FLINT, 7.0F, -3.2F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> FLINT_HOE = TOOLS.register("flint_hoe", ()-> new HoeItem(ModItemTier.FLINT, -1, -2.0F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));

    public static final RegistryObject<Item> EMERALD_SWORD = TOOLS.register("emerald_sword", ()-> new SwordItem(ModItemTier.EMERALD, 3, -2.4F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = TOOLS.register("emerald_shovel", ()-> new ShovelItem(ModItemTier.EMERALD, 1.5F, -3.0F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = TOOLS.register("emerald_pickaxe", ()-> new PickaxeItem(ModItemTier.EMERALD, 1, -2.8F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_AXE = TOOLS.register("emerald_axe", ()-> new AxeItem(ModItemTier.EMERALD, 5.0F, -3.0F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));
    public static final RegistryObject<Item> EMERALD_HOE = TOOLS.register("emerald_hoe", ()-> new HoeItem(ModItemTier.EMERALD, -3, 0.0F, (new Item.Properties()).group(ModTab.BETTER_MATERIALS)));

    public static void init(IEventBus bus) {TOOLS.register(bus);}
}
