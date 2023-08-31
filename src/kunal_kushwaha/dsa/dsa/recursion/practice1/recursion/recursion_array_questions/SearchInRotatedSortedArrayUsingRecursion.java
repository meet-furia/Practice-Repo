package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion.recursion_array_questions;

public class SearchInRotatedSortedArrayUsingRecursion {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        int res1 = binarySearchUsingRecursion(nums1, target1, 0, nums1.length - 1);
        System.out.println(res1);
    }

    static int binarySearchUsingRecursion(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] >= nums[start]) {
            if (target >= nums[start] && target <= nums[mid]) {
                return binarySearchUsingRecursion(nums, target, start, mid - 1);
            }
            else {
                return binarySearchUsingRecursion(nums, target, mid + 1, end);
            }
        }
        if (nums[mid] <= nums[end]){
            if (target >= nums[mid] && target <= nums[end]) {
                return binarySearchUsingRecursion(nums, target, mid + 1, end);
            }
        }
        return binarySearchUsingRecursion(nums, target, start, mid - 1);
    }
}
