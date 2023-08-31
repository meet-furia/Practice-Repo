package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion.introduction_to_recursion;

public class RecursionPractice1 {
    public static void main(String[] args) {
        recursionNto1(5);
        System.out.println("---------------");

        recursion1toN(5);
        System.out.println("---------------");

        recursionBoth(5);
        System.out.println("---------------");
    }

    static void recursionNto1(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        recursionNto1(n-1);
        System.out.println(n);
    }

    static void recursion1toN(int n){
        if (n == 0){
            return;
        }
        recursion1toN(n-1);
        System.out.println(n);
    }

    static void recursionBoth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        recursionBoth(n-1);
        System.out.println(n);
    }

}
