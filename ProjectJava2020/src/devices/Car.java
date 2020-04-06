package devices;

public class Car extends Device {

    public final String plates;
    final private Double value;

    public Car(String producer, String model,String plates,Double value) {
        super(producer, model,value);
        this.plates=plates;
        this.value=value;
    }




    public String toString(){
        return super.toString() + " " + this.plates;
    }
}

