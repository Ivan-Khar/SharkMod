package com.aqupd.sharkmod.mixin;

import com.aqupd.sharkmod.Main;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.aqupd.sharkmod.utils.AqLogger.logInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerDamageMixin extends LivingEntity {

    private PlayerDamageMixin(EntityType<? extends LivingEntity> type, World world) {
        super(type, world);
    }

    @Inject(method = "damage", at = @At("RETURN"), cancellable = true)
    private void spawnSharkParticles(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue() && source.getAttacker() != null && source.getAttacker().getType() == Main.SHARK) {
            spawnCustomParticles(ParticleTypes.CLOUD);
            logInfo("Shark bite you");
        }
    }

    private void spawnCustomParticles(ParticleEffect parameters) {
        for (int i = 0; i < 5; ++i) {
            double d = random.nextGaussian() * 0.02d;
            double e = random.nextGaussian() * 0.02d;
            double f = random.nextGaussian() * 0.02d;
            world.addParticle(parameters, true, getParticleX(1), getRandomBodyY() + 1, getParticleZ(1), d, e, f);
        }
    }
}

