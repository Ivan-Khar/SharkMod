package com.aqupd.sharkmod;

import com.aqupd.sharkmod.entity.SharkEntity;
import com.aqupd.sharkmod.utils.AqConfig;
import com.aqupd.sharkmod.utils.AqDebug;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;

import static com.aqupd.sharkmod.utils.AqLogger.*;

public class Main implements ModInitializer {

    int weight = AqConfig.INSTANCE.getNumberProperty("spawn.weight");
    int mingroup = AqConfig.INSTANCE.getNumberProperty("spawn.min");
    int maxgroup = AqConfig.INSTANCE.getNumberProperty("spawn.max");
    String[] biomelist = AqConfig.INSTANCE.getStringProperty("spawn.biomes").split(",");

    public static Identifier SHARK_ID = new Identifier("aqupd", "shark");
    public static final EntityType<SharkEntity> SHARK = Registry.register(
            Registry.ENTITY_TYPE,
            SHARK_ID,
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE,
                    SharkEntity::new).dimensions(EntityDimensions.fixed(1.2f, 0.9f)).build()
    );
    public static final SpawnEggItem SHARK_SPAWN_EGG = new SpawnEggItem(SHARK, 253948, 19799, new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(64));

    @Override
    public void onInitialize() {
        ServerWorldEvents.LOAD.register((server, world) -> {
            AqDebug.INSTANCE.startDebug(AqConfig.INSTANCE.getBooleanProperty("debug"));
        });
        Registry.register(Registry.ITEM, new Identifier("aqupd", "shark_spawn_egg"), SHARK_SPAWN_EGG);
        FabricDefaultAttributeRegistry.register(SHARK, SharkEntity.createSharkAttributes());

        BiomeModifications.addSpawn(
                selection -> Arrays.stream(biomelist).anyMatch(x -> x.equals(selection.getBiome().getCategory().getName().toUpperCase())),
                SpawnGroup.WATER_CREATURE,
                SHARK,
                weight, mingroup, maxgroup // weight/min group size/max group size
        );
        logInfo("Shark mod is loaded!");
    }
}
