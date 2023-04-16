package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.arrays_practice;

import java.util.Arrays;

public class Arrays1D {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3};
        int[][] array2 = {{0, 1}, {2, 3}, {4, 5}};
        int[][][] array3 = {{{0, 1}, {2, 3}}, {{4, 5}, {6, 7}}};

        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < array3.length; i++){
            for (int j = 0; j < array3[i].length; j++){
                for (int k = 0; k < array3[i][j].length; k++){
                    System.out.print(array3[i][j][k] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("Array 1D");

        for (int i : array1){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print(Arrays.toString(array1));


        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("Array 2D");



        for (int[] i : array2){
                System.out.print(Arrays.toString(i));
            }

        System.out.println();
        System.out.println("---------------------------------------------------");

    }
}
