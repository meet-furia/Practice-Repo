package kunal_kushwaha.dsa.dsa.arrays.binary_search.binary_search_in_2d_arrays;

import java.util.Arrays;

public class SearchIn2DMatrix1 {
    public static void main(String[] args) {
        int[][] array2D= {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};

        System.out.println(Arrays.toString(searchAndReturnIndexes(array2D, 10)));
        System.out.println(searchAndReturnBoolean(array2D, 10));

        int[][] array2D1 = {
                {-1},
                {3}
        };
        System.out.println(array2D1.length);
        System.out.println(array2D1[0].length);

        boolean res2 = searchAndReturnBoolean(array2D1, 3);
        System.out.println(res2);
    }

    static public int[] searchAndReturnIndexes(int[][] matrix, int target){
        int row = 0;

        // Because matrix.length returns row's length, but we need columns length, so
        // column = matrix[0].length - 1
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0){
            if (target == matrix[row][column]){
                return new int[]{row, column};
            }
            if (target > matrix[row][column]){
                row++;
            }
            else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }


    static public boolean searchAndReturnBoolean(int[][] matrix, int target){

        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }

        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0){
            if (target == matrix[row][column]){
                return true;
            }
            if (target > matrix[row][column]){
                row++;
            }
            else {
                column--;
            }
        }
        return false;
    }
}
