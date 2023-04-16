package kunal_kushwaha.dsa.dsa_practice_2.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

    }
    static void applySelectionSort(int[] nums) {
        for (int outer = nums.length - 1; outer >= 0; outer--) {
            int large = 0;
            for (int inner = 1; inner <= outer; inner++) {
                if (nums[inner] > nums[large]) {
                    large = inner;
                }
            }
            swap(nums, outer, large);
        }
    }
    static void swap(int[] nums, int outer, int large) {
        int temp = nums[large];
        nums[large] = nums[outer];
        nums[outer] = temp;
    }
}
