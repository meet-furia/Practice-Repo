package baaki_ke_doubts.java_basics;

public class StaticObjectDoubt {
    static Test test = new Test();
    public static void main(String[] args) {
        StaticObjectDoubt.test.display();
    }
}
class Test {
    void display() {
        System.out.println("Hello");
    }
}
