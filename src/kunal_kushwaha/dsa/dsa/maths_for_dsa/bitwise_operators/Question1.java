package kunal_kushwaha.dsa.dsa.maths_for_dsa.bitwise_operators;

public class Question1 {
    public static void main(String[] args) {
        int a = 10 << 1;
        System.out.println(a);

        int b = 40 >> 1;
        System.out.println(b);

        // Question 1 : Find whether the given number is odd or even

        // Anything & 1 = same number.
        int n1 = 67;
        boolean b1 = isOdd(n1);
        System.out.println(b1);
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }


}
