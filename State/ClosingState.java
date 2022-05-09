package com.company;

public class ClosingState implements IState {

    @Override
    public String goNext(DoorSimulator doorSimulator) {
        String event = doorSimulator.getCurrentEvent();

        if (event.equals("s2")) {
            doorSimulator.setCurrentState(new ClosedState());
            return new String("Drzwi zamknięte");

        } else if (event.equals("b") || event.equals("ls")) {
            doorSimulator.setCurrentState(new OpeningState());
            return new String("Otwieranie drzwi...");

        }

        return null;
    }

}
