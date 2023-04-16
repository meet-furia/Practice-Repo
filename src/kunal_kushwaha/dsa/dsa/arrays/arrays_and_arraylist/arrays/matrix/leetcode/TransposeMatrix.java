package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.matrix.leetcode;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] reshapedMatrix1 = transpose(matrix1);
        for (int[] i : reshapedMatrix1){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[][] matrix2 = {
                {2, 4, - 1},
                {-10,  5,  11},
                {18, -7,  6}
        };
        int[][] reshapedMatrix2 = transpose(matrix2);
        for (int[] i : reshapedMatrix2){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    static public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int rowNewMatrix = matrix[0].length;
        int colNewMatrix = matrix.length;

        int[][] transposedMatrix = new int[rowNewMatrix][colNewMatrix];

        int row = 0;
        int col = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                transposedMatrix[row][col] = matrix[j][i];
                col++;
            }
            if (col == colNewMatrix){
                col = 0;
                row++;
            }
        }
        return transposedMatrix;
    }

}
