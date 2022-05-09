package com.house.builder;

public class PrimaryHouseBuilder implements IHouseBuilder{
    private House house;

    public PrimaryHouseBuilder() {
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
       house.setWindows(true, 2);
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
