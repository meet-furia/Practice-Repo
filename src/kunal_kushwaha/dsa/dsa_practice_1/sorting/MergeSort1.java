package kunal_kushwaha.dsa.dsa_practice_1.sorting;

import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] nums1 = {5,4,3,2,1};
        int[] res1 = mergeSort(nums1);
        System.out.println(Arrays.toString(res1));

    }

    // 5 4 3 2 1
    static int[] mergeSort(int[] nums) {
        if (nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(nums,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);

    }
    static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
