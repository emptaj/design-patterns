package com.builder;

public class Main {

    public static void main(String[] args) {
	    OldStyleRobotBuilder builder = new OldStyleRobotBuilder();
	    ModernStyleRobotBuilder builder2 = new ModernStyleRobotBuilder();
        RobotEnginerr re = new RobotEnginerr(builder);

        Robot finalRobot = re.makeRobot();
        Robot finalSecondRobot = re.makeRobot();

        re.setBuilder(builder2);
        Robot finalModernRobot = re.makeRobot();

        System.out.println(finalRobot);
        System.out.println(finalModernRobot);
    }
}
