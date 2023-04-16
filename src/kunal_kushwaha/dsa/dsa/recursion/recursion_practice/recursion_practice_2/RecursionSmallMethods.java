package kunal_kushwaha.dsa.dsa.recursion.recursion_practice.recursion_practice_2;

public class RecursionSmallMethods {
    public static void main(String[] args) {
        printPattern(5, 5);
    }
    static void printPattern(int rows, int index) {
        if (rows == 0){
            return;
        }
        for (int i = index;i >= rows; i--){
            System.out.print("*" + " ");
        }
        System.out.println();
        printPattern(rows - 1, index);
    }
}
