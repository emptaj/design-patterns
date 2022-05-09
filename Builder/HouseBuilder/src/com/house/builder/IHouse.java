package com.house.builder;

public interface IHouse {
    public void setRoof(Boolean hasRoof);
    public void setWindows(Boolean hasWindows, int numberOfWindows);
    public void setFloor(Boolean hasFloor);
    public void setSwimmingPool(Boolean hasSwimmingPool);
    public void setName(String name);
    public void setGarage(Boolean hasGarage);

}
