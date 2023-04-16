package baaki_ke_doubts;

class Car {
    void display(){
        System.out.println("Car is running");
    }
}

class Bike {
//    void display();
}
public class Test {
    static Car car = new Car();
    public static void main(String[] args) {

        Bike bike = new Bike();
//        car = bike;
        car.display();
        Test.display();
    }

    static void display(){
        car.display();
    }
}

