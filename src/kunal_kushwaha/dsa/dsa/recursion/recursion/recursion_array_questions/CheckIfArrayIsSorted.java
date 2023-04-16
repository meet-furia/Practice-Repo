package kunal_kushwaha.dsa.dsa.recursion.recursion.recursion_array_questions;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 70, 156, 175};
        boolean res11 = sortedOrNotByKK(nums1, 0);
        System.out.println(res11);
        boolean res12 = sortedOrNotMyMethod(nums1, 0);
        System.out.println(res12);

        int[] nums2 = {1, 2, 5, 70, 156, 75};
        boolean res21 = sortedOrNotByKK(nums2, 0);
        System.out.println(res21);
        boolean res22 = sortedOrNotMyMethod(nums2, 0);
        System.out.println(res22);

    }
    static boolean sortedOrNotByKK(int[] nums, int start){
        if (start == nums.length-1){
            return true;
        }
        return nums[start] < nums[start + 1] && sortedOrNotByKK(nums, ++start);
    }

    static boolean sortedOrNotMyMethod(int[] nums, int start){
        if (start == nums.length-1){
            return true;
        }
        if (nums[start] > nums[start + 1]){
            return false;
        }
        return sortedOrNotByKK(nums, ++start);
    }

}
