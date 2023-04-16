package kunal_kushwaha.dsa.dsa.recursion.recursion_practice.recursion_practice_1;

public class RecursionSmallMethods {
    public static void main(String[] args) {
        print1ToN(5);
        printNTo1(5);
        int reversedNumber1 = reverseANumber(4356);
        System.out.println(reversedNumber1);

        int reversedNumber2 = kunal1(6789);
        System.out.println(reversedNumber2);

        int reversedNumber3 = kunal2(5897);
        System.out.println(reversedNumber3);

        int numberOfZeros = countNumberOfZeros(50402, 0);
        System.out.println(numberOfZeros);
    }

    static void print1ToN(int n){
        if (n == 0){
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    static void printNTo1(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }

    static int reverseANumber(int n){
        String s = Integer.toString(n);
        int length = s.length() - 1;

        if (n == 0){
            return 0;
        }

        int rem = n  % 10;
        n = n/10;
        return  rem * (int) Math.pow(10, length) + reverseANumber(n);
    }

    static int sum = 0;
    static int kunal1(int n){
        if (n == 0){
            return 0;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        kunal1(n/10);
        return sum;
    }

    static int kunal2(int n){
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if (n % 10 == n){
            return n;
        }

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    static int countNumberOfZeros(int n, int count){
        if (n == 0){
            return count;
        }
        int ans = count;
        int rem = n % 10;
        if (rem == 0){
            return countNumberOfZeros(n/10, count+1);
        }
        else {
            return countNumberOfZeros(n/10, count);
        }
    }
}
