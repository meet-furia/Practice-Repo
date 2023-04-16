package kunal_kushwaha.dsa.dsa_self_fun.recursion.basics;

public class RecursionBasics3 {
    public static void main(String[] args) {
        int fib1 = printFib(5);
        System.out.println(printFib(5));
    }

    static int printFib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        return printFib(n - 1) + printFib(n - 2);
    }

}
