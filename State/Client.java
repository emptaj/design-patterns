package com.company;

public class Client {

    public String buttonPressed(DoorSimulator doorSimulator) {
        doorSimulator.setCurrentEvent("b");
        return doorSimulator.goNext();
    }

    public String sensor1Reached(DoorSimulator doorSimulator) {
        doorSimulator.setCurrentEvent("s1");
        return doorSimulator.goNext();
    }

    public String sensor2Reached(DoorSimulator doorSimulator) {
        doorSimulator.setCurrentEvent("s2");
        return doorSimulator.goNext();
    }

    public String doorline(DoorSimulator doorSimulator) {
        doorSimulator.setCurrentEvent("ls");
        return doorSimulator.goNext();
    }

    public String timeout(DoorSimulator doorSimulator) {
        doorSimulator.setCurrentEvent("time-out");
        return doorSimulator.goNext();
    }

}
