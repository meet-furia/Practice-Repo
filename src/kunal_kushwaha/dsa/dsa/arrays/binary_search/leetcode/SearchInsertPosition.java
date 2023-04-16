package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int res1 = searchInsert(nums1, 5);
        System.out.println(res1);

        int[] nums2 = {1,3,5,6};
        int res2 = searchInsert(nums2, 2);
        System.out.println(res2);

        int[] nums3 = {1,3,5,6,8,10,12,15,17,20};
        int res3 = searchInsert(nums3, 18);
        System.out.println(res3);

    }
    static public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
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
        if (target > nums[mid]){
            return mid + 1;
        }
        else if (target < nums[mid]){
            return mid;
        }
        return mid;
    }

}
