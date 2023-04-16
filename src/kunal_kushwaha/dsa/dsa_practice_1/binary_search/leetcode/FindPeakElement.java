package kunal_kushwaha.dsa.dsa_practice_1.binary_search.leetcode;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums1 = {6,5,4,3,2,3,2};
        int peak1 = findPeakElement(nums1);
        System.out.println(peak1);
    }
    static public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
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
