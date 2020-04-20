package devices;

import com.company.Human;

public class Car extends Device {

    public final String plates;

    public Car(String producer, String model, String plates, Double value) {
        super(producer, model, value);
        this.plates = plates;
    }

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        super.sell(seller, buyer, value);

        Car noCar = new Car("empty", "empty", "empty", 0.0);

        if (seller.getCar().equals(this)) {
            if (buyer.getMoney() >= value) {
                buyer.setMoney(buyer.getMoney() - value);
                seller.setMoney(seller.getMoney() + value);
                seller.setCar(noCar);
                buyer.setCar(this);
                System.out.println("Transaction PASS!!! You have a nice car");
            } else {
                System.out.println("Transaction Denied!!! Too Broke");
            }
        } else {
            throw new Exception("Wrong owner");
        }
    }

    public String toString() {
        return super.toString() + " " + this.plates;
    }
}

