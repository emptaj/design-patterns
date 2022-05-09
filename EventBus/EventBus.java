package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventBus {
    private List<Publisher> publishers;
    private List<IListener> listeners;

    public EventBus() {
        this.publishers = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    public void register(Publisher publisher) {
        publishers.add(publisher);

    }

    public void register(IListener listener) {
        listeners.add(listener);
    }

    public void fire(Publisher publisher, Event event) {
        for (IListener listener : listeners)
            listener.call(event);
    }
}
