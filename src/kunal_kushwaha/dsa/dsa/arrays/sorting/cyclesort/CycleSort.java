package kunal_kushwaha.dsa.dsa.arrays.sorting.cyclesort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {

        int[] arr1 = {3, 5, 2, 1, 4};
        cycleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10, 9, 8, 7, 6, 1, 2, 3, 4, 5};
        cycleSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {3, 5, 2, 1, 4};
        cycleSort1(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {10, 9, 8, 7, 6, 1, 2, 3, 4, 5};
        cycleSort1(arr4);
        System.out.println(Arrays.toString(arr4));

    }
    static int[] cycleSort(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[index] == index + 1){
                index++;
            }
            else {
                int temp = arr[index];
                arr[index] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        return arr;
    }

    // Cycle Sort by Kunal Kushwaha
    static void cycleSort1(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
