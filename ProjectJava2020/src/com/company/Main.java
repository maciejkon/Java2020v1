package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Maciej", "Weltrowski", 2100.0, 100.0);
        Human wife = new Human("Ania", "Kowalska", 1300.0, 100.0);

        Animal dog = new Animal("dog");
        dog.name = "pies";
        Animal lion = new Animal("lion");
        lion.name = "lion";
        me.pet = dog;

        Car car1 = new Car("Fiat", "Bravo", "xy12340", 123.0);
        me.setCar(car1);
        Car car2 = new Car("Opel", "Corsa", "GCH13480", 100.0);

        Phone phone11 = new Phone("Samsung", "galaxyS1000", 10000.0, 17.6, true);
        me.setPhone(phone11);
        Phone iPhone = new Phone("Apple", "iphone15", 200.0, 17.6, false);

        System.out.println("Maciej auto: " + me.getCar());
        System.out.println("Ania auto: " + wife.getCar());
        System.out.println("Maciej pieniądze przed transakcją: " + me.getMoney());
        System.out.println("Ania pieniądze przed transakcją: " + wife.getMoney());
        try {
            me.getCar().sell(me, wife, 10.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Maciej auto: " + me.getCar());
        System.out.println("Ania auto: " + wife.getCar());
        System.out.println("Maciej pieniądze po transakcji: " + me.getMoney());
        System.out.println("Ania pieniądze po transakcji: " + wife.getMoney());


    }
}
