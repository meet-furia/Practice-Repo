package oops.singleton_class;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void print() {
        System.out.println(singleton);
        System.out.println(singleton.hashCode());
    }
}
