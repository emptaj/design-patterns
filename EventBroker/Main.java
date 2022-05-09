package com.company;

public class Main {

    public static void main(String[] args) {
        EventBroker broker = new EventBroker();

//    Publishers
        TemperaturePublisher temperaturePublisher = new TemperaturePublisher(broker);
        WindPublisher windPublisher = new WindPublisher(broker);

        broker.register(temperaturePublisher, EventType.TEMPERATURE_CHANGE);
        broker.register(windPublisher, EventType.WIND_CHANGE);

//    Listeners
        TemperatureAverage temperatureAverage = new TemperatureAverage();
        WindChill windChill = new WindChill();

        broker.register(temperatureAverage, EventType.TEMPERATURE_CHANGE);
        broker.register(windChill, EventType.WIND_CHANGE);
        broker.register(windChill, EventType.TEMPERATURE_CHANGE);

//        Main
        Thread t1 = new Thread(temperaturePublisher);
        Thread t2 = new Thread(windPublisher);

        t1.start();
        t2.start();
    }
}
