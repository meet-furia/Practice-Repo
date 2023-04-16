package kunal_kushwaha.rest.object_oriented_programming.oop.oop1.final_keyword;

public class Salary {
    final static int HIKE = 2;
    public static void main(String[] args) {
        Salary salary = new Salary();
        Test test = new Test();

    }
}

class Test {
    final int num;
    final String name = "";
    final static String country;
    {
        num = 10;
        System.out.println("Block executed");
    }
    static {
        country = "I";
    }
}

