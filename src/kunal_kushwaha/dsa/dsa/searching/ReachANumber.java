package kunal_kushwaha.dsa.dsa.searching;

public class ReachANumber {
    public static void main(String[] args) {
        int moves1 = reachNumber(2);
        System.out.println(moves1);

        int moves2 = reachNumber(3);
        System.out.println(moves2);

        int moves3 = reachNumber(1);
        System.out.println(moves3);

        int moves4 = reachNumber(0);
        System.out.println(moves4);
    }

    static public int reachNumber(int target) {
        if (target == 0) {
            return 0;
        }
        target = Math.abs(target);
        int sum = 0;
        int totalSteps = 0;
        int moves = 1;
        while (sum < target) {
            sum = sum + moves;
            moves++;
            totalSteps++;

            if (sum == target) {
                return totalSteps;
            }
        }
        if ((sum - target) % 2 == 0) {
            return totalSteps;
        }

        while ((sum - target) % 2 != 0) {
            sum = sum + moves;
            moves++;
            totalSteps++;
        }
        return totalSteps;
    }
}
