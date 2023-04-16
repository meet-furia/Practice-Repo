package kunal_kushwaha.dsa.dsa_self_fun.javatpoint.java_basic_programs;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmStrong(153));
        System.out.println(isArmStrong(1));
        System.out.println(isArmStrong(5));
        System.out.println(isArmStrong(250));
        System.out.println(isArmStrong(370));

        System.out.println(armstrongNumber(153));
        System.out.println(armstrongNumber(250));
    }

    static boolean isArmStrong(int num) {
        int countOfNumbers = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp/10;
            countOfNumbers++;
        }
        int totalSum = totalSum(num, countOfNumbers);
        if (num == totalSum) {
            return true;
        }
        else {
            return false;
        }
    }
    static int totalSum(int num, int count) {
        int totalSum = 0;
        while (num > 0){
            int rem = num % 10;
            int sum = 1;
            for (int i = 1; i <= count; i++) {
                sum = sum * rem;
            }
            totalSum = totalSum + sum;
            num = num/10;
        }
        return totalSum;
    }


    static String armstrongNumber(int n){
        // code here
        int countOfNumbers = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp/10;
            countOfNumbers++;
        }
        int totalSum = totalSum(n, countOfNumbers);
        if (n == totalSum) {
            return "Yes";
        }
        else {
            return "No";
        }

    }

}
