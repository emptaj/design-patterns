package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WindPublisher implements IPublisher, Runnable{
    private List<IListener> listeners;

    public WindPublisher() {
        this.listeners = new ArrayList<>();
    }

    @Override
    public void run() {
        System.out.println("WiND PUBLISHER");

        while (true) {
            Random random = new SecureRandom();
            int wind = random.nextInt(100);
            notify(new Event(EventType.WIND_CHANGE, wind));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void add(IListener listener) {
        listeners.add(listener);
    }

    @Override
    public void remove(IListener listener) {
        listeners.remove(listener);

    }
    @Override
    public void notify(Event event) {
        for (IListener listener : listeners)
            listener.update(event);
    }
}
