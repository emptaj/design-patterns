package com.builder;

public interface IRobotBuilder {
    public void buildRobotHead();

    public void buildRobotTorso();

    public void buildRobotArms();

    public void buildRobotLegs();

    public void reset();

    public Robot getRobot();
}
