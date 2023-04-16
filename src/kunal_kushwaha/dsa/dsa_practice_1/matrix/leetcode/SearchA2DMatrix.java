package kunal_kushwaha.dsa.dsa_practice_1.matrix.leetcode;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        System.out.println(searchMatrix(matrix1, 13));
    }
    static public boolean searchMatrix(int[][] matrix, int target) {
        int startRow = 0, endRow = matrix.length - 1;
        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow)/2;
            // Row ka middle dhund and uske last and first element se compare kar target ko
            if (target >= matrix[midRow][0] && target <= matrix[midRow][matrix[0].length - 1]) {
                return applyBinarySearch(matrix, target, midRow);
            } else if (target < matrix[midRow][0]) {
                endRow = midRow - 1;
            }
            else {
                startRow = midRow + 1;
            }
        }
        return false;
    }
    static public boolean applyBinarySearch(int[][] matrix, int target, int row) {
        int startCol = 0, endCol = matrix[0].length;
        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol)/2;
            if (target > matrix[row][midCol]) {
                startCol = midCol + 1;
            } else if (target < matrix[row][midCol]) {
                endCol = midCol - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }

}
