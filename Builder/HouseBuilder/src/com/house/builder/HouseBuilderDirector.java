package com.house.builder;

public class HouseBuilderDirector {
    private IHouseBuilder builder;

    public HouseBuilderDirector(IHouseBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(IHouseBuilder builder) {
        this.builder = builder;
    }

    public House construct(String name) {
        builder.reset();

        builder.buildName(name);
        builder.buildFloor();
        builder.buildRoof();
        builder.buildWindows();

        if (builder instanceof MediumHouseBuilder) {
            System.out.println("Building medium house...");
            builder.buildGarage();
        } else if (builder instanceof PremiumHouseBuilder) {
            System.out.println("Building premium house...");
            builder.buildSwimmingPool();
        }

        return builder.build();
    }
}
