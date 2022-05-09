package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class TemperatureAverage implements IListener {
    private List<Integer> temperatures;

    public TemperatureAverage() {
        this.temperatures = new ArrayList<>();
    }

    @Override
    public void update(Event event) {
        if (temperatures.size() == 5)
            temperatures.remove(0);

        temperatures.add(event.getData());

        //średnia
        int temperatureSum = temperatures.stream().
                mapToInt(i -> i.intValue()).sum();

        int temperatureAvg = temperatureSum / temperatures.size();

        System.out.println("TEMPERATURE LAST " + temperatures.size() + " MEASUREMENTS AVG = " + temperatureAvg);
    }
}
