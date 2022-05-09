package com.company;

public class OpenedState implements IState {

    @Override
    public String goNext(DoorSimulator doorSimulator) {
        String event = doorSimulator.getCurrentEvent();

        if (event.equals("time-out")) {
            doorSimulator.setCurrentState(new ClosingState());
            return new String("Zamykanie drzwi...");
        }

        return null;
    }
}
