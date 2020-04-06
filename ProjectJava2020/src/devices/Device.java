package devices;

public class Device {
    public final String producer;
    public final String model;
    public final Double value;

    public Device(String producer,String model,Double value){
        this.producer=producer;
        this.model=model;
        this.value=value;
    }

    public Double getValue() {
        return this.value;
    }

    public String toString(){
        return this.producer+" "+this.model;
    }
}
