package devices;

import creatures.Human;

public abstract class Device implements Saleable {
    public final String producer;
    public final String model;
    private final Double value;

    public Device(String producer, String model, Double value) {
        this.producer = producer;
        this.model = model;
        this.value = value;
    }

    public abstract void turnOn();

    public Double getValue() {
        return value;
    }

    public String toString() {
        return this.producer + " " + this.model;
    }


    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
    }
}
