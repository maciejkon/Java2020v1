package creatures;

public class FarmAnimal extends Animal {
    final public Integer idNumber;

    static final public Double DEFAULT_FOOD_WEIGHT = 1.5;

    public FarmAnimal(String spieces, Integer idNumber) {
        super(spieces);
        this.idNumber = idNumber;

    }

}
