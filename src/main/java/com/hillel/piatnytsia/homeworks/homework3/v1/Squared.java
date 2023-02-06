package com.hillel.piatnytsia.homeworks.homework3.v1;

public class Squared implements GeometricFigure {

    private final double a;

    public Squared(double a) {
        this.a = a;
    }

    @Override
    public double square() {

        return Math.pow(a,2);
    }
}
