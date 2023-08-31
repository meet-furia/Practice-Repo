package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion_practice.recursion_practice_3;

public class RecursionPractice3 {
    public static void main(String[] args) {
        printNto1(5);
        print1ToN(5);
    }
    static void printNto1(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    static void print1ToN(int n){
        if (n == 0){
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

}
