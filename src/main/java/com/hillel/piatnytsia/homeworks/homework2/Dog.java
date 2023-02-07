package com.hillel.piatnytsia.homeworks.homework2;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    private static int countDog = 0;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
   public void swim(int distance) {
        if (distance > SWIM_LIMIT) {
            System.out.printf("\n%s не може плити більше %d м.", getName(),SWIM_LIMIT);
        } else {
            System.out.printf("\n%s проплила %d ", getName(), distance);
        }
    }

    @Override
    public int getRunDistanceLimit() {
        return RUN_LIMIT;
    }

    public static void printCountDog() {
        System.out.println("Загальна кількість собак: " + countDog);
    }

}
