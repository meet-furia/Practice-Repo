package takeuforward.sde_sheet.sde_sheet_1.arrays.leetcode;

public class SetMatrixZeroes {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean isCol = false;

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Check for first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        }

        // Check for first col
        if (isCol) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }

}
