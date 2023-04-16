package kunal_kushwaha.dsa.dsa_practice_2.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums1 = {10,9,8,7,1,2,3,4};
        applyBubbleSort(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        applyBubbleSort(nums2);
        System.out.println(Arrays.toString(nums2));

    }
    static void applyBubbleSort(int[] nums) {
        for (int outer = 0; outer < nums.length; outer++) {
            boolean flag = false;
            for (int inner = 0; inner < nums.length - 1 - outer; inner++) {
                if (nums[inner] > nums[inner + 1]) {
                    swap(nums, inner, inner + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }



}
