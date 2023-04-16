package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int nums1[] = {5,7,7,8,8,10};
        int target1 = 7;
        int[] range1 = searchRangeLinear(nums1, target1);
        System.out.println(Arrays.toString(range1));

        int nums2[] = {5,7,7,8,8,10};
        int target2 = 7;
        int[] range2 = searchRangeBinary(nums2, target2);
        System.out.println(Arrays.toString(range2));

    }
    // Brute Force Approach
    static public int[] searchRangeLinear(int[] nums, int target) {
        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                startIndex = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] == target){
                endIndex = i;
                break;
            }
        }
        int[] range = {startIndex, endIndex};
        return range;
    }

    static public int[] searchRangeBinary(int[] nums, int target) {
//        int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//        int mid;
//
//        while (start <= end){
//            mid = start + (end - start)/2;
//            if (nums[mid] < target){
//                start = mid + 1;
//            }
//            if (nums[mid] > target){
//                end = mid - 1;
//            }
//            else if (nums[mid] == target){
//                ans = mid;
//                end = mid - 1;
//            }
//        }
//
//        int[] range = {ans};
//        return range;



        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
