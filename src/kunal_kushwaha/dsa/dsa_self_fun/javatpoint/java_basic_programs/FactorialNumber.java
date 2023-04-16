package kunal_kushwaha.dsa.dsa_self_fun.javatpoint.java_basic_programs;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
