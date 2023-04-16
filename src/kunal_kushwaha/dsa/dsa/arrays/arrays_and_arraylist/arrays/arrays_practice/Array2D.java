package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.arrays_practice;

public class Array2D {
    public static void main(String[] args) {
        int[][] array1 = {{1,2}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
