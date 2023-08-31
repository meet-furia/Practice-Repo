package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion.recursion_pattern;

import javax.swing.*;

public class RecursionPattern2 extends JFrame {
    public static void main(String[] args) {
        printPattern(4, 0);
    }
    static void printPattern(int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            printPattern(row, col + 1);
            System.out.print("*");
        }
        else {
            printPattern(row - 1, 0);
            System.out.println();
        }
    }
}
