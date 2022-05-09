package com.company;

public abstract class Publisher {
    protected EventBus bus;

    public Publisher(EventBus bus) {
        this.bus = bus;
    }

    public void setBus(EventBus bus) {
        this.bus = bus;
    }
}
