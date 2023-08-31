package kunal_kushwaha.dsa.dsa.recursion.practice1.leetcode;

public class StepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num1 = 14;
        int numOfSteps1 = numberOfSteps(num1);
        System.out.println(numOfSteps1);

        int num2 = 123;
        int numOfSteps2 = numberOfSteps(num2);
        System.out.println(numOfSteps2);

    }
    static public int numberOfSteps(int num) {
        return steps(num, 0);
    }

    static public int steps(int num, int count){
        if (num == 0){
            return count;
        }
        if (num % 2 == 0){
            return steps(num/2, count+1);
        }

        return steps(num - 1, count+1);
    }
}
