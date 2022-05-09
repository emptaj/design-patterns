package com.company;

public class Main {

    public static void main(String[] args) {
        // Bus
        EventBus bus = new EventBus();

        //Publishers
        TemperaturePublisher temperaturePublisher= new TemperaturePublisher(bus);
        WindPublisher windPublisher = new WindPublisher(bus);

        bus.register(temperaturePublisher);
        bus.register(windPublisher);

        //Listeners
        WindChill windChill = new WindChill();
        TemperatureAverage temperatureAverage = new TemperatureAverage();

        bus.register(windChill);
        bus.register(temperatureAverage);

        //Main
        Thread t1 = new Thread(temperaturePublisher);
        Thread t2 = new Thread(windPublisher);

        t1.start();
        t2.start();

    }
}
