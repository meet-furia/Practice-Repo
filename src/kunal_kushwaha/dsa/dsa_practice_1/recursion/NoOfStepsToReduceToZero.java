package kunal_kushwaha.dsa.dsa_practice_1.recursion;

public class NoOfStepsToReduceToZero {
    public static void main(String[] args) {
        int numberOfSteps1 = numberOfSteps(14);
        System.out.println(numberOfSteps1);

        int numberOfSteps2 = numberOfSteps(8);
        System.out.println(numberOfSteps2);

        int numberOfSteps3 = numberOfSteps(123);
        System.out.println(numberOfSteps3);

    }

    static public int numberOfSteps(int num) {
        return totalNumberOfSteps(num, 0);
    }

    static public int totalNumberOfSteps(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return totalNumberOfSteps(num/2, steps+=1);
        }
        else {
            return totalNumberOfSteps(num-=1, steps+=1);
        }

    }

}
