package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventBroker {
    private HashMap<EventType, List<IListener>> listeners;
    private HashMap<EventType, List<Publisher>> publishers;

    public EventBroker() {
        this.listeners = new HashMap<>();
        this.publishers = new HashMap<>();
    }

    public void register(IListener listener, EventType eventType) {
        if (listeners.containsKey(eventType)) {
            listeners.get(eventType).add(listener);
        } else {
            List<IListener> obs = new ArrayList<>();
            obs.add(listener);
            listeners.put(eventType, obs);
        }
    }

    public void unregister(IListener listener, EventType eventType) {
        if (listeners.containsKey(eventType)) {
            listeners.get(eventType).remove(listener);
        }
    }

    public void register(Publisher publisher, EventType eventType) {
        if (publishers.containsKey(eventType)) {
            publishers.get(eventType).add(publisher);
        } else {
            List<Publisher> pubs = new ArrayList<>();
            pubs.add(publisher);
            publishers.put(eventType, pubs);
        }
    }

    public void fire(Publisher publisher, Event event) {
        for (IListener listener : listeners.get(event.getEventType())) {
            listener.call(event);
        }
    }
}
