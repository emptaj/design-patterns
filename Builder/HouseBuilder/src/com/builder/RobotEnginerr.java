package com.builder;

public class RobotEnginerr {
    private IRobotBuilder builder;

    public RobotEnginerr(IRobotBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(IRobotBuilder builder) {
        this.builder = builder;
    }

    public Robot makeRobot() {
        builder.reset();
        builder.buildRobotHead();
        builder.buildRobotArms();
        builder.buildRobotLegs();
        builder.buildRobotTorso();

        return builder.getRobot();
    }

}
