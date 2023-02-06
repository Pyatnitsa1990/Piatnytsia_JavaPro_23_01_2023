package com.hillel.piatnytsia.homeworks.homework3.v2.obstacles;

import com.hillel.piatnytsia.homeworks.homework3.v2.members.Members;

public class Wall implements Obstacles {
    public static final String WALL = "Стіна";
    int highWall;

    public Wall(int highWall) {
        this.highWall = highWall;
    }

    @Override
    public boolean overcome(Members members) {
        boolean isOvercome = highWall <= members.getJumpHigh();
        members.jump();
        if (isOvercome) {
            System.out.printf("\nУчасник %s подолав перешкоду %s висотою %d",
                    members.getName(), WALL, highWall);
        } else {
            System.out.printf("\nУчасник %s не подалав перешкоду %s висотою %d. Пригнув на висоту %d",
                    members.getName(), WALL, highWall, members.getJumpHigh());
        }
        return isOvercome;
    }
}
