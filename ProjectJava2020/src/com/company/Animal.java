package com.company;

import creatures.Pet;
import devices.Saleable;


import java.io.File;

public class Animal implements Edible, Saleable {
    final String spieces;
    String name;
    protected Double weight;


    //File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String spieces) {
        this.spieces = spieces;

        switch (spieces) {
            case "lion":

                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
        }
    }

    public String toString() {
        return this.spieces + " " + this.name + " ";
    }

    void feed() {
        if (isAlive()) {
            weight += 2;
            System.out.println(name + " THX for food " + "my weight is: " + weight);
        } else {
            System.out.println("OMG, your pet is dead!!!");
        }
    }

    void walk() {
        if (isAlive()) {
            weight -= 2.0;
            System.out.println(name + " THX for walk " + " my weight is: " + weight);
        } else {
            System.out.println("OMG, your pet is dead!!!");
        }
    }

    boolean isAlive() {
        if (this.weight > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human || this instanceof Pet) {
            throw new Exception("no this way");
        }

        System.out.println(this.toString() + "adiooos");
        this.weight = 0.0;
    }

    public void sell(Human seller, Human buyer, Double value) throws Exception {

        if (seller.pet.equals(this)) {
            if (buyer.getMoney() >= value) {
                buyer.setMoney(buyer.getMoney() - value);
                seller.setMoney(seller.getMoney() + value);
                seller.pet = null;
                buyer.pet = this;
                System.out.println("Transaction PASS!!! OMG im a slave now");
            } else {
                System.out.println("Too broke");
            }
        } else {
            throw new Exception("Wrong owner");
        }
    }
}
