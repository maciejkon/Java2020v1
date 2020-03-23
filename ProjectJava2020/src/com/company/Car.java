package com.company;

public class Car {
    final String brand;
    final String producer;
    final String plates;
    final private Double value;


    public Car(String brand,String producer,String plates,Double value ){
        this.brand=brand;
        this.producer=producer;
        this.plates=plates;
        this.value=value;

    }

    public Double getValue() {
        return this.value;
    }
}
