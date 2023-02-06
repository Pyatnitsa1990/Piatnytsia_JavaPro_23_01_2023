package com.hillel.piatnytsia.homeworks.homework3.v1;

public class Triangle implements GeometricFigure {

    private final double a;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    private final double h;

    @Override
    public double square() {

        return 0.5 * a * h;

    }
}
