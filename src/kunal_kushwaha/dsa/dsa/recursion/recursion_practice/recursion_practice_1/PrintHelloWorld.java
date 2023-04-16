package kunal_kushwaha.dsa.dsa.recursion.recursion_practice.recursion_practice_1;

public class PrintHelloWorld {
    public static void main(String[] args) {
        message(5);
        for (int i = 1; i <= 5; i++){
            printNumbers(i);
        }
    }

    static void message(int count){
        if (count == 0){
            return;
        }
        System.out.println("Hello World");
        message(--count);
    }

    static void printNumbers(int n){
        System.out.println(n);
    }
}
