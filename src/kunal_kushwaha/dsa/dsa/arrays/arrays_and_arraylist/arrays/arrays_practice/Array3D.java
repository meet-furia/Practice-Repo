package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.arrays_practice;

import java.util.Arrays;

public class Array3D {
    public static void main(String[] args) {
        int[][][] array1 = {{{0, 1}, {2, 3}}, {{4, 5}, {6, 7, 8}}, {{9, 10}, {11, 12, 13}}};

        // Printing arrays the traditional way
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                for (int k = 0; k < array1[i][j].length; k++){
                    System.out.print(array1[i][j][k] + " ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

        System.out.println();
        // Printing arrays with toString method
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                    System.out.print(Arrays.toString(array1[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[][] a : array1){
//            System.out.println(a);
            for (int[] b : a){
//                System.out.print(Arrays.toString(b) + " ");
                for (int c : b){
                    System.out.print(c + " ");
                }
                System.out.println();

            }
        }

    }
}
