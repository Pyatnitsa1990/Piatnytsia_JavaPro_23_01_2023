package com.hillel.piatnytsia.homeworks.homework3.v2;


import com.hillel.piatnytsia.homeworks.homework3.v2.members.Cat;
import com.hillel.piatnytsia.homeworks.homework3.v2.members.Members;
import com.hillel.piatnytsia.homeworks.homework3.v2.members.Person;
import com.hillel.piatnytsia.homeworks.homework3.v2.members.Robot;
import com.hillel.piatnytsia.homeworks.homework3.v2.obstacles.Obstacles;
import com.hillel.piatnytsia.homeworks.homework3.v2.obstacles.RunningTrack;
import com.hillel.piatnytsia.homeworks.homework3.v2.obstacles.Wall;

public class Main {
    public static void main(String[] args) {

        Members[] members = {
                new Person(50,2),
                new Robot(50, 1),
                new Cat(20,2)
        };

        Obstacles[] obstacles = {
                new RunningTrack(50),
                new Wall(2)
        };

        for (Members member: members){
            for (Obstacles obstacle : obstacles) {
                if (!obstacle.overcome(member)) {
                    break;
                }
            }
        }
    }
}
