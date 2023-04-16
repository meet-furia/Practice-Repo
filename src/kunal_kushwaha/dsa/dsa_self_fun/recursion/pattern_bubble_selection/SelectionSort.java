package kunal_kushwaha.dsa.dsa_self_fun.recursion.pattern_bubble_selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums1 = {10,9,8,7,1,2,3,4};
        applySelectionSort(nums1, nums1.length - 1, 0, 0);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        applySelectionSort(nums2, nums2.length - 1, 0, 0);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {10,9,8,7,6,5,4,3,2,1};
        applySelectionSort(nums3, nums3.length - 1, 0, 0);
        System.out.println(Arrays.toString(nums3));

    }
    static void applySelectionSort(int[] nums, int row, int col, int largest) {
        if (row < 0) {
            return;
        }
        if (col > row) {
            swap(nums, largest, row);
            applySelectionSort(nums, row - 1, 0, 0);
        }
        else if (nums[col] > nums[largest]) {
            largest = col;
            applySelectionSort(nums, row, col + 1, largest);
        }
        else {
            applySelectionSort(nums, row, col + 1, largest);
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
