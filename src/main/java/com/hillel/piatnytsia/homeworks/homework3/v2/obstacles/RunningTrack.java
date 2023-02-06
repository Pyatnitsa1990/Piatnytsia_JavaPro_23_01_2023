package com.hillel.piatnytsia.homeworks.homework3.v2.obstacles;

import com.hillel.piatnytsia.homeworks.homework3.v2.members.Members;

public class RunningTrack implements Obstacles {
    private static final String RUNNING_TRACK = "";
    int distanceTrack;

    public RunningTrack(int distanceTrack) {
        this.distanceTrack = distanceTrack;
    }

    @Override
    public boolean overcome(Members members) {
        boolean isOvercome = distanceTrack <= members.getDistanceRun();
        members.run();
        if (isOvercome) {
            System.out.printf("\nУчасник %s пройшов перешкоду %s на дистанції %d",
                    members.getName(), RUNNING_TRACK, distanceTrack);
        } else {
            System.out.printf("\nУчасник %s не пройшов перешкоду %s на дистанції %d. Пройдено %d",
                    members.getName(), RUNNING_TRACK, distanceTrack, members.getDistanceRun());
        }
        return isOvercome;
    }

}
