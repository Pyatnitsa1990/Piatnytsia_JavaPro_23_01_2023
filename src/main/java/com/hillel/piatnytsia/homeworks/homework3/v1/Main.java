package com.hillel.piatnytsia.homeworks.homework3.v1;

public class Main {
    public static void main(String[] args) {

        double sumSquareGeometricFigures = 0;
        GeometricFigure[] geometricFigures = {
                new Circle(5),
                new Triangle(4,6),
                new Squared(5),
                new Circle(4),
                new Triangle(5,4)
        };
        for (int i = 0; i < geometricFigures.length; i++) {
            sumSquareGeometricFigures += geometricFigures[i].square();
        }
        System.out.printf("Сумарна площа всіх фігур: %.2f", sumSquareGeometricFigures);
    }
}
