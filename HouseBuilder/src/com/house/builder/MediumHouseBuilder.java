package com.house.builder;

public class MediumHouseBuilder implements IHouseBuilder{
    private House house;

    public MediumHouseBuilder() {
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
        house.setWindows(true, 4);
    }

    @Override
    public void buildSwimmingPool() {

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
