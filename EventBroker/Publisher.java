package com.company;

public abstract class Publisher {
    protected EventBroker broker;

    public EventBroker getBroker() {
        return broker;
    }

    public void setBroker(EventBroker broker) {
        this.broker = broker;
    }

    public Publisher(EventBroker broker) {
        this.broker = broker;
    }


}
