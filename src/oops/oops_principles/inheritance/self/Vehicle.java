package oops.oops_principles.inheritance.self;

public class Vehicle {
    String company;

    public Vehicle(String company) {
        this.company = company;
    }

    static public void display() {
        System.out.println("I am in Vehicle Class");
    }
}
