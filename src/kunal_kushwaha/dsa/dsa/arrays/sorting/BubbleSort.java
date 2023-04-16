package kunal_kushwaha.dsa.dsa.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sortedArray1 = applyBubbleSort(array1);
        System.out.println(Arrays.toString(sortedArray1));

        int[] array2 = {};
        int[] sortedArray2 = applyBubbleSort(array2);
        System.out.println(Arrays.toString(sortedArray2));

        int[] array3 = {1,2,3,4,5,6,7,8,10,9};
        int[] sortedArray3 = applyBubbleSort(array3);
        System.out.println(Arrays.toString(sortedArray3));

        bubbleSort(array1, 10);
        System.out.println(Arrays.toString(array1));
    }

    static public int[] applyBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return array;
    }

    public static void bubbleSort(int arr[], int n) {
        //code here
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }
}
