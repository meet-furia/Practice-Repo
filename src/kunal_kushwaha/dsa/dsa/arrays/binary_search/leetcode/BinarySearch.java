package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 9;
        int result1 = search(nums1, target1);
        System.out.println(result1);

        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 2;
        int result2 = search(nums2, target2);
        System.out.println(result2);

        int[] nums3 = {5};
        int target3 = 5;
        int result3 = search(nums3, target3);
        System.out.println(result3);

    }

    static public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
