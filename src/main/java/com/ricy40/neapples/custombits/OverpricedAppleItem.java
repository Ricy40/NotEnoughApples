package com.ricy40.neapples.custombits;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class OverpricedAppleItem extends Item {

    public OverpricedAppleItem(Item.Properties pProperties) {
        super(pProperties);
    }

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        if (pEntityLiving instanceof Player && !pEntityLiving.level.isClientSide) {
            double d0 = Math.sqrt(5);
            pEntityLiving.level.explode(pEntityLiving, pEntityLiving.getX(), pEntityLiving.getY(), pEntityLiving.getZ(), (float)(4.0D + pEntityLiving.getRandom().nextDouble() * 1.5D * d0), false, Level.ExplosionInteraction.TNT);
        }
        return super.finishUsingItem(pStack, pLevel, pEntityLiving);
    }

}