package net.megaroid.MagicalWeaponry.item;

import net.megaroid.MagicalWeaponry.MagicalWeaponry;
import net.megaroid.MagicalWeaponry.entity.ModEntities;
import net.minecraft.client.resources.model.Material;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MagicalWeaponry.MODID);

    public static final DeferredItem<SwordItem> PLACEHOLDERSWORD = ITEMS.register("placeholder_sword",
        props -> new SwordItem(ToolMaterial.MAGIC_MATERIAL,new Item.Properties()
            .attributes(SwordItem.createAttributes(ToolMaterial.MAGIC_MATERIAL,5,-2.4f))));

    public static final DeferredItem<SwordItem> PLACEHOLDERHAMMER = ITEMS.register("placeholder_hammer",
            props -> new SwordItem(ToolMaterial.MAGIC_MATERIAL,new Item.Properties()
                    .attributes(SwordItem.createAttributes(ToolMaterial.MAGIC_MATERIAL,7,-3f))));
    public static final DeferredItem<SwordItem> PLACEHOLDERSTAFF = ITEMS.register("placeholder_staff",
            props -> new SwordItem(ToolMaterial.MAGIC_MATERIAL,new Item.Properties()
                    .attributes(SwordItem.createAttributes(ToolMaterial.MAGIC_MATERIAL,7,-3f))));
    public static final DeferredItem<SwordItem> PLACEHOLDERSCYTHE = ITEMS.register("placeholder_scythe",
            props -> new SwordItem(ToolMaterial.MAGIC_MATERIAL,new Item.Properties()
                    .attributes(SwordItem.createAttributes(ToolMaterial.MAGIC_MATERIAL,7,-3f))));

    public  static  final DeferredItem<Item> MIMIC_SPAWN_EGG = ITEMS.register("mimic_spawn_egg",
            ()-> new DeferredSpawnEggItem(ModEntities.MIMIC,0xffffff,0xffffff,
                    new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);



    }

}
