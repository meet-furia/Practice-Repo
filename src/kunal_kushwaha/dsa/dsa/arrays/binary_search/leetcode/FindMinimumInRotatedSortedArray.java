package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5,1,2};
        int min1 = findMin(nums1);
        System.out.println(min1);

        int[] nums2 = {4,5,6,7,0,1,2};
        int min2 = findMin(nums2);
        System.out.println(min2);

        int[] nums3 = {11,13,15,17};
        int min3 = findMin(nums3);
        System.out.println(min3);

        int[] nums4 = {8,9,10,0,1,2,3,4,5,6,7};
        int min4 = findMin(nums4);
        System.out.println(min4);

        int[] nums5 = {8};
        int min5 = findMin(nums5);
        System.out.println(min5);

    }
    static public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        if (nums[0] < nums[nums.length-1]){
            return nums[0];
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid > 0 && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }

            if (nums[mid] < nums[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return nums[0];
    }

}
