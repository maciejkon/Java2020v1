package devices;


import creatures.Human;

public interface Saleable {
    void sell(Human seller, Human buyer, Double value) throws Exception;
}
