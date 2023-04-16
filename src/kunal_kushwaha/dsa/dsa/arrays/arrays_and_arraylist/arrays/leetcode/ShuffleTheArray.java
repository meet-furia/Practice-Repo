package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,4,3,2,1};
        int[] nums2 = shuffle(nums1, 4);
        System.out.println(Arrays.toString(nums2));
    }

    static public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[nums.length];
        int pointerOne = 0;
        int pointerTwo = n;
        for (int i = 0; i < shuffledArray.length; i++) {
            if (i % 2 == 0) {
                shuffledArray[i] = nums[pointerOne];
                pointerOne++;
            }
            else {
                shuffledArray[i] = nums[pointerTwo];
                pointerTwo++;
            }
        }
        return shuffledArray;
    }

}
