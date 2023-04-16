package kunal_kushwaha.dsa.dsa_practice_1.cycle_sort;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums1 = {3,4,-1,1};
        int fMP1 = firstMissingPositive(nums1);
        System.out.println(fMP1);

        int[] nums2 = {1};
        int fMP2 = firstMissingPositive(nums2);
        System.out.println(fMP2);

    }

    static public int firstMissingPositive(int[] nums) {
//        3,4,-1,1
        applyCycleSort(nums);
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return i + 1;
    }

    static public void applyCycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                int correction = nums[i] - 1;
                if (nums[i] != nums[correction]) {
                    swap(nums, i, correction);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

    }
    static public void swap(int[] nums, int i, int correction) {
        int temp = nums[i];
        nums[i] = nums[correction];
        nums[correction] = temp;
    }

}
