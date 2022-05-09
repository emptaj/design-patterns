package com.company;

import java.security.SecureRandom;
import java.util.Random;

public class WindPublisher extends Publisher implements Runnable{
    public WindPublisher(EventBus bus) {
        super(bus);
    }

    @Override
    public void run() {
        System.out.println("TEMPERATURE PUBLISHER STARTED");

        while (true) {
            Random random = new SecureRandom();
            int temperature = -30 + random.nextInt(61);
            Event event = new Event(EventType.WIND_CHANGE, temperature);
            bus.fire(this, event);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
