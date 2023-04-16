package kunal_kushwaha.rest.object_oriented_programming.singleton_class;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton();
        System.out.println(Singleton.singleton);

    }
}

class Singleton {
    static public Singleton singleton;
    private Singleton(){
    }

    static public Singleton getInstance() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
