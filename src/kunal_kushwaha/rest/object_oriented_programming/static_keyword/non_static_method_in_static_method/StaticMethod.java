package kunal_kushwaha.rest.object_oriented_programming.static_keyword.non_static_method_in_static_method;

public class StaticMethod {
    public static void main(String[] args) {
        fun();
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.details();
    }

    static void fun(){
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.details();
    }

    void details(){
        System.out.println("Tikuji ni wadi");
        vehicle();
    }

    void vehicle(){
        System.out.println("Bus");
    }
}
