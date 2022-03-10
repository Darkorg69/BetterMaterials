package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.blocks.ModBlocks;
import darkorg.bettermaterials.items.ModHorseArmor;
import darkorg.bettermaterials.items.ModTools;
import darkorg.bettermaterials.setup.ModReference;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.function.Consumer;

import static darkorg.bettermaterials.data.common.ModRecipeProvider.ModRecipeBuilder.*;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        //Blocks
        addNineStorageBlockRecipes(ModBlocks.FLINT_BLOCK.get(), Items.FLINT, consumer);
        addNineStorageBlockRecipes(ModBlocks.CHARCOAL_BLOCK.get(), Items.CHARCOAL, consumer);
        //Armor
        addArmorRecipes(ModReference.EMERALD_ARMOR, Items.EMERALD, consumer);
        //Misc
        addHorseArmourRecipe(ModHorseArmor.EMERALD_HORSE_ARMOR.get(), Items.EMERALD, consumer);
        //Tools
        addToolRecipes(ModReference.BONE_TOOLS, Items.BONE, consumer);
        addToolRecipes(ModReference.FLINT_TOOLS, Items.FLINT, consumer);
        addToolRecipes(ModReference.EMERALD_TOOLS, Items.EMERALD, consumer);
        //Vanilla
        addShapelessRecipe(Items.CLAY_BALL, 4, Blocks.CLAY, consumer);
        addShapelessTagRecipe(Items.STRING, 4, ItemTags.WOOL, consumer);
        addHorseArmourRecipe(Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, consumer);
        addHorseArmourRecipe(Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, consumer);
        addHorseArmourRecipe(Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, consumer);
        ShapedRecipeBuilder.shapedRecipe(Items.FLINT).key('#', Items.GRAVEL).patternLine("##").patternLine("# ").addCriterion("has_gravel", hasItem(Items.GRAVEL)).build(consumer, "gravel_to_flint");
        ShapedRecipeBuilder.shapedRecipe(Items.SADDLE).key('I', Items.IRON_INGOT).key('L', Items.LEATHER).key('S', Items.STRING).key('W', ItemTags.WOOL).patternLine("LLL").patternLine("SWS").patternLine("I I").addCriterion("has_", hasItem(Items.SADDLE)).build(consumer);
    }

    static class ModRecipeBuilder {
        static void addToolRecipes(List<RegistryObject<Item>> toolList, IItemProvider material, Consumer<IFinishedRecipe> consumer) {
            ShapedRecipeBuilder.shapedRecipe(toolList.get(0).get()).key('#', material).key('/', Items.STICK).patternLine("#").patternLine("#").patternLine("/").addCriterion("has_" + material, hasItem(material)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(toolList.get(1).get()).key('#', material).key('/', Items.STICK).patternLine("###").patternLine(" / ").patternLine(" / ").addCriterion("has_" + material, hasItem(material)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(toolList.get(2).get()).key('#', material).key('/', Items.STICK).patternLine("#").patternLine("/").patternLine("/").addCriterion("has_" + material, hasItem(material)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(toolList.get(3).get()).key('#', material).key('/', Items.STICK).patternLine("##").patternLine("#/").patternLine(" /").addCriterion("has_" + material, hasItem(material)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(toolList.get(4).get()).key('#', material).key('/', Items.STICK).patternLine("##").patternLine(" /").patternLine(" /").addCriterion("has_" + material, hasItem(material)).build(consumer);
        }

        static void addArmorRecipes(List<RegistryObject<Item>> armorList, IItemProvider material, Consumer<IFinishedRecipe> consumer) {
            ShapedRecipeBuilder.shapedRecipe(armorList.get(0).get()).key('#', material).patternLine("###").patternLine("# #").addCriterion("has_" + material, hasItem(material)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(armorList.get(1).get()).key('#', material).patternLine("# #").patternLine("###").patternLine("###").addCriterion("has_" + material, hasItem(material)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(armorList.get(2).get()).key('#', material).patternLine("###").patternLine("# #").patternLine("# #").addCriterion("has_" + material, hasItem(material)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(armorList.get(3).get()).key('#', material).patternLine("# #").patternLine("# #").addCriterion("has_" + material, hasItem(material)).build(consumer);
        }

        static void addShearsRecipe(IItemProvider result, IItemProvider material, Consumer<IFinishedRecipe> consumer) {
            ShapedRecipeBuilder.shapedRecipe(result).key('#', material).patternLine(" #").patternLine("# ").addCriterion("has_" + material, hasItem(material)).build(consumer);
        }

        static void addHorseArmourRecipe(IItemProvider result, IItemProvider material, Consumer<IFinishedRecipe> consumer) {
            ShapedRecipeBuilder.shapedRecipe(result).key('#', material).key('/', Items.LEATHER_HORSE_ARMOR).patternLine("# #").patternLine("###").patternLine("#/#").addCriterion("has_" + material, hasItem(material)).build(consumer);
        }

        static void addNineStorageBlockRecipes(IItemProvider storageBlock, IItemProvider material, Consumer<IFinishedRecipe> consumer) {
            ShapelessRecipeBuilder.shapelessRecipe(material, 9).addIngredient(storageBlock).addCriterion("has_" + storageBlock, hasItem(storageBlock)).build(consumer);
            ShapedRecipeBuilder.shapedRecipe(storageBlock).key('#', material).patternLine("###").patternLine("###").patternLine("###").addCriterion("has_" + material, hasItem(material)).build(consumer);
        }

        static void addShapelessRecipe(IItemProvider result, int count, IItemProvider ingredient, Consumer<IFinishedRecipe> consumer) {
            ShapelessRecipeBuilder.shapelessRecipe(result, count).addIngredient(ingredient).addCriterion("has_" + result, hasItem(result)).build(consumer);
        }

        static void addShapelessTagRecipe(IItemProvider result, int count, ITag.INamedTag<Item> ingredientTag, Consumer<IFinishedRecipe> consumer) {
            ShapelessRecipeBuilder.shapelessRecipe(result, count).addIngredient(ingredientTag).addCriterion("has_" + result, hasItem(result)).build(consumer);
        }
    }
}
