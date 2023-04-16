package kunal_kushwaha.dsa.dsa.arrays.sorting.cyclesort.leetcode;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,2,2};
        int findDuplicate1 = findDuplicate(nums1);
        System.out.println(findDuplicate1);

        int[] nums2 = {3,1,3,4,2};
        int findDuplicate2 = findDuplicate(nums2);
        System.out.println(findDuplicate2);

    }
    static public int findDuplicate(int[] nums) {
        applyCycleSort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i + 1){
                return nums[i];
            }
        }
        return nums[0];
    }

    static public void applyCycleSort(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correction = nums[i] - 1;
            if (nums[i] == nums[correction]){
                i++;
            }
            else {
                swap(nums, i, correction);
            }
        }
    }
    static public void swap(int[] array, int i, int correction){
        int temp = array[i];
        array[i] = array[correction];
        array[correction] = temp;
    }

}
