package net.megaroid.MagicalWeaponry.datagen;

import net.megaroid.MagicalWeaponry.MagicalWeaponry;
import net.megaroid.MagicalWeaponry.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MagicalWeaponry.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels(){
        withExistingParent(ModItems.PLACEHOLDERSWORD.getId().toString(), mcLoc("item/handheld")).texture("layer0", "item/placeholder_sword");
        withExistingParent(ModItems.PLACEHOLDERHAMMER.getId().toString(), mcLoc("item/handheld")).texture("layer0", "item/placeholder_hammer");
        withExistingParent(ModItems.PLACEHOLDERSCYTHE.getId().toString(), mcLoc("item/handheld")).texture("layer0", "item/placeholder_scythe");
        withExistingParent(ModItems.PLACEHOLDERSTAFF.getId().toString(), mcLoc("item/handheld")).texture("layer0", "item/placeholder_staff");
        withExistingParent(ModItems.MIMIC_SPAWN_EGG.getId().getPath(),mcLoc("item/template_spawn_egg"));

    }
}
