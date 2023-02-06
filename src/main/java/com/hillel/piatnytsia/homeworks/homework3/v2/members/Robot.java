package com.hillel.piatnytsia.homeworks.homework3.v2.members;

public class Robot extends Members {
    private static final String NAME = "Робот";

    public Robot(int distanceRun, int highJump) {
        super(distanceRun, highJump);
    }

    @Override
    public void run() {
        System.out.printf("\n%s біжить бігову дорожку", getName());
    }

    @Override
    public void jump() {
        System.out.printf("\n%s долає  стіну", getName());
    }

    @Override
    public String getName() {
        return NAME;
    }

}
