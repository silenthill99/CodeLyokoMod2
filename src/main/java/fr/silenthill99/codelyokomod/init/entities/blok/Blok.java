package fr.silenthill99.codelyokomod.init.entities.blok;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.world.World;

public class Blok extends SkeletonEntity
{
    public Blok(EntityType<? extends SkeletonEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes()
    {
        return SkeletonEntity.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 100.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.3f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
}
