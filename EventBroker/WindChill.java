package com.company;

public class WindChill implements IListener {
    private Integer lastWindChange = 0;
    private Integer lastTempChange = null;


    @Override
    public void call(Event event) {
        EventType eventType = event.getEventType();

        if (eventType == EventType.TEMPERATURE_CHANGE)
            lastTempChange = event.getData();
        else
            lastWindChange = event.getData();

        if (lastTempChange != null) {
            double roznica = ((double) (lastWindChange) / 100) * 5;
            double temp = lastTempChange - roznica;

            System.out.println("WIND CHILL = " + (int) (temp));
        }
    }
}