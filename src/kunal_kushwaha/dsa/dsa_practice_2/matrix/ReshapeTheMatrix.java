package kunal_kushwaha.dsa.dsa_practice_2.matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2}, {3,4}};
        int[][] reshapedMat1 = matrixReshape(mat1, 1, 4);
        for (int[] i : reshapedMat1) {
            System.out.print(Arrays.toString(i));
        }
    }

    static public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat[0]. length * mat.length != r * c) {
            return mat;
        }
        int newMatCol = 0;
        int newMatRow = 0;

        int[][] reshapedMatrix = new int[r][c];
        for (int oldMatRow = 0; oldMatRow < mat.length; oldMatRow++) {
            for (int oldMatCol = 0; oldMatCol < mat[0].length; oldMatCol++) {
                reshapedMatrix[newMatRow][newMatCol] = mat[oldMatRow][oldMatCol];
                newMatCol++;
            }
            if (newMatCol == c) {
                newMatCol = 0;
                newMatRow++;
            }
        }
        return reshapedMatrix;
    }
}
