package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.matrix.leetcode;

import java.util.ArrayList;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2}, 
                {3, 4}
        };
        int[][] reshapedMatrix1 = matrixReshape(matrix1, 1, 4);
        for (int[] i : reshapedMatrix1){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        }; 
        int[][] reshapedMatrix2 = matrixReshape(matrix2, 2, 4);
        for (int[] i : reshapedMatrix2){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    static public int[][] matrixReshape(int[][] mat, int r, int c) {
        int totalCountInMat = 0;
        int[][] reshapedMatrix = new int[r][c];
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                arrayList.add(mat[i][j]);
                totalCountInMat++;
            }
        }
        if (totalCountInMat != r * c){
            return mat;
        }
        else {
            int count = 0;
            for (int i = 0; i < r; i++){
                for (int j = 0; j < c; j++){
                    reshapedMatrix[i][j] = arrayList.get(count);
                    count++;
                }
            }
        }
        return reshapedMatrix;
    }





    static public int[][] matrixReshape1(int[][] mat, int r, int c) {
        int[][] reshapedMatrix = new int[r][c];

        if (mat.length * mat[0].length != r * c){
            return mat;
        }

        else {
            int row = 0;
            int col = 0;
            for (int i = 0; i < mat.length; i++){
                for (int j = 0; j < mat[i].length; j++){
                    reshapedMatrix[row][col] = mat[i][j];
                    col++;
                    if (col == c){
                        col = 0;
                        row++;
                    }
                }
            }
        }

        return reshapedMatrix;

    }
}
