package com.hillel.piatnytsia.homeworks.homework1.employee;

public class Employee {
    private final String nameAndSurname;
    private final String position;
    private final String email;
    private final String mobileNumber;
    private final int age;

    Employee(String nameAndSurname, String position, String email, String mobileNumber, int age) {
        this.nameAndSurname = nameAndSurname;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee " +
                "\nnameAndSurname = " + nameAndSurname +
                "\nposition = " + position +
                "\nemail = " + email +
                "\nmobileNumber = " + mobileNumber +
                "\nage = " + age ;
    }
}
