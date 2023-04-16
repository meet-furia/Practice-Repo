package kunal_kushwaha.dsa.dsa.recursion.recursion.introduction_to_recursion;

public class RecursionProblems {
    public static void main(String[] args) {
        int factorial = productNto1(5);
        System.out.println(factorial);

        int sum = sumOfNumbers(1234);
        System.out.println(sum);

        int product = productOfDigits(1234);
        System.out.println(product);

        int reversedNumber = reverseANumber(1234);
        System.out.println(reversedNumber);


        int reverseNumberRecursion = reverseANumberRecursion(1234);
        System.out.println(reverseNumberRecursion);

    }
    static int productNto1(int n){
        int sum = 1;
        if (n == 1){
            return 1;
        }
        return n * productNto1(n - 1);

    }

    static int sumOfNumbers(int n){
        int temp = n;
        if (temp == 0){
            return 0;
        }
        int rem = temp % 10;
        temp = temp/10;
        return rem + sumOfNumbers(temp);
    }

    static int productOfDigits(int n){
        int temp = n;
        if (temp == 0){
            return 1;
        }
        int rem = temp % 10;
        temp = temp/10;
        return rem * productOfDigits(temp);
    }

    static int reverseANumber(int n){
        int temp = n;
        int reversedNumber = 0;
        while (temp != 0){
            int rem = temp % 10;
            reversedNumber = reversedNumber * 10 + rem;
            temp = temp/10;
        }
        return reversedNumber;
    }

    static int reversedNumber = 0;

    static int reverseANumberRecursion(int n){
        int temp = n;
        if (temp == 0){
            return 0;
        }
        int rem = temp % 10;
        reversedNumber = reversedNumber * 10 + rem;
        temp = temp/10;
        reverseANumberRecursion(temp);
        return reversedNumber;
    }



}
