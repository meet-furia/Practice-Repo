package kunal_kushwaha.dsa.dsa_self_fun.recursion.basics;

public class RecursionLevel1Questions {
    public static void main(String[] args) {
        printNTo1(5);
        System.out.println();

        print1ToN(5);
        System.out.println();

        System.out.println(productNTo1(5));

        int n = sumNTo1(5);
        System.out.println(sumNTo1(5));

        int n1 = productOfDigits(65432);
        System.out.println(n1);

        int n2 = revNumIteratively(5426);
        System.out.println(n2);

        int n3 = revNum(5426, 0);
        System.out.println(n3);

        int n4 = countZeros(50405, 0);
        System.out.println(n4);
    }

    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    static void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNTo1(n-1);
    }

    static int productNTo1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * productNTo1(n-1);
    }

    static int sumNTo1(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNTo1(n-1);
    }

    static int productOfDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * productOfDigits(n/10);
    }

    // 5426
    static int revNum(int n, int revNum) {
        if (n == 0) {
            return revNum;
        }
        int rem = n % 10;
        return revNum(n/10, revNum * 10 + rem);
    }

    static int revNumIteratively(int n) {
        int revNum = 0;
        while (n != 0) {
            int rem = n % 10;
            revNum = revNum * 10 + rem;
            n/=10;
        }
        return revNum;
    }

    static int countZeros(int n, int zeros) {
        if (n == 0) {
            return zeros;
        }
        int rem = n % 10;
        if (rem == 0) {
            return countZeros(n/10, zeros+1);
        }
        else {
            return countZeros(n/10, zeros);
        }
    }
}
