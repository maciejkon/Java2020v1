package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name="pies";

        Animal lion = new Animal("lion");
        lion.name="lion";

        Human me = new Human();

        me.firstName="Ola";
        me.lastName="Weltrowski";
        me.setSalary(12345.0);
        me.pet=new Animal("Myszojeleń");

        Human wife = new Human();
        wife.firstName="Ania";
        wife.lastName="Kowalska";
        wife.setSalary(3421.0);

        Car dirtyOne = new Car("Bravo","Fiat","xy12340",123.0);
        Phone phone11=new Phone("Samsung","galaxyS1000",10000.0,17.6,true);

        me.setCar(dirtyOne);
        wife.setCar(dirtyOne);

        System.out.println(me.getCar());
        System.out.println(wife.getCar());
        System.out.println(me);
        System.out.println(wife);
        System.out.println(lion);

        System.out.println(me.spieces);
        me.feed();


        try {
            me.sell();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            lion.sell();
        } catch (Exception e) {
            e.printStackTrace();
        }
        phone11.sell();
        dirtyOne.sell();


    }
}
