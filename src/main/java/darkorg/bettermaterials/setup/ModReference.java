package darkorg.bettermaterials.setup;

import darkorg.bettermaterials.items.ModArmor;
import darkorg.bettermaterials.items.ModTools;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;

public class ModReference {
    public static List<RegistryObject<Item>> BONE_TOOLS = new ArrayList<>();
    public static  List<RegistryObject<Item>> FLINT_TOOLS = new ArrayList<>();
    public static  List<RegistryObject<Item>> COPPER_TOOLS = new ArrayList<>();
    public static  List<RegistryObject<Item>> COPPER_ARMOR = new ArrayList<>();
    public static  List<RegistryObject<Item>> EMERALD_TOOLS = new ArrayList<>();
    public static  List<RegistryObject<Item>> EMERALD_ARMOR = new ArrayList<>();
    public static   List<RegistryObject<Item>> AMETHYST_TOOLS = new ArrayList<>();
    public static  List<RegistryObject<Item>> AMETHYST_ARMOR = new ArrayList<>();

    public static void init() {
        BONE_TOOLS.add(0, ModTools.BONE_SWORD);
        BONE_TOOLS.add(1, ModTools.BONE_PICKAXE);
        BONE_TOOLS.add(2, ModTools.BONE_SHOVEL);
        BONE_TOOLS.add(3, ModTools.BONE_AXE);
        BONE_TOOLS.add(4, ModTools.BONE_HOE);
        FLINT_TOOLS.add(0, ModTools.FLINT_SWORD);
        FLINT_TOOLS.add(1, ModTools.FLINT_PICKAXE);
        FLINT_TOOLS.add(2, ModTools.FLINT_SHOVEL);
        FLINT_TOOLS.add(3, ModTools.FLINT_AXE);
        FLINT_TOOLS.add(4, ModTools.FLINT_HOE);
        COPPER_TOOLS.add(0, ModTools.COPPER_SWORD);
        COPPER_TOOLS.add(1, ModTools.COPPER_PICKAXE);
        COPPER_TOOLS.add(2, ModTools.COPPER_SHOVEL);
        COPPER_TOOLS.add(3, ModTools.COPPER_AXE);
        COPPER_TOOLS.add(4, ModTools.COPPER_HOE);
        COPPER_ARMOR.add(0, ModArmor.COPPER_HELMET);
        COPPER_ARMOR.add(1, ModArmor.COPPER_CHESTPLATE);
        COPPER_ARMOR.add(2, ModArmor.COPPER_LEGGINGS);
        COPPER_ARMOR.add(3, ModArmor.COPPER_BOOTS);
        EMERALD_TOOLS.add(0, ModTools.EMERALD_SWORD);
        EMERALD_TOOLS.add(1, ModTools.EMERALD_PICKAXE);
        EMERALD_TOOLS.add(2, ModTools.EMERALD_SHOVEL);
        EMERALD_TOOLS.add(3, ModTools.EMERALD_AXE);
        EMERALD_TOOLS.add(4, ModTools.EMERALD_HOE);
        EMERALD_ARMOR.add(0, ModArmor.EMERALD_HELMET);
        EMERALD_ARMOR.add(1, ModArmor.EMERALD_CHESTPLATE);
        EMERALD_ARMOR.add(2, ModArmor.EMERALD_LEGGINGS);
        EMERALD_ARMOR.add(3, ModArmor.EMERALD_BOOTS);
        AMETHYST_TOOLS.add(0, ModTools.AMETHYST_SWORD);
        AMETHYST_TOOLS.add(1, ModTools.AMETHYST_PICKAXE);
        AMETHYST_TOOLS.add(2, ModTools.AMETHYST_SHOVEL);
        AMETHYST_TOOLS.add(3, ModTools.AMETHYST_AXE);
        AMETHYST_TOOLS.add(4, ModTools.AMETHYST_HOE);
        AMETHYST_ARMOR.add(0, ModArmor.AMETHYST_HELMET);
        AMETHYST_ARMOR.add(1, ModArmor.AMETHYST_CHESTPLATE);
        AMETHYST_ARMOR.add(2, ModArmor.AMETHYST_LEGGINGS);
        AMETHYST_ARMOR.add(3, ModArmor.AMETHYST_BOOTS);
    }
}
