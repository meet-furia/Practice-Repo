package kunal_kushwaha.dsa.dsa_practice_1.binary_search.leetcode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(20));
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(2147483647));

        long l1 = 565656565;
        long l2 = 9223372036854775807L;
        System.out.println(Long.MAX_VALUE);

        short s1 = 10;
        byte b1 = 20;
        short s2 = (short) (s1 + b1);

        int i1 = 50;
        int i2 = 50;
        int i3 = i1 * i2;

    }

    static public boolean isPerfectSquare(int num) {
        long start = 1, end = num;
        while (start <= end) {
            long mid = start + (end - start)/2;
            if (mid * mid > num) {
                end = mid - 1;
            }
            else if (mid * mid < num) {
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
