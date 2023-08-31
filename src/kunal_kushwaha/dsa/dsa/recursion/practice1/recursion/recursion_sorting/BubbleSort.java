package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion.recursion_sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(nums1));
        normalBubbleSort(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(nums2));
        recursiveBubbleSort(nums2, 0, 0);
        System.out.println(Arrays.toString(nums2));

    }
    static void normalBubbleSort(int[] nums){
        for (int i = 0; i < nums.length; i++){
            boolean flag = true;
            for (int j = 0; j < nums.length-1-i; j++){
                if (nums[j] > nums[j + 1]){
                    swap(nums, j, j+1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
    static void swap(int[] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    static void recursiveBubbleSort(int[] nums, int row, int col){
        if (row == 0 || row < 0) {
            return;
        }
        if (col == row) {
            recursiveBubbleSort(nums, row - 1, 0);
        }
        else if (nums[col] > nums[col + 1]){
            swap(nums, col, col + 1);
            recursiveBubbleSort(nums, row, col + 1);
        }
        else {
            recursiveBubbleSort(nums, row, col + 1);
        }
    }
}
