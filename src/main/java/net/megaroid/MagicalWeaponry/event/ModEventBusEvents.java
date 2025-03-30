package net.megaroid.MagicalWeaponry.event;

import net.megaroid.MagicalWeaponry.MagicalWeaponry;
import net.megaroid.MagicalWeaponry.entity.ModEntities;
import net.megaroid.MagicalWeaponry.entity.client.MimicModel;
import net.megaroid.MagicalWeaponry.entity.custom.MimicEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = MagicalWeaponry.MODID,bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MimicModel.LAYER_LOCATION,MimicModel::createBodyLayer);


    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.MIMIC.get(), MimicEntity.createAttributes().build());
    }

}
