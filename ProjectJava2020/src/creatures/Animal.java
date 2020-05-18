package creatures;

import devices.Saleable;

public abstract class Animal implements Edible, Saleable, Feedable {
    public final String species;
    String name;
    protected Double weight;
    //File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;
    static final public Double DEFAULT_FOOD_WEIGHT = 1.0;


    public Animal(String species) {
        this.species = species;


        switch (species) {
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
        return this.species;
    }

    @Override
    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }

    @Override
    public void feed(Double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.println(name + " THX for food " + "my weight is: " + weight);
        } else {
            System.out.println("OMG, your pet is dead!!!");
        }
    }

    public void walk() {
        if (weight > 0) {
            weight -= 2.0;
            System.out.println(name + " THX for walk " + " my weight is: " + weight);
        } else {
            System.out.println("OMG, your pet is dead!!!");
        }
    }

    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human || this instanceof Pet) {
            throw new Exception("no this way");
        }

        System.out.println(this.toString() + " adiooos");
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
