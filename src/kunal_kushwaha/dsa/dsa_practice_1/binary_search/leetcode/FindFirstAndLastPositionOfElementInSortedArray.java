package kunal_kushwaha.dsa.dsa_practice_1.binary_search.leetcode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {5,7,7,8,8,10};
        int[] res1 = searchRange(nums1, 6);
        System.out.println(Arrays.toString(res1));

        int[] nums2 = {};
        int[] res2 = searchRange(nums1, 0);
        System.out.println(Arrays.toString(res2));


    }

    static public int[] searchRange(int[] nums, int target) {
        int firstIndex = applyBinarySearch(nums, target, true);
        int lastIndex = -1;
        if (firstIndex == -1){
            return new int[]{-1, -1};
        }
        else {
            lastIndex = applyBinarySearch(nums, target, false);
        }
        return new int[]{firstIndex, lastIndex};
    }

    static public int applyBinarySearch(int[] nums, int target, boolean firstIndex) {
        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > nums[mid]){
                start = mid + 1;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else {
                if (firstIndex){
                    if (mid > 0 && target == nums[mid - 1]){
                        end = mid - 1;
                    }
                    else {
                        return mid;
                    }
                }
                else {
                    if (mid < nums.length - 1 && target == nums[mid + 1]){
                        start = mid + 1;
                    }
                    else {
                        return mid;
                    }
                }
            }
        }
        return -1;
    }
}

