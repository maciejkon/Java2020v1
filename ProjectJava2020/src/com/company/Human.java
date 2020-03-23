package com.company;

public class Human {
    String firstName;
    String lastName;
    com.company.Animal pet;
    Phone phone;
    private Car car;

    private Double salary;

    public void setCar(Car car){
        if (car.getValue()<=this.salary) {
            System.out.println("Great you can buy it by cash");
            this.car = car;
        }
        else if (car.getValue()<= this.salary *12) {
            System.out.println("Not so great, but you can buy it ");
            this.car=car;
        }
        else{
            System.out.println("Sorry , get rise");
        }
    }

    public String toString(){
        return this.firstName + " " + this.lastName + " " +this.pet;
    }

    public Car getCar(){
        return this.car;
    }


    public Double getSalary() {
        //readonly
        //autoryzacja
        //logi
        return salary; //podstawa + premia + prowizja;
    }

    public void setSalary(Double salary) {
        //walidacje
        //logowanie/logi
        //integracja z innym systemem
        this.salary = salary;
    }


}
