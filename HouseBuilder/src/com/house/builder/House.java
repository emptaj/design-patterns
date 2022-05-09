package com.house.builder;

public class House implements IHouse{
    private String name;
    private Boolean hasRoof = false;
    private Boolean hasWindows = false;
    private Boolean hasFloor = false;
    private Boolean hasSwimmingPool = false;
    private Boolean hasGarage = false;
    private Integer windows = 0;

    @Override
    public void setRoof(Boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    @Override
    public void setWindows(Boolean hasWindows, int numberOfWindows) {
        this.hasWindows = true;
        this.windows = numberOfWindows;
    }

    @Override
    public void setFloor(Boolean hasFloor) {
        this.hasFloor = hasFloor;
    }

    @Override
    public void setSwimmingPool(Boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House:" +
                "name='" + name + '\'' +
                ", hasRoof=" + hasRoof +
                ", hasWindows=" + hasWindows +
                ", hasFloor=" + hasFloor +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarage=" + hasGarage +
                ", windows=" + windows +
                '}';
    }
}
