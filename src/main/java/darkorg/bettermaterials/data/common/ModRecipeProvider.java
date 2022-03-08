package darkorg.bettermaterials.data.common;

import darkorg.bettermaterials.blocks.ModBlocks;
import darkorg.bettermaterials.items.ModArmor;
import darkorg.bettermaterials.items.ModHorseArmor;
import darkorg.bettermaterials.items.ModTools;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.FLINT_BLOCK.get()).define('#', Items.FLINT).pattern("###").pattern("###").pattern("###").unlockedBy("has", has(Items.FLINT)).save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.FLINT, 9).requires(ModBlocks.FLINT_BLOCK.get()).unlockedBy("has", has(ModBlocks.FLINT_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CHARCOAL_BLOCK.get()).define('#', Items.CHARCOAL).pattern("###").pattern("###").pattern("###").unlockedBy("has", has(Items.CHARCOAL)).save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.CHARCOAL, 9).requires(ModBlocks.CHARCOAL_BLOCK.get()).unlockedBy("has", has(ModBlocks.CHARCOAL_BLOCK.get())).save(consumer);
        //Armor
        ShapedRecipeBuilder.shaped(ModArmor.COPPER_HELMET.get()).define('#', Items.COPPER_INGOT).pattern("###").pattern("# #").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.COPPER_CHESTPLATE.get()).define('#', Items.COPPER_INGOT).pattern("# #").pattern("###").pattern("###").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.COPPER_LEGGINGS.get()).define('#', Items.COPPER_INGOT).pattern("###").pattern("# #").pattern("# #").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.COPPER_BOOTS.get()).define('#', Items.COPPER_INGOT).pattern("# #").pattern("# #").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.EMERALD_HELMET.get()).define('#', Items.EMERALD).pattern("###").pattern("# #").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.EMERALD_CHESTPLATE.get()).define('#', Items.EMERALD).pattern("# #").pattern("###").pattern("###").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.EMERALD_LEGGINGS.get()).define('#', Items.EMERALD).pattern("###").pattern("# #").pattern("# #").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.EMERALD_BOOTS.get()).define('#', Items.EMERALD).pattern("# #").pattern("# #").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.AMETHYST_HELMET.get()).define('#', Items.AMETHYST_SHARD).pattern("###").pattern("# #").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.AMETHYST_CHESTPLATE.get()).define('#', Items.AMETHYST_SHARD).pattern("# #").pattern("###").pattern("###").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.AMETHYST_LEGGINGS.get()).define('#', Items.AMETHYST_SHARD).pattern("###").pattern("# #").pattern("# #").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModArmor.AMETHYST_BOOTS.get()).define('#', Items.AMETHYST_SHARD).pattern("# #").pattern("# #").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        //Tools
        ShapedRecipeBuilder.shaped(ModTools.COPPER_SHEARS.get()).define('#', Items.COPPER_INGOT).pattern(" #").pattern("# ").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.BONE_SWORD.get()).define('#', Items.BONE).define('/', Items.STICK).pattern("#").pattern("#").pattern("/").unlockedBy("has", has(Items.BONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.BONE_PICKAXE.get()).define('#', Items.BONE).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.BONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.BONE_SHOVEL.get()).define('#', Items.BONE).define('/', Items.STICK).pattern("#").pattern("/").pattern("/").unlockedBy("has", has(Items.BONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.BONE_AXE.get()).define('#', Items.BONE).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.BONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.BONE_HOE.get()).define('#', Items.BONE).define('/', Items.STICK).pattern("##").pattern(" /").pattern(" /").unlockedBy("has", has(Items.BONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.FLINT_SWORD.get()).define('#', Items.FLINT).define('/', Items.STICK).pattern("#").pattern("#").pattern("/").unlockedBy("has", has(Items.FLINT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.FLINT_PICKAXE.get()).define('#', Items.FLINT).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.FLINT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.FLINT_SHOVEL.get()).define('#', Items.FLINT).define('/', Items.STICK).pattern("#").pattern("/").pattern("/").unlockedBy("has", has(Items.FLINT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.FLINT_AXE.get()).define('#', Items.FLINT).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.FLINT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.FLINT_HOE.get()).define('#', Items.FLINT).define('/', Items.STICK).pattern("##").pattern(" /").pattern(" /").unlockedBy("has", has(Items.FLINT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.COPPER_SWORD.get()).define('#', Items.COPPER_INGOT).define('/', Items.STICK).pattern("#").pattern("#").pattern("/").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.COPPER_PICKAXE.get()).define('#', Items.COPPER_INGOT).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.COPPER_SHOVEL.get()).define('#', Items.COPPER_INGOT).define('/', Items.STICK).pattern("#").pattern("/").pattern("/").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.COPPER_AXE.get()).define('#', Items.COPPER_INGOT).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.COPPER_HOE.get()).define('#', Items.COPPER_INGOT).define('/', Items.STICK).pattern("##").pattern(" /").pattern(" /").unlockedBy("has", has(Items.COPPER_INGOT)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.EMERALD_SWORD.get()).define('#', Items.EMERALD).define('/', Items.STICK).pattern("#").pattern("#").pattern("/").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.EMERALD_PICKAXE.get()).define('#', Items.EMERALD).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.EMERALD_SHOVEL.get()).define('#', Items.EMERALD).define('/', Items.STICK).pattern("#").pattern("/").pattern("/").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.EMERALD_AXE.get()).define('#', Items.EMERALD).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.EMERALD_HOE.get()).define('#', Items.EMERALD).define('/', Items.STICK).pattern("##").pattern(" /").pattern(" /").unlockedBy("has", has(Items.EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.AMETHYST_SWORD.get()).define('#', Items.AMETHYST_SHARD).define('/', Items.STICK).pattern("#").pattern("#").pattern("/").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.AMETHYST_PICKAXE.get()).define('#', Items.AMETHYST_SHARD).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.AMETHYST_SHOVEL.get()).define('#', Items.AMETHYST_SHARD).define('/', Items.STICK).pattern("#").pattern("/").pattern("/").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.AMETHYST_AXE.get()).define('#', Items.AMETHYST_SHARD).define('/', Items.STICK).pattern("###").pattern(" / ").pattern(" / ").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        ShapedRecipeBuilder.shaped(ModTools.AMETHYST_HOE.get()).define('#', Items.AMETHYST_SHARD).define('/', Items.STICK).pattern("##").pattern(" /").pattern(" /").unlockedBy("has", has(Items.AMETHYST_SHARD)).save(consumer);
        //Horse Armor
        ShapedRecipeBuilder.shaped(ModHorseArmor.COPPER_HORSE_ARMOR.get()).define('#', Items.COPPER_INGOT).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy("has", has(Items.LEATHER_HORSE_ARMOR)).save(consumer);
        ShapedRecipeBuilder.shaped(ModHorseArmor.EMERALD_HORSE_ARMOR.get()).define('#', Items.EMERALD).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy("has", has(Items.LEATHER_HORSE_ARMOR)).save(consumer);
        ShapedRecipeBuilder.shaped(ModHorseArmor.AMETHYST_HORSE_ARMOR.get()).define('#', Items.AMETHYST_SHARD).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy("has", has(Items.LEATHER_HORSE_ARMOR)).save(consumer);
        ShapedRecipeBuilder.shaped(Items.IRON_HORSE_ARMOR).define('#', Items.IRON_INGOT).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy("has", has(Items.LEATHER_HORSE_ARMOR)).save(consumer);
        ShapedRecipeBuilder.shaped(Items.GOLDEN_HORSE_ARMOR).define('#', Items.GOLD_INGOT).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy("has", has(Items.LEATHER_HORSE_ARMOR)).save(consumer);
        ShapedRecipeBuilder.shaped(Items.DIAMOND_HORSE_ARMOR).define('#', Items.DIAMOND).define('/', Items.LEATHER_HORSE_ARMOR).pattern("# #").pattern("###").pattern("#/#").unlockedBy("has", has(Items.LEATHER_HORSE_ARMOR)).save(consumer);
        //QOL Recipes
        ShapelessRecipeBuilder.shapeless(Items.CLAY_BALL, 4).requires(Blocks.CLAY).unlockedBy("has", has(Blocks.CLAY)).save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.STRING, 4).requires(ItemTags.WOOL).unlockedBy("has", has(Blocks.CLAY)).save(consumer);
    }
}
