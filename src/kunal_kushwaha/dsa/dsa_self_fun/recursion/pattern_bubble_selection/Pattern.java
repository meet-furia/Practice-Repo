    package kunal_kushwaha.dsa.dsa_self_fun.recursion.pattern_bubble_selection;

public class Pattern {
    public static void main(String[] args) {
        printPattern(3, 0);
    }

    static void printPattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col == row) {
            System.out.println();
            printPattern(row - 1, 0);
        }
        else {
            System.out.print("*");
            printPattern(row, col + 1);
        }
    }
}
