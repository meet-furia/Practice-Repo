package kunal_kushwaha.dsa.dsa_practice_1.binary_search.binary_search;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        int index = applyBinarySearch(nums1, 10, 0, nums1.length-1);
        System.out.println(index);
    }
    static int applyBinarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if (target > nums[mid]){
            return applyBinarySearch(nums, target, mid + 1, end);
        }
        else if (target < nums[mid]) {
            return applyBinarySearch(nums, target, start, mid - 1);
        }
        else {
            return mid;
        }
    }
}
