package com.builder;

public class Robot {
    private Boolean head;
    private String torso;
    private int arms;
    private int legs;

    public void setHead(Boolean head) {
        this.head = head;
    }

    public void setTorso(String torso) {
        this.torso = torso;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Robot: " +
                "head=" + head +
                ", torso='" + torso + '\'' +
                ", arms=" + arms +
                ", legs=" + legs;
    }
}
