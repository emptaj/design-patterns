package com.company;

public class Main {

    public static void main(String[] args) {
        TemperaturePublisher temperaturePublisher = new TemperaturePublisher();
        WindPublisher windPublisher = new WindPublisher();

        TemperatureAverage temperatureAverage = new TemperatureAverage();
        WindChill windChill = new WindChill();

        temperaturePublisher.add(temperatureAverage);
        temperaturePublisher.add(windChill);
        windPublisher.add(windChill);

        Thread t = new Thread(temperaturePublisher);
        Thread t2 = new Thread(windPublisher);
        t2.start();
        t.start();


    }
}
