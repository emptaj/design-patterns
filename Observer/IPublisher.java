package com.company;

public interface IPublisher {
    public void add(IListener listener);
    public void remove( IListener listener);
    public void notify(Event event);
}
