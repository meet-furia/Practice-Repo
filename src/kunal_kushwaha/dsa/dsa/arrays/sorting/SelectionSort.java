package kunal_kushwaha.dsa.dsa.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(array1, array1.length);
        System.out.println(Arrays.toString(array1));
//        int[] sortedArray1 = applySelectionSort(array1);
//        System.out.println(Arrays.toString(sortedArray1));

        int[] array2 = {};
        int[] sortedArray2 = applySelectionSort(array2);
        System.out.println(Arrays.toString(sortedArray2));

        int[] array3 = {1,2,3,4,5,6,7,8,10,9};
        int[] sortedArray3 = applySelectionSort(array3);
        System.out.println(Arrays.toString(sortedArray3));


        int[] array4 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        applySelectionSortByKK(array4);
        System.out.println(Arrays.toString(array4));

    }

    // My Method
    private static int[] applySelectionSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--){
            int max = array[0];
            int maxIndex = 0;
            for (int j = 1; j <= i; j++){
                if (max < array[j]){
                    max = array[j];
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxIndex] = temp;
        }
        return array;
    }


    // Kunal Kushwaha Method
    static void applySelectionSortByKK(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int last = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr, 0, last);
            swapInArray(arr, maxIndex, last);
        }
    }

    static int findMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swapInArray(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    // GFG Solution
    static void selectionSort(int arr[], int n)
    {
        //code here
        for (int i = n - 1; i >= 0; i--){
            int max = arr[0];
            int maxIndex = 0;
            for (int j = 1; j <= i; j++){
                if (max < arr[j]){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[maxIndex] = temp;

        }

    }

}
