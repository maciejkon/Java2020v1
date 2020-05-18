package creatures;

public class Pet extends Animal {
    final String name;
    static final public Double DEFAULT_FOOD_WEIGHT = 0.5;

    public Pet(String spieces, String name) {
        super(spieces);
        this.name = name;
    }

    @Override
    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }
}
