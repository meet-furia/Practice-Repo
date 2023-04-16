package kunal_kushwaha.dsa.dsa_self_fun.javatpoint.java_basic_programs;

public class FibonacciNumber {
    public static void main(String[] args) {
        int fib = nthFibNum(10);
        System.out.println(fib);

        int fibUsingRecursion = nthFibNumUsingRecursion(6);
        System.out.println(fibUsingRecursion);
    }

    static int nthFibNum(int num) {
        int first = 0;
        int second = 1;
        if (num < 3) {
            if (num == 1){
                return 0;
            } else if (num == 2) {
                return 1;
            } else if (num < 1) {
                return -1;
            }
        }
        int fibNum = 0;
        for (int i = 3; i <= num; i++){
            fibNum = first + second;
            first = second;
            second = fibNum;
        }
        return fibNum;
    }


    static int nthFibNumUsingRecursion(int num) {
        if (num == 1){
            return 0;
        }
        if (num == 2){
            return 1;
        }
        return nthFibNumUsingRecursion(num - 1) + nthFibNumUsingRecursion(num - 2);
    }
}
