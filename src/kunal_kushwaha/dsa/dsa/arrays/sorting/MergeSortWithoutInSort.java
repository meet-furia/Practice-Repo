package kunal_kushwaha.dsa.dsa.arrays.sorting;

import java.util.Arrays;

public class MergeSortWithoutInSort {
    public static void main(String[] args) {
        int[] nums1 = {5,4,3,2,1};
        nums1 = mergeSort(nums1);
        System.out.println(Arrays.toString(nums1));
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

    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] mix = new int[first.length + second.length];

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
