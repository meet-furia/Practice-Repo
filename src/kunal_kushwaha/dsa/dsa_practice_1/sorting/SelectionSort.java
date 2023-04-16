package kunal_kushwaha.dsa.dsa_practice_1.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums1 = {125, 25, 65, 78, 48, 65, 65, 12, 5, 3, 1};
        System.out.println(Arrays.toString(nums1));
        selectionSort(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(nums2));
        selectionSort(nums2);
        System.out.println(Arrays.toString(nums2));
    }
    static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++){
            int maxIndex = 0;
            for (int j = 1; j < nums.length-i; j++){
                if (nums[j] > nums[maxIndex]){
                    maxIndex = j;
                }
            }
            swapNumbers(nums, maxIndex, nums.length - i - 1);
        }
    }

    static void swapNumbers(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
