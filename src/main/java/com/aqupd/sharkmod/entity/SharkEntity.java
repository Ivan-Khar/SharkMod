package com.aqupd.sharkmod.entity;

import com.aqupd.sharkmod.utils.AqConfig;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.control.AquaticLookControl;
import net.minecraft.entity.ai.control.AquaticMoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.SwimNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.GuardianEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.AxolotlEntity;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.*;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;


public class SharkEntity extends HostileEntity {
    static final TargetPredicate CLOSE_PLAYER_PREDICATE;
    private static final TrackedData<Integer> MOISTNESS;

    private static double health = AqConfig.INSTANCE.getDoubleProperty("entity.health");
    private static double speed = AqConfig.INSTANCE.getDoubleProperty("entity.speed");
    private static double follow = AqConfig.INSTANCE.getDoubleProperty("entity.follow");
    private static double damage = AqConfig.INSTANCE.getDoubleProperty("entity.damage");
    private static double knockback = AqConfig.INSTANCE.getDoubleProperty("entity.knockback");

    public SharkEntity(EntityType<? extends SharkEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new AquaticMoveControl(this, 85, 10, 0.02F, 0.1F, true);
        this.lookControl = new AquaticLookControl(this, 25);
    }
    @Nullable
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        this.setAir(this.getMaxAir());
        this.setPitch(0.0F);
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    public boolean canBreatheInWater() {
        return false;
    }

    public int getMoistness() {
        return this.dataTracker.get(MOISTNESS);
    }

    public void setMoistness(int moistness) {
        this.dataTracker.set(MOISTNESS, moistness);
    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(MOISTNESS, 2400);
    }

    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Moistness", this.getMoistness());
    }

    public void readCustomDataFromNbt(NbtCompound nbt) {
        this.setMoistness(nbt.getInt("Moistness"));
    }

    protected void initGoals() {
        this.goalSelector.add(0, new MoveIntoWaterGoal(this));
        this.goalSelector.add(4, new MeleeAttackGoal(this, 1.2000000476837158D, true));
        this.goalSelector.add(6, new SwimAroundGoal(this, 0.50, 2));
        this.targetSelector.add(1, new FollowTargetGoal<>(this, PlayerEntity.class, 10, true, true, new InWaterPredicate(this)));
        this.targetSelector.add(2, new FollowTargetGoal<>(this, WaterCreatureEntity.class, 10, false, true, new InWaterPredicate(this)));
        this.targetSelector.add(3, new FollowTargetGoal<>(this, AnimalEntity.class, 10, false, true, new InWaterPredicate(this)));
    }

    public static DefaultAttributeContainer.Builder createSharkAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, knockback)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, follow);
    }
    protected EntityNavigation createNavigation(World world) {
        return new SwimNavigation(this, world);
    }

    public int getMaxAir() {
        return 4800;
    }

    protected int getNextAirOnLand(int air) {
        return this.getMaxAir();
    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 0.3F;
    }

    public int getLookPitchSpeed() {
        return 1;
    }

    public int getBodyYawSpeed() {
        return 1;
    }

    public void tick() {
        super.tick();
        if (this.isAiDisabled()) {
            this.setAir(this.getMaxAir());
        } else {
            if (this.isWet()) {
                this.setMoistness(2400);
                this.setAir(4800);
            } else {
                this.setMoistness(this.getMoistness() - 1);
                if (this.getMoistness() <= 0) {
                    this.damage(DamageSource.DRYOUT, 1.0F);
                }

                if (this.onGround) {
                    this.setVelocity(this.getVelocity().add((this.random.nextFloat() * 2.0F - 1.0F) * 0.2F,
                            0.5D,
                            (this.random.nextFloat() * 2.0F - 1.0F) * 0.2F));
                    this.setYaw(this.random.nextFloat() * 360.0F);
                    this.onGround = false;
                    this.velocityDirty = true;
                }
            }

            if (this.world.isClient && this.isTouchingWater() && this.getVelocity().lengthSquared() > 0.03D) {
                Vec3d vec3d = this.getRotationVec(0.0F);
                float f = MathHelper.cos(this.getYaw() * 0.017453292F) * 0.3F;
                float g = MathHelper.sin(this.getYaw() * 0.017453292F) * 0.3F;
                float h = 1.2F - this.random.nextFloat() * 0.7F;

                for(int i = 0; i < 2; ++i) {
                    this.world.addParticle(ParticleTypes.DOLPHIN, this.getX() - vec3d.x * (double)h + (double)f, this.getY() - vec3d.y, this.getZ() - vec3d.z * (double)h + (double)g, 0.0D, 0.0D, 0.0D);
                    this.world.addParticle(ParticleTypes.DOLPHIN, this.getX() - vec3d.x * (double)h - (double)f, this.getY() - vec3d.y, this.getZ() - vec3d.z * (double)h - (double)g, 0.0D, 0.0D, 0.0D);
                }
            }

        }
    }

    public void handleStatus(byte status) {
        if (status == 38) {
            this.spawnParticlesAround();
        } else {
            super.handleStatus(status);
        }

    }

    private void spawnParticlesAround() {
        for(int i = 0; i < 7; ++i) {
            double d = this.random.nextGaussian() * 0.01D;
            double e = this.random.nextGaussian() * 0.01D;
            double f = this.random.nextGaussian() * 0.01D;
            this.world.addParticle(ParticleTypes.HAPPY_VILLAGER, this.getParticleX(1.0D), this.getRandomBodyY() + 0.2D, this.getParticleZ(1.0D), d, e, f);
        }

    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_DOLPHIN_HURT;
    }

    @Nullable
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_DOLPHIN_DEATH;
    }

    @Nullable
    protected SoundEvent getAmbientSound() {
        return this.isTouchingWater() ? SoundEvents.ENTITY_DOLPHIN_AMBIENT_WATER : SoundEvents.ENTITY_DOLPHIN_AMBIENT;
    }

    protected SoundEvent getSplashSound() {
        return SoundEvents.ENTITY_DOLPHIN_SPLASH;
    }

    protected SoundEvent getSwimSound() {
        return SoundEvents.ENTITY_DOLPHIN_SWIM;
    }

    public void travel(Vec3d movementInput) {
        if (this.canMoveVoluntarily() && this.isTouchingWater()) {
            this.updateVelocity(this.getMovementSpeed(), movementInput);
            this.move(MovementType.SELF, this.getVelocity());
            this.setVelocity(this.getVelocity().multiply(0.9D));
            if (this.getTarget() == null) {
                this.setVelocity(this.getVelocity().add(0.0D, -0.005D, 0.0D));
            }
        } else {
            super.travel(movementInput);
        }

    }

    static {
        MOISTNESS = DataTracker.registerData(DolphinEntity.class, TrackedDataHandlerRegistry.INTEGER);
        CLOSE_PLAYER_PREDICATE = TargetPredicate.createNonAttackable().setBaseMaxDistance(10.0D).ignoreVisibility();
    }

    @Override
    public boolean canSpawn(WorldView world) {
        return world.containsFluid(this.getBoundingBox()) && world.intersectsEntities(this);
    }

    public static boolean canSpawnIgnoreLightLevel(WorldAccess world) {
        return world.getDifficulty() != Difficulty.PEACEFUL;
    }

    static class InWaterPredicate implements Predicate<LivingEntity> {
        private final SharkEntity owner;

        public InWaterPredicate(SharkEntity owner) {
            this.owner = owner;
        }

        public boolean test(@Nullable LivingEntity entity) {
            assert entity != null;
            return entity.isSwimming();
        }
    }
}
