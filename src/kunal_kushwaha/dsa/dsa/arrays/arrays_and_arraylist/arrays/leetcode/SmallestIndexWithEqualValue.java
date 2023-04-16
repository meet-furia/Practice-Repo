package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {
        int[] nums1 = {0,1,2};
        int result1 = smallestEqual(nums1);
        System.out.println(result1);

        int[] nums2 = {4,3,2,1};
        int result2 = smallestEqual(nums2);
        System.out.println(result2);

        int[] nums3 = {1, 0};
        int result3 = smallestEqual(nums3);
        System.out.println(result3);

        int[] nums4 = {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
        int result4 = smallestEqual(nums4);
        System.out.println(result4);
    }

    static public int smallestEqual(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == i % 10){
                return i;
            }
        }
        return -1;
    }
}
