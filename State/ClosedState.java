package com.company;

public class ClosedState implements IState {
    @Override
    public String goNext(DoorSimulator doorSimulator) {
        String event = doorSimulator.getCurrentEvent();

        if (event.equals("b")) {
            doorSimulator.setCurrentState(new OpeningState());
            return new String("Otwieranie drzwi...");
        }

        return null;
    }
}
