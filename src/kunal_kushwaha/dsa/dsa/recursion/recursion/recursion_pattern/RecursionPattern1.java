package kunal_kushwaha.dsa.dsa.recursion.recursion.recursion_pattern;

public class RecursionPattern1 {
    public static void main(String[] args) {
        printPattern(5, 0);
//        printPattern2(5, 0);
        printPatternByKK(5, 0);
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

    static void printPatternByKK(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            printPatternByKK(row, col + 1);
        }
        else {
            System.out.println();
            printPatternByKK(row - 1, 0);
        }
    }

    static void printPatternbyChatGPT(int row, int col) {
        if (row == 0 || col > row) {
            return;
        }
        if (col == row) {
            System.out.println();
            printPattern(row - 1, 0);
        }
        System.out.print("*");
        printPattern(row, col + 1);
    }
}