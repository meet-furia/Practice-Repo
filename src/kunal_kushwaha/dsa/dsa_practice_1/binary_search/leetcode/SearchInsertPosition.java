package kunal_kushwaha.dsa.dsa_practice_1.binary_search.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int res1 = searchInsert(nums1, 2);
        System.out.println(res1);

        int[] nums2 = {1,3,5,6,11,78,95};
        int res2 = searchInsert(nums2, 79);
        System.out.println(res2);
    }

    static public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        if (target > nums[mid]){
            return mid + 1;
        }
        else {
            return mid;
        }
    }

}
