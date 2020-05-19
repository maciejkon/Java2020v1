package devices;

import creatures.Human;

public class Car extends Device implements Comparable<Car> {
    public final Integer yearOfProduction;
    public final String plates;

    public Car(String producer, String model, String plates, Double value, Integer yearOfProduction) {
        super(producer, model, value);
        this.plates = plates;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Your car is ready to go!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        super.sell(seller, buyer, value);

        if (!buyer.hasFreeSpace()) {
            throw new Exception("nie ma miejsca");
        }

        if (seller.hasCar(this)) {
            if (buyer.getMoney() >= value) {
                buyer.setMoney(buyer.getMoney() - value);
                seller.setMoney(seller.getMoney() + value);
                seller.removeCar(this);
                buyer.addCar(this);
                System.out.println("Transction PASS!! You have a nice car!");
            } else {
                System.out.println("Transaction Denied!! Too broke");
            }
        } else {
            throw new Exception("ERROR,Wrong owner");
        }
    }

    public String toString() {
        return super.toString() + " " + this.plates;
    }

    @Override
    public int compareTo(Car o) {
        return o.yearOfProduction - this.yearOfProduction;
    }
}

