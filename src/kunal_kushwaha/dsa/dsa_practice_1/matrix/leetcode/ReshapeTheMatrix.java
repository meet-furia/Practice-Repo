package kunal_kushwaha.dsa.dsa_practice_1.matrix.leetcode;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int[][] reshapedMatrix = matrixReshape(mat, 2, 6);
        for (int[] arr : reshapedMatrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] reshapedMatrix = new int[r][c];
        int reshapedMatRow = 0;
        int reshapedMatCol = 0;

        for (int oldMatRow = 0; oldMatRow < mat.length; oldMatRow++) {
            for (int oldMatCol = 0; oldMatCol < mat[0].length; oldMatCol++) {
                if (reshapedMatCol == c) {
                    reshapedMatCol = 0;
                    reshapedMatRow++;
                }
                reshapedMatrix[reshapedMatRow][reshapedMatCol] = mat[oldMatRow][oldMatCol];
                reshapedMatCol++;
            }
        }
        return reshapedMatrix;
    }

}
