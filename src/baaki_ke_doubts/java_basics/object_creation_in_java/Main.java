package baaki_ke_doubts.java_basics.object_creation_in_java;

public class Main {
    String model;
    Bike bike = new Bike();
    Integer tyres;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.bike);
        System.out.println(main.model);
        System.out.println(main);
        System.out.println(main.tyres);

        System.out.println(main.bike.tyres);
    }
}
