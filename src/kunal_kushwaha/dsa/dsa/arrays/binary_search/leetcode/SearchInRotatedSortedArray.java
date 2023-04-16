package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 1;
        int pivot1 = findPivot(nums1);
        System.out.println(pivot1);
        int result1 = search(nums1, target1);
        System.out.println(result1);

        int[] nums2 = {9,0,1,2,3,4,5,6,7,8};
        int target2 = 11;
        int pivot2 = findPivot(nums2);
        System.out.println(pivot2);
        int result2 = search(nums2, target2);
        System.out.println(result2);

    }
    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1){
            return applyBinarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target){
            return pivot;
        }

        if (target >= nums[0]){
            return applyBinarySearch(nums, target, 0, pivot - 1);
        }

        return applyBinarySearch(nums, target, pivot + 1, nums.length - 1);
//
//        int result = applyBinarySearch(nums, target, 0, pivot);
//        if (result == -1){
//            result = applyBinarySearch(nums, target, pivot+1, nums.length-1);
//        }
//        return result;
    }

    static public int applyBinarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > nums[mid]){
                start = mid + 1;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static public int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end -  start)/2;
            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]){
                return mid-1;
            }
            if (nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
