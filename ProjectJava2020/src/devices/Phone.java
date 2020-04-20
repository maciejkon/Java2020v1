package devices;

import com.company.Human;

public class Phone extends Device {

    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, Double value, Double screenSize, boolean isAndroid) {
        super(producer, model, value);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
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
}
