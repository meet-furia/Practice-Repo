package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int res1 = removeDuplicates(nums1);
        System.out.println(res1);
        for (int i = 0; i < res1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(nums1));

        System.out.println("-------------------------");

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int res2 = removeDuplicates(nums2);
        System.out.println(res2);
        for (int i = 0; i < res2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(nums2));


        System.out.println("----------------------------");
        int[] nums3 = {1};
        int res3 = removeDuplicates(nums3);
        System.out.println(res3);
    }



    static public int removeDuplicates(int[] nums) {
        int index = 0, numToBeCompared = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != numToBeCompared){
                index++;
                nums[index] = nums[i];
                numToBeCompared = nums[index];
            }
        }
        return index + 1;
    }

}
