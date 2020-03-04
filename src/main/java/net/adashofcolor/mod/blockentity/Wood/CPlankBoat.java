package net.adashofcolor.mod.blockentity.Wood;

/*public class CPlankBoat {

    private static EntityType<BoatEntity> registerBoat(String name, CPlankBlock wood, BoatEntity.Type vanilla) {
        Identifier skin = new Identifier(ADashOfColor.MOD_ID, "textures/entity/boat/" + name + ".png");
        BoatEntity boat = new BoatEntity(skin, vanilla);

        EntityType<BoatEntity> type = FabricEntityTypeBuilder.<BoatEntity>create(
                EntityCategory.MISC, (entity, world) -> new BoatEntity(entity, world, boat))
                .size(EntityDimensions.fixed(1.375F, 0.5625F))
                .build();

        return Registry.register(Registry.ENTITY_TYPE, new Identifier(ADashOfColor.MOD_ID, name + "_boat"), type);
    }
}*/