package com.hillel.piatnytsia.homeworks.homework4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        printSumSign();
        System.out.println();
        printColor();
        System.out.println();
        printCompareNumbers();
        System.out.println();
        printNumberSign(33);
        System.out.println();
        printCharacter("Hello", 5);
        System.out.println();
        checkLeapYear(300);

    }

    //2
    static void printThreeWords() {
        System.out.println("Orange \nBanana\nApple");
    }

    //3
    static void printSumSign() {
        int a = 10;
        int b = 3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    //4
    static void printColor() {
        int value = 69;
        if (value < 1) {
            System.out.println("Червоний");
        } else if (value > 0 && value < 101) {
            System.out.println("Жовтий");
        } else if (value > 100) {
            System.out.println("Зелений");
        }
    }

    //5
    static void printCompareNumbers() {
        int a = 7;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //6
    static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum > 9 && sum < 21;

    }

    //7
    static void printNumberSign(int a) {
        if (a > -1) {
            System.out.println("Передано додатнє число");
        } else {
            System.out.println("Передано від'ємне число");
        }
    }

    //8
    static boolean isNegativeNumber(int a) {
        return a < 0;
    }

    //9
    static void printCharacter(String value, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(value);
        }
    }

    //10
    static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;

        }

        if (year % 4 == 0) {
            return true;
        }
        return false;
    }


}