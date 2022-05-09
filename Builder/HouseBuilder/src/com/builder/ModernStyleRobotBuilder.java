package com.builder;

public class ModernStyleRobotBuilder implements IRobotBuilder{
    private Robot robot;

    public ModernStyleRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        this.robot.setHead(false);
    }

    @Override
    public void buildRobotTorso() {
        this.robot.setTorso("Modern style torso");
    }

    @Override
    public void buildRobotArms() {
        this.robot.setArms(12);
    }

    @Override
    public void buildRobotLegs() {
        this.robot.setLegs(6);
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
