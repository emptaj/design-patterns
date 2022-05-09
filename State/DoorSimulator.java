package com.company;

public class DoorSimulator {
    private IState currentState;
    private String currentEvent;

    public DoorSimulator(IState currentState) {
        this.currentState = currentState;
    }

    public DoorSimulator() {
        this.currentState = new ClosedState();
        this.currentEvent = "b";
    }

    public String goNext() {
        return currentState.goNext(this);
    }


    public void setCurrentState(IState newState) {
        this.currentState = newState;
    }

    public String getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(String currentEvent) {
        this.currentEvent = currentEvent;
    }
}
