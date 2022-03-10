package darkorg.bettermaterials.data.client;

import darkorg.bettermaterials.BetterMaterials;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BetterMaterials.MOD_ID, existingFileHelper);
    }
    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
    ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

    @Override
    protected void registerModels() {
        //Block Item Models
        withExistingParent("flint_block", modLoc("block/flint_block"));
        withExistingParent("charcoal_block", modLoc("block/charcoal_block"));
        //Handheld
        itemModelBuilder("bone_sword", itemHandheld, "bone/bone_sword");
        itemModelBuilder("bone_pickaxe", itemHandheld, "bone/bone_pickaxe");
        itemModelBuilder("bone_shovel", itemHandheld, "bone/bone_shovel");
        itemModelBuilder("bone_axe", itemHandheld, "bone/bone_axe");
        itemModelBuilder("bone_hoe", itemHandheld, "bone/bone_hoe");
        itemModelBuilder("flint_sword", itemHandheld, "flint/flint_sword");
        itemModelBuilder("flint_pickaxe", itemHandheld, "flint/flint_pickaxe");
        itemModelBuilder("flint_shovel", itemHandheld, "flint/flint_shovel");
        itemModelBuilder("flint_axe", itemHandheld, "flint/flint_axe");
        itemModelBuilder("flint_hoe", itemHandheld, "flint/flint_hoe");
        itemModelBuilder("emerald_sword", itemHandheld, "emerald/emerald_sword");
        itemModelBuilder("emerald_pickaxe", itemHandheld, "emerald/emerald_pickaxe");
        itemModelBuilder("emerald_shovel", itemHandheld, "emerald/emerald_shovel");
        itemModelBuilder("emerald_axe", itemHandheld, "emerald/emerald_axe");
        itemModelBuilder("emerald_hoe", itemHandheld, "emerald/emerald_hoe");
        //Generated
        itemModelBuilder("emerald_helmet", itemGenerated, "emerald/emerald_helmet");
        itemModelBuilder("emerald_chestplate", itemGenerated, "emerald/emerald_chestplate");
        itemModelBuilder("emerald_leggings", itemGenerated, "emerald/emerald_leggings");
        itemModelBuilder("emerald_boots", itemGenerated, "emerald/emerald_boots");
        itemModelBuilder("emerald_horse_armor", itemGenerated, "emerald/emerald_horse_armor");
    }
    private ItemModelBuilder itemModelBuilder(String itemName, ModelFile modelFile, String textureLocation) {
        return getBuilder(itemName).parent(modelFile).texture("layer0", "item/" + textureLocation);
    }
}
