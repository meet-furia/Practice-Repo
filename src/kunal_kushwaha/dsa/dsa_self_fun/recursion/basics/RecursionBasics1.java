package kunal_kushwaha.dsa.dsa_self_fun.recursion.basics;

public class RecursionBasics1 {
    public static void main(String[] args) {
        printNTo1(5);
        print1ToN(5);
        System.out.println(factorial(5));
    }
    static void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }

    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sumOfFirstNNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfFirstNNumbers(n - 1);
    }
}
