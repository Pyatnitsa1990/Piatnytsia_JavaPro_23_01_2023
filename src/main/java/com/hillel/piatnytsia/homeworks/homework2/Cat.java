package com.hillel.piatnytsia.homeworks.homework2;

public class Cat extends Animal {
    private static int countCat = 0;
    private static final int RUN_LIMIT = 200;


    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("\n%s не вміє плавати", getName());
    }

    @Override
    public int getRunDistanceLimit() {
        return RUN_LIMIT;
    }

    public static void printCountCat() {
        System.out.println("Загальна кількість собак: " + countCat);
    }
}