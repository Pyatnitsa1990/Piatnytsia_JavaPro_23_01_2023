package com.hillel.piatnytsia.homeworks.homework3.v2.members;

public abstract class Members {
    private int distanceRun;
    private int  highJump;

    public Members(int distanceRun, int highJump) {
        this.distanceRun = distanceRun;
        this.highJump = highJump;
    }

    public abstract void run();

    public abstract void jump();

    public abstract String getName();

    public int getDistanceRun(){
        return distanceRun;
    };

    public int getJumpHigh(){
        return highJump;
    };
}
