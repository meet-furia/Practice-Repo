package oops.oops_principles.inheritance.self;

public class Bike extends Vehicle {
    int tyres;

    public Bike(String company, int tyres) {
        super(company);
        this.tyres = tyres;
    }

//    public void display() {
//        System.out.println("I am in Bike Class");
//    }


    public static void main(String[] args) {
        Bike bike = new Bike("Honda", 2);
        System.out.println(bike.tyres);
        System.out.println(bike.company);
        bike.display();
        Bike.display();
    }
}
