package devices;


import com.company.Human;

public interface Saleable {
    void sell(Human seller, Human buyer, Double value) throws Exception;
}
