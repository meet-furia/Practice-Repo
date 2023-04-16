package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class SearchInRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {2,5,6,0,0,1,2};
        int target1 = 3;
        int pivot1 = findPivot(nums1);
        System.out.println(pivot1);
        boolean targetFound1 = search(nums1, target1);
        System.out.println(targetFound1);

        int[] nums2 = {10,10,11,12,13,0,0,1,2,3,3,5,6,8,9,10};
        int target2 = 3;
        int pivot2 = findPivot(nums2);
        System.out.println(pivot2);
        boolean targetFound2 = search(nums2, target2);
        System.out.println(targetFound2);

    }

    static public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target){
            return true;
        }
        boolean targetFound = binarySearch(nums, target, 0, pivot);
        if (!targetFound){
            targetFound = binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        return targetFound;
    }

    static public boolean binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > nums[mid]){
                start =  mid + 1;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else {
                return true;
            }
         }
        return false;
    }

    static public int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            else if (nums[mid] > nums[start] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
