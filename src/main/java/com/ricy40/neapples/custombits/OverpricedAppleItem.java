package com.ricy40.neapples.custombits;

import com.ricy40.neapples.ModDamageTypes;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class OverpricedAppleItem extends Item implements DamageTypes {

    public OverpricedAppleItem(Item.Properties pProperties) {
        super(pProperties);
    }

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        if (pEntityLiving instanceof Player && !pEntityLiving.level.isClientSide) {
            double d0 = Math.sqrt(5);
            pEntityLiving.level.explode(pEntityLiving, pEntityLiving.getX(), pEntityLiving.getY(), pEntityLiving.getZ(), (float)(4.0D + pEntityLiving.getRandom().nextDouble() * 1.5D * d0), false, Level.ExplosionInteraction.TNT);
            pEntityLiving.hurt(ModDamageTypes.getDamageSource(pEntityLiving.getLevel(), ModDamageTypes.OVERPRICED_APPLE), 10);
        }
        return super.finishUsingItem(pStack, pLevel, pEntityLiving);
    }
}