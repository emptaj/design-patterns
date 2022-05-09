package com.company;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class TemperaturePublisher implements IPublisher, Runnable {
    private List<IListener> listeners;

    public TemperaturePublisher() {
        this.listeners = new ArrayList<>();
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

    @Override
    public void run() {
        System.out.println("TEMPRETURE PUBLISHER");

        while (true) {
            Random random = new SecureRandom();
            int temperature = -30 + random.nextInt(61);
            notify(new Event(EventType.TEMPERATURE_CHANGE, temperature));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
