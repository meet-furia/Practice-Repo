package kunal_kushwaha.dsa.dsa.arrays.sorting.cyclesort.leetcode;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));

        int[] nums1 = {1,1};
        int[] result1 = findErrorNums(nums1);
        System.out.println(Arrays.toString(result1));

    }
    static public int[] findErrorNums(int[] nums) {
        applyCycleSort(nums);
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i + 1){
                arr[0] = nums[i];
                arr[1] = i + 1;
                break;
            }
        }
        return arr;
    }

    static void applyCycleSort(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correction = nums[i]- 1;
            if (nums[i] != nums[correction]){
                swap(nums, i, correction);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int i, int correction){
        int temp = nums[i];
        nums[i] = nums[correction];
        nums[correction] = temp;
    }
}
