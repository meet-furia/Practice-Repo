package kunal_kushwaha.dsa.dsa.linkedlist.leetcode;

public class HappyNumber {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = sumSquare(slow);
            fast = sumSquare(sumSquare(slow));
        }
        while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    private static int sumSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n/=10;
        }
        return sum;
    }

}
