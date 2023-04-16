package kunal_kushwaha.dsa.dsa_self_fun.matrix;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]
                {
                        {1,2,3}, //i=0
                        {4,5,6}, //i=1
                        {7,8,9}  //i=2
                };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        rotateMatrixLeftSide(matrix);

    }

    //    1 2 3
    //    4 5 6
    //    7 8 9

    //    3 6 9
    //    2 5 8
    //    1 4 7

    // Rotate left side

    static void rotateMatrixLeftSide(int[][] matrix) {
        int colLength = matrix[0].length;
        int rowLength = matrix.length;
        System.out.println("Left Side Rotated Matrix");
        for (int col = colLength - 1; col >= 0; col--) {
            for (int row = 0; row <= rowLength - 1; row++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}


