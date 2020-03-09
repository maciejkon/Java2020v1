package com.company;

import java.io.File;

public class Animal {
    final String spieces;
    String name;
    private Double weight;
    File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String spieces) {
        this.spieces=spieces;

        if (spieces=="lion"){
            this.weight=DEFAULT_LION_WEIGHT;
        }
        else if (spieces=="mouse"){
            this.weight=DEFAULT_MOUSE_WEIGHT;
        }
        else if (spieces=="dog"){
            this.weight=DEFAULT_DOG_WEIGHT;
        }
    }

    void feed(){
        if(isAlive()==true) {
            weight += 2;
            System.out.println(name + " thx for food");
        }
        else{
            System.out.println("your pet is dead");
        }
    }

    void walk(){
        if(isAlive()==true){
            weight-=2.0;
            System.out.println(name+ " thx for walk. "+weight);
        }
        else {
            System.out.println("your pet is dead");
        }
    }
    boolean isAlive(){
        if(this.weight>0){
            return true;
        }
        else {
            return false;
        }
    }

}
