package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = new int[4][3];
        System.out.println(matrix1.length);
        System.out.println(matrix1[0].length);


        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10},
                {11}
        };
        System.out.println(matrix2.length);
        System.out.println(matrix2[0].length);
        System.out.println(matrix2[1].length);
        System.out.println(matrix2[4].length);
    }
}
