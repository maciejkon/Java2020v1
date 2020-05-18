package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Maciej", "Weltrowski", 2100.0, 100.0);
        Human wife = new Human("Ania", "Kowalska", 1300.0, 100.0);

        Animal husky = new Pet("dog", "Azor");
        Animal pig = new FarmAnimal("pig", 123);

        Car car1 = new Car("Fiat", "Bravo", "xy12340", 123.0);
        Car car2 = new Car("Opel", "Corsa", "GCH13480", 100.0);

        me.setCar(car1);
        wife.setCar(car2);

        Phone phone11 = new Phone("Samsung", "galaxyS1000", 10000.0, 17.6, true);
        Phone iPhone = new Phone("Apple", "iphone15", 200.0, 17.6, false);
        me.setPhone(phone11);
        wife.setPhone(iPhone);


    }
}
