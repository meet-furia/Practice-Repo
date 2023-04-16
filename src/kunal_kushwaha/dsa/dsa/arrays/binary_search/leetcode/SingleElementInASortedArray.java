package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,3,4,4,8,8};
        int result1 = singleNonDuplicate(nums1);
        System.out.println(result1);

        int[] nums2 = {3,3,7,7,10,11,11};
        int result2 = singleNonDuplicate(nums2);
        System.out.println(result2);

        int[] nums3 = {3,3};
        int result3 = singleNonDuplicate(nums3);
        System.out.println(result3);

    }
    static public int singleNonDuplicate(int[] nums) {
        int s = 0, e = nums.length-1;
        while (s <= e){
            int m = s + (e - s)/2;
            if (m < nums.length - 1 && nums[m] == nums[m + 1]){
                if (m % 2 == 0){
                    s = m + 1;
                }
                else {
                    e = m - 1;
                }
            }
            else if (m > 0 && nums[m] == nums[m - 1]){
                if (m % 2 == 0){
                    e = m - 1;
                }
                else {
                    s = m + 1;
                }
            }
            else {
                return nums[m];
            }
        }
        return -1;
    }

}
