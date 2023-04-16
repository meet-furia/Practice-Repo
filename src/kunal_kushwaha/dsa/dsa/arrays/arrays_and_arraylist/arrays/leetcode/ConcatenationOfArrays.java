package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

import java.util.Arrays;

public class ConcatenationOfArrays {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    static public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int ansLength = numsLength * 2;
        int[] ans = new int[ansLength];

        for(int i = 0; i < ansLength; i++){
            if(i < numsLength){
                ans[i] = nums[i];
            }
            else {
                ans[i] = nums[i - numsLength];
            }
        }
        return ans;
    }

}
