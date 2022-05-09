package com.builder;

public class OldStyleRobotBuilder implements IRobotBuilder {
    private Robot robot;

    public OldStyleRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        this.robot.setHead(true);
    }

    @Override
    public void buildRobotTorso() {
        this.robot.setTorso("Old style torso");
    }

    @Override
    public void buildRobotArms() {
        this.robot.setArms(2);
    }

    @Override
    public void buildRobotLegs() {
        this.robot.setLegs(2);
    }

    @Override
    public void reset() {
        this.robot = new Robot();
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
