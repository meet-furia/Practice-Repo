package oops.singleton_class;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.print();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.print();
    }
}
