package devices;

import com.company.Human;

public class Device implements Saleable {
    public final String producer;
    public final String model;
    public final Double value;

    public Device(String producer, String model, Double value) {
        this.producer = producer;
        this.model = model;
        this.value = value;
    }

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
