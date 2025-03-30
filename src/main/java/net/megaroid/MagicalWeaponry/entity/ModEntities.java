package net.megaroid.MagicalWeaponry.entity;

import net.megaroid.MagicalWeaponry.MagicalWeaponry;
import net.megaroid.MagicalWeaponry.entity.custom.MimicEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES=
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MagicalWeaponry.MODID);


    public  static  final Supplier<EntityType<MimicEntity>> MIMIC =
            ENTITY_TYPES.register("mimic",() -> EntityType.Builder.of(MimicEntity::new, MobCategory.CREATURE)
                    .sized(1,1).build("mimic"));


    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
