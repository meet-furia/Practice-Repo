package kunal_kushwaha.dsa.dsa.arrays.sorting.cyclesort.leetcode;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums1 = {3,4,-1,1};
        int firstMissingPositive1 = firstMissingPositive(nums1);
        System.out.println(firstMissingPositive1);

        int[] nums2 = {1,2,0};
        int firstMissingPositive2 = firstMissingPositive(nums2);
        System.out.println(firstMissingPositive2);

        int[] nums3 = {7,8,9,11,12};
        int firstMissingPositive3 = firstMissingPositive(nums3);
        System.out.println(firstMissingPositive3);

        int[] nums4 = {4,3,2,1};
        int firstMissingPositive4 = firstMissingPositive(nums4);
        System.out.println(firstMissingPositive4);

    }
    static public int firstMissingPositive(int[] nums) {
        applyCycleSort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i+1){
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    static void applyCycleSort(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (correct > nums.length - 1 || correct < 0){
                i++;
            }
            else if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] nums, int i, int correctIndex){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
