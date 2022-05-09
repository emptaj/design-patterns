package com.house.builder;

public class PremiumHouseBuilder implements IHouseBuilder{
    private House house;

    public PremiumHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildName(String name) {
        house.setName(name);
    }

    @Override
    public void buildRoof() {
        house.setRoof(true);
    }

    @Override
    public void buildWindows() {
        house.setWindows(true, 8);
    }

    @Override
    public void buildSwimmingPool() {
        house.setSwimmingPool(true);
    }

    @Override
    public void buildFloor() {
        house.setFloor(true);
    }

    @Override
    public void buildGarage() {
        house.setGarage(true);
    }

    @Override
    public House build() {
        return house;
    }

    @Override
    public void reset() {
        this.house = new House();
    }
}
