package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class SearchInRotatedSortedArray2ndMethod {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        int res = applyBinarySearch(nums1, target1);
        System.out.println(res);
    }

    static public int applyBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            }
            else if (nums[start] <= nums[mid]){
                if (target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid+1;
                }
            }
            else if (nums[end] >= nums[mid]){
                if (target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

