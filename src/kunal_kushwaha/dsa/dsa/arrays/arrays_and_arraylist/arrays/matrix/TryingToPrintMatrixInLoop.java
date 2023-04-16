package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.matrix;

public class TryingToPrintMatrixInLoop {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int col = 0;
        int row = 0;
        for (int i = 0; i < matrix.length * matrix[0].length; i++){
            if (col == matrix[row].length){
                col = 0;
                row++;
            }
            System.out.print(matrix[row][col] + " ");
            col++;
        }
    }
}
