package kunal_kushwaha.dsa.dsa_self_fun.arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,79,10,3};
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
