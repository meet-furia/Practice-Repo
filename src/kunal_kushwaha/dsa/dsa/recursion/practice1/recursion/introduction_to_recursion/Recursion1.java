package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion.introduction_to_recursion;

public class Recursion1 {
    public static void main(String[] args) {
        print1(1);

        for (int i = 1; i <= 5; i++){
            callingMethodWithLoops(i);
        }
    }
    static void print1(int n){
        System.out.println(n);
        if (n < 5){
            print1(n + 1);
        }
    }

    static void callingMethodWithLoops(int n){
        System.out.println(n);
    }




//    static int findNthFib(int n){
//
//    }
}
