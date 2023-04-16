package kunal_kushwaha.dsa.dsa.arrays.binary_search.binary_search_in_2d_arrays;

public class SearchIn2DMatrix2 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target1 = 60;
        int row1 = searchRowIn2DArray(matrix1, target1);
        System.out.println(row1);
        boolean targetFound1 = applyBinarySearch(matrix1, row1, target1);
        System.out.println(targetFound1);

        int[][] matrix2 = {
                {1,3,5,7}
        };
        int target2 = 2;
        int row2 = searchRowIn2DArray(matrix2, target2);
        System.out.println(row2);
        boolean targetFound2 = searchMatrix(matrix1, target2);
        System.out.println(targetFound2);

    }

    static public boolean searchMatrix(int[][] matrix, int target) {
        int row = searchRowIn2DArray(matrix, target);
        if (row == -1){
            return false;
        }
        boolean result = applyBinarySearch(matrix, row, target);
        return result;
    }

    static public int searchRowIn2DArray(int[][] matrix, int target){
        int rowStart = 0;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        int rowEnd = matrix.length - 1;

        if (target < matrix[rowStart][colStart]) {
            return -1;
        }

        if (target > matrix[rowEnd][colEnd]) {
            return -1;
        }

        if (matrix == null) {
            return -1;
        }


        while (rowStart <= rowEnd) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[rowMid][colStart] <= target && matrix[rowMid][colEnd] >= target) {
                return rowMid;
            }
            if (rowMid > 0 && target < matrix[rowMid][colStart]) {
                rowEnd = rowMid - 1;
            }
            else {
                rowStart = rowMid + 1;
            }

        }
        return -1;
    }

    static public boolean applyBinarySearch(int[][] matrix, int row, int target){
        int colStart = 0;
        int colEnd = matrix[row].length;
        while (colStart <= colEnd){
            int colMid = colStart + (colEnd - colStart)/2;
            if (target == matrix[row][colMid]){
                return true;
            }
            if (target > matrix[row][colMid]){
                colStart = colMid + 1;
            }
            else {
                colEnd = colMid - 1;
            }
        }
        return false;
    }
}
