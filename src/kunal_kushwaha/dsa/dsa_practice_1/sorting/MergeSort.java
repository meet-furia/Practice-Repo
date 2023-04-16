package kunal_kushwaha.dsa.dsa_practice_1.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums1 = {5, 4, 3, 2, 1};
        nums1 = mergeSort(nums1);
        System.out.println(Arrays.toString(nums1));


        while (true){
            System.out.println("hahaha");
        }
    }
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[left.length + right.length];

        while (i < left.length && j < right.length){
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
