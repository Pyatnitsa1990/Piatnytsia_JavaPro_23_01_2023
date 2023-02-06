package com.hillel.piatnytsia.homeworks.homework3.v2.members;

public class Cat extends Members {
    private static final String NAME = "Кіт";

    public Cat(int distanceRun, int highJump) {
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
