package com.hillel.piatnytsia.homeworks.homework2;

public abstract class Animal {
    String name;
    private static int countAllAnimal = 0;

    public Animal(String name) {
        this.name = name;
        countAllAnimal++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (getRunDistanceLimit() < distance) {
            System.out.printf("\n%s не може бігти більше %d м.", getName(), getRunDistanceLimit());
        } else {
            System.out.printf("\n%s пробіг %d ", getName(), distance);
        }
    }

    public abstract void swim(int distance);

    public abstract int getRunDistanceLimit();

    public static void printCountAllAnimal() {
        System.out.println("\nЗагальна кількість тварин: " + countAllAnimal);
    }
}
