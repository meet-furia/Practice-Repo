package kunal_kushwaha.dsa.dsa.recursion.recursion.introduction_to_recursion;

public class TailRecursion {
    public static void main(String[] args) {
        tailRecursion(1);
        int nthFibNum1 = nthFibonacciNumber(5);
        System.out.println(nthFibNum1);

        int nthFibNum2 = nthFibonacciNumber(50);
        System.out.println(nthFibNum2);

    }

    static void tailRecursion(int n) {
        // In tail recursion
        if (n == 5) {
            return;
        }
        System.out.println(n);
        tailRecursion(n + 1);

    }

    static int nthFibonacciNumber(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2){
            return 1;
        }
        int result = nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);
        return result;
    }
}
