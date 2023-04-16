package kunal_kushwaha.dsa.dsa_practice_1.cycle_sort;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] == nums[correctIndex]) {
                i++;
            }
            else {
                swap(nums, i, correctIndex);
            }
        }
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }
    public void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }

}
