package com.hillel.piatnytsia.homeworks.homework3.v1;

public class Circle implements GeometricFigure {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(r, 2);

    }
}
