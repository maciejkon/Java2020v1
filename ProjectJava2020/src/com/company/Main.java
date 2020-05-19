package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Phone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Maciej", "Weltrowski", 2100.0, 100.0, 1);
        Human wife = new Human("Ania", "Kowalska", 1300.0, 100.0, 4);

        Animal husky = new Pet("dog", "Azor");
        Animal pig = new FarmAnimal("pig", 123);

        Car car1 = new Car("Fiat", "Bravo", "xy12340", 123.0, 2010);
        Car car2 = new Car("Opel", "Corsa", "GCH13480", 100.0, 1996);
        Car car3 = new Car("Opel", "Cor", "GCH13480", 100.0, 1995);
        Car car4 = new Car("Opel", "Cors", "GCH13480", 100.0, 1997);
        Car car5 = new Car("Opel", "orsa", "GCH13480", 100.0, 1998);

        Phone phone11 = new Phone("Samsung", "galaxyS1000", 10000.0, 17.6, true);
        Phone iPhone = new Phone("Apple", "iphone15", 200.0, 17.6, false);

        wife.setCar(car3, 0);
        wife.setCar(car1, 1);
        wife.setCar(car2, 2);
        wife.setCar(car4, 3);
        /*for(int i = 0;i<wife.getGarage().length;i++){
            System.out.println(wife.getCar(i));
        }
        wife.sortCar();
        System.out.println(wife.sumValue());
        System.out.println(Arrays.toString(wife.getGarage()));*/

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(me.getMoney());
        System.out.println(Arrays.toString(wife.getGarage()));
        System.out.println(wife.getMoney());

        try {
            car1.sell(wife, me, 2.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(me.getMoney());

        System.out.println(Arrays.toString(wife.getGarage()));
        System.out.println(wife.getMoney());

    }
}
