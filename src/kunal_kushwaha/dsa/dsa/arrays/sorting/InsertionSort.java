package kunal_kushwaha.dsa.dsa.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        applyInsertionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        applyInsertionSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {};
        applyInsertionSort(arr3);
        System.out.println(Arrays.toString(arr3));

    }

    static void applyInsertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

//    static void swap(int smaller, int larger) {
//
//    }

    // GFG Solution
    public void insertionSort(int arr[], int n)
    {
        //code here
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

}
