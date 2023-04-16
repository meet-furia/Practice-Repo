package kunal_kushwaha.dsa.dsa.number_problems_leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(reverse(2147483647));

        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }
    static public int reverse(int x) {
        long revNum = 0;
        while (x != 0) {
            int rem = x % 10;
            revNum = revNum * 10 + rem;
            x = x/10;
        }
        if (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) (revNum);
    }

}
