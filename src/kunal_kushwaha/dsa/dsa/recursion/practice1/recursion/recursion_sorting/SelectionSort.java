package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion.recursion_sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums1 = {5,4,3,2,1};
        selectionSort(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {5,4,3,2,1};
        recursiveSelectionSort(nums2, nums2.length, 0, 0);
        System.out.println(Arrays.toString(nums2));

    }
    static void selectionSort(int[] nums) {
        for (int i = nums.length-1; i > 0; i--){
            int max = 0;
            for (int j = 0; j <= i; j++){
                if (nums[j] > nums[max]){
                    max = j;
                }
            }
            swap(nums, max, i);
        }
    }
    static void swap(int[] nums, int max, int i){
        int temp = nums[max];
        nums[max] = nums[i];
        nums[i] = temp;
    }


    static void recursiveSelectionSort(int[] nums, int r, int c, int max){

        if (r == 0){
            return;
        }

        if (c < r) {
            if (nums[c] > nums[max]){
                recursiveSelectionSort(nums, r, c + 1, c);
            }
            else {
                recursiveSelectionSort(nums, r, c + 1, max);
            }
        }
        else {
            swap(nums, max, r - 1);
            recursiveSelectionSort(nums, r - 1, 0, 0);
        }
    }
}
