package creatures;

import devices.Car;
import devices.Phone;

public class Human extends Animal {

    public String firstName;
    final String lastName;
    Animal pet;
    private Phone phone;
    private Car car;
    private Double salary;
    private Double money;

    public Human(String firstName, String lastName, Double salary, Double money) {
        super("Homo Sapiens");
        this.weight = 89.0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.money = money;
    }

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        throw new Exception("you cannot sell human!!!");
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void goToWork() {
        this.money += salary;
    }

    public void setCar(Car car) {
        if (car.getValue() <= this.salary) {
            //System.out.println("Great you can buy it by cash");
            this.car = car;
        } else if (car.getValue() <= this.salary * 12) {
            //System.out.println("Not so great, but you can buy it ");
            this.car = car;
        } else {
            System.out.println("Sorry , get rise");
        }

    }

    public Car getCar() {
        return this.car;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
