package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int peak1 = findPeakElement(nums1);
        System.out.println(peak1);

        int[] nums2 = {1,2,1,3,5,6,4};
        int peak2 = findPeakElement(nums2);
        System.out.println(peak2);

    }

    static public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start < end){
            mid = start + (end - start)/2;
            if (nums[mid] < nums[mid + 1]){  // increasing array, answer is to the right
                start = mid + 1;
            }
            else if (nums[mid] > nums[mid + 1]){ // decreasing array, answer to the left
                end = mid;
            }
        }
        return start;
    }

}

