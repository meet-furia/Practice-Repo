package kunal_kushwaha.dsa.dsa_self_fun.recursion.basics;

public class RecursionBasics2 {
    public static void main(String[] args) {
        print1ToN(5);
    }

    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }
}
