package com.hillel.piatnytsia.homeworks.homework1.car;

public class Car {
    String car;

    public void start() {
        startElectricity();
        startFuelSystem();
        startCommand();
    }

    private void startElectricity() {
        System.out.printf("Включення панелі приборів");
    }

    private void startCommand() {
        System.out.printf("\nКоманда запуску");
    }

    private void startFuelSystem() {
        System.out.printf("\nСистема палива в нормі");
    }
}
