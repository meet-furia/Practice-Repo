package kunal_kushwaha.dsa.dsa_practice_2.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums1 = {10,9,8,7,1,2,3,4};
        applyInsertionSort(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        applyInsertionSort(nums2);
        System.out.println(Arrays.toString(nums2));

    }

    static void applyInsertionSort(int[] nums) {
        for (int outer = 0; outer < nums.length - 1; outer++) {
            for (int inner = outer + 1; inner > 0; inner--) {
                if (nums[inner] < nums[inner - 1]) {
                    swap(nums, inner, inner - 1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] nums, int innerOne, int innerTwo) {
        int temp = nums[innerOne];
        nums[innerOne] = nums[innerTwo];
        nums[innerTwo] = temp;
    }
}
