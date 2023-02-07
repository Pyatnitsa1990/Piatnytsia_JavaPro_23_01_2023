package com.hillel.piatnytsia.homeworks.homework2;

public class Main {
    public static void main(String[] args) {
        Animal dogPonchik = new Dog("Пончик");
        Animal dogTobik = new Dog("Тобік");
        Animal catUrchik = new Cat("Урчик");
        Animal catTigra = new Cat("Тігра");
        Animal catBob = new Cat("Боб");

        dogPonchik.run(500);
        dogPonchik.swim(10);
        catUrchik.run(200);
        catUrchik.swim(30);

        Animal.printCountAllAnimal();
        Dog.printCountDog();
        Cat.printCountCat();
    }

}
