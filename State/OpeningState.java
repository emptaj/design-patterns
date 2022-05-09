package com.company;

public class OpeningState implements IState {
    @Override
    public String goNext(DoorSimulator doorSimulator) {
        String event = doorSimulator.getCurrentEvent();

        if (event.equals("s1")) {
            doorSimulator.setCurrentState(new OpenedState());
            return new String("Drzwi otwarte");
        }

        return null;
    }


}
