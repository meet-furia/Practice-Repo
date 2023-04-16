package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.arrays_practice;

import java.util.Arrays;

public class ReverseArrayWithSwap {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 11, 19, 25, 77};
        System.out.println(Arrays.toString(array));
        reverseWithSwap(array);

        System.out.println();

        int[] array1 = {1, 2, 3, 4, 5, 11, 19, 25, 77, 97};
        System.out.println(Arrays.toString(array1));
        reverseWithSwap(array1);

    }
    static void reverseWithSwap(int[] array){
        int begin = 0;
        int end = array.length - 1;
        int temp;
        while (end > begin){
            temp = array[begin];
            array[begin] = array[end];
            array[end] = temp;
            begin++;
            end--;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
