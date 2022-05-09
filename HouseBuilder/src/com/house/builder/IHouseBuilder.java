package com.house.builder;

public interface IHouseBuilder {
    public void buildName(String name);

    public void buildRoof();

    public void buildWindows();

    public void buildSwimmingPool();

    public void buildFloor();

    public void buildGarage();

    public House build();

    public void reset();
}
