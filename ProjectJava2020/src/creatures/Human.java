package creatures;

import devices.Car;
import devices.Phone;

import java.util.Arrays;

public class Human extends Animal {

    public String firstName;
    final String lastName;
    Animal pet;
    private Phone phone;
    private Double salary;
    private Double money;
    private Car[] garage;

    public Human(String firstName, String lastName, Double salary, Double money, Integer garageSize) {
        super("Homo Sapiens");
        this.weight = 89.0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.money = money;
        this.garage = new Car[garageSize];
    }

    public void sortCar() {
        Arrays.sort(garage);
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == carToRemove) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car carToAdd) throws Exception {
        if (!this.hasFreeSpace()) {
            throw new Exception("Has no place for this car!");
        }
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = carToAdd;
                break;
            }
        }

    }


    public Double sumValue() {
        Double valueOfCars = 0.0;
        for (Car car : garage) {
            if (car != null) {
                valueOfCars += car.getValue();
            }
        }
        return valueOfCars;
    }

    public void setCar(Car car, Integer numberOfCar) {
        if (car != null) {
            if (car.getValue() <= this.salary) {
                System.out.println("Udało się kupić za gotówkę");
                this.garage[numberOfCar] = car;
            } else if (car.getValue() <= this.salary * 12) {
                System.out.println("Udało się kupić na kredyt");
                this.garage[numberOfCar] = car;
            } else {
                System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            }
        } else {
            this.garage[numberOfCar] = null;
        }
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public Car getCar(int numberOfCar) {
        return this.garage[numberOfCar];
    }

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        throw new Exception("you cannot sell human!!!");
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


}
