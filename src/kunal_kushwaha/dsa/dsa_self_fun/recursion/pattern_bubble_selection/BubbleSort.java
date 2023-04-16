package kunal_kushwaha.dsa.dsa_self_fun.recursion.pattern_bubble_selection;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {10,9,8,7,5,6,4,3,2,1};
        applyBubbleSort(arr1, arr1.length - 1, 0);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,2,5,4,3,6,7,8,9,10};
        applyBubbleSort(arr2, arr2.length - 1, 0);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {};
        applyBubbleSort(arr3, arr3.length - 1, 0);
        System.out.println(Arrays.toString(arr3));

    }
    static void applyBubbleSort(int[] nums, int row, int col) {
        if (row == 0 || row < 0) {
            return;
        }
        if (col == row) {
            applyBubbleSort(nums, row - 1, 0);
        }
        else if (nums[col] > nums[col + 1]){
            swap(nums, col, col + 1);
            applyBubbleSort(nums, row, col + 1);
        }
        else {
            applyBubbleSort(nums, row, col + 1);
        }
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
