package kunal_kushwaha.dsa.dsa_self_fun.javatpoint.java_basic_programs;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
    static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
