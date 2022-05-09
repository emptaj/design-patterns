package com.company;

public class Event {
    private EventType eventType;
    private int data;

    public Event(EventType eventType, int data) {
        this.eventType = eventType;
        this.data = data;
    }

    public EventType getEventType() {
        return eventType;
    }

    public int getData() {
        return data;
    }
}
