package devices;

public class Phone extends Device {

    public final Double screenSize;
    public final boolean isAndroid;


    public Phone(String producer, String model, Double value, Double screenSize, boolean isAndroid) {
        super(producer, model,value);
        this.screenSize=screenSize;
        this.isAndroid=isAndroid;
    }
}
