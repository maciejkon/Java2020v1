package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name="pies";

        dog.feed();

        Animal lion = new Animal("lion");
        lion.name="lion";



        Human me = new Human();

        me.firstName="Maciej";
        me.lastName="Weltrowski";
        me.pet=new Animal("Myszojeleń");
        me.car=new Car("Volkswagen","VW","x12345");

        System.out.println(me.car.plates);




    }
}
