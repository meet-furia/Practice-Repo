// https://leetcode.com/problems/spiral-matrix-ii/
package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.matrix.leetcode;

public class SpiralMatrix1 {
    public static void main(String[] args) {
        int[][] matrix1 = generateMatrix(1);
        for (int[] arr:matrix1) {
            for (int i:arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;
        int count = 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count;
                count++;
            }
            top++;
            if (top > bottom || left > right) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;
            }
            right--;

            if (top > bottom || left > right) {
                break;
            }

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = count;
                count++;
            }
            bottom--;

            if (top > bottom || left > right) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = count;
                count++;
            }
            left++;

            if (top > bottom || left > right) {
                break;
            }
        }
        return matrix;
    }
}
