package devices;

import creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, Double value, Double screenSize, boolean isAndroid) {
        super(producer, model, value);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    @Override
    public void turnOn() {
        System.out.println("your phone is on!");
    }

    public void installAnApp(String appName) throws MalformedURLException {
        this.installAnApp(appName, "latest");

    }

    public void installAnApp(String appName, String version) throws MalformedURLException {
        URL url = new URL("https", "https://ourAppStore/" + appName + "/" + version, 443, appName);
        this.installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("zainstalowałem aplikacje " + url.getFile());
    }

    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        super.sell(seller, buyer, value);
        if (seller.getPhone().equals(this)) {
            if (buyer.getMoney() >= value) {
                buyer.setMoney(buyer.getMoney() - value);
                seller.setMoney(seller.getMoney() + value);
                seller.setPhone(null);
                buyer.setPhone(this);
                System.out.println("Transaction PASS!!! You have nice phone");
            } else {
                System.out.println("Too broke");
            }

        } else {
            throw new Exception("You can't sel this device (wrong owner) ");
        }
    }

    public String toString() {
        return "Phone: " + this.producer + " " + this.model + " " + this.screenSize;
    }
}
