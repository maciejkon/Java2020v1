package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name="pies";

        Animal lion = new Animal("lion");
        lion.name="lion";

        Human me = new Human();
        Human wife = new Human();
        me.firstName="Ola";
        me.lastName="Weltrowski";
        me.setSalary(12345.0);
        me.pet=new Animal("Myszojeleń");

        Car dirtyOne = new Car("Bravo","Fiat","xy12340",123.0);
        me.car=dirtyOne;
        wife.car=dirtyOne;
        System.out.println("I earn "+me.getSalary());




    }
}
